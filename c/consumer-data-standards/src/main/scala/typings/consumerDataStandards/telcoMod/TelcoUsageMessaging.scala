package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.International
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoUsageMessaging
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Summary of MMS usage
    */
  var mms: International
  
  /**
    * Summary of SMS usage
    */
  var sms: International
}
object TelcoUsageMessaging {
  
  inline def apply(mms: International, sms: International): TelcoUsageMessaging = {
    val __obj = js.Dynamic.literal(mms = mms.asInstanceOf[js.Any], sms = sms.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoUsageMessaging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoUsageMessaging] (val x: Self) extends AnyVal {
    
    inline def setMms(value: International): Self = StObject.set(x, "mms", value.asInstanceOf[js.Any])
    
    inline def setSms(value: International): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
  }
}
