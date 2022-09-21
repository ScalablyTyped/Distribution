package typings.azureMsalCommon

import typings.azureMsalCommon.anon.Code
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authErrorMod {
  
  @JSImport("@azure/msal-common/dist/error/AuthError", "AuthError")
  @js.native
  open class AuthError ()
    extends StObject
       with Error {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
    def this(errorCode: Unit, errorMessage: String) = this()
    def this(errorCode: String, errorMessage: String, suberror: String) = this()
    def this(errorCode: String, errorMessage: Unit, suberror: String) = this()
    def this(errorCode: Unit, errorMessage: String, suberror: String) = this()
    def this(errorCode: Unit, errorMessage: Unit, suberror: String) = this()
    
    /**
      * CorrelationId associated with the error
      */
    var correlationId: String = js.native
    
    /**
      * Short string denoting error
      */
    var errorCode: String = js.native
    
    /**
      * Detailed description of error
      */
    var errorMessage: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    def setCorrelationId(correlationId: String): Unit = js.native
    
    /**
      * Describes the subclass of an error
      */
    var subError: String = js.native
  }
  /* static members */
  object AuthError {
    
    @JSImport("@azure/msal-common/dist/error/AuthError", "AuthError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an error for post request failures.
      * @param errDesc
      * @returns
      */
    inline def createPostRequestFailed(errDesc: String): AuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPostRequestFailed")(errDesc.asInstanceOf[js.Any]).asInstanceOf[AuthError]
    
    /**
      * Creates an error that is thrown when something unexpected happens in the library.
      * @param errDesc
      */
    inline def createUnexpectedError(errDesc: String): AuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnexpectedError")(errDesc.asInstanceOf[js.Any]).asInstanceOf[AuthError]
  }
  
  object AuthErrorMessage {
    
    @JSImport("@azure/msal-common/dist/error/AuthError", "AuthErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-common/dist/error/AuthError", "AuthErrorMessage.postRequestFailed")
    @js.native
    def postRequestFailed: Code = js.native
    inline def postRequestFailed_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postRequestFailed")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/AuthError", "AuthErrorMessage.unexpectedError")
    @js.native
    def unexpectedError: Code = js.native
    inline def unexpectedError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unexpectedError")(x.asInstanceOf[js.Any])
  }
}
