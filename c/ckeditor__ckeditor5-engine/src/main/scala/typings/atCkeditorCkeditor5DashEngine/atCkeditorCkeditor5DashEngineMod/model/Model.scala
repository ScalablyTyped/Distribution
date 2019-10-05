package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model

import typings.atCkeditorCkeditor5DashEngine.Anon_Backward
import typings.atCkeditorCkeditor5DashEngine.Anon_DoNotResetEntireContentLeaveUnmerged
import typings.atCkeditorCkeditor5DashEngine.Anon_Priority
import typings.atCkeditorCkeditor5DashEngine.Anon_PriorityNumber
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.operation.Operation
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.default
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.transparent
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Emitter
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Observable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/model/model
@JSImport("@ckeditor/ckeditor5-engine", "model.Model")
@js.native
class Model () extends Observable {
  val document: Document = js.native
  val markers: MarkerCollection = js.native
  val schema: Schema = js.native
  def applyOperation(operation: Operation): Unit = js.native
  def change(callback: js.Function): js.Any = js.native
  def deleteContent(selection: DocumentSelection, batch: Batch, options: Anon_DoNotResetEntireContentLeaveUnmerged): Unit = js.native
  def deleteContent(selection: Selection, batch: Batch, options: Anon_DoNotResetEntireContentLeaveUnmerged): Unit = js.native
  def destroy(): Unit = js.native
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
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Anon_Priority): Unit = js.native
  def modifySelection(selection: DocumentSelection): Unit = js.native
  def modifySelection(selection: DocumentSelection, options: Anon_Backward): Unit = js.native
  def modifySelection(selection: Selection): Unit = js.native
  def modifySelection(selection: Selection, options: Anon_Backward): Unit = js.native
  def on(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
  def once(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
}

