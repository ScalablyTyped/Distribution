package typings.cesium.anon

import typings.cesium.mod.Command
import typings.cesium.mod.ImageryProvider
import typings.cesium.mod.ProviderViewModel.CreationFunction
import typings.cesium.mod.TerrainProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Category extends js.Object {
  
  var category: js.UndefOr[String] = js.native
  
  var creationFunction: CreationFunction | Command = js.native
  
  var iconUrl: String = js.native
  
  var name: String = js.native
  
  var tooltip: String = js.native
}
object Category {
  
  @scala.inline
  def apply(creationFunction: CreationFunction | Command, iconUrl: String, name: String, tooltip: String): Category = {
    val __obj = js.Dynamic.literal(creationFunction = creationFunction.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
    
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
    def setCreationFunctionFunction0(value: () => ImageryProvider | TerrainProvider | (js.Array[ImageryProvider | TerrainProvider])): Self = this.set("creationFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreationFunction(value: CreationFunction | Command): Self = this.set("creationFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
  }
}
