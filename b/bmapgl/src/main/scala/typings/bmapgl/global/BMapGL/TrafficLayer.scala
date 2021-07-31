package typings.bmapgl.global.BMapGL

import typings.bmapgl.BMapGL.Copyright
import typings.bmapgl.BMapGL.TrafficLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.TrafficLayer")
@js.native
class TrafficLayer ()
  extends StObject
     with typings.bmapgl.BMapGL.TileLayer {
  def this(opts: TrafficLayerOptions) = this()
  
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typings.bmapgl.BMapGL.Pixel, zoom: Double): String = js.native
  
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
}
