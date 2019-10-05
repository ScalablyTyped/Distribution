package typings.chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Chai {
  import typings.chai.Object
  import typings.std.Date
  import typings.std.RegExp

  type AssertStatic = Assert
  // chai.Assertion.prototype.assert arguments
  type AssertionArgs = js.Tuple6[
    // 'expression to be tested'
  // This parameter is unused and the docs list its type as
  // 'Philosophical', which is mentioned nowhere else in the source. Do
  // with that what you will!
  js.Any, 
    Message, 
    Message, 
    js.Any, 
    js.UndefOr[js.Any], 
    js.UndefOr[Boolean]
  ]
  type ChaiPlugin = js.Function2[/* chai */ ChaiStatic, /* utils */ ChaiUtils, Unit]
  type CloseTo = js.Function3[/* expected */ Double, /* delta */ Double, /* message */ js.UndefOr[String], Assertion]
  type Equal = js.Function2[/* value */ js.Any, /* message */ js.UndefOr[String], Assertion]
  type InstanceOf = js.Function2[/* constructor */ js.Any, /* message */ js.UndefOr[String], Assertion]
  type Match = js.Function2[/* regexp */ RegExp, /* message */ js.UndefOr[String], Assertion]
  type Members = js.Function2[/* set */ js.Array[js.Any], /* message */ js.UndefOr[String], Assertion]
  type Message = String | js.Function0[String]
  type NumberComparer = js.Function2[/* value */ Double | Date, /* message */ js.UndefOr[String], Assertion]
  type ObjectProperty = String | js.Symbol | Double
  type Operator = String
  type OperatorComparable = js.UndefOr[Boolean | Null | Double | String | Date]
  type OwnProperty = js.Function2[/* name */ String, /* message */ js.UndefOr[String], Assertion]
  type Property = js.Function3[
    /* name */ String, 
    /* value */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[String], 
    Assertion
  ]
  type PropertyChange = js.Function3[
    /* object */ Object, 
    /* property */ js.UndefOr[String], 
    /* message */ js.UndefOr[String], 
    Assertion
  ]
  type RespondTo = js.Function2[/* method */ String, /* message */ js.UndefOr[String], Assertion]
  type Satisfy = js.Function2[/* matcher */ js.Function, /* message */ js.UndefOr[String], Assertion]
}
