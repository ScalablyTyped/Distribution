package typings.bip174.interfacesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapBip32Derivation
  extends StObject
     with Bip32Derivation {
  
  var leafHashes: js.Array[Buffer]
}
object TapBip32Derivation {
  
  inline def apply(leafHashes: js.Array[Buffer], masterFingerprint: Buffer, path: String, pubkey: Buffer): TapBip32Derivation = {
    val __obj = js.Dynamic.literal(leafHashes = leafHashes.asInstanceOf[js.Any], masterFingerprint = masterFingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pubkey = pubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapBip32Derivation]
  }
  
  extension [Self <: TapBip32Derivation](x: Self) {
    
    inline def setLeafHashes(value: js.Array[Buffer]): Self = StObject.set(x, "leafHashes", value.asInstanceOf[js.Any])
    
    inline def setLeafHashesVarargs(value: Buffer*): Self = StObject.set(x, "leafHashes", js.Array(value*))
  }
}
