package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDetail extends js.Object {
  
  /**
    * The ARN of the resource.
    */
  var ARN: js.UndefOr[ResourceDetailARN] = js.native
  
  /**
    * The creation time of the resource.
    */
  var CreatedTime: js.UndefOr[ResourceDetailCreatedTime] = js.native
  
  /**
    * The description of the resource.
    */
  var Description: js.UndefOr[ResourceDetailDescription] = js.native
  
  /**
    * The identifier of the resource.
    */
  var Id: js.UndefOr[ResourceDetailId] = js.native
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ResourceDetailName] = js.native
}
object ResourceDetail {
  
  @scala.inline
  def apply(): ResourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetail]
  }
  
  @scala.inline
  implicit class ResourceDetailOps[Self <: ResourceDetail] (val x: Self) extends AnyVal {
    
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
    def setARN(value: ResourceDetailARN): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: ResourceDetailCreatedTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: ResourceDetailDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setId(value: ResourceDetailId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: ResourceDetailName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
