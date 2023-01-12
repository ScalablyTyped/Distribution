package typings.bip21

import typings.bip21.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: String
    
    var options: Options
  }
  object Address {
    
    inline def apply(address: String, options: Options): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Amount extends StObject {
    
    var amount: js.UndefOr[Double] = js.undefined
  }
  object Amount {
    
    inline def apply(): Amount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Amount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    }
  }
}
