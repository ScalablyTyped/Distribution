package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecurityProfileRequest extends StObject {
  
  /**
    * The description of the security profile.
    */
  var Description: js.UndefOr[SecurityProfileDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * Permissions assigned to the security profile. For a list of valid permissions, see List of security profile permissions. 
    */
  var Permissions: js.UndefOr[PermissionsList] = js.undefined
  
  /**
    * The name of the security profile.
    */
  var SecurityProfileName: typings.awsSdk.connectMod.SecurityProfileName
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateSecurityProfileRequest {
  
  inline def apply(InstanceId: InstanceId, SecurityProfileName: SecurityProfileName): CreateSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SecurityProfileName = SecurityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityProfileRequest]
  }
  
  extension [Self <: CreateSecurityProfileRequest](x: Self) {
    
    inline def setDescription(value: SecurityProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: PermissionsList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SecurityProfilePermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "SecurityProfileName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
