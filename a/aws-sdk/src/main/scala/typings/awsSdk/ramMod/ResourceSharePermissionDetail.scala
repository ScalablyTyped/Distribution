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
  
  inline def apply(): ResourceSharePermissionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSharePermissionDetail]
  }
  
  extension [Self <: ResourceSharePermissionDetail](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: DateTime): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDefaultVersion(value: Boolean): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
    
    inline def setLastUpdatedTime(value: DateTime): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
