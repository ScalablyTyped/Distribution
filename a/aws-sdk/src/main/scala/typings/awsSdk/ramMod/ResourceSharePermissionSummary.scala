package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceSharePermissionSummary extends js.Object {
  
  /**
    * The ARN of the permission.
    */
  var arn: js.UndefOr[String] = js.native
  
  /**
    * The date and time when the permission was created.
    */
  var creationTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The identifier for the version of the permission that is set as the default version.
    */
  var defaultVersion: js.UndefOr[Boolean] = js.native
  
  /**
    * The date and time when the permission was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The name of the permission.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of resource to which the permission applies.
    */
  var resourceType: js.UndefOr[String] = js.native
  
  /**
    * The current status of the permission.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The identifier for the version of the permission.
    */
  var version: js.UndefOr[String] = js.native
}
object ResourceSharePermissionSummary {
  
  @scala.inline
  def apply(): ResourceSharePermissionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSharePermissionSummary]
  }
  
  @scala.inline
  implicit class ResourceSharePermissionSummaryOps[Self <: ResourceSharePermissionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDefaultVersion(value: Boolean): Self = this.set("defaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVersion: Self = this.set("defaultVersion", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: DateTime): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
