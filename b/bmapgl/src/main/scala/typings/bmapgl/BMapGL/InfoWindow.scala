package typings.bmapgl.BMapGL

import typings.bmapgl.anon.Target
import typings.bmapgl.anon.Type
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoWindow
  extends StObject
     with Overlay {
  
  def disableAutoPan(): Unit = js.native
  
  def disableCloseOnClick(): Unit = js.native
  
  def disableMaximize(): Unit = js.native
  
  def enableAutoPan(): Unit = js.native
  
  def enableCloseOnClick(): Unit = js.native
  
  def enableMaximize(): Unit = js.native
  
  def getContent(): String | HTMLElement = js.native
  
  def getPosition(): Point = js.native
  
  def getTitle(): String | HTMLElement = js.native
  
  def isOpen(): Boolean = js.native
  
  def maximize(): Unit = js.native
  
  def onclickclose(event: Target): Unit = js.native
  
  def onclose(event: Type): Unit = js.native
  
  def onmaximize(event: Target): Unit = js.native
  
  def onopen(event: Type): Unit = js.native
  
  def onrestore(event: Target): Unit = js.native
  
  def redraw(): Unit = js.native
  
  def restore(): Unit = js.native
  
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  
  def setHeight(height: Double): Unit = js.native
  
  def setMaxContent(content: String): Unit = js.native
  
  def setTitle(title: String): Unit = js.native
  def setTitle(title: HTMLElement): Unit = js.native
  
  def setWidth(width: Double): Unit = js.native
}
