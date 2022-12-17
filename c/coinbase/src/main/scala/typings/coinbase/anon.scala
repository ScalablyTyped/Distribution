package typings.coinbase

import org.scalablytyped.runtime.StringDictionary
import typings.coinbase.coinbaseStrings.buy
import typings.coinbase.coinbaseStrings.sell
import typings.coinbase.coinbaseStrings.trade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Amount extends StObject {
    
    /**
      * Amount as floating-point in a string
      */
    var amount: String
    
    /**
      * Currency e.g. "BTC" (see Client#getCurrencies() for available strings)
      */
    var base: String
    
    /**
      * Currency e.g. "EUR" (see Client#getCurrencies() for available strings)
      */
    var currency: String
  }
  object Amount {
    
    inline def apply(amount: String, base: String, currency: String): Amount = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[Amount]
    }
    
    extension [Self <: Amount](x: Self) {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    }
  }
  
  trait Currency extends StObject {
    
    /**
      * Base currency
      */
    var currency: String
    
    /**
      * Rates as floating points in strings; indexed by currency id
      */
    var rates: StringDictionary[String]
  }
  object Currency {
    
    inline def apply(currency: String, rates: StringDictionary[String]): Currency = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    extension [Self <: Currency](x: Self) {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setRates(value: StringDictionary[String]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    }
  }
  
  trait Epoch extends StObject {
    
    var epoch: Double
    
    var iso: String
  }
  object Epoch {
    
    inline def apply(epoch: Double, iso: String): Epoch = {
      val __obj = js.Dynamic.literal(epoch = epoch.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
      __obj.asInstanceOf[Epoch]
    }
    
    extension [Self <: Epoch](x: Self) {
      
      inline def setEpoch(value: Double): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
      
      inline def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var message: String
    
    var url: String
  }
  object Id {
    
    inline def apply(id: String, message: String, url: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdResource extends StObject {
    
    var id: String
    
    var resource: trade
    
    var resource_path: String
  }
  object IdResource {
    
    inline def apply(id: String, resource_path: String): IdResource = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resource = "trade", resource_path = resource_path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdResource]
    }
    
    extension [Self <: IdResource](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setResource(value: trade): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResource_path(value: String): Self = StObject.set(x, "resource_path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Minsize extends StObject {
    
    /**
      * Abbreviation e.g. "USD" or "BTC"
      */
    var id: String
    
    /**
      * Floating-point number in a string
      */
    var min_size: String
    
    /**
      * Full name e.g. "United Arab Emirates Dirham"
      */
    var name: String
  }
  object Minsize {
    
    inline def apply(id: String, min_size: String, name: String): Minsize = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], min_size = min_size.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Minsize]
    }
    
    extension [Self <: Minsize](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMin_size(value: String): Self = StObject.set(x, "min_size", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Resource extends StObject {
    
    var id: String
    
    var resource: buy
    
    var resource_path: String
  }
  object Resource {
    
    inline def apply(id: String, resource_path: String): Resource = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resource = "buy", resource_path = resource_path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    extension [Self <: Resource](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setResource(value: buy): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResource_path(value: String): Self = StObject.set(x, "resource_path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Resourcepath extends StObject {
    
    var id: String
    
    var resource: sell
    
    var resource_path: String
  }
  object Resourcepath {
    
    inline def apply(id: String, resource_path: String): Resourcepath = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resource = "sell", resource_path = resource_path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resourcepath]
    }
    
    extension [Self <: Resourcepath](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setResource(value: sell): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResource_path(value: String): Self = StObject.set(x, "resource_path", value.asInstanceOf[js.Any])
    }
  }
}
