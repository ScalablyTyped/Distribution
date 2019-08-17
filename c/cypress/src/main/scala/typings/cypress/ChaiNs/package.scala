package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChaiNs {
  import typings.cypress.Object
  import typings.std.Date

  type AssertStatic = Assert
  type AssertionStatic = js.Function2[/* target */ js.Any, /* message */ js.UndefOr[String], Assertion]
  type CloseTo = js.Function3[/* expected */ Double, /* delta */ Double, /* message */ js.UndefOr[String], Assertion]
  type Equal = js.Function2[/* value */ js.Any, /* message */ js.UndefOr[String], Assertion]
  type InstanceOf = js.Function2[/* constructor */ Object, /* message */ js.UndefOr[String], Assertion]
  type Members = js.Function2[/* set */ js.Array[js.Any], /* message */ js.UndefOr[String], Assertion]
  type NumberComparer = js.Function2[/* value */ Double, /* message */ js.UndefOr[String], Assertion]
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
    /* property */ String, 
    /* message */ js.UndefOr[String], 
    Assertion
  ]
  type RespondTo = js.Function2[/* method */ String, /* message */ js.UndefOr[String], Assertion]
  type Satisfy = js.Function2[/* matcher */ js.Function, /* message */ js.UndefOr[String], Assertion]
}
