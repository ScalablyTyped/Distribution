package typings.ckeditor.CKEDITOR.ui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait balloonToolbar extends js.Object {
  
  def addItem(name: String, element: button): Unit = js.native
  def addItem(name: String, element: richCombo): Unit = js.native
  
  def addItems(elements: StringDictionary[button | richCombo]): Unit = js.native
  
  def deleteItem(name: String): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getItem(name: String): button | richCombo = js.native
  
  def hide(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def show(): Unit = js.native
}
