package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceSharePermissionDetail extends StObject {
  
  /**
    * The ARN of the permission.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the permission was created.
    */
  var creationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The identifier for the version of the permission that is set as the default version.
    */
  var defaultVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time when the permission was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The name of the permission.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The permission's effect and actions in JSON format. The effect indicates whether the actions are allowed or denied. The actions list the API actions to which the principal is granted or denied access.
    */
  var permission: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type to which the permission applies.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the version of the permission.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ResourceSharePermissionDetail {
  
  @scala.inline
  def apply(): ResourceSharePermissionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSharePermissionDetail]
  }
  
  @scala.inline
  implicit class ResourceSharePermissionDetailMutableBuilder[Self <: ResourceSharePermissionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDefaultVersion(value: Boolean): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: DateTime): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
