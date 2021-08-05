package typings.cassandraDriver.anon

import typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.typesMod.types.consistencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consistency extends StObject {
  
  var consistency: js.UndefOr[consistencies] = js.undefined
  
  var graphOptions: js.UndefOr[Language] = js.undefined
  
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.undefined
  
  var readTimeout: js.UndefOr[Double] = js.undefined
  
  var retry: js.UndefOr[RetryPolicy] = js.undefined
  
  var serialConsistency: js.UndefOr[consistencies] = js.undefined
}
object Consistency {
  
  inline def apply(): Consistency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Consistency]
  }
  
  extension [Self <: Consistency](x: Self) {
    
    inline def setConsistency(value: consistencies): Self = StObject.set(x, "consistency", value.asInstanceOf[js.Any])
    
    inline def setConsistencyUndefined: Self = StObject.set(x, "consistency", js.undefined)
    
    inline def setGraphOptions(value: Language): Self = StObject.set(x, "graphOptions", value.asInstanceOf[js.Any])
    
    inline def setGraphOptionsUndefined: Self = StObject.set(x, "graphOptions", js.undefined)
    
    inline def setLoadBalancing(value: LoadBalancingPolicy): Self = StObject.set(x, "loadBalancing", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancingUndefined: Self = StObject.set(x, "loadBalancing", js.undefined)
    
    inline def setReadTimeout(value: Double): Self = StObject.set(x, "readTimeout", value.asInstanceOf[js.Any])
    
    inline def setReadTimeoutUndefined: Self = StObject.set(x, "readTimeout", js.undefined)
    
    inline def setRetry(value: RetryPolicy): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setSerialConsistency(value: consistencies): Self = StObject.set(x, "serialConsistency", value.asInstanceOf[js.Any])
    
    inline def setSerialConsistencyUndefined: Self = StObject.set(x, "serialConsistency", js.undefined)
  }
}
