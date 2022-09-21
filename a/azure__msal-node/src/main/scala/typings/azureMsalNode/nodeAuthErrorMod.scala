package typings.azureMsalNode

import typings.azureMsalCommon.mod.AuthError
import typings.azureMsalNode.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeAuthErrorMod {
  
  @JSImport("@azure/msal-node/dist/error/NodeAuthError", "NodeAuthError")
  @js.native
  open class NodeAuthError protected () extends AuthError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
  }
  /* static members */
  object NodeAuthError {
    
    @JSImport("@azure/msal-node/dist/error/NodeAuthError", "NodeAuthError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an error thrown if loopback server address is of type string.
      */
    inline def createInvalidLoopbackAddressTypeError(): NodeAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidLoopbackAddressTypeError")().asInstanceOf[NodeAuthError]
    
    /**
      * Creates an error thrown if a loopback server already exists when attempting to create another one.
      */
    inline def createLoopbackServerAlreadyExistsError(): NodeAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoopbackServerAlreadyExistsError")().asInstanceOf[NodeAuthError]
    
    /**
      * Creates an error thrown if the loopback server times out registering the auth code listener.
      */
    inline def createLoopbackServerTimeoutError(): NodeAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoopbackServerTimeoutError")().asInstanceOf[NodeAuthError]
    
    /**
      * Creates an error thrown if the server response does not contain an auth code.
      */
    inline def createNoAuthCodeInResponseError(): NodeAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoAuthCodeInResponseError")().asInstanceOf[NodeAuthError]
    
    /**
      * Creates an error thrown if the loopback server has not been spun up yet.
      */
    inline def createNoLoopbackServerExistsError(): NodeAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoLoopbackServerExistsError")().asInstanceOf[NodeAuthError]
    
    /**
      * Creates an error thrown when the state is not present.
      */
    inline def createStateNotFoundError(): NodeAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStateNotFoundError")().asInstanceOf[NodeAuthError]
    
    /**
      * Creates an error thrown if the loopback server is unable to get a url.
      */
    inline def createUnableToLoadRedirectUrlError(): NodeAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnableToLoadRedirectUrlError")().asInstanceOf[NodeAuthError]
  }
  
  object NodeAuthErrorMessage {
    
    @JSImport("@azure/msal-node/dist/error/NodeAuthError", "NodeAuthErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-node/dist/error/NodeAuthError", "NodeAuthErrorMessage.invalidLoopbackAddressType")
    @js.native
    def invalidLoopbackAddressType: Code = js.native
    inline def invalidLoopbackAddressType_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidLoopbackAddressType")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/error/NodeAuthError", "NodeAuthErrorMessage.loopbackServerAlreadyExists")
    @js.native
    def loopbackServerAlreadyExists: Code = js.native
    inline def loopbackServerAlreadyExists_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loopbackServerAlreadyExists")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/error/NodeAuthError", "NodeAuthErrorMessage.loopbackServerTimeout")
    @js.native
    def loopbackServerTimeout: Code = js.native
    inline def loopbackServerTimeout_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loopbackServerTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/error/NodeAuthError", "NodeAuthErrorMessage.noAuthCodeInResponse")
    @js.native
    def noAuthCodeInResponse: Code = js.native
    inline def noAuthCodeInResponse_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noAuthCodeInResponse")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/error/NodeAuthError", "NodeAuthErrorMessage.noLoopbackServerExists")
    @js.native
    def noLoopbackServerExists: Code = js.native
    inline def noLoopbackServerExists_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noLoopbackServerExists")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/error/NodeAuthError", "NodeAuthErrorMessage.stateNotFoundError")
    @js.native
    def stateNotFoundError: Code = js.native
    inline def stateNotFoundError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateNotFoundError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/error/NodeAuthError", "NodeAuthErrorMessage.unableToLoadRedirectUri")
    @js.native
    def unableToLoadRedirectUri: Code = js.native
    inline def unableToLoadRedirectUri_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unableToLoadRedirectUri")(x.asInstanceOf[js.Any])
  }
}
