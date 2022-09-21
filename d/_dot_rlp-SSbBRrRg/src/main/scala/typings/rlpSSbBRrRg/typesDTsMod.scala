package typings.rlpSSbBRrRg

import typings.bnJs.mod.^
import typings.node.bufferMod.global.Buffer
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDTsMod {
  
  trait Decoded extends StObject {
    
    var data: Buffer | js.Array[Buffer]
    
    var remainder: Buffer
  }
  object Decoded {
    
    inline def apply(data: Buffer | js.Array[Buffer], remainder: Buffer): Decoded = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decoded]
    }
    
    extension [Self <: Decoded](x: Self) {
      
      inline def setData(value: Buffer | js.Array[Buffer]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Buffer*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setRemainder(value: Buffer): Self = StObject.set(x, "remainder", value.asInstanceOf[js.Any])
    }
  }
  
  type Input = Buffer | String | Double | js.BigInt | js.typedarray.Uint8Array | ^ | List | Null
  
  @js.native
  trait List
    extends StObject
       with Array[Input]
}
