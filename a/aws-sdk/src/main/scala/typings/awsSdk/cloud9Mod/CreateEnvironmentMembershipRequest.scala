package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentMembershipRequest extends StObject {
  
  /**
    * The ID of the environment that contains the environment member you want to add.
    */
  var environmentId: EnvironmentId
  
  /**
    * The type of environment member permissions you want to associate with this environment member. Available values include:    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
    */
  var permissions: MemberPermissions
  
  /**
    * The Amazon Resource Name (ARN) of the environment member you want to add.
    */
  var userArn: UserArn
}
object CreateEnvironmentMembershipRequest {
  
  inline def apply(environmentId: EnvironmentId, permissions: MemberPermissions, userArn: UserArn): CreateEnvironmentMembershipRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentMembershipRequest]
  }
  
  extension [Self <: CreateEnvironmentMembershipRequest](x: Self) {
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: MemberPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
