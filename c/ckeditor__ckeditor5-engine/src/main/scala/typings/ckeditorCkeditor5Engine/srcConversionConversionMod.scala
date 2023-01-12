package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Attribute
import typings.ckeditorCkeditor5Engine.anon.Model
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.dataDowncast
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.downcast
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.editingDowncast
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.upcast
import typings.ckeditorCkeditor5Engine.srcViewElementdefinitionMod.ElementDefinition
import typings.ckeditorCkeditor5Engine.srcViewMatcherMod.MatcherPattern
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConversionConversionMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/conversion", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Conversion {
    def this(
      downcastDispatchers: js.Array[
            typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object]
          ],
      upcastDispatchers: js.Array[typings.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.default]
    ) = this()
    def this(
      downcastDispatchers: js.Array[
            typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object]
          ],
      upcastDispatchers: typings.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.default
    ) = this()
    def this(
      downcastDispatchers: typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object],
      upcastDispatchers: js.Array[typings.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.default]
    ) = this()
    def this(
      downcastDispatchers: typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object],
      upcastDispatchers: typings.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.default
    ) = this()
  }
  
  @js.native
  trait Conversion extends StObject {
    
    def addAlias(
      alias: String,
      dispatcher: typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object]
    ): Unit = js.native
    def addAlias(
      alias: String,
      dispatcher: typings.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.default
    ): Unit = js.native
    
    def attributeToAttribute(): Unit = js.native
    def attributeToAttribute(definition: Model): Unit = js.native
    
    def attributeToElement(definition: ConverterDefinition): Unit = js.native
    
    def elementToElement(definition: ConverterDefinition): Unit = js.native
    
    def `for`(groupName: upcast | downcast | dataDowncast | editingDowncast): typings.ckeditorCkeditor5Engine.srcConversionUpcasthelpersMod.default | typings.ckeditorCkeditor5Engine.srcConversionDowncasthelpersMod.default = js.native
    @JSName("for")
    def for_default(groupName: dataDowncast | editingDowncast | downcast): typings.ckeditorCkeditor5Engine.srcConversionDowncasthelpersMod.default = js.native
    @JSName("for")
    def for_upcast(groupName: upcast): typings.ckeditorCkeditor5Engine.srcConversionUpcasthelpersMod.default = js.native
  }
  
  trait ConverterDefinition extends StObject {
    
    var converterPriority: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any
      ] = js.undefined
    
    var model: Any
    
    var upcastAlso: js.UndefOr[MatcherPattern | js.Array[MatcherPattern]] = js.undefined
    
    var view: ElementDefinition | (Record[String, Any])
  }
  object ConverterDefinition {
    
    inline def apply(model: Any, view: ElementDefinition | (Record[String, Any])): ConverterDefinition = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConverterDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConverterDefinition] (val x: Self) extends AnyVal {
      
      inline def setConverterPriority(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any
      ): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
      
      inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setUpcastAlso(value: MatcherPattern | js.Array[MatcherPattern]): Self = StObject.set(x, "upcastAlso", value.asInstanceOf[js.Any])
      
      inline def setUpcastAlsoFunction1(
        value: /* element */ typings.ckeditorCkeditor5Engine.srcViewElementMod.default => Unit | Null | Attribute
      ): Self = StObject.set(x, "upcastAlso", js.Any.fromFunction1(value))
      
      inline def setUpcastAlsoUndefined: Self = StObject.set(x, "upcastAlso", js.undefined)
      
      inline def setUpcastAlsoVarargs(value: MatcherPattern*): Self = StObject.set(x, "upcastAlso", js.Array(value*))
      
      inline def setView(value: ElementDefinition | (Record[String, Any])): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
