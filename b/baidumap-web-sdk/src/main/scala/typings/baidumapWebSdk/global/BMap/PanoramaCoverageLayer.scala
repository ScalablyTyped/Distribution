package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.Copyright
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.PanoramaCoverageLayer")
@js.native
class PanoramaCoverageLayer ()
  extends StObject
     with typings.baidumapWebSdk.BMap.TileLayer {
  
  /* CompleteClass */
  override def getCopyright(): Copyright = js.native
  
  /* CompleteClass */
  override def getTilesUrl(tileCoord: typings.baidumapWebSdk.BMap.Pixel, zoom: Double): String = js.native
  
  /* CompleteClass */
  override def isTransparentPng(): Boolean = js.native
}
