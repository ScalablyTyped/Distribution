package typings.bmapgl.global.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.Projection")
@js.native
open class Projection ()
  extends StObject
     with typings.bmapgl.BMapGL.Projection {
  
  /* CompleteClass */
  override def lngLatToPoint(lngLat: typings.bmapgl.BMapGL.Point): typings.bmapgl.BMapGL.Pixel = js.native
  
  /* CompleteClass */
  override def pointToLngLat(point: typings.bmapgl.BMapGL.Pixel): typings.bmapgl.BMapGL.Point = js.native
}
object Projection {
  
  @JSGlobal("BMapGL.Projection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def convertLL2MC(point: typings.bmapgl.BMapGL.Point): typings.bmapgl.BMapGL.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLL2MC")(point.asInstanceOf[js.Any]).asInstanceOf[typings.bmapgl.BMapGL.Point]
  
  /* static member */
  inline def convertMC2LL(point: typings.bmapgl.BMapGL.Point): typings.bmapgl.BMapGL.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("convertMC2LL")(point.asInstanceOf[js.Any]).asInstanceOf[typings.bmapgl.BMapGL.Point]
  
  /* static member */
  inline def proximityConvertMC2LL(point: typings.bmapgl.BMapGL.Point): typings.bmapgl.BMapGL.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("proximityConvertMC2LL")(point.asInstanceOf[js.Any]).asInstanceOf[typings.bmapgl.BMapGL.Point]
}
