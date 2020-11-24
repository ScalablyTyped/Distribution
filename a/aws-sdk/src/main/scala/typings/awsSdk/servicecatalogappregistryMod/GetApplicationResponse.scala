package typings.awsSdk.servicecatalogappregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApplicationResponse extends js.Object {
  
  /**
    * The Amazon resource name (ARN) that specifies the application across services.
    */
  var arn: js.UndefOr[ApplicationArn] = js.native
  
  /**
    * The number of top-level resources that were registered as part of this application.
    */
  var associatedResourceCount: js.UndefOr[AssociationCount] = js.native
  
  /**
    * The ISO-8601 formatted timestamp of the moment when the application was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the application.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The identifier of the application.
    */
  var id: js.UndefOr[ApplicationId] = js.native
  
  /**
    * The ISO-8601 formatted timestamp of the moment when the application was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the application. The name must be unique in the region in which you are creating the application.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * Key-value pairs associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object GetApplicationResponse {
  
  @scala.inline
  def apply(): GetApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationResponse]
  }
  
  @scala.inline
  implicit class GetApplicationResponseOps[Self <: GetApplicationResponse] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ApplicationArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAssociatedResourceCount(value: AssociationCount): Self = this.set("associatedResourceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedResourceCount: Self = this.set("associatedResourceCount", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: ApplicationId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
