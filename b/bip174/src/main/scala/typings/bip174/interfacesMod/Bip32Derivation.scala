package typings.bip174.interfacesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bip32Derivation extends StObject {
  
  var masterFingerprint: Buffer
  
  var path: String
  
  var pubkey: Buffer
}
object Bip32Derivation {
  
  inline def apply(masterFingerprint: Buffer, path: String, pubkey: Buffer): Bip32Derivation = {
    val __obj = js.Dynamic.literal(masterFingerprint = masterFingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pubkey = pubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bip32Derivation]
  }
  
  extension [Self <: Bip32Derivation](x: Self) {
    
    inline def setMasterFingerprint(value: Buffer): Self = StObject.set(x, "masterFingerprint", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPubkey(value: Buffer): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
  }
}
