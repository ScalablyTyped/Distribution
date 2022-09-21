package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterClusterResponse extends StObject {
  
  var cluster: js.UndefOr[Cluster] = js.undefined
}
object RegisterClusterResponse {
  
  inline def apply(): RegisterClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterClusterResponse]
  }
  
  extension [Self <: RegisterClusterResponse](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
