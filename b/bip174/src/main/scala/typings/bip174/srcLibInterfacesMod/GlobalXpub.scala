package typings.bip174.srcLibInterfacesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalXpub extends StObject {
  
  var extendedPubkey: Buffer
  
  var masterFingerprint: Buffer
  
  var path: String
}
object GlobalXpub {
  
  inline def apply(extendedPubkey: Buffer, masterFingerprint: Buffer, path: String): GlobalXpub = {
    val __obj = js.Dynamic.literal(extendedPubkey = extendedPubkey.asInstanceOf[js.Any], masterFingerprint = masterFingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalXpub]
  }
  
  extension [Self <: GlobalXpub](x: Self) {
    
    inline def setExtendedPubkey(value: Buffer): Self = StObject.set(x, "extendedPubkey", value.asInstanceOf[js.Any])
    
    inline def setMasterFingerprint(value: Buffer): Self = StObject.set(x, "masterFingerprint", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
