package typings.bitcoreLibCash.mod

import typings.bitcoreLibCash.mod.Networks.Network
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CashAddressDecoding extends StObject {
  
  val hashBuffer: Buffer
  
  val network: Network
  
  val `type`: String
}
object CashAddressDecoding {
  
  inline def apply(hashBuffer: Buffer, network: Network, `type`: String): CashAddressDecoding = {
    val __obj = js.Dynamic.literal(hashBuffer = hashBuffer.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashAddressDecoding]
  }
  
  extension [Self <: CashAddressDecoding](x: Self) {
    
    inline def setHashBuffer(value: Buffer): Self = StObject.set(x, "hashBuffer", value.asInstanceOf[js.Any])
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
