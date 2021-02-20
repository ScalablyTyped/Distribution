package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClusterDbRevisionResult extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.redshiftMod.Cluster] = js.native
}
object ModifyClusterDbRevisionResult {
  
  @scala.inline
  def apply(): ModifyClusterDbRevisionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterDbRevisionResult]
  }
  
  @scala.inline
  implicit class ModifyClusterDbRevisionResultMutableBuilder[Self <: ModifyClusterDbRevisionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
