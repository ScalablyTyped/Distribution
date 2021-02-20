package typings.ckeditorCkeditor5Engine.mod.model

import typings.ckeditorCkeditor5Engine.anon.Direction
import typings.ckeditorCkeditor5Engine.anon.LeaveUnmerged
import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.anon.`0`
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.transparent
import typings.ckeditorCkeditor5Engine.mod.model.operation.Operation
import typings.ckeditorCkeditor5Utils.mod.Emitter
import typings.ckeditorCkeditor5Utils.mod.Observable
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/model
@JSImport("@ckeditor/ckeditor5-engine", "model.Model")
@js.native
class Model () extends Observable {
  
  def applyOperation(operation: Operation): Unit = js.native
  
  def change(callback: js.Function): js.Any = js.native
  
  def deleteContent(selection: DocumentSelection, batch: Batch, options: LeaveUnmerged): Unit = js.native
  def deleteContent(selection: Selection, batch: Batch, options: LeaveUnmerged): Unit = js.native
  
  def destroy(): Unit = js.native
  
  val document: Document = js.native
  
  def enqueueChange(batchOrType: Batch, callback: js.Function): Unit = js.native
  @JSName("enqueueChange")
  def enqueueChange_default(batchOrType: default, callback: js.Function): Unit = js.native
  @JSName("enqueueChange")
  def enqueueChange_transparent(batchOrType: transparent, callback: js.Function): Unit = js.native
  
  def getSelectedContent(selection: DocumentSelection): DocumentFragment = js.native
  def getSelectedContent(selection: Selection): DocumentFragment = js.native
  
  def hasContent(rangeOrElement: Element): Boolean = js.native
  def hasContent(rangeOrElement: Range): Boolean = js.native
  
  def insertContent(content: DocumentFragment): Unit = js.native
  def insertContent(content: DocumentFragment, selectable: DocumentSelection): Unit = js.native
  def insertContent(content: DocumentFragment, selectable: Element): Unit = js.native
  def insertContent(content: DocumentFragment, selectable: Position): Unit = js.native
  def insertContent(content: DocumentFragment, selectable: Range): Unit = js.native
  def insertContent(content: DocumentFragment, selectable: Selection): Unit = js.native
  def insertContent(content: DocumentFragment, selectable: Iterable[Range]): Unit = js.native
  def insertContent(content: Item): Unit = js.native
  def insertContent(content: Item, selectable: DocumentSelection): Unit = js.native
  def insertContent(content: Item, selectable: Element): Unit = js.native
  def insertContent(content: Item, selectable: Position): Unit = js.native
  def insertContent(content: Item, selectable: Range): Unit = js.native
  def insertContent(content: Item, selectable: Selection): Unit = js.native
  def insertContent(content: Item, selectable: Iterable[Range]): Unit = js.native
  
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Priority): Unit = js.native
  
  val markers: MarkerCollection = js.native
  
  def modifySelection(selection: DocumentSelection): Unit = js.native
  def modifySelection(selection: DocumentSelection, options: Direction): Unit = js.native
  def modifySelection(selection: Selection): Unit = js.native
  def modifySelection(selection: Selection, options: Direction): Unit = js.native
  
  def on(event: String, callback: js.Function, options: `0`): Unit = js.native
  
  def once(event: String, callback: js.Function, options: `0`): Unit = js.native
  
  val schema: Schema = js.native
}
