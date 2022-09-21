package typings.awsSdk.emrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVirtualClustersResponse extends StObject {
  
  /**
    * This output displays the token for the next set of virtual clusters.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * This output lists the specified virtual clusters.
    */
  var virtualClusters: js.UndefOr[VirtualClusters] = js.undefined
}
object ListVirtualClustersResponse {
  
  inline def apply(): ListVirtualClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVirtualClustersResponse]
  }
  
  extension [Self <: ListVirtualClustersResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVirtualClusters(value: VirtualClusters): Self = StObject.set(x, "virtualClusters", value.asInstanceOf[js.Any])
    
    inline def setVirtualClustersUndefined: Self = StObject.set(x, "virtualClusters", js.undefined)
    
    inline def setVirtualClustersVarargs(value: VirtualCluster*): Self = StObject.set(x, "virtualClusters", js.Array(value*))
  }
}
