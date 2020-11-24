package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupDeveloperIdentityInput extends js.Object {
  
  /**
    * <p>A unique ID used by your backend authentication process to identify a user.
    *          Typically, a developer identity provider would issue many developer user identifiers, in
    *          keeping with the number of users.</p>
    */
  var DeveloperUserIdentifier: js.UndefOr[String] = js.native
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  
  /**
    * <p>The maximum number of identities to return.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.native
  
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
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "LookupDeveloperIdentityInput")
@js.native
object LookupDeveloperIdentityInput extends js.Object {
  
  def filterSensitiveLog(obj: LookupDeveloperIdentityInput): js.Any = js.native
}
