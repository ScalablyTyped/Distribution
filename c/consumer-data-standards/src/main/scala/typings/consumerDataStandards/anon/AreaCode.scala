package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.HOME
import typings.consumerDataStandards.consumerDataStandardsStrings.INTERNATIONAL
import typings.consumerDataStandards.consumerDataStandardsStrings.MOBILE
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.UNSPECIFIED
import typings.consumerDataStandards.consumerDataStandardsStrings.WORK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaCode
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.
    */
  var areaCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If absent, assumed to be Australia (+61). The + should be included
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An extension number (if applicable)
    */
  var `extension`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of **[[RFC3966]](#iref-RFC3966)**
    */
  var fullNumber: String
  
  /**
    * May be true for one and only one entry to indicate the preferred phone number. Assumed to be 'false' if not present
    */
  var isPreferred: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The actual phone number, with leading zeros as appropriate
    */
  var number: String
  
  /**
    * The purpose of the number as specified by the customer
    */
  var purpose: HOME | INTERNATIONAL | MOBILE | OTHER | UNSPECIFIED | WORK
}
object AreaCode {
  
  inline def apply(
    fullNumber: String,
    number: String,
    purpose: HOME | INTERNATIONAL | MOBILE | OTHER | UNSPECIFIED | WORK
  ): AreaCode = {
    val __obj = js.Dynamic.literal(fullNumber = fullNumber.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaCode]
  }
  
  extension [Self <: AreaCode](x: Self) {
    
    inline def setAreaCode(value: String): Self = StObject.set(x, "areaCode", value.asInstanceOf[js.Any])
    
    inline def setAreaCodeNull: Self = StObject.set(x, "areaCode", null)
    
    inline def setAreaCodeUndefined: Self = StObject.set(x, "areaCode", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionNull: Self = StObject.set(x, "extension", null)
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setFullNumber(value: String): Self = StObject.set(x, "fullNumber", value.asInstanceOf[js.Any])
    
    inline def setIsPreferred(value: Boolean): Self = StObject.set(x, "isPreferred", value.asInstanceOf[js.Any])
    
    inline def setIsPreferredNull: Self = StObject.set(x, "isPreferred", null)
    
    inline def setIsPreferredUndefined: Self = StObject.set(x, "isPreferred", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPurpose(value: HOME | INTERNATIONAL | MOBILE | OTHER | UNSPECIFIED | WORK): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
  }
}
