package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.DowncastConversionApi
import typings.ckeditorCkeditor5Engine.srcModelElementMod.default
import typings.ckeditorCkeditor5Engine.srcViewElementdefinitionMod.ElementDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerBy extends StObject {
  
  var converterPriority: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
  ] = js.undefined
  
  var model: String
  
  var triggerBy: js.UndefOr[Attributes] = js.undefined
  
  var view: ElementDefinition | (js.Function2[
    /* element */ default, 
    /* api */ DowncastConversionApi[Any], 
    typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default
  ])
}
object TriggerBy {
  
  inline def apply(
    model: String,
    view: ElementDefinition | (js.Function2[
      /* element */ default, 
      /* api */ DowncastConversionApi[Any], 
      typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default
    ])
  ): TriggerBy = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerBy] (val x: Self) extends AnyVal {
    
    inline def setConverterPriority(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriorityString */ Any) | Double
    ): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    inline def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setTriggerBy(value: Attributes): Self = StObject.set(x, "triggerBy", value.asInstanceOf[js.Any])
    
    inline def setTriggerByUndefined: Self = StObject.set(x, "triggerBy", js.undefined)
    
    inline def setView(
      value: ElementDefinition | (js.Function2[
          /* element */ default, 
          /* api */ DowncastConversionApi[Any], 
          typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default
        ])
    ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewFunction2(
      value: (/* element */ default, /* api */ DowncastConversionApi[Any]) => typings.ckeditorCkeditor5Engine.srcViewContainerelementMod.default
    ): Self = StObject.set(x, "view", js.Any.fromFunction2(value))
  }
}
