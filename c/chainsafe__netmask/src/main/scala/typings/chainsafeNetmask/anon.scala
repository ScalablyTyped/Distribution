package typings.chainsafeNetmask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Mask extends StObject {
    
    var mask: js.typedarray.Uint8Array
    
    var network: js.typedarray.Uint8Array
  }
  object Mask {
    
    inline def apply(mask: js.typedarray.Uint8Array, network: js.typedarray.Uint8Array): Mask = {
      val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mask]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mask] (val x: Self) extends AnyVal {
      
      inline def setMask(value: js.typedarray.Uint8Array): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: js.typedarray.Uint8Array): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    }
  }
}
