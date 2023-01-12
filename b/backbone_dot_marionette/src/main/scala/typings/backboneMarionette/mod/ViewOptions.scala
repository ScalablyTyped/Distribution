package typings.backboneMarionette.mod

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewOptions[TModel /* <: Model[Any, ModelSetOptions, Any] */]
  extends StObject
     with typings.backbone.mod.ViewOptions[TModel, HTMLElement]
     with ViewMixinOptions {
  
  /**
    * If you've created a custom region class, you can use it to define
    * your region.
    */
  var regionClass: js.UndefOr[Any] = js.undefined
  
  /**
    * Add regions to this View.
    */
  var regions: js.UndefOr[Any] = js.undefined
  
  /**
    * Set the template of this View.
    */
  var template: js.UndefOr[Any] = js.undefined
  
  /**
    * The templateContext attribute can be used to add extra information to
    * your templates
    */
  var templateContext: js.UndefOr[Any] = js.undefined
}
object ViewOptions {
  
  inline def apply[TModel /* <: Model[Any, ModelSetOptions, Any] */](): ViewOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions[TModel]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewOptions[?], TModel /* <: Model[Any, ModelSetOptions, Any] */] (val x: Self & ViewOptions[TModel]) extends AnyVal {
    
    inline def setRegionClass(value: Any): Self = StObject.set(x, "regionClass", value.asInstanceOf[js.Any])
    
    inline def setRegionClassUndefined: Self = StObject.set(x, "regionClass", js.undefined)
    
    inline def setRegions(value: Any): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setTemplate(value: Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateContext(value: Any): Self = StObject.set(x, "templateContext", value.asInstanceOf[js.Any])
    
    inline def setTemplateContextUndefined: Self = StObject.set(x, "templateContext", js.undefined)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
