package typings.azureMsalNode

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoHashUtilsMod {
  
  @JSImport("@azure/msal-node/dist/crypto/HashUtils", "HashUtils")
  @js.native
  open class HashUtils () extends StObject {
    
    /**
      * generate 'SHA256' hash
      * @param buffer
      */
    def sha256(buffer: String): Buffer = js.native
  }
}
