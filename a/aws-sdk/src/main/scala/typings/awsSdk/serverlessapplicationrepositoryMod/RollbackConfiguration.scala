package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackConfiguration extends StObject {
  
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackConfiguration
    Data Type.
    */
  var MonitoringTimeInMinutes: js.UndefOr[integer] = js.undefined
  
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackConfiguration
    Data Type.
    */
  var RollbackTriggers: js.UndefOr[listOfRollbackTrigger] = js.undefined
}
object RollbackConfiguration {
  
  inline def apply(): RollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackConfiguration]
  }
  
  extension [Self <: RollbackConfiguration](x: Self) {
    
    inline def setMonitoringTimeInMinutes(value: integer): Self = StObject.set(x, "MonitoringTimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setMonitoringTimeInMinutesUndefined: Self = StObject.set(x, "MonitoringTimeInMinutes", js.undefined)
    
    inline def setRollbackTriggers(value: listOfRollbackTrigger): Self = StObject.set(x, "RollbackTriggers", value.asInstanceOf[js.Any])
    
    inline def setRollbackTriggersUndefined: Self = StObject.set(x, "RollbackTriggers", js.undefined)
    
    inline def setRollbackTriggersVarargs(value: RollbackTrigger*): Self = StObject.set(x, "RollbackTriggers", js.Array(value*))
  }
}
