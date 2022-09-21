package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoverInstancesResponse extends StObject {
  
  /**
    * A complex type that contains one HttpInstanceSummary for each registered instance.
    */
  var Instances: js.UndefOr[HttpInstanceSummaryList] = js.undefined
}
object DiscoverInstancesResponse {
  
  inline def apply(): DiscoverInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverInstancesResponse]
  }
  
  extension [Self <: DiscoverInstancesResponse](x: Self) {
    
    inline def setInstances(value: HttpInstanceSummaryList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: HttpInstanceSummary*): Self = StObject.set(x, "Instances", js.Array(value*))
  }
}
