package typings.checCommerceJs

import typings.checCommerceJs.anon.Enabled
import typings.checCommerceJs.priceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatewayMod {
  
  trait Gateway extends StObject {
    
    var code: String
    
    var config: Any
    
    var created: Double
    
    var id: String
    
    var meta: Any
    
    var sandbox: Enabled
    
    var transaction_volume: Price
    
    var updated: Double
  }
  object Gateway {
    
    inline def apply(
      code: String,
      config: Any,
      created: Double,
      id: String,
      meta: Any,
      sandbox: Enabled,
      transaction_volume: Price,
      updated: Double
    ): Gateway = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any], transaction_volume = transaction_volume.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gateway]
    }
    
    extension [Self <: Gateway](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setSandbox(value: Enabled): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setTransaction_volume(value: Price): Self = StObject.set(x, "transaction_volume", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
}
