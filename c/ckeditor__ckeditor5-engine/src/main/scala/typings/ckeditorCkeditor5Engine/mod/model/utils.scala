package typings.ckeditorCkeditor5Engine.mod.model

import typings.ckeditorCkeditor5Engine.anon.Direction
import typings.ckeditorCkeditor5Engine.anon.DoNotResetEntireContent
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("@ckeditor/ckeditor5-engine", "model.utils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteContent(model: Model, selection: DocumentSelection, batch: Batch): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteContent")(model.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deleteContent(model: Model, selection: DocumentSelection, batch: Batch, options: DoNotResetEntireContent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteContent")(model.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], batch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deleteContent(model: Model, selection: Selection, batch: Batch): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteContent")(model.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deleteContent(model: Model, selection: Selection, batch: Batch, options: DoNotResetEntireContent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteContent")(model.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], batch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getSelectedContent(model: Model, selection: DocumentSelection): DocumentFragment = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedContent")(model.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[DocumentFragment]
  inline def getSelectedContent(model: Model, selection: Selection): DocumentFragment = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedContent")(model.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[DocumentFragment]
  
  inline def injectSelectionPostFixer(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectSelectionPostFixer")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def insertContent(model: Model, content: DocumentFragment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: DocumentFragment, selectable: DocumentSelection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any], selectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: DocumentFragment, selectable: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any], selectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: DocumentFragment, selectable: Position): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any], selectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: DocumentFragment, selectable: Range): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any], selectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: DocumentFragment, selectable: Selection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any], selectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: DocumentFragment, selectable: Iterable[Range]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any], selectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: Item): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: Item, selectable: DocumentSelection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any], selectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: Item, selectable: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any], selectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: Item, selectable: Position): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any], selectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: Item, selectable: Range): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any], selectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: Item, selectable: Selection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any], selectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertContent(model: Model, content: Item, selectable: Iterable[Range]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContent")(model.asInstanceOf[js.Any], content.asInstanceOf[js.Any], selectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def modifySelection(model: Model, selection: DocumentSelection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifySelection")(model.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def modifySelection(model: Model, selection: DocumentSelection, options: Direction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifySelection")(model.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def modifySelection(model: Model, selection: Selection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifySelection")(model.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def modifySelection(model: Model, selection: Selection, options: Direction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifySelection")(model.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
