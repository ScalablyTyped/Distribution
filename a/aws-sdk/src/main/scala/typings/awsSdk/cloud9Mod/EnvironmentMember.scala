package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentMember extends StObject {
  
  /**
    * The ID of the environment for the environment member.
    */
  var environmentId: EnvironmentId
  
  /**
    * The time, expressed in epoch time format, when the environment member last opened the environment.
    */
  var lastAccess: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of environment member permissions associated with this environment member. Available values include:    owner: Owns the environment.    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
    */
  var permissions: Permissions
  
  /**
    * The Amazon Resource Name (ARN) of the environment member.
    */
  var userArn: UserArn
  
  /**
    * The user ID in Identity and Access Management (IAM) of the environment member.
    */
  var userId: String
}
object EnvironmentMember {
  
  inline def apply(environmentId: EnvironmentId, permissions: Permissions, userArn: UserArn, userId: String): EnvironmentMember = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentMember]
  }
  
  extension [Self <: EnvironmentMember](x: Self) {
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setLastAccess(value: js.Date): Self = StObject.set(x, "lastAccess", value.asInstanceOf[js.Any])
    
    inline def setLastAccessUndefined: Self = StObject.set(x, "lastAccess", js.undefined)
    
    inline def setPermissions(value: Permissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
