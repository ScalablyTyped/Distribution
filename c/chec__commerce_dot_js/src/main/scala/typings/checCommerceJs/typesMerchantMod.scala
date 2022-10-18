package typings.checCommerceJs

import typings.checCommerceJs.anon.Analytics
import typings.checCommerceJs.anon.Google
import typings.checCommerceJs.typesCurrencyMod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMerchantMod {
  
  trait Merchant extends StObject {
    
    var analytics: Google
    
    var country: String
    
    var cover: String | Null
    
    var currency: Currency
    
    var description: String
    
    var has: Analytics
    
    var id: Double
    
    var intercom: Boolean
    
    var logo: js.UndefOr[String] = js.undefined
    
    var logo_shape: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var status: MerchantStatus
    
    var support_email: String
  }
  object Merchant {
    
    inline def apply(
      analytics: Google,
      country: String,
      currency: Currency,
      description: String,
      has: Analytics,
      id: Double,
      intercom: Boolean,
      name: String,
      status: MerchantStatus,
      support_email: String
    ): Merchant = {
      val __obj = js.Dynamic.literal(analytics = analytics.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intercom = intercom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], support_email = support_email.asInstanceOf[js.Any], cover = null)
      __obj.asInstanceOf[Merchant]
    }
    
    extension [Self <: Merchant](x: Self) {
      
      inline def setAnalytics(value: Google): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCover(value: String): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setCoverNull: Self = StObject.set(x, "cover", null)
      
      inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHas(value: Analytics): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIntercom(value: Boolean): Self = StObject.set(x, "intercom", value.asInstanceOf[js.Any])
      
      inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setLogo_shape(value: String): Self = StObject.set(x, "logo_shape", value.asInstanceOf[js.Any])
      
      inline def setLogo_shapeUndefined: Self = StObject.set(x, "logo_shape", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: MerchantStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSupport_email(value: String): Self = StObject.set(x, "support_email", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.checCommerceJs.checCommerceJsStrings.active
    - typings.checCommerceJs.checCommerceJsStrings.inactive
  */
  trait MerchantStatus extends StObject
  object MerchantStatus {
    
    inline def active: typings.checCommerceJs.checCommerceJsStrings.active = "active".asInstanceOf[typings.checCommerceJs.checCommerceJsStrings.active]
    
    inline def inactive: typings.checCommerceJs.checCommerceJsStrings.inactive = "inactive".asInstanceOf[typings.checCommerceJs.checCommerceJsStrings.inactive]
  }
}
