package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdInput extends js.Object {
  
  /**
    * <p>A standard AWS account ID (9+ digits).</p>
    */
  var AccountId: js.UndefOr[String] = js.native
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens. The
    *          available provider names for <code>Logins</code> are as follows:</p>
    *          <ul>
    *             <li>
    *                <p>Facebook: <code>graph.facebook.com</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Amazon Cognito user pool:
    *                   <code>cognito-idp.<region>.amazonaws.com/<YOUR_USER_POOL_ID></code>,
    *                for example, <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
    *             </p>
    *             </li>
    *             <li>
    *                <p>Google: <code>accounts.google.com</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Amazon: <code>www.amazon.com</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Twitter: <code>api.twitter.com</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Digits: <code>www.digits.com</code>
    *                </p>
    *             </li>
    *          </ul>
    */
  var Logins: js.UndefOr[StringDictionary[String]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetIdInput")
@js.native
object GetIdInput extends js.Object {
  
  def filterSensitiveLog(obj: GetIdInput): js.Any = js.native
}
