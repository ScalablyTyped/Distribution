package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClustersResponse extends StObject {
  
  /**
    * The list of clusters.
    */
  var clusters: js.UndefOr[Clusters] = js.undefined
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
}
object DescribeClustersResponse {
  
  inline def apply(): DescribeClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClustersResponse]
  }
  
  extension [Self <: DescribeClustersResponse](x: Self) {
    
    inline def setClusters(value: Clusters): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    inline def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value :_*))
  }
}
