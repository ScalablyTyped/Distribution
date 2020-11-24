package typings.ckeditorCkeditor5Engine.mod.model

import typings.ckeditorCkeditor5Engine.anon.Direction
import typings.ckeditorCkeditor5Engine.anon.DoNotResetEntireContent
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-engine", "model.utils")
@js.native
object utils extends js.Object {
  
  def deleteContent(model: Model, selection: DocumentSelection, batch: Batch): Unit = js.native
  def deleteContent(model: Model, selection: DocumentSelection, batch: Batch, options: DoNotResetEntireContent): Unit = js.native
  def deleteContent(model: Model, selection: Selection, batch: Batch): Unit = js.native
  def deleteContent(model: Model, selection: Selection, batch: Batch, options: DoNotResetEntireContent): Unit = js.native
  
  def getSelectedContent(model: Model, selection: DocumentSelection): DocumentFragment = js.native
  def getSelectedContent(model: Model, selection: Selection): DocumentFragment = js.native
  
  def injectSelectionPostFixer(model: Model): Unit = js.native
  
  def insertContent(model: Model, content: DocumentFragment): Unit = js.native
  def insertContent(model: Model, content: DocumentFragment, selectable: DocumentSelection): Unit = js.native
  def insertContent(model: Model, content: DocumentFragment, selectable: Element): Unit = js.native
  def insertContent(model: Model, content: DocumentFragment, selectable: Position): Unit = js.native
  def insertContent(model: Model, content: DocumentFragment, selectable: Range): Unit = js.native
  def insertContent(model: Model, content: DocumentFragment, selectable: Selection): Unit = js.native
  def insertContent(model: Model, content: DocumentFragment, selectable: Iterable[Range]): Unit = js.native
  def insertContent(model: Model, content: Item): Unit = js.native
  def insertContent(model: Model, content: Item, selectable: DocumentSelection): Unit = js.native
  def insertContent(model: Model, content: Item, selectable: Element): Unit = js.native
  def insertContent(model: Model, content: Item, selectable: Position): Unit = js.native
  def insertContent(model: Model, content: Item, selectable: Range): Unit = js.native
  def insertContent(model: Model, content: Item, selectable: Selection): Unit = js.native
  def insertContent(model: Model, content: Item, selectable: Iterable[Range]): Unit = js.native
  
  def modifySelection(model: Model, selection: DocumentSelection): Unit = js.native
  def modifySelection(model: Model, selection: DocumentSelection, options: Direction): Unit = js.native
  def modifySelection(model: Model, selection: Selection): Unit = js.native
  def modifySelection(model: Model, selection: Selection, options: Direction): Unit = js.native
}
