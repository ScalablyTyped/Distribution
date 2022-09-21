package typings.azureMsalBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base64EncodeMod {
  
  @JSImport("@azure/msal-browser/dist/encode/Base64Encode", "Base64Encode")
  @js.native
  open class Base64Encode () extends StObject {
    
    /**
      * Base64 encode byte array
      * @param aBytes
      */
    /* private */ var base64EncArr: Any = js.native
    
    /**
      * Returns b64 encoded string from plaintext string.
      * @param input
      */
    def encode(input: String): String = js.native
    
    /**
      * Base64 string to array encoding helper
      * @param nUint6
      */
    /* private */ var uint6ToB64: Any = js.native
    
    /**
      * Returns URL Safe b64 encoded string from a plaintext string.
      * @param input
      */
    def urlEncode(input: String): String = js.native
    
    /**
      * Returns URL Safe b64 encoded string from an int8Array.
      * @param inputArr
      */
    def urlEncodeArr(inputArr: js.typedarray.Uint8Array): String = js.native
  }
}
