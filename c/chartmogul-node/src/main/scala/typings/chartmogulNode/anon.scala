package typings.chartmogulNode

import typings.chartmogulNode.commonMod.Strings
import typings.chartmogulNode.mod.Customer.NewCustomAttributes
import typings.chartmogulNode.mod.Invoice.Invoice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Addresszip extends StObject {
    
    var address_zip: js.UndefOr[String] = js.native
    
    var city: js.UndefOr[String] = js.native
    
    var country: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
  }
  object Addresszip {
    
    @scala.inline
    def apply(): Addresszip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Addresszip]
    }
    
    @scala.inline
    implicit class AddresszipMutableBuilder[Self <: Addresszip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_zipUndefined: Self = StObject.set(x, "address_zip", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait Arpa extends StObject {
    
    var arpa: Double = js.native
    
    var arr: Double = js.native
    
    var asp: Double = js.native
    
    var `customer-churn-rate`: Double = js.native
    
    var customers: Double = js.native
    
    var date: String = js.native
    
    var ltv: Double = js.native
    
    var mrr: Double = js.native
    
    var `mrr-churn-rate`: Double = js.native
  }
  object Arpa {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ArpaMutableBuilder[Self <: Arpa] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArpa(value: Double): Self = StObject.set(x, "arpa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArr(value: Double): Self = StObject.set(x, "arr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsp(value: Double): Self = StObject.set(x, "asp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCustomer-churn-rate`(value: Double): Self = StObject.set(x, "customer-churn-rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomers(value: Double): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtv(value: Double): Self = StObject.set(x, "ltv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMrr(value: Double): Self = StObject.set(x, "mrr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMrr-churn-rate`(value: Double): Self = StObject.set(x, "mrr-churn-rate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Custom extends StObject {
    
    var custom: js.Array[NewCustomAttributes] = js.native
    
    var email: String = js.native
  }
  object Custom {
    
    @scala.inline
    def apply(custom: js.Array[NewCustomAttributes], email: String): Custom = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Custom]
    }
    
    @scala.inline
    implicit class CustomMutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: js.Array[NewCustomAttributes]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomVarargs(value: NewCustomAttributes*): Self = StObject.set(x, "custom", js.Array(value :_*))
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomArray extends StObject {
    
    var custom: js.Array[NewCustomAttributes] = js.native
  }
  object CustomArray {
    
    @scala.inline
    def apply(custom: js.Array[NewCustomAttributes]): CustomArray = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomArray]
    }
    
    @scala.inline
    implicit class CustomArrayMutableBuilder[Self <: CustomArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: js.Array[NewCustomAttributes]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomVarargs(value: NewCustomAttributes*): Self = StObject.set(x, "custom", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CustomStrings extends StObject {
    
    var custom: Strings = js.native
  }
  object CustomStrings {
    
    @scala.inline
    def apply(custom: Strings): CustomStrings = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomStrings]
    }
    
    @scala.inline
    implicit class CustomStringsMutableBuilder[Self <: CustomStrings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: Strings): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomVarargs(value: String*): Self = StObject.set(x, "custom", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Invoices extends StObject {
    
    var invoices: js.Array[Invoice] = js.native
  }
  object Invoices {
    
    @scala.inline
    def apply(invoices: js.Array[Invoice]): Invoices = {
      val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Invoices]
    }
    
    @scala.inline
    implicit class InvoicesMutableBuilder[Self <: Invoices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvoices(value: js.Array[Invoice]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoicesVarargs(value: Invoice*): Self = StObject.set(x, "invoices", js.Array(value :_*))
    }
  }
}
