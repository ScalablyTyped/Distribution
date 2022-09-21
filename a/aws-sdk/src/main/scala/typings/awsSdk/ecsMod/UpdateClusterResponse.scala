package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterResponse extends StObject {
  
  /**
    * Details about the cluster.
    */
  var cluster: js.UndefOr[Cluster] = js.undefined
}
object UpdateClusterResponse {
  
  inline def apply(): UpdateClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterResponse]
  }
  
  extension [Self <: UpdateClusterResponse](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
