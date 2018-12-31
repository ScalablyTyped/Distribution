package typings
package atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "conversion")
@js.native
object conversionNs extends js.Object {
  // engine/conversion/conversion
  @js.native
  class Conversion () extends js.Object {
    def attributeToAttribute(): scala.Unit = js.native
    def attributeToAttribute(definition: atCkeditorCkeditor5DashEngineLib.Anon_ModelViewUpcastAlso): scala.Unit = js.native
    def attributeToElement(definition: ConverterDefinition): scala.Unit = js.native
    def elementToElement(definition: ConverterDefinition): scala.Unit = js.native
    def `for`(groupName: java.lang.String): atCkeditorCkeditor5DashEngineLib.Anon_Add = js.native
    def register(groupName: java.lang.String, dispatchers: js.Array[DowncastDispatcher | UpcastDispatcher]): scala.Unit = js.native
  }
  
  trait ConverterDefinition extends js.Object {
    var converterPriority: atCkeditorCkeditor5DashUtilsLib.ckeditor5DashUtilsMod.PriorityString
    var model: js.Any
    var upcastAlso: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.MatcherPattern | js.Array[atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.MatcherPattern]
    var view: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.ElementDefinition | js.Object
  }
  
  // engine/conversion/downcastdispatcher
  @js.native
  class DowncastDispatcher () extends js.Object
  
  // engine/conversion/downcast-converters
  trait HighlightDescriptor extends js.Object {
    var attributes: js.Object
    var classes: java.lang.String | js.Array[java.lang.String]
    var id: java.lang.String
    var priority: scala.Double
  }
  
  // engine/conversion/mapper
  @js.native
  class Mapper () extends js.Object {
    def bindElementToMarker(
      element: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.Element,
      name: java.lang.String
    ): scala.Unit = js.native
    def bindElements(
      modelElement: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Element,
      viewElement: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.Element
    ): scala.Unit = js.native
    def clearBindings(): scala.Unit = js.native
    def getModelLength(viewNode: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.Element): scala.Double = js.native
    def markerNameToElements(name: java.lang.String): stdLib.Set[atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.Element] | scala.Null = js.native
    def registerViewToModelLength(viewElementName: java.lang.String, lengthCallback: js.Function): scala.Unit = js.native
    def toModelElement(viewElement: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.Element): js.UndefOr[atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Element] = js.native
    def toModelPosition(viewPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.Position): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position = js.native
    def toModelRange(viewRange: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.Range): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Range = js.native
    def toViewElement(modelElement: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Element): js.UndefOr[atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.Element] = js.native
    def toViewPosition(modelPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.Position = js.native
    def toViewPosition(
      modelPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position,
      options: atCkeditorCkeditor5DashEngineLib.Anon_IsPhantom
    ): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.Position = js.native
    def toViewRange(modelRange: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Range): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.Range = js.native
    def unbindElementsFromMarkerName(name: java.lang.String): scala.Unit = js.native
    def unbindModelElement(modelElement: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Element): scala.Unit = js.native
    def unbindViewElement(viewElement: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.viewNs.Element): scala.Unit = js.native
  }
  
  // engine/conversion/modelconsumable
  @js.native
  class ModelConsumable () extends js.Object {
    def add(
      item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      `type`: java.lang.String
    ): scala.Unit = js.native
    def add(
      item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Range,
      `type`: java.lang.String
    ): scala.Unit = js.native
    def add(
      item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Selection,
      `type`: java.lang.String
    ): scala.Unit = js.native
    def consume(
      item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      `type`: java.lang.String
    ): scala.Boolean = js.native
    def consume(
      item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Range,
      `type`: java.lang.String
    ): scala.Boolean = js.native
    def consume(
      item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Selection,
      `type`: java.lang.String
    ): scala.Boolean = js.native
    def revert(
      item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      `type`: java.lang.String
    ): scala.Null | scala.Boolean = js.native
    def revert(
      item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Range,
      `type`: java.lang.String
    ): scala.Null | scala.Boolean = js.native
    def revert(
      item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Selection,
      `type`: java.lang.String
    ): scala.Null | scala.Boolean = js.native
    def test(
      item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      `type`: java.lang.String
    ): scala.Null | scala.Boolean = js.native
    def test(
      item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Range,
      `type`: java.lang.String
    ): scala.Null | scala.Boolean = js.native
    def test(
      item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Selection,
      `type`: java.lang.String
    ): scala.Null | scala.Boolean = js.native
  }
  
  // engine/conversion/upcastdispatcher
  @js.native
  class UpcastDispatcher () extends js.Object
  
  // engine/conversion/viewconsumable
  @js.native
  class ViewConsumable () extends js.Object
  
  trait ViewConversionApi extends js.Object
  
  // engine/conversion/downcast-selection-converters
  def clearAttributes(): js.Function = js.native
  def convertCollapsedSelection(): js.Function = js.native
  def convertRangeSelection(): js.Function = js.native
  // engine/conversion/upcast-selection-converters
  def convertSelectionChange(model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model, mapper: Mapper): js.Function = js.native
  // engine/conversion/upcast-converters
  def convertText(): js.Function = js.native
  def convertToModelFragment(): js.Function = js.native
  def upcastAttributeToAttribute(config: atCkeditorCkeditor5DashEngineLib.Anon_ModelViewConverterPriority): js.Function = js.native
  def upcastElementToAttribute(config: atCkeditorCkeditor5DashEngineLib.Anon_Model): js.Function = js.native
  def upcastElementToElement(config: atCkeditorCkeditor5DashEngineLib.Anon_ModelViewConverterPriorityString): js.Function = js.native
  def upcastElementToMarker(config: atCkeditorCkeditor5DashEngineLib.Anon_ModelView): js.Function = js.native
}

