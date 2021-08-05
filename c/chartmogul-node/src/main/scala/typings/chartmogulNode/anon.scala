package typings.chartmogulNode

import typings.chartmogulNode.commonMod.Strings
import typings.chartmogulNode.mod.Customer.NewCustomAttributes
import typings.chartmogulNode.mod.Invoice.Invoice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Addresszip extends StObject {
    
    var address_zip: js.UndefOr[String] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object Addresszip {
    
    inline def apply(): Addresszip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Addresszip]
    }
    
    extension [Self <: Addresszip](x: Self) {
      
      inline def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
      
      inline def setAddress_zipUndefined: Self = StObject.set(x, "address_zip", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait Arpa extends StObject {
    
    var arpa: Double
    
    var arr: Double
    
    var asp: Double
    
    var `customer-churn-rate`: Double
    
    var customers: Double
    
    var date: String
    
    var ltv: Double
    
    var mrr: Double
    
    var `mrr-churn-rate`: Double
  }
  object Arpa {
    
    inline def apply(
      arpa: Double,
      arr: Double,
      asp: Double,
      `customer-churn-rate`: Double,
      customers: Double,
      date: String,
      ltv: Double,
      mrr: Double,
      `mrr-churn-rate`: Double
    ): Arpa = {
      val __obj = js.Dynamic.literal(arpa = arpa.asInstanceOf[js.Any], arr = arr.asInstanceOf[js.Any], asp = asp.asInstanceOf[js.Any], customers = customers.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], ltv = ltv.asInstanceOf[js.Any], mrr = mrr.asInstanceOf[js.Any])
      __obj.updateDynamic("customer-churn-rate")(`customer-churn-rate`.asInstanceOf[js.Any])
      __obj.updateDynamic("mrr-churn-rate")(`mrr-churn-rate`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arpa]
    }
    
    extension [Self <: Arpa](x: Self) {
      
      inline def setArpa(value: Double): Self = StObject.set(x, "arpa", value.asInstanceOf[js.Any])
      
      inline def setArr(value: Double): Self = StObject.set(x, "arr", value.asInstanceOf[js.Any])
      
      inline def setAsp(value: Double): Self = StObject.set(x, "asp", value.asInstanceOf[js.Any])
      
      inline def `setCustomer-churn-rate`(value: Double): Self = StObject.set(x, "customer-churn-rate", value.asInstanceOf[js.Any])
      
      inline def setCustomers(value: Double): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setLtv(value: Double): Self = StObject.set(x, "ltv", value.asInstanceOf[js.Any])
      
      inline def setMrr(value: Double): Self = StObject.set(x, "mrr", value.asInstanceOf[js.Any])
      
      inline def `setMrr-churn-rate`(value: Double): Self = StObject.set(x, "mrr-churn-rate", value.asInstanceOf[js.Any])
    }
  }
  
  trait Custom extends StObject {
    
    var custom: js.Array[NewCustomAttributes]
    
    var email: String
  }
  object Custom {
    
    inline def apply(custom: js.Array[NewCustomAttributes], email: String): Custom = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Custom]
    }
    
    extension [Self <: Custom](x: Self) {
      
      inline def setCustom(value: js.Array[NewCustomAttributes]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomVarargs(value: NewCustomAttributes*): Self = StObject.set(x, "custom", js.Array(value :_*))
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomArray extends StObject {
    
    var custom: js.Array[NewCustomAttributes]
  }
  object CustomArray {
    
    inline def apply(custom: js.Array[NewCustomAttributes]): CustomArray = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomArray]
    }
    
    extension [Self <: CustomArray](x: Self) {
      
      inline def setCustom(value: js.Array[NewCustomAttributes]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomVarargs(value: NewCustomAttributes*): Self = StObject.set(x, "custom", js.Array(value :_*))
    }
  }
  
  trait CustomStrings extends StObject {
    
    var custom: Strings
  }
  object CustomStrings {
    
    inline def apply(custom: Strings): CustomStrings = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomStrings]
    }
    
    extension [Self <: CustomStrings](x: Self) {
      
      inline def setCustom(value: Strings): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomVarargs(value: String*): Self = StObject.set(x, "custom", js.Array(value :_*))
    }
  }
  
  trait Invoices extends StObject {
    
    var invoices: js.Array[Invoice]
  }
  object Invoices {
    
    inline def apply(invoices: js.Array[Invoice]): Invoices = {
      val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Invoices]
    }
    
    extension [Self <: Invoices](x: Self) {
      
      inline def setInvoices(value: js.Array[Invoice]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
      
      inline def setInvoicesVarargs(value: Invoice*): Self = StObject.set(x, "invoices", js.Array(value :_*))
    }
  }
}
