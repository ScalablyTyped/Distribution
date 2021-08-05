package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyReservedInstancesRequest extends StObject {
  
  /**
    * A unique, case-sensitive token you provide to ensure idempotency of your modification request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the Reserved Instances to modify.
    */
  var ReservedInstancesIds: ReservedInstancesIdStringList
  
  /**
    * The configuration settings for the Reserved Instances to modify.
    */
  var TargetConfigurations: ReservedInstancesConfigurationList
}
object ModifyReservedInstancesRequest {
  
  inline def apply(
    ReservedInstancesIds: ReservedInstancesIdStringList,
    TargetConfigurations: ReservedInstancesConfigurationList
  ): ModifyReservedInstancesRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesIds = ReservedInstancesIds.asInstanceOf[js.Any], TargetConfigurations = TargetConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReservedInstancesRequest]
  }
  
  extension [Self <: ModifyReservedInstancesRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setReservedInstancesIds(value: ReservedInstancesIdStringList): Self = StObject.set(x, "ReservedInstancesIds", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesIdsVarargs(value: ReservationId*): Self = StObject.set(x, "ReservedInstancesIds", js.Array(value :_*))
    
    inline def setTargetConfigurations(value: ReservedInstancesConfigurationList): Self = StObject.set(x, "TargetConfigurations", value.asInstanceOf[js.Any])
    
    inline def setTargetConfigurationsVarargs(value: ReservedInstancesConfiguration*): Self = StObject.set(x, "TargetConfigurations", js.Array(value :_*))
  }
}
