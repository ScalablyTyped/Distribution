package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupDeveloperIdentityResponse extends js.Object {
  
  /**
    * <p>This is the list of developer user identifiers associated with an identity ID.
    *          Cognito supports the association of multiple developer user identifiers with an identity
    *          ID.</p>
    */
  var DeveloperUserIdentifierList: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  
  /**
    * <p>A pagination token. The first call you make will have <code>NextToken</code> set to
    *          null. After that the service will return <code>NextToken</code> values as needed. For
    *          example, let's say you make a request with <code>MaxResults</code> set to 10, and there are
    *          20 matches in the database. The service will return a pagination token as a part of the
    *          response. This token can be used to call the API again and get results starting from the
    *          11th match.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "LookupDeveloperIdentityResponse")
@js.native
object LookupDeveloperIdentityResponse extends js.Object {
  
  def filterSensitiveLog(obj: LookupDeveloperIdentityResponse): js.Any = js.native
}
