package typings
package d3DashArrayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashArrayMod {
  type Primitive = scala.Double | java.lang.String | scala.Boolean | stdLib.Date
  type ThresholdArrayGenerator = ThresholdNumberArrayGenerator[scala.Double]
  type ThresholdCountGenerator[Value /* <: js.UndefOr[scala.Double] */] = js.Function3[
    /* values */ stdLib.ArrayLike[Value], 
    /* min */ scala.Double, 
    /* max */ scala.Double, 
    scala.Double
  ]
  type ThresholdDateArrayGenerator[Value /* <: js.UndefOr[stdLib.Date] */] = js.Function3[
    /* values */ stdLib.ArrayLike[Value], 
    /* min */ stdLib.Date, 
    /* max */ stdLib.Date, 
    js.Array[Value]
  ]
  type ThresholdNumberArrayGenerator[Value /* <: js.UndefOr[scala.Double] */] = js.Function3[
    /* values */ stdLib.ArrayLike[Value], 
    /* min */ scala.Double, 
    /* max */ scala.Double, 
    js.Array[Value]
  ]
}
