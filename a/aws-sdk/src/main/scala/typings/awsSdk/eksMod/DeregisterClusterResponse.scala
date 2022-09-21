package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterClusterResponse extends StObject {
  
  var cluster: js.UndefOr[Cluster] = js.undefined
}
object DeregisterClusterResponse {
  
  inline def apply(): DeregisterClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterClusterResponse]
  }
  
  extension [Self <: DeregisterClusterResponse](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
