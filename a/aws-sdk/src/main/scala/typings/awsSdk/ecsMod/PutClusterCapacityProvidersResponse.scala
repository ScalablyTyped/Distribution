package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutClusterCapacityProvidersResponse extends StObject {
  
  var cluster: js.UndefOr[Cluster] = js.undefined
}
object PutClusterCapacityProvidersResponse {
  
  @scala.inline
  def apply(): PutClusterCapacityProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutClusterCapacityProvidersResponse]
  }
  
  @scala.inline
  implicit class PutClusterCapacityProvidersResponseMutableBuilder[Self <: PutClusterCapacityProvidersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
