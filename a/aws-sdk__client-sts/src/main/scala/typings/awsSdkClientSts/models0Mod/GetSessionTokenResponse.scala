package typings.awsSdkClientSts.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionTokenResponse extends StObject {
  
  /**
    * <p>The temporary security credentials, which include an access key ID, a secret access key,
    *          and a security (or session) token.</p>
    *
    *          <note>
    *             <p>The size of the security token that STS API operations return is not fixed. We
    *         strongly recommend that you make no assumptions about the maximum size.</p>
    *          </note>
    */
  var Credentials: js.UndefOr[typings.awsSdkClientSts.models0Mod.Credentials] = js.undefined
}
object GetSessionTokenResponse {
  
  inline def apply(): GetSessionTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSessionTokenResponse]
  }
  
  extension [Self <: GetSessionTokenResponse](x: Self) {
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
  }
}
