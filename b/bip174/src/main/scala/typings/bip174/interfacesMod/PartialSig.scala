package typings.bip174.interfacesMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialSig extends StObject {
  
  var pubkey: Buffer
  
  var signature: Buffer
}
object PartialSig {
  
  @scala.inline
  def apply(pubkey: Buffer, signature: Buffer): PartialSig = {
    val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSig]
  }
  
  @scala.inline
  implicit class PartialSigMutableBuilder[Self <: PartialSig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPubkey(value: Buffer): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
