package typings.backboneLayoutmanager.mod

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.View
import typings.backbone.mod.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutOptions[TModel /* <: Model[_, ModelSetOptions, js.Object] */] extends ViewOptions[TModel] {
  
  var template: js.UndefOr[String] = js.native
  
  var views: js.UndefOr[StringDictionary[View[TModel]]] = js.native
}
object LayoutOptions {
  
  @scala.inline
  def apply[TModel /* <: Model[_, ModelSetOptions, js.Object] */](): LayoutOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutOptions[TModel]]
  }
  
  @scala.inline
  implicit class LayoutOptionsOps[Self <: LayoutOptions[_], TModel /* <: Model[_, ModelSetOptions, js.Object] */] (val x: Self with LayoutOptions[TModel]) extends AnyVal {
    
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
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setViews(value: StringDictionary[View[TModel]]): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
}
