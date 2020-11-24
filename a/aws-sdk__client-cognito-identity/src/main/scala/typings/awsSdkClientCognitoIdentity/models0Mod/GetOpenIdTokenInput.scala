package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpenIdTokenInput extends js.Object {
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens. When
    *          using graph.facebook.com and www.amazon.com, supply the access_token returned from the
    *          provider's authflow. For accounts.google.com, an Amazon Cognito user pool provider, or any
    *          other OpenId Connect provider, always include the <code>id_token</code>.</p>
    */
  var Logins: js.UndefOr[StringDictionary[String]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetOpenIdTokenInput")
@js.native
object GetOpenIdTokenInput extends js.Object {
  
  def filterSensitiveLog(obj: GetOpenIdTokenInput): js.Any = js.native
}
