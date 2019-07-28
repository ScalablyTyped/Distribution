package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod

import typings.atCkeditorCkeditor5DashEngine.Anon_Arg
import typings.atCkeditorCkeditor5DashEngine.Anon_BatchType
import typings.atCkeditorCkeditor5DashEngine.Anon_Context
import typings.atCkeditorCkeditor5DashEngine.Anon_ConvertMarkers
import typings.atCkeditorCkeditor5DashEngine.Anon_IgnoreRoot
import typings.atCkeditorCkeditor5DashEngine.Anon_LastRangeBackward
import typings.atCkeditorCkeditor5DashEngine.Anon_RenderUIElements
import typings.atCkeditorCkeditor5DashEngine.Anon_RootName
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.devUtilsNs.DebugPlugin
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Batch
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Marker
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Model
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.RootElement
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Schema
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Selection
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentFragment
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentSelection
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Element
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Position
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Range
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Text
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.View
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "devUtils")
@js.native
object devUtilsNs extends js.Object {
  // engine/dev-utils/enableenginedebug
  @js.native
  class DebugPlugin () extends js.Object
  
  // engine/dev-utils/operationreplayer
  @js.native
  class OperationReplayer () extends js.Object
  
  def disableEngineDebug(): Unit = js.native
  def enableEngineDebug(_logger: Anon_Arg): DebugPlugin = js.native
  // engine/dev-utils/view
  def getData(view: View): String = js.native
  def getData(view: View, options: Anon_RenderUIElements): String = js.native
  def parse(data: String, options: Anon_LastRangeBackward): Text | Element | DocumentFragment | js.Object = js.native
  def setData(view: View, data: String, options: Anon_RootName): Unit = js.native
  def stringify(node: DocumentFragment): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: DocumentSelection, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Position, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Range, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: Element): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: DocumentSelection, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Position, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Range, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: Text): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: DocumentSelection, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Position, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Range, options: Anon_IgnoreRoot): String = js.native
  // engine/dev-utils/model
  @JSName("devmodel")
  @js.native
  object devmodelNs extends js.Object {
    def getData(model: Model): String = js.native
    def getData(model: Model, options: Anon_ConvertMarkers): String = js.native
    def parse(data: String, schema: Schema, batch: Batch): typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Element | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Text | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.DocumentFragment | js.Object = js.native
    def parse(data: String, schema: Schema, batch: Batch, options: Anon_Context): typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Element | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Text | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.DocumentFragment | js.Object = js.native
    def setData(model: String, data: js.Object, options: Anon_BatchType): Unit = js.native
    def stringify(
      node: RootElement | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Element | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Text | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: Selection | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Position | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Range
    ): String = js.native
    def stringify(
      node: RootElement | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Element | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Text | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: Selection | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Position | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Range,
      markers: Iterable[Marker]
    ): String = js.native
  }
  
}

