package typings.d3Array

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  type Primitive = scala.Double | java.lang.String | scala.Boolean | typings.std.Date
  type ThresholdCountGenerator[Value /* <: js.UndefOr[scala.Double] */] = js.Function3[
    /* values */ typings.std.ArrayLike[Value], 
    /* min */ scala.Double, 
    /* max */ scala.Double, 
    scala.Double
  ]
  type ThresholdDateArrayGenerator[Value /* <: js.UndefOr[typings.std.Date] */] = js.Function3[
    /* values */ typings.std.ArrayLike[Value], 
    /* min */ typings.std.Date, 
    /* max */ typings.std.Date, 
    js.Array[Value]
  ]
  type ThresholdNumberArrayGenerator[Value /* <: js.UndefOr[scala.Double] */] = js.Function3[
    /* values */ typings.std.ArrayLike[Value], 
    /* min */ scala.Double, 
    /* max */ scala.Double, 
    js.Array[Value]
  ]
}
