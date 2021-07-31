package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdInput extends StObject {
  
  /**
    * <p>A standard AWS account ID (9+ digits).</p>
    */
  var AccountId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  
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
  var Logins: js.UndefOr[StringDictionary[String]] = js.undefined
}
object GetIdInput {
  
  @scala.inline
  def apply(): GetIdInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetIdInput")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: GetIdInput): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class GetIdInputMutableBuilder[Self <: GetIdInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    @scala.inline
    def setLogins(value: StringDictionary[String]): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
  }
}
