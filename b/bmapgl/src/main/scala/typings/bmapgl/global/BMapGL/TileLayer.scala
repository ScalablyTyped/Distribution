package typings.bmapgl.global.BMapGL

import typings.bmapgl.BMapGL.Copyright
import typings.bmapgl.BMapGL.TileLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.TileLayer")
@js.native
open class TileLayer ()
  extends StObject
     with typings.bmapgl.BMapGL.TileLayer {
  def this(opts: TileLayerOptions) = this()
  
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typings.bmapgl.BMapGL.Pixel, zoom: Double): String = js.native
  
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
}
