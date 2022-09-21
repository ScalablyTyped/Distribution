package typings.azureMsalCommon

import typings.azureMsalCommon.anon.Code
import typings.azureMsalCommon.authErrorMod.AuthError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joseHeaderErrorMod {
  
  @JSImport("@azure/msal-common/dist/error/JoseHeaderError", "JoseHeaderError")
  @js.native
  open class JoseHeaderError protected () extends AuthError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
  }
  /* static members */
  object JoseHeaderError {
    
    @JSImport("@azure/msal-common/dist/error/JoseHeaderError", "JoseHeaderError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an error thrown when algorithm isn't set on JOSE header.
      */
    inline def createMissingAlgError(): JoseHeaderError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMissingAlgError")().asInstanceOf[JoseHeaderError]
    
    /**
      * Creates an error thrown when keyId isn't set on JOSE header.
      */
    inline def createMissingKidError(): JoseHeaderError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMissingKidError")().asInstanceOf[JoseHeaderError]
  }
  
  object JoseHeaderErrorMessage {
    
    @JSImport("@azure/msal-common/dist/error/JoseHeaderError", "JoseHeaderErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-common/dist/error/JoseHeaderError", "JoseHeaderErrorMessage.missingAlgError")
    @js.native
    def missingAlgError: Code = js.native
    inline def missingAlgError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingAlgError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/JoseHeaderError", "JoseHeaderErrorMessage.missingKidError")
    @js.native
    def missingKidError: Code = js.native
    inline def missingKidError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingKidError")(x.asInstanceOf[js.Any])
  }
}
