package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoServiceDetail
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The tokenised ID of the service identifier for use in the CDR APIs. E.g a mobile [MSISDN](https://www.etsi.org/deliver/etsi_gts/03/0303/05.00.00_60/gsmts_0303v050000p.pdf), [FNN](https://www.nbnco.com.au/content/dam/nbnco2/documents/sfaa-wba2-dictionary_FTTN-launch.pdf) or internet service e.g [NBN AVC Service ID](https://www.nbnco.com.au/content/dam/nbnco2/documents/sfaa-wba2-dictionary_FTTN-launch.pdf).  Created according to the CDR rules for [CDR ID permanence](#id-permanence)
    */
  var serviceId: String
}
object TelcoServiceDetail {
  
  inline def apply(serviceId: String): TelcoServiceDetail = {
    val __obj = js.Dynamic.literal(serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoServiceDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoServiceDetail] (val x: Self) extends AnyVal {
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
  }
}
