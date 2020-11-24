package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.ui.dialog.button
import typings.ckeditor.CKEDITOR.ui.dialog.uiElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dialog_ extends js.Object {
  
  def addFocusable(element: element): Unit = js.native
  def addFocusable(element: element, index: Double): Unit = js.native
  
  def addPage(contents: StringDictionary[js.Any]): Unit = js.native
  
  def click(id: String): js.Any = js.native
  
  def commitContent(): Unit = js.native
  
  def disableButton(id: String): Unit = js.native
  
  def enableButton(id: String): Unit = js.native
  
  def foreach(fn: js.Function0[Unit]): dialog = js.native
  
  def getButton(id: String): button = js.native
  
  def getContentElement(pageId: String, elementId: String): uiElement = js.native
  
  def getElement(): element = js.native
  
  def getName(): String = js.native
  
  def getPageCount(): Double = js.native
  
  def getParentEditor(): editor = js.native
  
  def getPosition(): StringDictionary[js.Any] = js.native
  
  def getSelectedElement(): element = js.native
  
  def getSize(): StringDictionary[js.Any] = js.native
  
  def getValueOf(pageId: String, elementId: String): js.Any = js.native
  
  def hide(): Unit = js.native
  
  def hidePage(id: String): Unit = js.native
  
  def layout(): Unit = js.native
  
  def move(x: Double, y: Double, save: Boolean): Unit = js.native
  
  def reset(): dialog = js.native
  
  def resize(width: Double, height: Double): Unit = js.native
  
  def selectPage(id: String): Unit = js.native
  
  def setState(state: Double): Unit = js.native
  
  def setValueOf(pageId: String, elementId: String, value: js.Any): Unit = js.native
  
  def setupContent(): Unit = js.native
  
  def show(): Unit = js.native
  
  def showPage(id: String): Unit = js.native
  
  val state: Double = js.native
  
  def updateStyle(): Unit = js.native
}
