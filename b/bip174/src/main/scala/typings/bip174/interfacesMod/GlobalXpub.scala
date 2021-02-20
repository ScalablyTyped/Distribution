package typings.bip174.interfacesMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalXpub extends StObject {
  
  var extendedPubkey: Buffer = js.native
  
  var masterFingerprint: Buffer = js.native
  
  var path: String = js.native
}
object GlobalXpub {
  
  @scala.inline
  def apply(extendedPubkey: Buffer, masterFingerprint: Buffer, path: String): GlobalXpub = {
    val __obj = js.Dynamic.literal(extendedPubkey = extendedPubkey.asInstanceOf[js.Any], masterFingerprint = masterFingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalXpub]
  }
  
  @scala.inline
  implicit class GlobalXpubMutableBuilder[Self <: GlobalXpub] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendedPubkey(value: Buffer): Self = StObject.set(x, "extendedPubkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterFingerprint(value: Buffer): Self = StObject.set(x, "masterFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
