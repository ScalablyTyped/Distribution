package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.elementPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait command
  extends event
     with commandDefinition {
  
  def checkAllowed(noCache: Boolean): Boolean = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def exec(): Boolean = js.native
  def exec(data: StringDictionary[js.Any]): Boolean = js.native
  
  @JSName("fakeKeystroke")
  var fakeKeystroke_command: Double = js.native
  
  var previousState: Double = js.native
  
  @JSName("refresh")
  def refresh_Mcommand(editor: editor, path: elementPath): Unit = js.native
  
  def setState(newState: Double): Boolean = js.native
  
  var state: Double = js.native
  
  def toggleState(): Unit = js.native
  
  var uiItems: js.Array[_] = js.native
}
