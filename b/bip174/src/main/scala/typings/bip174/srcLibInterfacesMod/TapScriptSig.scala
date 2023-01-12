package typings.bip174.srcLibInterfacesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapScriptSig
  extends StObject
     with PartialSig {
  
  var leafHash: Buffer
}
object TapScriptSig {
  
  inline def apply(leafHash: Buffer, pubkey: Buffer, signature: Buffer): TapScriptSig = {
    val __obj = js.Dynamic.literal(leafHash = leafHash.asInstanceOf[js.Any], pubkey = pubkey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapScriptSig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TapScriptSig] (val x: Self) extends AnyVal {
    
    inline def setLeafHash(value: Buffer): Self = StObject.set(x, "leafHash", value.asInstanceOf[js.Any])
  }
}
