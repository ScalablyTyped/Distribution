package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEnvironmentMembershipsRequest extends StObject {
  
  /**
    * The ID of the environment to get environment member information about.
    */
  var environmentId: js.UndefOr[EnvironmentId] = js.native
  
  /**
    * The maximum number of environment members to get information about.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * During a previous call, if there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The type of environment member permissions to get information about. Available values include:    owner: Owns the environment.    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.   If no value is specified, information about all environment members are returned.
    */
  var permissions: js.UndefOr[PermissionsList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an individual environment member to get information about. If no value is specified, information about all environment members are returned.
    */
  var userArn: js.UndefOr[UserArn] = js.native
}
object DescribeEnvironmentMembershipsRequest {
  
  @scala.inline
  def apply(): DescribeEnvironmentMembershipsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentMembershipsRequest]
  }
  
  @scala.inline
  implicit class DescribeEnvironmentMembershipsRequestMutableBuilder[Self <: DescribeEnvironmentMembershipsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPermissions(value: PermissionsList): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: Permissions*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArnUndefined: Self = StObject.set(x, "userArn", js.undefined)
  }
}
