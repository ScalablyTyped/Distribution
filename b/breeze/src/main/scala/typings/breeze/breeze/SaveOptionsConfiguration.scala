package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveOptionsConfiguration extends js.Object {
  
  var allowConcurrentSaves: js.UndefOr[Boolean] = js.native
  
  var dataService: js.UndefOr[DataService] = js.native
  
  var resourceName: js.UndefOr[String] = js.native
  
  var tag: js.UndefOr[js.Object] = js.native
}
object SaveOptionsConfiguration {
  
  @scala.inline
  def apply(): SaveOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptionsConfiguration]
  }
  
  @scala.inline
  implicit class SaveOptionsConfigurationOps[Self <: SaveOptionsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAllowConcurrentSaves(value: Boolean): Self = this.set("allowConcurrentSaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowConcurrentSaves: Self = this.set("allowConcurrentSaves", js.undefined)
    
    @scala.inline
    def setDataService(value: DataService): Self = this.set("dataService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataService: Self = this.set("dataService", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setTag(value: js.Object): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
