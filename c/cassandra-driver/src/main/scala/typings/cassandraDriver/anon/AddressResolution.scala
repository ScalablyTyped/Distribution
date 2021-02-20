package typings.cassandraDriver.anon

import typings.cassandraDriver.policiesMod.policies.addressResolution.AddressTranslator
import typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.policiesMod.policies.reconnection.ReconnectionPolicy
import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.policiesMod.policies.speculativeExecution.SpeculativeExecutionPolicy
import typings.cassandraDriver.policiesMod.policies.timestampGeneration.TimestampGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressResolution extends StObject {
  
  var addressResolution: js.UndefOr[AddressTranslator] = js.native
  
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.native
  
  var reconnection: js.UndefOr[ReconnectionPolicy] = js.native
  
  var retry: js.UndefOr[RetryPolicy] = js.native
  
  var speculativeExecution: js.UndefOr[SpeculativeExecutionPolicy] = js.native
  
  var timestampGeneration: js.UndefOr[TimestampGenerator] = js.native
}
object AddressResolution {
  
  @scala.inline
  def apply(): AddressResolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressResolution]
  }
  
  @scala.inline
  implicit class AddressResolutionMutableBuilder[Self <: AddressResolution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressResolution(value: AddressTranslator): Self = StObject.set(x, "addressResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressResolutionUndefined: Self = StObject.set(x, "addressResolution", js.undefined)
    
    @scala.inline
    def setLoadBalancing(value: LoadBalancingPolicy): Self = StObject.set(x, "loadBalancing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancingUndefined: Self = StObject.set(x, "loadBalancing", js.undefined)
    
    @scala.inline
    def setReconnection(value: ReconnectionPolicy): Self = StObject.set(x, "reconnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnectionUndefined: Self = StObject.set(x, "reconnection", js.undefined)
    
    @scala.inline
    def setRetry(value: RetryPolicy): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    @scala.inline
    def setSpeculativeExecution(value: SpeculativeExecutionPolicy): Self = StObject.set(x, "speculativeExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeculativeExecutionUndefined: Self = StObject.set(x, "speculativeExecution", js.undefined)
    
    @scala.inline
    def setTimestampGeneration(value: TimestampGenerator): Self = StObject.set(x, "timestampGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampGenerationUndefined: Self = StObject.set(x, "timestampGeneration", js.undefined)
  }
}
