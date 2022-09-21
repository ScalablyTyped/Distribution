package typings.awsSdk.rolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProfileRequest extends StObject {
  
  /**
    *  The number of seconds the vended session credentials are valid for. 
    */
  var durationSeconds: js.UndefOr[UpdateProfileRequestDurationSecondsInteger] = js.undefined
  
  /**
    * A list of managed policy ARNs that apply to the vended session credentials. 
    */
  var managedPolicyArns: js.UndefOr[ManagedPolicyList] = js.undefined
  
  /**
    * The name of the profile.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The unique identifier of the profile.
    */
  var profileId: Uuid
  
  /**
    * A list of IAM roles that this profile can assume in a CreateSession operation.
    */
  var roleArns: js.UndefOr[RoleArnList] = js.undefined
  
  /**
    * A session policy that applies to the trust boundary of the vended session credentials. 
    */
  var sessionPolicy: js.UndefOr[UpdateProfileRequestSessionPolicyString] = js.undefined
}
object UpdateProfileRequest {
  
  inline def apply(profileId: Uuid): UpdateProfileRequest = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfileRequest]
  }
  
  extension [Self <: UpdateProfileRequest](x: Self) {
    
    inline def setDurationSeconds(value: UpdateProfileRequestDurationSecondsInteger): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    
    inline def setManagedPolicyArns(value: ManagedPolicyList): Self = StObject.set(x, "managedPolicyArns", value.asInstanceOf[js.Any])
    
    inline def setManagedPolicyArnsUndefined: Self = StObject.set(x, "managedPolicyArns", js.undefined)
    
    inline def setManagedPolicyArnsVarargs(value: ManagedPolicyListMemberString*): Self = StObject.set(x, "managedPolicyArns", js.Array(value*))
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfileId(value: Uuid): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setRoleArns(value: RoleArnList): Self = StObject.set(x, "roleArns", value.asInstanceOf[js.Any])
    
    inline def setRoleArnsUndefined: Self = StObject.set(x, "roleArns", js.undefined)
    
    inline def setRoleArnsVarargs(value: RoleArn*): Self = StObject.set(x, "roleArns", js.Array(value*))
    
    inline def setSessionPolicy(value: UpdateProfileRequestSessionPolicyString): Self = StObject.set(x, "sessionPolicy", value.asInstanceOf[js.Any])
    
    inline def setSessionPolicyUndefined: Self = StObject.set(x, "sessionPolicy", js.undefined)
  }
}
