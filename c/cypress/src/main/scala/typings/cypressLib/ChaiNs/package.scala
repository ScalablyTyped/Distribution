package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ChaiNs {
  type AssertStatic = Assert
  type AssertionStatic = js.Function2[/* target */ js.Any, /* message */ js.UndefOr[java.lang.String], Assertion]
  type CloseTo = js.Function3[
    /* expected */ scala.Double, 
    /* delta */ scala.Double, 
    /* message */ js.UndefOr[java.lang.String], 
    Assertion
  ]
  type Equal = js.Function2[/* value */ js.Any, /* message */ js.UndefOr[java.lang.String], Assertion]
  type InstanceOf = js.Function2[
    /* constructor */ cypressLib.Object, 
    /* message */ js.UndefOr[java.lang.String], 
    Assertion
  ]
  type Members = js.Function2[/* set */ js.Array[js.Any], /* message */ js.UndefOr[java.lang.String], Assertion]
  type NumberComparer = js.Function2[/* value */ scala.Double, /* message */ js.UndefOr[java.lang.String], Assertion]
  type Operator = java.lang.String
  type OperatorComparable = js.UndefOr[scala.Boolean | scala.Null | scala.Double | java.lang.String | stdLib.Date]
  type OwnProperty = js.Function2[/* name */ java.lang.String, /* message */ js.UndefOr[java.lang.String], Assertion]
  type Property = js.Function3[
    /* name */ java.lang.String, 
    /* value */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    Assertion
  ]
  type PropertyChange = js.Function3[
    /* object */ cypressLib.Object, 
    /* property */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    Assertion
  ]
  type RespondTo = js.Function2[/* method */ java.lang.String, /* message */ js.UndefOr[java.lang.String], Assertion]
  type Satisfy = js.Function2[/* matcher */ js.Function, /* message */ js.UndefOr[java.lang.String], Assertion]
}
