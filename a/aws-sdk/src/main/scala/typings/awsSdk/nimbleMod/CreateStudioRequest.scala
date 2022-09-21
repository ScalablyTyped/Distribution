package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStudioRequest extends StObject {
  
  /**
    * The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.
    */
  var adminRoleArn: RoleArn
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A friendly name for the studio.
    */
  var displayName: StudioDisplayName
  
  /**
    * The studio encryption configuration.
    */
  var studioEncryptionConfiguration: js.UndefOr[StudioEncryptionConfiguration] = js.undefined
  
  /**
    * The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.
    */
  var studioName: StudioName
  
  /**
    * A collection of labels, in the form of key:value pairs, that apply to this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.
    */
  var userRoleArn: RoleArn
}
object CreateStudioRequest {
  
  inline def apply(
    adminRoleArn: RoleArn,
    displayName: StudioDisplayName,
    studioName: StudioName,
    userRoleArn: RoleArn
  ): CreateStudioRequest = {
    val __obj = js.Dynamic.literal(adminRoleArn = adminRoleArn.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], studioName = studioName.asInstanceOf[js.Any], userRoleArn = userRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStudioRequest]
  }
  
  extension [Self <: CreateStudioRequest](x: Self) {
    
    inline def setAdminRoleArn(value: RoleArn): Self = StObject.set(x, "adminRoleArn", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDisplayName(value: StudioDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setStudioEncryptionConfiguration(value: StudioEncryptionConfiguration): Self = StObject.set(x, "studioEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStudioEncryptionConfigurationUndefined: Self = StObject.set(x, "studioEncryptionConfiguration", js.undefined)
    
    inline def setStudioName(value: StudioName): Self = StObject.set(x, "studioName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUserRoleArn(value: RoleArn): Self = StObject.set(x, "userRoleArn", value.asInstanceOf[js.Any])
  }
}
