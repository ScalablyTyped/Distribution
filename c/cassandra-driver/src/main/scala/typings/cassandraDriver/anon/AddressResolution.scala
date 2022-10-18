package typings.cassandraDriver.anon

import typings.cassandraDriver.libPoliciesMod.policies.addressResolution.AddressTranslator
import typings.cassandraDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.libPoliciesMod.policies.reconnection.ReconnectionPolicy
import typings.cassandraDriver.libPoliciesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.libPoliciesMod.policies.speculativeExecution.SpeculativeExecutionPolicy
import typings.cassandraDriver.libPoliciesMod.policies.timestampGeneration.TimestampGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressResolution extends StObject {
  
  var addressResolution: js.UndefOr[AddressTranslator] = js.undefined
  
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.undefined
  
  var reconnection: js.UndefOr[ReconnectionPolicy] = js.undefined
  
  var retry: js.UndefOr[RetryPolicy] = js.undefined
  
  var speculativeExecution: js.UndefOr[SpeculativeExecutionPolicy] = js.undefined
  
  var timestampGeneration: js.UndefOr[TimestampGenerator] = js.undefined
}
object AddressResolution {
  
  inline def apply(): AddressResolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressResolution]
  }
  
  extension [Self <: AddressResolution](x: Self) {
    
    inline def setAddressResolution(value: AddressTranslator): Self = StObject.set(x, "addressResolution", value.asInstanceOf[js.Any])
    
    inline def setAddressResolutionUndefined: Self = StObject.set(x, "addressResolution", js.undefined)
    
    inline def setLoadBalancing(value: LoadBalancingPolicy): Self = StObject.set(x, "loadBalancing", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancingUndefined: Self = StObject.set(x, "loadBalancing", js.undefined)
    
    inline def setReconnection(value: ReconnectionPolicy): Self = StObject.set(x, "reconnection", value.asInstanceOf[js.Any])
    
    inline def setReconnectionUndefined: Self = StObject.set(x, "reconnection", js.undefined)
    
    inline def setRetry(value: RetryPolicy): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setSpeculativeExecution(value: SpeculativeExecutionPolicy): Self = StObject.set(x, "speculativeExecution", value.asInstanceOf[js.Any])
    
    inline def setSpeculativeExecutionUndefined: Self = StObject.set(x, "speculativeExecution", js.undefined)
    
    inline def setTimestampGeneration(value: TimestampGenerator): Self = StObject.set(x, "timestampGeneration", value.asInstanceOf[js.Any])
    
    inline def setTimestampGenerationUndefined: Self = StObject.set(x, "timestampGeneration", js.undefined)
  }
}
