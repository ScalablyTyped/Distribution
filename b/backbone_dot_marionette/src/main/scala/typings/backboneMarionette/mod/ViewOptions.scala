package typings.backboneMarionette.mod

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewOptions[TModel /* <: Model[_, ModelSetOptions] */]
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
  def apply[/* <: typings.backbone.mod.Model[_, typings.backbone.mod.ModelSetOptions] */ TModel](): ViewOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions[TModel]]
  }
  @scala.inline
  implicit class ViewOptionsOps[Self <: ViewOptions[_], /* <: typings.backbone.mod.Model[_, typings.backbone.mod.ModelSetOptions] */ TModel] (val x: Self with ViewOptions[TModel]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRegionClass(value: js.Any): Self = this.set("regionClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionClass: Self = this.set("regionClass", js.undefined)
    @scala.inline
    def setRegions(value: js.Any): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    @scala.inline
    def setTemplate(value: js.Any): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateContext(value: js.Any): Self = this.set("templateContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateContext: Self = this.set("templateContext", js.undefined)
  }
  
}

