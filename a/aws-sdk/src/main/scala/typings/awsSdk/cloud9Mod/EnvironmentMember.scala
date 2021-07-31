package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentMember extends StObject {
  
  /**
    * The ID of the environment for the environment member.
    */
  var environmentId: js.UndefOr[EnvironmentId] = js.undefined
  
  /**
    * The time, expressed in epoch time format, when the environment member last opened the environment.
    */
  var lastAccess: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The type of environment member permissions associated with this environment member. Available values include:    owner: Owns the environment.    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
    */
  var permissions: js.UndefOr[Permissions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the environment member.
    */
  var userArn: js.UndefOr[UserArn] = js.undefined
  
  /**
    * The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object EnvironmentMember {
  
  @scala.inline
  def apply(): EnvironmentMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentMember]
  }
  
  @scala.inline
  implicit class EnvironmentMemberMutableBuilder[Self <: EnvironmentMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
    
    @scala.inline
    def setLastAccess(value: Timestamp): Self = StObject.set(x, "lastAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessUndefined: Self = StObject.set(x, "lastAccess", js.undefined)
    
    @scala.inline
    def setPermissions(value: Permissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArnUndefined: Self = StObject.set(x, "userArn", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
