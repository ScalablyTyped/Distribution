package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterResult extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.redshiftMod.Cluster] = js.undefined
}
object CreateClusterResult {
  
  @scala.inline
  def apply(): CreateClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterResult]
  }
  
  @scala.inline
  implicit class CreateClusterResultMutableBuilder[Self <: CreateClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
