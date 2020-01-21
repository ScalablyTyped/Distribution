package typings.ckeditorCkeditor5Engine.mod

import typings.ckeditorCkeditor5Engine.AnonArg
import typings.ckeditorCkeditor5Engine.AnonBatchType
import typings.ckeditorCkeditor5Engine.AnonContext
import typings.ckeditorCkeditor5Engine.AnonConvertMarkers
import typings.ckeditorCkeditor5Engine.AnonIgnoreRoot
import typings.ckeditorCkeditor5Engine.AnonLastRangeBackward
import typings.ckeditorCkeditor5Engine.AnonRenderUIElements
import typings.ckeditorCkeditor5Engine.AnonRootName
import typings.ckeditorCkeditor5Engine.mod.model.Batch
import typings.ckeditorCkeditor5Engine.mod.model.Marker
import typings.ckeditorCkeditor5Engine.mod.model.Model
import typings.ckeditorCkeditor5Engine.mod.model.RootElement
import typings.ckeditorCkeditor5Engine.mod.model.Schema
import typings.ckeditorCkeditor5Engine.mod.model.Selection
import typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment
import typings.ckeditorCkeditor5Engine.mod.view.DocumentSelection
import typings.ckeditorCkeditor5Engine.mod.view.Element
import typings.ckeditorCkeditor5Engine.mod.view.Position
import typings.ckeditorCkeditor5Engine.mod.view.Range
import typings.ckeditorCkeditor5Engine.mod.view.Text
import typings.ckeditorCkeditor5Engine.mod.view.View
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "devUtils")
@js.native
object devUtils extends js.Object {
  // engine/dev-utils/enableenginedebug
  @js.native
  class DebugPlugin () extends js.Object
  
  // engine/dev-utils/operationreplayer
  @js.native
  class OperationReplayer () extends js.Object
  
  def disableEngineDebug(): Unit = js.native
  def enableEngineDebug(_logger: AnonArg): DebugPlugin = js.native
  // engine/dev-utils/view
  def getData(view: View): String = js.native
  def getData(view: View, options: AnonRenderUIElements): String = js.native
  def parse(data: String, options: AnonLastRangeBackward): Text | Element | DocumentFragment | js.Object = js.native
  def setData(view: View, data: String, options: AnonRootName): Unit = js.native
  def stringify(node: DocumentFragment): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: DocumentSelection, options: AnonIgnoreRoot): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Position, options: AnonIgnoreRoot): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Range, options: AnonIgnoreRoot): String = js.native
  def stringify(node: Element): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: DocumentSelection, options: AnonIgnoreRoot): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Position, options: AnonIgnoreRoot): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Range, options: AnonIgnoreRoot): String = js.native
  def stringify(node: Text): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: DocumentSelection, options: AnonIgnoreRoot): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Position, options: AnonIgnoreRoot): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Range, options: AnonIgnoreRoot): String = js.native
  // engine/dev-utils/model
  @js.native
  object devmodel extends js.Object {
    def getData(model: Model): String = js.native
    def getData(model: Model, options: AnonConvertMarkers): String = js.native
    def parse(data: String, schema: Schema, batch: Batch): typings.ckeditorCkeditor5Engine.mod.model.Element | typings.ckeditorCkeditor5Engine.mod.model.Text | typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment | js.Object = js.native
    def parse(data: String, schema: Schema, batch: Batch, options: AnonContext): typings.ckeditorCkeditor5Engine.mod.model.Element | typings.ckeditorCkeditor5Engine.mod.model.Text | typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment | js.Object = js.native
    def setData(model: String, data: js.Object, options: AnonBatchType): Unit = js.native
    def stringify(
      node: RootElement | typings.ckeditorCkeditor5Engine.mod.model.Element | typings.ckeditorCkeditor5Engine.mod.model.Text | typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: Selection | typings.ckeditorCkeditor5Engine.mod.model.Position | typings.ckeditorCkeditor5Engine.mod.model.Range
    ): String = js.native
    def stringify(
      node: RootElement | typings.ckeditorCkeditor5Engine.mod.model.Element | typings.ckeditorCkeditor5Engine.mod.model.Text | typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: Selection | typings.ckeditorCkeditor5Engine.mod.model.Position | typings.ckeditorCkeditor5Engine.mod.model.Range,
      markers: Iterable[Marker]
    ): String = js.native
  }
  
}

