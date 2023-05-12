package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoServiceUsage
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Optional description of the service used for display purposes
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date when the usage period ends
    */
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required if the service includes a phone number
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tokenised ID of the service identifier. E.g. a mobile [MSISDN](https://www.etsi.org/deliver/etsi_gts/03/0303/05.00.00_60/gsmts_0303v050000p.pdf), [FNN](https://www.nbnco.com.au/content/dam/nbnco2/documents/sfaa-wba2-dictionary_FTTN-launch.pdf) or internet service e.g [NBN AVC Service ID](https://www.nbnco.com.au/content/dam/nbnco2/documents/sfaa-wba2-dictionary_FTTN-launch.pdf). To be created in accordance with [CDR ID permanence](#id-permanence) requirements
    */
  var serviceId: String
  
  /**
    * Date when the usage period started
    */
  var startDate: String
  
  /**
    * Object containing usage summary
    */
  var usage: js.UndefOr[Data] = js.undefined
}
object TelcoServiceUsage {
  
  inline def apply(serviceId: String, startDate: String): TelcoServiceUsage = {
    val __obj = js.Dynamic.literal(serviceId = serviceId.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoServiceUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoServiceUsage] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: Data): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
