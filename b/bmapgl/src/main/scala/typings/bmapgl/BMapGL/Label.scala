package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StringDictionary
import typings.bmapgl.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends Overlay {
  
  def disableMassClear(): Unit = js.native
  
  def enableMassClear(): Unit = js.native
  
  def getMap(): Map = js.native
  
  def getOffset(): Size = js.native
  
  def getPosition(): Point = js.native
  
  def getTitle(): String = js.native
  
  def onclick(event: Target): Unit = js.native
  
  def ondblclick(event: Target): Unit = js.native
  
  def onmousedown(event: Target): Unit = js.native
  
  def onmouseout(event: Target): Unit = js.native
  
  def onmouseover(event: Target): Unit = js.native
  
  def onmouseup(event: Target): Unit = js.native
  
  def onremove(event: Target): Unit = js.native
  
  def onrightclick(event: Target): Unit = js.native
  
  def setContent(content: String): Unit = js.native
  
  def setOffset(offset: Size): Unit = js.native
  
  def setPosition(position: Point): Unit = js.native
  
  def setStyle(styles: StringDictionary[String | Double]): Unit = js.native
  
  def setTitle(title: String): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
