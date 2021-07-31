package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlinkIdentityInput extends StObject {
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A set of optional name-value pairs that map provider names to provider
    *          tokens.</p>
    */
  var Logins: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * <p>Provider names to unlink from this identity.</p>
    */
  var LoginsToRemove: js.UndefOr[js.Array[String]] = js.undefined
}
object UnlinkIdentityInput {
  
  @scala.inline
  def apply(): UnlinkIdentityInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnlinkIdentityInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "UnlinkIdentityInput")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: UnlinkIdentityInput): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class UnlinkIdentityInputMutableBuilder[Self <: UnlinkIdentityInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    @scala.inline
    def setLogins(value: StringDictionary[String]): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginsToRemove(value: js.Array[String]): Self = StObject.set(x, "LoginsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginsToRemoveUndefined: Self = StObject.set(x, "LoginsToRemove", js.undefined)
    
    @scala.inline
    def setLoginsToRemoveVarargs(value: String*): Self = StObject.set(x, "LoginsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
  }
}
