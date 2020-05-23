package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArrayOrSingle[T /* <: js.Any */] = T | js.Array[T]
  type ArrayOrString = typings.c3.mod.ArrayOrSingle[java.lang.String]
  type Domain = js.Tuple2[scala.Double, scala.Double]
  type ExpandOptions = scala.Boolean | typings.c3.anon.DurationNumber
  type FormatFunction = js.Function4[
    /* v */ scala.Double | typings.c3.anon.ValueOf, 
    /* id */ java.lang.String, 
    /* i */ scala.Double, 
    /* j */ scala.Double, 
    java.lang.String
  ]
  type Primitive = java.lang.String | scala.Boolean | scala.Double | typings.std.Date | scala.Null
  type PrimitiveArray = js.Array[typings.c3.mod.Primitive]
  type RedrawOptions = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type UpdateAndRedrawOptions = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
