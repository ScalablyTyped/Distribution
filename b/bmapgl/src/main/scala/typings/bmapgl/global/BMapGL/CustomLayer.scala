package typings.bmapgl.global.BMapGL

import typings.bmapgl.BMapGL.Copyright
import typings.bmapgl.BMapGL.CustomLayerOptions
import typings.bmapgl.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.CustomLayer")
@js.native
class CustomLayer protected ()
  extends StObject
     with typings.bmapgl.BMapGL.CustomLayer {
  def this(opts: CustomLayerOptions) = this()
  
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typings.bmapgl.BMapGL.Pixel, zoom: Double): String = js.native
  
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
  
  /* CompleteClass */
  override def onhotspotclick(event: Content): Unit = js.native
}
