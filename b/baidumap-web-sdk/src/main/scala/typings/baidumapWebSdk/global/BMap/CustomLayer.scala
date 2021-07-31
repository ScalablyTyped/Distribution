package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.Copyright
import typings.baidumapWebSdk.BMap.CustomLayerOptions
import typings.baidumapWebSdk.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.CustomLayer")
@js.native
class CustomLayer protected ()
  extends StObject
     with typings.baidumapWebSdk.BMap.CustomLayer {
  def this(opts: CustomLayerOptions) = this()
  
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typings.baidumapWebSdk.BMap.Pixel, zoom: Double): String = js.native
  
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
  
  /* CompleteClass */
  override def onhotspotclick(event: Content): Unit = js.native
}
