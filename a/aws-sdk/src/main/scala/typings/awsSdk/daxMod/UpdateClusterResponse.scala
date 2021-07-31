package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterResponse extends StObject {
  
  /**
    * A description of the DAX cluster, after it has been modified.
    */
  var Cluster: js.UndefOr[typings.awsSdk.daxMod.Cluster] = js.undefined
}
object UpdateClusterResponse {
  
  @scala.inline
  def apply(): UpdateClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterResponse]
  }
  
  @scala.inline
  implicit class UpdateClusterResponseMutableBuilder[Self <: UpdateClusterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
