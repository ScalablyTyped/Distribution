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
import typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment
import typings.ckeditorCkeditor5Engine.mod.model.Element
import typings.ckeditorCkeditor5Engine.mod.model.Marker
import typings.ckeditorCkeditor5Engine.mod.model.Model
import typings.ckeditorCkeditor5Engine.mod.model.Position
import typings.ckeditorCkeditor5Engine.mod.model.Range
import typings.ckeditorCkeditor5Engine.mod.model.RootElement
import typings.ckeditorCkeditor5Engine.mod.model.Schema
import typings.ckeditorCkeditor5Engine.mod.model.Selection
import typings.ckeditorCkeditor5Engine.mod.model.Text
import typings.ckeditorCkeditor5Engine.mod.view.DocumentSelection
import typings.ckeditorCkeditor5Engine.mod.view.View
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devUtils {
  
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils")
  @js.native
  val ^ : js.Any = js.native
  
  // engine/dev-utils/enableenginedebug
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.DebugPlugin")
  @js.native
  class DebugPlugin () extends StObject
  
  // engine/dev-utils/operationreplayer
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.OperationReplayer")
  @js.native
  class OperationReplayer () extends StObject
  
  // engine/dev-utils/model
  object devmodel {
    
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getData(model: Model): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(model.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def getData(model: Model, options: ConvertMarkers): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getData")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def parse(data: String, schema: Schema, batch: Batch): Element | Text | DocumentFragment | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[Element | Text | DocumentFragment | js.Object]
    @scala.inline
    def parse(data: String, schema: Schema, batch: Batch, options: Context): Element | Text | DocumentFragment | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], batch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element | Text | DocumentFragment | js.Object]
    
    @scala.inline
    def setData(model: String, data: js.Object, options: BatchType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setData")(model.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def stringify(node: DocumentFragment, selectionOrPositionOrRange: Position): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(
      node: DocumentFragment,
      selectionOrPositionOrRange: Position,
      // TODO optional
    markers: Iterable[Marker]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: DocumentFragment, selectionOrPositionOrRange: Range): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(
      node: DocumentFragment,
      selectionOrPositionOrRange: Range,
      // TODO optional
    markers: Iterable[Marker]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: DocumentFragment, selectionOrPositionOrRange: Selection): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(
      node: DocumentFragment,
      selectionOrPositionOrRange: Selection,
      // TODO optional
    markers: Iterable[Marker]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: Element, selectionOrPositionOrRange: Position): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: Element, selectionOrPositionOrRange: Position, // TODO optional
    markers: Iterable[Marker]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: Element, selectionOrPositionOrRange: Range): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: Element, selectionOrPositionOrRange: Range, // TODO optional
    markers: Iterable[Marker]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: Element, selectionOrPositionOrRange: Selection): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: Element, selectionOrPositionOrRange: Selection, // TODO optional
    markers: Iterable[Marker]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: RootElement, selectionOrPositionOrRange: Position): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(
      node: RootElement,
      selectionOrPositionOrRange: Position,
      // TODO optional
    markers: Iterable[Marker]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: RootElement, selectionOrPositionOrRange: Range): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: RootElement, selectionOrPositionOrRange: Range, // TODO optional
    markers: Iterable[Marker]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: RootElement, selectionOrPositionOrRange: Selection): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(
      node: RootElement,
      selectionOrPositionOrRange: Selection,
      // TODO optional
    markers: Iterable[Marker]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: Text, selectionOrPositionOrRange: Position): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: Text, selectionOrPositionOrRange: Position, // TODO optional
    markers: Iterable[Marker]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: Text, selectionOrPositionOrRange: Range): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: Text, selectionOrPositionOrRange: Range, // TODO optional
    markers: Iterable[Marker]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: Text, selectionOrPositionOrRange: Selection): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def stringify(node: Text, selectionOrPositionOrRange: Selection, // TODO optional
    markers: Iterable[Marker]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @scala.inline
  def disableEngineDebug(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableEngineDebug")().asInstanceOf[Unit]
  
  @scala.inline
  def enableEngineDebug(_logger: Error): DebugPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("enableEngineDebug")(_logger.asInstanceOf[js.Any]).asInstanceOf[DebugPlugin]
  
  // engine/dev-utils/view
  @scala.inline
  def getData(view: View): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(view.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getData(view: View, options: RenderUIElements): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getData")(view.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def parse(data: String, options: LastRangeBackward): typings.ckeditorCkeditor5Engine.mod.view.Text | typings.ckeditorCkeditor5Engine.mod.view.Element | typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.mod.view.Text | typings.ckeditorCkeditor5Engine.mod.view.Element | typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment | js.Object]
  
  @scala.inline
  def setData(view: View, data: String, options: RootName): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setData")(view.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def stringify(node: typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: Unit,
    options: IgnoreRoot
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: DocumentSelection
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: DocumentSelection,
    options: IgnoreRoot
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.view.Position
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.view.Position,
    options: IgnoreRoot
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.view.Range
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.view.Range,
    options: IgnoreRoot
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(node: typings.ckeditorCkeditor5Engine.mod.view.Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: Unit,
    options: IgnoreRoot
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: DocumentSelection
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: DocumentSelection,
    options: IgnoreRoot
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.view.Position
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.view.Position,
    options: IgnoreRoot
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.view.Range
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.view.Range,
    options: IgnoreRoot
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(node: typings.ckeditorCkeditor5Engine.mod.view.Text): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: Unit,
    options: IgnoreRoot
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(node: typings.ckeditorCkeditor5Engine.mod.view.Text, selectionOrPositionOrRange: DocumentSelection): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: DocumentSelection,
    options: IgnoreRoot
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.view.Position
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.view.Position,
    options: IgnoreRoot
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.view.Range
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    node: typings.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: typings.ckeditorCkeditor5Engine.mod.view.Range,
    options: IgnoreRoot
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], selectionOrPositionOrRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
