package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnlinkIdentityInput extends js.Object {
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  
  /**
    * <p>A set of optional name-value pairs that map provider names to provider
    *          tokens.</p>
    */
  var Logins: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * <p>Provider names to unlink from this identity.</p>
    */
  var LoginsToRemove: js.UndefOr[js.Array[String]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "UnlinkIdentityInput")
@js.native
object UnlinkIdentityInput extends js.Object {
  
  def filterSensitiveLog(obj: UnlinkIdentityInput): js.Any = js.native
}
