package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentitiesInput extends js.Object {
  
  /**
    * <p>An optional boolean parameter that allows you to hide disabled identities. If
    *          omitted, the ListIdentities API will include disabled identities in the response.</p>
    */
  var HideDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  
  /**
    * <p>The maximum number of identities to return.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.native
  
  /**
    * <p>A pagination token.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ListIdentitiesInput")
@js.native
object ListIdentitiesInput extends js.Object {
  
  def filterSensitiveLog(obj: ListIdentitiesInput): js.Any = js.native
}
