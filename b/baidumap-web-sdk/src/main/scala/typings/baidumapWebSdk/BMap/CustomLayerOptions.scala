package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLayerOptions extends js.Object {
  
  var databoxId: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var geotableId: js.UndefOr[String] = js.native
  
  var pointDensityType: js.UndefOr[PointDensityType] = js.native
  
  var q: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[String] = js.native
}
object CustomLayerOptions {
  
  @scala.inline
  def apply(): CustomLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLayerOptions]
  }
  
  @scala.inline
  implicit class CustomLayerOptionsOps[Self <: CustomLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setDataboxId(value: String): Self = this.set("databoxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataboxId: Self = this.set("databoxId", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGeotableId(value: String): Self = this.set("geotableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeotableId: Self = this.set("geotableId", js.undefined)
    
    @scala.inline
    def setPointDensityType(value: PointDensityType): Self = this.set("pointDensityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointDensityType: Self = this.set("pointDensityType", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
