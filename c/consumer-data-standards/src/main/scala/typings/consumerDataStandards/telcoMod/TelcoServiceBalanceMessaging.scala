package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DescriptionInternational
import typings.consumerDataStandards.consumerDataStandardsStrings.LIMITED
import typings.consumerDataStandards.consumerDataStandardsStrings.METERED
import typings.consumerDataStandards.consumerDataStandardsStrings.UNMETERED
import typings.consumerDataStandards.consumerDataStandardsStrings.UNSUPPORTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoServiceBalanceMessaging
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Summary of MMS Balance. Required if the service plan supports MMS messaging
    */
  var mms: DescriptionInternational
  
  /**
    * Plan type for this feature. METERED: A plan is charged by usage for the feature. UNMETERED: A plan with no limits for a feature. LIMITED: Where plan limit inclusions apply. UNSUPPORTED: Feature is not supported
    */
  var planType: js.UndefOr[METERED | UNMETERED | LIMITED | UNSUPPORTED] = js.undefined
  
  /**
    * Summary of SMS Balance. Required if the service plan supports SMS messaging
    */
  var sms: DescriptionInternational
}
object TelcoServiceBalanceMessaging {
  
  inline def apply(mms: DescriptionInternational, sms: DescriptionInternational): TelcoServiceBalanceMessaging = {
    val __obj = js.Dynamic.literal(mms = mms.asInstanceOf[js.Any], sms = sms.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoServiceBalanceMessaging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoServiceBalanceMessaging] (val x: Self) extends AnyVal {
    
    inline def setMms(value: DescriptionInternational): Self = StObject.set(x, "mms", value.asInstanceOf[js.Any])
    
    inline def setPlanType(value: METERED | UNMETERED | LIMITED | UNSUPPORTED): Self = StObject.set(x, "planType", value.asInstanceOf[js.Any])
    
    inline def setPlanTypeUndefined: Self = StObject.set(x, "planType", js.undefined)
    
    inline def setSms(value: DescriptionInternational): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
  }
}
