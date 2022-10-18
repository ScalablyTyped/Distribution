package typings.azureMsalBrowser

import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionType
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distResponseServerAuthorizationCodeResponseMod.ServerAuthorizationCodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsBrowserProtocolUtilsMod {
  
  @JSImport("@azure/msal-browser/dist/utils/BrowserProtocolUtils", "BrowserProtocolUtils")
  @js.native
  open class BrowserProtocolUtils () extends StObject
  /* static members */
  object BrowserProtocolUtils {
    
    @JSImport("@azure/msal-browser/dist/utils/BrowserProtocolUtils", "BrowserProtocolUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Extracts the BrowserStateObject from the state string.
      * @param browserCrypto
      * @param state
      */
    inline def extractBrowserRequestState(browserCrypto: ICrypto, state: String): BrowserStateObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extractBrowserRequestState")(browserCrypto.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[BrowserStateObject | Null]
    
    /**
      * Parses properties of server response from url hash
      * @param locationHash Hash from url
      */
    inline def parseServerResponseFromHash(locationHash: String): ServerAuthorizationCodeResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("parseServerResponseFromHash")(locationHash.asInstanceOf[js.Any]).asInstanceOf[ServerAuthorizationCodeResponse]
  }
  
  trait BrowserStateObject extends StObject {
    
    var interactionType: InteractionType
  }
  object BrowserStateObject {
    
    inline def apply(interactionType: InteractionType): BrowserStateObject = {
      val __obj = js.Dynamic.literal(interactionType = interactionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserStateObject]
    }
    
    extension [Self <: BrowserStateObject](x: Self) {
      
      inline def setInteractionType(value: InteractionType): Self = StObject.set(x, "interactionType", value.asInstanceOf[js.Any])
    }
  }
}
