package typings.colormap

import typings.colormap.anon.Alpha
import typings.colormap.colormapStrings.float
import typings.colormap.colormapStrings.hex
import typings.colormap.colormapStrings.rgba
import typings.colormap.colormapStrings.rgbaString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: hex | rgbaString | rgba | float */](): js.Array[String | (js.Tuple4[Double, Double, Double, Double])] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[String | (js.Tuple4[Double, Double, Double, Double])]]
  inline def apply[T /* <: hex | rgbaString | rgba | float */](spec: Alpha[T]): js.Array[String | (js.Tuple4[Double, Double, Double, Double])] = ^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | (js.Tuple4[Double, Double, Double, Double])]]
  
  @JSImport("colormap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
