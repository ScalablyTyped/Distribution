package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod

import typings.atCkeditorCkeditor5DashEngine.Anon_Add
import typings.atCkeditorCkeditor5DashEngine.Anon_ConverterPriority
import typings.atCkeditorCkeditor5DashEngine.Anon_ConverterPriorityModel
import typings.atCkeditorCkeditor5DashEngine.Anon_ConverterPriorityModelView
import typings.atCkeditorCkeditor5DashEngine.Anon_ConverterPriorityModelViewFunction
import typings.atCkeditorCkeditor5DashEngine.Anon_IsPhantom
import typings.atCkeditorCkeditor5DashEngine.Anon_Model
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.conversionNs.ConverterDefinition
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.conversionNs.DowncastDispatcher
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.conversionNs.Mapper
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.conversionNs.UpcastDispatcher
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Item
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Model
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Selection
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Element
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.ElementDefinition
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.MatcherPattern
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Position
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Range
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.PriorityString
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "conversion")
@js.native
object conversionNs extends js.Object {
  // engine/conversion/conversion
  @js.native
  class Conversion () extends js.Object {
    def attributeToAttribute(): Unit = js.native
    def attributeToAttribute(definition: Anon_Model): Unit = js.native
    def attributeToElement(definition: ConverterDefinition): Unit = js.native
    def elementToElement(definition: ConverterDefinition): Unit = js.native
    def `for`(groupName: String): Anon_Add = js.native
    def register(groupName: String, dispatchers: js.Array[DowncastDispatcher | UpcastDispatcher]): Unit = js.native
  }
  
  trait ConverterDefinition extends js.Object {
    var converterPriority: PriorityString
    var model: js.Any
    var upcastAlso: MatcherPattern | js.Array[MatcherPattern]
    var view: ElementDefinition | js.Object
  }
  
  // engine/conversion/downcastdispatcher
  @js.native
  class DowncastDispatcher () extends js.Object
  
  // engine/conversion/downcast-converters
  trait HighlightDescriptor extends js.Object {
    var attributes: js.Object
    var classes: String | js.Array[String]
    var id: String
    var priority: Double
  }
  
  // engine/conversion/mapper
  @js.native
  class Mapper () extends js.Object {
    def bindElementToMarker(element: Element, name: String): Unit = js.native
    def bindElements(
      modelElement: typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Element,
      viewElement: Element
    ): Unit = js.native
    def clearBindings(): Unit = js.native
    def getModelLength(viewNode: Element): Double = js.native
    def markerNameToElements(name: String): Set[Element] | Null = js.native
    def registerViewToModelLength(viewElementName: String, lengthCallback: js.Function): Unit = js.native
    def toModelElement(viewElement: Element): js.UndefOr[
        typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Element
      ] = js.native
    def toModelPosition(viewPosition: Position): typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Position = js.native
    def toModelRange(viewRange: Range): typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Range = js.native
    def toViewElement(
      modelElement: typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Element
    ): js.UndefOr[Element] = js.native
    def toViewPosition(
      modelPosition: typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Position
    ): Position = js.native
    def toViewPosition(
      modelPosition: typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Position,
      options: Anon_IsPhantom
    ): Position = js.native
    def toViewRange(modelRange: typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Range): Range = js.native
    def unbindElementsFromMarkerName(name: String): Unit = js.native
    def unbindModelElement(
      modelElement: typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Element
    ): Unit = js.native
    def unbindViewElement(viewElement: Element): Unit = js.native
  }
  
  // engine/conversion/modelconsumable
  @js.native
  class ModelConsumable () extends js.Object {
    def add(item: Item, `type`: String): Unit = js.native
    def add(
      item: typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Range,
      `type`: String
    ): Unit = js.native
    def add(item: Selection, `type`: String): Unit = js.native
    def consume(item: Item, `type`: String): Boolean = js.native
    def consume(
      item: typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Range,
      `type`: String
    ): Boolean = js.native
    def consume(item: Selection, `type`: String): Boolean = js.native
    def revert(item: Item, `type`: String): Null | Boolean = js.native
    def revert(
      item: typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Range,
      `type`: String
    ): Null | Boolean = js.native
    def revert(item: Selection, `type`: String): Null | Boolean = js.native
    def test(item: Item, `type`: String): Null | Boolean = js.native
    def test(
      item: typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Range,
      `type`: String
    ): Null | Boolean = js.native
    def test(item: Selection, `type`: String): Null | Boolean = js.native
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
  def convertSelectionChange(model: Model, mapper: Mapper): js.Function = js.native
  // engine/conversion/upcast-converters
  def convertText(): js.Function = js.native
  def convertToModelFragment(): js.Function = js.native
  def upcastAttributeToAttribute(config: Anon_ConverterPriority): js.Function = js.native
  def upcastElementToAttribute(config: Anon_ConverterPriorityModel): js.Function = js.native
  def upcastElementToElement(config: Anon_ConverterPriorityModelView): js.Function = js.native
  def upcastElementToMarker(config: Anon_ConverterPriorityModelViewFunction): js.Function = js.native
}

