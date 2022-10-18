package typings.azureMsalBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEncodeBase64DecodeMod {
  
  @JSImport("@azure/msal-browser/dist/encode/Base64Decode", "Base64Decode")
  @js.native
  open class Base64Decode () extends StObject {
    
    /**
      * Base64 string to array decoding helper
      * @param charNum
      */
    /* private */ var b64ToUint6: Any = js.native
    
    /**
      * Decodes base64 into Uint8Array
      * @param base64String
      * @param nBlockSize
      */
    /* private */ var base64DecToArr: Any = js.native
    
    /**
      * Returns a URL-safe plaintext decoded string from b64 encoded input.
      * @param input
      */
    def decode(input: String): String = js.native
  }
}
