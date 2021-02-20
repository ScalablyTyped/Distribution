package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClusterResponse extends StObject {
  
  /**
    * The full description of your new cluster.
    */
  var cluster: js.UndefOr[Cluster] = js.native
}
object CreateClusterResponse {
  
  @scala.inline
  def apply(): CreateClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterResponse]
  }
  
  @scala.inline
  implicit class CreateClusterResponseMutableBuilder[Self <: CreateClusterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
