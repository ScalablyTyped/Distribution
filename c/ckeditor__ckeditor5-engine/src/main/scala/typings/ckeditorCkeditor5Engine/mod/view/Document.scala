package typings.ckeditorCkeditor5Engine.mod.view

import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.anon.`0`
import typings.ckeditorCkeditor5Utils.mod.Collection
import typings.ckeditorCkeditor5Utils.mod.Emitter
import typings.ckeditorCkeditor5Utils.mod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/view/document
@JSImport("@ckeditor/ckeditor5-engine", "view.Document")
@js.native
class Document () extends Observable {
  
  /* protected */ def _callPostFixers(writer: DowncastWriter): Unit = js.native
  
  def getRoot(): RootEditableElement | Null = js.native
  def getRoot(name: String): RootEditableElement | Null = js.native
  
  val isComposing: Boolean = js.native
  
  val isFocused: Boolean = js.native
  
  var isReadOnly: Boolean = js.native
  
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Priority): Unit = js.native
  
  def on(event: String, callback: js.Function, options: `0`): Unit = js.native
  
  def once(event: String, callback: js.Function, options: `0`): Unit = js.native
  
  def registerPostFixer(postFixer: js.Function1[/* downcastWriter */ DowncastWriter, Boolean]): Unit = js.native
  
  val roots: Collection[RootEditableElement] = js.native
  
  val selection: DocumentSelection = js.native
}
