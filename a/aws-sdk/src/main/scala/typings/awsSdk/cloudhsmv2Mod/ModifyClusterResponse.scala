package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterResponse extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Cluster] = js.undefined
}
object ModifyClusterResponse {
  
  inline def apply(): ModifyClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterResponse]
  }
  
  extension [Self <: ModifyClusterResponse](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
