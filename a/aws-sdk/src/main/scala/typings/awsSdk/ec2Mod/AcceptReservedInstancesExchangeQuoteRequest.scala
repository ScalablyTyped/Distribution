package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptReservedInstancesExchangeQuoteRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the Convertible Reserved Instances to exchange for another Convertible Reserved Instance of the same or higher value.
    */
  var ReservedInstanceIds: ReservedInstanceIdSet
  
  /**
    * The configuration of the target Convertible Reserved Instance to exchange for your current Convertible Reserved Instances.
    */
  var TargetConfigurations: js.UndefOr[TargetConfigurationRequestSet] = js.undefined
}
object AcceptReservedInstancesExchangeQuoteRequest {
  
  @scala.inline
  def apply(ReservedInstanceIds: ReservedInstanceIdSet): AcceptReservedInstancesExchangeQuoteRequest = {
    val __obj = js.Dynamic.literal(ReservedInstanceIds = ReservedInstanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptReservedInstancesExchangeQuoteRequest]
  }
  
  @scala.inline
  implicit class AcceptReservedInstancesExchangeQuoteRequestMutableBuilder[Self <: AcceptReservedInstancesExchangeQuoteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setReservedInstanceIds(value: ReservedInstanceIdSet): Self = StObject.set(x, "ReservedInstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstanceIdsVarargs(value: ReservationId*): Self = StObject.set(x, "ReservedInstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetConfigurations(value: TargetConfigurationRequestSet): Self = StObject.set(x, "TargetConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetConfigurationsUndefined: Self = StObject.set(x, "TargetConfigurations", js.undefined)
    
    @scala.inline
    def setTargetConfigurationsVarargs(value: TargetConfigurationRequest*): Self = StObject.set(x, "TargetConfigurations", js.Array(value :_*))
  }
}
