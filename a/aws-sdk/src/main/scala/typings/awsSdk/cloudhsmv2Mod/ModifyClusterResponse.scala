package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClusterResponse extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Cluster] = js.native
}
object ModifyClusterResponse {
  
  @scala.inline
  def apply(): ModifyClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterResponse]
  }
  
  @scala.inline
  implicit class ModifyClusterResponseMutableBuilder[Self <: ModifyClusterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
