package typings.cassandraDriver.anon

import typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.typesMod.types.consistencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consistency extends StObject {
  
  var consistency: js.UndefOr[consistencies] = js.native
  
  var graphOptions: js.UndefOr[Language] = js.native
  
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.native
  
  var readTimeout: js.UndefOr[Double] = js.native
  
  var retry: js.UndefOr[RetryPolicy] = js.native
  
  var serialConsistency: js.UndefOr[consistencies] = js.native
}
object Consistency {
  
  @scala.inline
  def apply(): Consistency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Consistency]
  }
  
  @scala.inline
  implicit class ConsistencyMutableBuilder[Self <: Consistency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsistency(value: consistencies): Self = StObject.set(x, "consistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistencyUndefined: Self = StObject.set(x, "consistency", js.undefined)
    
    @scala.inline
    def setGraphOptions(value: Language): Self = StObject.set(x, "graphOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphOptionsUndefined: Self = StObject.set(x, "graphOptions", js.undefined)
    
    @scala.inline
    def setLoadBalancing(value: LoadBalancingPolicy): Self = StObject.set(x, "loadBalancing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancingUndefined: Self = StObject.set(x, "loadBalancing", js.undefined)
    
    @scala.inline
    def setReadTimeout(value: Double): Self = StObject.set(x, "readTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeoutUndefined: Self = StObject.set(x, "readTimeout", js.undefined)
    
    @scala.inline
    def setRetry(value: RetryPolicy): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    @scala.inline
    def setSerialConsistency(value: consistencies): Self = StObject.set(x, "serialConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialConsistencyUndefined: Self = StObject.set(x, "serialConsistency", js.undefined)
  }
}
