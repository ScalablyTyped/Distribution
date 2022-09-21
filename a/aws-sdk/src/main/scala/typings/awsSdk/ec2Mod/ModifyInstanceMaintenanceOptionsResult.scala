package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceMaintenanceOptionsResult extends StObject {
  
  /**
    * Provides information on the current automatic recovery behavior of your instance.
    */
  var AutoRecovery: js.UndefOr[InstanceAutoRecoveryState] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object ModifyInstanceMaintenanceOptionsResult {
  
  inline def apply(): ModifyInstanceMaintenanceOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceMaintenanceOptionsResult]
  }
  
  extension [Self <: ModifyInstanceMaintenanceOptionsResult](x: Self) {
    
    inline def setAutoRecovery(value: InstanceAutoRecoveryState): Self = StObject.set(x, "AutoRecovery", value.asInstanceOf[js.Any])
    
    inline def setAutoRecoveryUndefined: Self = StObject.set(x, "AutoRecovery", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
