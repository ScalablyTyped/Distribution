package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleConfiguration extends StObject {
  
  /**
    * Program transition configurations.
    */
  var Transition: typings.awsSdk.mediatailorMod.Transition
}
object ScheduleConfiguration {
  
  inline def apply(Transition: Transition): ScheduleConfiguration = {
    val __obj = js.Dynamic.literal(Transition = Transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleConfiguration]
  }
  
  extension [Self <: ScheduleConfiguration](x: Self) {
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
  }
}
