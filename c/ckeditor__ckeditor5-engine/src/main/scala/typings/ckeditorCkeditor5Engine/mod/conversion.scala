package typings.ckeditorCkeditor5Engine.mod

import typings.ckeditorCkeditor5Engine.anon.Add
import typings.ckeditorCkeditor5Engine.anon.Attribute
import typings.ckeditorCkeditor5Engine.anon.ConverterPriority
import typings.ckeditorCkeditor5Engine.anon.ConverterPriorityModel
import typings.ckeditorCkeditor5Engine.anon.IsPhantom
import typings.ckeditorCkeditor5Engine.anon.Model
import typings.ckeditorCkeditor5Engine.anon.ModelView
import typings.ckeditorCkeditor5Engine.anon.View
import typings.ckeditorCkeditor5Engine.mod.model.Item
import typings.ckeditorCkeditor5Engine.mod.model.Selection
import typings.ckeditorCkeditor5Engine.mod.view.Element
import typings.ckeditorCkeditor5Engine.mod.view.ElementDefinition
import typings.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typings.ckeditorCkeditor5Engine.mod.view.Position
import typings.ckeditorCkeditor5Engine.mod.view.Range
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversion {
  
  @JSImport("@ckeditor/ckeditor5-engine", "conversion")
  @js.native
  val ^ : js.Any = js.native
  
  // engine/conversion/conversion
  @JSImport("@ckeditor/ckeditor5-engine", "conversion.Conversion")
  @js.native
  class Conversion () extends StObject {
    
    def attributeToAttribute(): Unit = js.native
    def attributeToAttribute(definition: Model): Unit = js.native
    
    def attributeToElement(definition: ConverterDefinition): Unit = js.native
    
    def elementToElement(definition: ConverterDefinition): Unit = js.native
    
    def `for`(groupName: String): Add = js.native
    
    def register(groupName: String, dispatchers: js.Array[DowncastDispatcher | UpcastDispatcher]): Unit = js.native
  }
  
  // engine/conversion/downcastdispatcher
  @JSImport("@ckeditor/ckeditor5-engine", "conversion.DowncastDispatcher")
  @js.native
  class DowncastDispatcher () extends StObject
  
  // engine/conversion/mapper
  @JSImport("@ckeditor/ckeditor5-engine", "conversion.Mapper")
  @js.native
  class Mapper () extends StObject {
    
    def bindElementToMarker(element: Element, name: String): Unit = js.native
    
    def bindElements(modelElement: typings.ckeditorCkeditor5Engine.mod.model.Element, viewElement: Element): Unit = js.native
    
    def clearBindings(): Unit = js.native
    
    def getModelLength(viewNode: Element): Double = js.native
    
    def markerNameToElements(name: String): Set[Element] | Null = js.native
    
    def registerViewToModelLength(viewElementName: String, lengthCallback: js.Function): Unit = js.native
    
    def toModelElement(viewElement: Element): js.UndefOr[typings.ckeditorCkeditor5Engine.mod.model.Element] = js.native
    
    def toModelPosition(viewPosition: Position): typings.ckeditorCkeditor5Engine.mod.model.Position = js.native
    
    def toModelRange(viewRange: Range): typings.ckeditorCkeditor5Engine.mod.model.Range = js.native
    
    def toViewElement(modelElement: typings.ckeditorCkeditor5Engine.mod.model.Element): js.UndefOr[Element] = js.native
    
    def toViewPosition(modelPosition: typings.ckeditorCkeditor5Engine.mod.model.Position): Position = js.native
    def toViewPosition(modelPosition: typings.ckeditorCkeditor5Engine.mod.model.Position, options: IsPhantom): Position = js.native
    
    def toViewRange(modelRange: typings.ckeditorCkeditor5Engine.mod.model.Range): Range = js.native
    
    def unbindElementsFromMarkerName(name: String): Unit = js.native
    
    def unbindModelElement(modelElement: typings.ckeditorCkeditor5Engine.mod.model.Element): Unit = js.native
    
    def unbindViewElement(viewElement: Element): Unit = js.native
  }
  
  // engine/conversion/modelconsumable
  @JSImport("@ckeditor/ckeditor5-engine", "conversion.ModelConsumable")
  @js.native
  class ModelConsumable () extends StObject {
    
    def add(item: Item, `type`: String): Unit = js.native
    def add(item: typings.ckeditorCkeditor5Engine.mod.model.Range, `type`: String): Unit = js.native
    def add(item: Selection, `type`: String): Unit = js.native
    
    def consume(item: Item, `type`: String): Boolean = js.native
    def consume(item: typings.ckeditorCkeditor5Engine.mod.model.Range, `type`: String): Boolean = js.native
    def consume(item: Selection, `type`: String): Boolean = js.native
    
    def revert(item: Item, `type`: String): Null | Boolean = js.native
    def revert(item: typings.ckeditorCkeditor5Engine.mod.model.Range, `type`: String): Null | Boolean = js.native
    def revert(item: Selection, `type`: String): Null | Boolean = js.native
    
    def test(item: Item, `type`: String): Null | Boolean = js.native
    def test(item: typings.ckeditorCkeditor5Engine.mod.model.Range, `type`: String): Null | Boolean = js.native
    def test(item: Selection, `type`: String): Null | Boolean = js.native
  }
  
  // engine/conversion/upcastdispatcher
  @JSImport("@ckeditor/ckeditor5-engine", "conversion.UpcastDispatcher")
  @js.native
  class UpcastDispatcher () extends StObject
  
  // engine/conversion/viewconsumable
  @JSImport("@ckeditor/ckeditor5-engine", "conversion.ViewConsumable")
  @js.native
  class ViewConsumable () extends StObject
  
  // engine/conversion/downcast-selection-converters
  @scala.inline
  def clearAttributes(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAttributes")().asInstanceOf[js.Function]
  
  @scala.inline
  def convertCollapsedSelection(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCollapsedSelection")().asInstanceOf[js.Function]
  
  @scala.inline
  def convertRangeSelection(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("convertRangeSelection")().asInstanceOf[js.Function]
  
  // engine/conversion/upcast-selection-converters
  @scala.inline
  def convertSelectionChange(model: typings.ckeditorCkeditor5Engine.mod.model.Model, mapper: Mapper): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("convertSelectionChange")(model.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  // engine/conversion/upcast-converters
  @scala.inline
  def convertText(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("convertText")().asInstanceOf[js.Function]
  
  @scala.inline
  def convertToModelFragment(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToModelFragment")().asInstanceOf[js.Function]
  
  @scala.inline
  def upcastAttributeToAttribute(config: ConverterPriority): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("upcastAttributeToAttribute")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def upcastElementToAttribute(config: View): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("upcastElementToAttribute")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def upcastElementToElement(config: ConverterPriorityModel): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("upcastElementToElement")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def upcastElementToMarker(config: ModelView): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("upcastElementToMarker")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  trait ConverterDefinition extends StObject {
    
    var converterPriority: PriorityString
    
    var model: js.Any
    
    var upcastAlso: MatcherPattern | js.Array[MatcherPattern]
    
    var view: ElementDefinition | js.Object
  }
  object ConverterDefinition {
    
    @scala.inline
    def apply(
      converterPriority: PriorityString,
      model: js.Any,
      upcastAlso: MatcherPattern | js.Array[MatcherPattern],
      view: ElementDefinition | js.Object
    ): ConverterDefinition = {
      val __obj = js.Dynamic.literal(converterPriority = converterPriority.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], upcastAlso = upcastAlso.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConverterDefinition]
    }
    
    @scala.inline
    implicit class ConverterDefinitionMutableBuilder[Self <: ConverterDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConverterPriority(value: PriorityString): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpcastAlso(value: MatcherPattern | js.Array[MatcherPattern]): Self = StObject.set(x, "upcastAlso", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpcastAlsoFunction1(value: /* element */ Element => Null | Attribute): Self = StObject.set(x, "upcastAlso", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpcastAlsoVarargs(value: MatcherPattern*): Self = StObject.set(x, "upcastAlso", js.Array(value :_*))
      
      @scala.inline
      def setView(value: ElementDefinition | js.Object): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  // engine/conversion/downcast-converters
  trait HighlightDescriptor extends StObject {
    
    var attributes: js.Object
    
    var classes: String | js.Array[String]
    
    var id: String
    
    var priority: Double
  }
  object HighlightDescriptor {
    
    @scala.inline
    def apply(attributes: js.Object, classes: String | js.Array[String], id: String, priority: Double): HighlightDescriptor = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightDescriptor]
    }
    
    @scala.inline
    implicit class HighlightDescriptorMutableBuilder[Self <: HighlightDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClasses(value: String | js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewConversionApi extends StObject
}
