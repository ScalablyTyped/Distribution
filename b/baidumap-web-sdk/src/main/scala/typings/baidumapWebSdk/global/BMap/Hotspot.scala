package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.HotspotOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.Hotspot")
@js.native
class Hotspot protected ()
  extends StObject
     with typings.baidumapWebSdk.BMap.Hotspot {
  def this(position: typings.baidumapWebSdk.BMap.Point) = this()
  def this(position: typings.baidumapWebSdk.BMap.Point, opts: HotspotOptions) = this()
  
  /* CompleteClass */
  override def getPosition(): typings.baidumapWebSdk.BMap.Point = js.native
  
  /* CompleteClass */
  override def getText(): String = js.native
  
  /* CompleteClass */
  override def getUserData(): js.Any = js.native
  
  /* CompleteClass */
  override def setPosition(position: typings.baidumapWebSdk.BMap.Point): Unit = js.native
  
  /* CompleteClass */
  override def setText(text: String): Unit = js.native
  
  /* CompleteClass */
  override def setUserData(data: js.Any): Unit = js.native
}
