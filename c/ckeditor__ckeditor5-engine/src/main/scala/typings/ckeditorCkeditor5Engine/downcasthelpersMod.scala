package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.ConverterPriority
import typings.ckeditorCkeditor5Engine.anon.ConverterPriorityModel
import typings.ckeditorCkeditor5Engine.anon.ConverterPriorityModelView
import typings.ckeditorCkeditor5Engine.anon.IsOpening
import typings.ckeditorCkeditor5Engine.anon.MarkerRange
import typings.ckeditorCkeditor5Engine.anon.ModelView
import typings.ckeditorCkeditor5Engine.anon.TriggerBy
import typings.ckeditorCkeditor5Engine.anon.View
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.addMarker
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.insert
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.insertColon$text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.selection
import typings.ckeditorCkeditor5Engine.downcastdispatcherMod.DowncastConversionApi
import typings.ckeditorCkeditor5Engine.downcastdispatcherMod.DowncastDispatcherCallback
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downcasthelpersMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/downcasthelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/downcasthelpers", JSImport.Default)
  @js.native
  open class default () extends DowncastHelpers
  
  inline def clearAttributes(): DowncastDispatcherCallback[
    selection, 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAttributes")().asInstanceOf[DowncastDispatcherCallback[
    selection, 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ]]
  
  inline def convertCollapsedSelection(): DowncastDispatcherCallback[
    selection, 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCollapsedSelection")().asInstanceOf[DowncastDispatcherCallback[
    selection, 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ]]
  
  inline def convertRangeSelection(): DowncastDispatcherCallback[
    selection, 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertRangeSelection")().asInstanceOf[DowncastDispatcherCallback[
    selection, 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ]]
  
  inline def createViewElementFromHighlightDescriptor(
    writer: typings.ckeditorCkeditor5Engine.downcastwriterMod.default[typings.ckeditorCkeditor5Engine.viewDocumentMod.default],
    descriptor: HighlightDescriptor
  ): typings.ckeditorCkeditor5Engine.attributeelementMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createViewElementFromHighlightDescriptor")(writer.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.attributeelementMod.default]
  
  inline def insertElement(
    elementCreator: js.Function2[
      /* modelItem */ typings.ckeditorCkeditor5Engine.elementMod.default, 
      /* conversionApi */ DowncastConversionApi[Any], 
      typings.ckeditorCkeditor5Engine.viewElementMod.default | Unit | Null
    ]
  ): DowncastDispatcherCallback[
    insert | (/* template literal string: insert:${string} */ String), 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertElement")(elementCreator.asInstanceOf[js.Any]).asInstanceOf[DowncastDispatcherCallback[
    insert | (/* template literal string: insert:${string} */ String), 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ]]
  
  inline def insertText(): DowncastDispatcherCallback[
    insertColon$text, 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertText")().asInstanceOf[DowncastDispatcherCallback[
    insertColon$text, 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ]]
  
  inline def insertUIElement(
    elementOrElementCreator: js.Function2[
      /* data */ MarkerRange & IsOpening, 
      /* conversionApi */ DowncastConversionApi[Any], 
      typings.ckeditorCkeditor5Engine.uielementMod.default | Unit | Null
    ]
  ): DowncastDispatcherCallback[
    addMarker | (/* template literal string: addMarker:${string} */ String), 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertUIElement")(elementOrElementCreator.asInstanceOf[js.Any]).asInstanceOf[DowncastDispatcherCallback[
    addMarker | (/* template literal string: addMarker:${string} */ String), 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ]]
  inline def insertUIElement(elementOrElementCreator: typings.ckeditorCkeditor5Engine.uielementMod.default): DowncastDispatcherCallback[
    addMarker | (/* template literal string: addMarker:${string} */ String), 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertUIElement")(elementOrElementCreator.asInstanceOf[js.Any]).asInstanceOf[DowncastDispatcherCallback[
    addMarker | (/* template literal string: addMarker:${string} */ String), 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ]]
  
  inline def remove(): DowncastDispatcherCallback[
    typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.remove, 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[DowncastDispatcherCallback[
    typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.remove, 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ]]
  
  inline def wrap(
    elementCreator: js.Function2[
      /* modelAttributeValue */ Any, 
      /* conversionApi */ DowncastConversionApi[Any], 
      typings.ckeditorCkeditor5Engine.viewElementMod.default | Unit | Null
    ]
  ): DowncastDispatcherCallback[
    /* template literal string: attribute:${string}:$text */ String, 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(elementCreator.asInstanceOf[js.Any]).asInstanceOf[DowncastDispatcherCallback[
    /* template literal string: attribute:${string}:$text */ String, 
    js.Object, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ]]
  
  @js.native
  trait DowncastHelpers
    extends typings.ckeditorCkeditor5Engine.conversionhelpersMod.default[DowncastHelpers] {
    
    def attributeToAttribute(): this.type = js.native
    def attributeToAttribute(config: ConverterPriority): this.type = js.native
    
    def attributeToElement(): this.type = js.native
    def attributeToElement(config: View): this.type = js.native
    
    def elementToElement(): this.type = js.native
    def elementToElement(config: TriggerBy): this.type = js.native
    
    def markerToData(): this.type = js.native
    def markerToData(config: ConverterPriorityModel): this.type = js.native
    
    def markerToElement(): this.type = js.native
    def markerToElement(config: ModelView): this.type = js.native
    
    def markerToHighlight(): this.type = js.native
    def markerToHighlight(config: ConverterPriorityModelView): this.type = js.native
  }
  
  trait HighlightDescriptor extends StObject {
    
    var attributes: js.UndefOr[Record[String, String | Double | Boolean]] = js.undefined
    
    var classes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
  }
  object HighlightDescriptor {
    
    inline def apply(): HighlightDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightDescriptor]
    }
    
    extension [Self <: HighlightDescriptor](x: Self) {
      
      inline def setAttributes(value: Record[String, String | Double | Boolean]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setClasses(value: String | js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
