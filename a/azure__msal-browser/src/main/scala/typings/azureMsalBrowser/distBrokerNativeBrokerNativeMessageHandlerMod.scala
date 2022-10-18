package typings.azureMsalBrowser

import typings.azureMsalBrowser.distBrokerNativeBrokerNativeRequestMod.NativeExtensionRequestBody
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrokerNativeBrokerNativeMessageHandlerMod {
  
  @JSImport("@azure/msal-browser/dist/broker/nativeBroker/NativeMessageHandler", "NativeMessageHandler")
  @js.native
  open class NativeMessageHandler protected () extends StObject {
    def this(logger: Logger, handshakeTimeoutMs: Double) = this()
    def this(logger: Logger, handshakeTimeoutMs: Double, extensionId: String) = this()
    
    /* private */ var extensionId: Any = js.native
    
    /* private */ var handshakeResolvers: Any = js.native
    
    /* private */ var handshakeTimeoutMs: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var messageChannel: Any = js.native
    
    /**
      * Invoked when a message is received from the extension on the MessageChannel port
      * @param event
      */
    /* private */ var onChannelMessage: Any = js.native
    
    /**
      * Invoked when a message is posted to the window. If a handshake request is received it means the extension is not installed.
      * @param event
      */
    /* private */ var onWindowMessage: Any = js.native
    
    /* private */ var resolvers: Any = js.native
    
    /* private */ var responseId: Any = js.native
    
    /**
      * Send handshake request helper.
      */
    /* private */ var sendHandshakeRequest: Any = js.native
    
    /**
      * Sends a given message to the extension and resolves with the extension response
      * @param body
      */
    def sendMessage(body: NativeExtensionRequestBody): js.Promise[js.Object] = js.native
    
    /* private */ var timeoutId: Any = js.native
    
    /* private */ var windowListener: Any = js.native
  }
  /* static members */
  object NativeMessageHandler {
    
    @JSImport("@azure/msal-browser/dist/broker/nativeBroker/NativeMessageHandler", "NativeMessageHandler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an instance of the MessageHandler that has successfully established a connection with an extension
      * @param logger
      * @param handshakeTimeoutMs
      */
    inline def createProvider(logger: Logger, handshakeTimeoutMs: Double): js.Promise[NativeMessageHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProvider")(logger.asInstanceOf[js.Any], handshakeTimeoutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NativeMessageHandler]]
    
    /**
      * Returns boolean indicating whether or not the request should attempt to use native broker
      * @param logger
      * @param config
      * @param nativeExtensionProvider
      * @param authenticationScheme
      */
    inline def isNativeAvailable(config: BrowserConfiguration, logger: Logger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNativeAvailable")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isNativeAvailable(
      config: BrowserConfiguration,
      logger: Logger,
      nativeExtensionProvider: Unit,
      authenticationScheme: AuthenticationScheme
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNativeAvailable")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], nativeExtensionProvider.asInstanceOf[js.Any], authenticationScheme.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isNativeAvailable(config: BrowserConfiguration, logger: Logger, nativeExtensionProvider: NativeMessageHandler): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNativeAvailable")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], nativeExtensionProvider.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isNativeAvailable(
      config: BrowserConfiguration,
      logger: Logger,
      nativeExtensionProvider: NativeMessageHandler,
      authenticationScheme: AuthenticationScheme
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNativeAvailable")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], nativeExtensionProvider.asInstanceOf[js.Any], authenticationScheme.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
