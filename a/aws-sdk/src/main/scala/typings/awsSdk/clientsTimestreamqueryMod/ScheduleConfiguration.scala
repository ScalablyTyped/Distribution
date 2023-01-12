package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleConfiguration extends StObject {
  
  /**
    * An expression that denotes when to trigger the scheduled query run. This can be a cron expression or a rate expression. 
    */
  var ScheduleExpression: typings.awsSdk.clientsTimestreamqueryMod.ScheduleExpression
}
object ScheduleConfiguration {
  
  inline def apply(ScheduleExpression: ScheduleExpression): ScheduleConfiguration = {
    val __obj = js.Dynamic.literal(ScheduleExpression = ScheduleExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleConfiguration] (val x: Self) extends AnyVal {
    
    inline def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
  }
}
