package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentOperatorInfo extends StObject {
  
  var categoryName: String
  
  var emailAddress: String
  
  var enabled: Boolean
  
  var id: Double
  
  var lastEmailDate: String
  
  var lastNetSendDate: String
  
  var lastPagerDate: String
  
  var name: String
  
  var netSendAddress: String
  
  var pagerAddress: String
  
  var pagerDays: WeekDays
  
  var saturdayPagerEndTime: String
  
  var saturdayPagerStartTime: String
  
  var sundayPagerEndTime: String
  
  var sundayPagerStartTime: String
  
  var weekdayPagerEndTime: String
  
  var weekdayPagerStartTime: String
}
object AgentOperatorInfo {
  
  inline def apply(
    categoryName: String,
    emailAddress: String,
    enabled: Boolean,
    id: Double,
    lastEmailDate: String,
    lastNetSendDate: String,
    lastPagerDate: String,
    name: String,
    netSendAddress: String,
    pagerAddress: String,
    pagerDays: WeekDays,
    saturdayPagerEndTime: String,
    saturdayPagerStartTime: String,
    sundayPagerEndTime: String,
    sundayPagerStartTime: String,
    weekdayPagerEndTime: String,
    weekdayPagerStartTime: String
  ): AgentOperatorInfo = {
    val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastEmailDate = lastEmailDate.asInstanceOf[js.Any], lastNetSendDate = lastNetSendDate.asInstanceOf[js.Any], lastPagerDate = lastPagerDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], netSendAddress = netSendAddress.asInstanceOf[js.Any], pagerAddress = pagerAddress.asInstanceOf[js.Any], pagerDays = pagerDays.asInstanceOf[js.Any], saturdayPagerEndTime = saturdayPagerEndTime.asInstanceOf[js.Any], saturdayPagerStartTime = saturdayPagerStartTime.asInstanceOf[js.Any], sundayPagerEndTime = sundayPagerEndTime.asInstanceOf[js.Any], sundayPagerStartTime = sundayPagerStartTime.asInstanceOf[js.Any], weekdayPagerEndTime = weekdayPagerEndTime.asInstanceOf[js.Any], weekdayPagerStartTime = weekdayPagerStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOperatorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentOperatorInfo] (val x: Self) extends AnyVal {
    
    inline def setCategoryName(value: String): Self = StObject.set(x, "categoryName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastEmailDate(value: String): Self = StObject.set(x, "lastEmailDate", value.asInstanceOf[js.Any])
    
    inline def setLastNetSendDate(value: String): Self = StObject.set(x, "lastNetSendDate", value.asInstanceOf[js.Any])
    
    inline def setLastPagerDate(value: String): Self = StObject.set(x, "lastPagerDate", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetSendAddress(value: String): Self = StObject.set(x, "netSendAddress", value.asInstanceOf[js.Any])
    
    inline def setPagerAddress(value: String): Self = StObject.set(x, "pagerAddress", value.asInstanceOf[js.Any])
    
    inline def setPagerDays(value: WeekDays): Self = StObject.set(x, "pagerDays", value.asInstanceOf[js.Any])
    
    inline def setSaturdayPagerEndTime(value: String): Self = StObject.set(x, "saturdayPagerEndTime", value.asInstanceOf[js.Any])
    
    inline def setSaturdayPagerStartTime(value: String): Self = StObject.set(x, "saturdayPagerStartTime", value.asInstanceOf[js.Any])
    
    inline def setSundayPagerEndTime(value: String): Self = StObject.set(x, "sundayPagerEndTime", value.asInstanceOf[js.Any])
    
    inline def setSundayPagerStartTime(value: String): Self = StObject.set(x, "sundayPagerStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeekdayPagerEndTime(value: String): Self = StObject.set(x, "weekdayPagerEndTime", value.asInstanceOf[js.Any])
    
    inline def setWeekdayPagerStartTime(value: String): Self = StObject.set(x, "weekdayPagerStartTime", value.asInstanceOf[js.Any])
  }
}
