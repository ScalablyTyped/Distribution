package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialsResult
  extends StObject
     with ResultStatus {
  
  var credentials: js.Array[CredentialInfo]
}
object GetCredentialsResult {
  
  inline def apply(credentials: js.Array[CredentialInfo], errorMessage: String, success: Boolean): GetCredentialsResult = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCredentialsResult] (val x: Self) extends AnyVal {
    
    inline def setCredentials(value: js.Array[CredentialInfo]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsVarargs(value: CredentialInfo*): Self = StObject.set(x, "credentials", js.Array(value*))
  }
}
