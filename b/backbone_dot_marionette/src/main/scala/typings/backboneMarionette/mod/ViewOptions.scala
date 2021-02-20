package typings.backboneMarionette.mod

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewOptions[TModel /* <: Model[_, ModelSetOptions, js.Object] */]
  extends typings.backbone.mod.ViewOptions[TModel]
     with ViewMixinOptions {
  
  /**
    * If you've created a custom region class, you can use it to define
    * your region.
    */
  var regionClass: js.UndefOr[js.Any] = js.native
  
  /**
    * Add regions to this View.
    */
  var regions: js.UndefOr[js.Any] = js.native
  
  /**
    * Set the template of this View.
    */
  var template: js.UndefOr[js.Any] = js.native
  
  /**
    * The templateContext attribute can be used to add extra information to
    * your templates
    */
  var templateContext: js.UndefOr[js.Any] = js.native
}
object ViewOptions {
  
  @scala.inline
  def apply[TModel /* <: Model[_, ModelSetOptions, js.Object] */](): ViewOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions[TModel]]
  }
  
  @scala.inline
  implicit class ViewOptionsMutableBuilder[Self <: ViewOptions[_], TModel /* <: Model[_, ModelSetOptions, js.Object] */] (val x: Self with ViewOptions[TModel]) extends AnyVal {
    
    @scala.inline
    def setRegionClass(value: js.Any): Self = StObject.set(x, "regionClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionClassUndefined: Self = StObject.set(x, "regionClass", js.undefined)
    
    @scala.inline
    def setRegions(value: js.Any): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setTemplate(value: js.Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateContext(value: js.Any): Self = StObject.set(x, "templateContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateContextUndefined: Self = StObject.set(x, "templateContext", js.undefined)
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
