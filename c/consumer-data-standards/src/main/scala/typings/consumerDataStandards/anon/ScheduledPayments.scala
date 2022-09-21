package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledPayments
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The list of scheduled payments to return
    */
  var scheduledPayments: js.Array[From]
}
object ScheduledPayments {
  
  inline def apply(scheduledPayments: js.Array[From]): ScheduledPayments = {
    val __obj = js.Dynamic.literal(scheduledPayments = scheduledPayments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledPayments]
  }
  
  extension [Self <: ScheduledPayments](x: Self) {
    
    inline def setScheduledPayments(value: js.Array[From]): Self = StObject.set(x, "scheduledPayments", value.asInstanceOf[js.Any])
    
    inline def setScheduledPaymentsVarargs(value: From*): Self = StObject.set(x, "scheduledPayments", js.Array(value*))
  }
}
