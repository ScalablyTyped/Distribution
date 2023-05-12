package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BROADBAND
import typings.consumerDataStandards.consumerDataStandardsStrings.MOBILE
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.POST_PAID
import typings.consumerDataStandards.consumerDataStandardsStrings.PRE_PAID
import typings.consumerDataStandards.consumerDataStandardsStrings.UPFRONT_PAID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingType
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The billing type of then plan
    */
  var billingType: PRE_PAID | POST_PAID | UPFRONT_PAID | OTHER
  
  /**
    * Optional display name for the plan provided by the customer to help differentiate multiple plans
    */
  var nickname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mandatory if openStatus is OPEN
    */
  var planOverview: DictkDisplayName
  
  /**
    * The serviceId representing a unique service identifier such as a mobile [MSISDN](https://www.etsi.org/deliver/etsi_gts/03/0303/05.00.00_60/gsmts_0303v050000p.pdf), [FNN](https://www.nbnco.com.au/content/dam/nbnco2/documents/sfaa-wba2-dictionary_FTTN-launch.pdf) or internet service e.g [NBN AVC Service ID](https://www.nbnco.com.au/content/dam/nbnco2/documents/sfaa-wba2-dictionary_FTTN-launch.pdf). In accordance with [CDR ID permanence](#id-permanence) requirement
    */
  var serviceIds: js.Array[String]
  
  /**
    * The type of the plan. The type of plan. A [MOBILE](https://www.legislation.gov.au/Details/C2022C00170/Html/Volume_1#_Toc95898745) service or BROADBAND fixed internet service
    */
  var `type`: MOBILE | BROADBAND
}
object BillingType {
  
  inline def apply(
    billingType: PRE_PAID | POST_PAID | UPFRONT_PAID | OTHER,
    planOverview: DictkDisplayName,
    serviceIds: js.Array[String],
    `type`: MOBILE | BROADBAND
  ): BillingType = {
    val __obj = js.Dynamic.literal(billingType = billingType.asInstanceOf[js.Any], planOverview = planOverview.asInstanceOf[js.Any], serviceIds = serviceIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingType] (val x: Self) extends AnyVal {
    
    inline def setBillingType(value: PRE_PAID | POST_PAID | UPFRONT_PAID | OTHER): Self = StObject.set(x, "billingType", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameNull: Self = StObject.set(x, "nickname", null)
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setPlanOverview(value: DictkDisplayName): Self = StObject.set(x, "planOverview", value.asInstanceOf[js.Any])
    
    inline def setServiceIds(value: js.Array[String]): Self = StObject.set(x, "serviceIds", value.asInstanceOf[js.Any])
    
    inline def setServiceIdsVarargs(value: String*): Self = StObject.set(x, "serviceIds", js.Array(value*))
    
    inline def setType(value: MOBILE | BROADBAND): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
