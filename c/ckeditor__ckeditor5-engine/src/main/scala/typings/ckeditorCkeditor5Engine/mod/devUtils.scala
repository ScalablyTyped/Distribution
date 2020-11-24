package typings.ckeditorCkeditor5Engine.mod

import typings.ckeditorCkeditor5Engine.anon.BatchType
import typings.ckeditorCkeditor5Engine.anon.Context
import typings.ckeditorCkeditor5Engine.anon.ConvertMarkers
import typings.ckeditorCkeditor5Engine.anon.Error
import typings.ckeditorCkeditor5Engine.anon.IgnoreRoot
import typings.ckeditorCkeditor5Engine.anon.LastRangeBackward
import typings.ckeditorCkeditor5Engine.anon.RenderUIElements
import typings.ckeditorCkeditor5Engine.anon.RootName
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-engine", "devUtils")
@js.native
object devUtils extends js.Object {
  
  def disableEngineDebug(): Unit = js.native
  
  def enableEngineDebug(_logger: Error): DebugPlugin = js.native
  
  // engine/dev-utils/view
  def getData(view: View): String = js.native
  def getData(view: View, options: RenderUIElements): String = js.native
  
  def parse(data: String, options: LastRangeBackward): Text | Element | DocumentFragment | js.Object = js.native
  
  def setData(view: View, data: String, options: RootName): Unit = js.native
  
  def stringify(node: DocumentFragment): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: js.UndefOr[scala.Nothing], options: IgnoreRoot): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: DocumentSelection, options: IgnoreRoot): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Position, options: IgnoreRoot): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Range, options: IgnoreRoot): String = js.native
  def stringify(node: Element): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: js.UndefOr[scala.Nothing], options: IgnoreRoot): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: DocumentSelection, options: IgnoreRoot): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Position, options: IgnoreRoot): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Range, options: IgnoreRoot): String = js.native
  def stringify(node: Text): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: js.UndefOr[scala.Nothing], options: IgnoreRoot): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: DocumentSelection, options: IgnoreRoot): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Position, options: IgnoreRoot): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Range, options: IgnoreRoot): String = js.native
  
  // engine/dev-utils/enableenginedebug
  @js.native
  class DebugPlugin () extends js.Object
  
  // engine/dev-utils/operationreplayer
  @js.native
  class OperationReplayer () extends js.Object
  
  // engine/dev-utils/model
  @js.native
  object devmodel extends js.Object {
    
    def getData(model: Model): String = js.native
    def getData(model: Model, options: ConvertMarkers): String = js.native
    
    def parse(data: String, schema: Schema, batch: Batch): typings.ckeditorCkeditor5Engine.mod.model.Element | typings.ckeditorCkeditor5Engine.mod.model.Text | typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment | js.Object = js.native
    def parse(data: String, schema: Schema, batch: Batch, options: Context): typings.ckeditorCkeditor5Engine.mod.model.Element | typings.ckeditorCkeditor5Engine.mod.model.Text | typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment | js.Object = js.native
    
    def setData(model: String, data: js.Object, options: BatchType): Unit = js.native
    
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Position
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Position,
      markers: Iterable[Marker]
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Range
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Range,
      markers: Iterable[Marker]
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: Selection
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: Selection,
      markers: Iterable[Marker]
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.Element,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Position
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.Element,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Position,
      markers: Iterable[Marker]
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.Element,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Range
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.Element,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Range,
      markers: Iterable[Marker]
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.Element,
       // TODO optional
    selectionOrPositionOrRange: Selection
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.Element,
       // TODO optional
    selectionOrPositionOrRange: Selection,
      markers: Iterable[Marker]
    ): String = js.native
    def stringify(
      node: RootElement,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Position
    ): String = js.native
    def stringify(
      node: RootElement,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Position,
      markers: Iterable[Marker]
    ): String = js.native
    def stringify(
      node: RootElement,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Range
    ): String = js.native
    def stringify(
      node: RootElement,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Range,
      markers: Iterable[Marker]
    ): String = js.native
    def stringify(node: RootElement,  // TODO optional
    selectionOrPositionOrRange: Selection): String = js.native
    def stringify(
      node: RootElement,
       // TODO optional
    selectionOrPositionOrRange: Selection,
      markers: Iterable[Marker]
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.Text,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Position
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.Text,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Position,
      markers: Iterable[Marker]
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.Text,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Range
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.Text,
       // TODO optional
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.model.Range,
      markers: Iterable[Marker]
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.Text,
       // TODO optional
    selectionOrPositionOrRange: Selection
    ): String = js.native
    def stringify(
      node: typings.ckeditorCkeditor5Engine.mod.model.Text,
       // TODO optional
    selectionOrPositionOrRange: Selection,
      markers: Iterable[Marker]
    ): String = js.native
  }
}
