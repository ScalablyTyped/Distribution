package typings.coinbase

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Amount extends StObject {
    
    /**
      * Amount as floating-point in a string
      */
    var amount: String = js.native
    
    /**
      * Currency e.g. "BTC" (see Client#getCurrencies() for available strings)
      */
    var base: String = js.native
    
    /**
      * Currency e.g. "EUR" (see Client#getCurrencies() for available strings)
      */
    var currency: String = js.native
  }
  object Amount {
    
    @scala.inline
    def apply(amount: String, base: String, currency: String): Amount = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[Amount]
    }
    
    @scala.inline
    implicit class AmountMutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Currency extends StObject {
    
    /**
      * Base currency
      */
    var currency: String = js.native
    
    /**
      * Rates as floating points in strings; indexed by currency id
      */
    var rates: StringDictionary[String] = js.native
  }
  object Currency {
    
    @scala.inline
    def apply(currency: String, rates: StringDictionary[String]): Currency = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    @scala.inline
    implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRates(value: StringDictionary[String]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Epoch extends StObject {
    
    var epoch: Double = js.native
    
    var iso: String = js.native
  }
  object Epoch {
    
    @scala.inline
    def apply(epoch: Double, iso: String): Epoch = {
      val __obj = js.Dynamic.literal(epoch = epoch.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
      __obj.asInstanceOf[Epoch]
    }
    
    @scala.inline
    implicit class EpochMutableBuilder[Self <: Epoch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEpoch(value: Double): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var message: String = js.native
    
    var url: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, message: String, url: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Minsize extends StObject {
    
    /**
      * Abbreviation e.g. "USD" or "BTC"
      */
    var id: String = js.native
    
    /**
      * Floating-point number in a string
      */
    var min_size: String = js.native
    
    /**
      * Full name e.g. "United Arab Emirates Dirham"
      */
    var name: String = js.native
  }
  object Minsize {
    
    @scala.inline
    def apply(id: String, min_size: String, name: String): Minsize = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], min_size = min_size.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Minsize]
    }
    
    @scala.inline
    implicit class MinsizeMutableBuilder[Self <: Minsize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin_size(value: String): Self = StObject.set(x, "min_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
