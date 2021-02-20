package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGlobalClusterResult extends StObject {
  
  var GlobalCluster: js.UndefOr[typings.awsSdk.rdsMod.GlobalCluster] = js.native
}
object DeleteGlobalClusterResult {
  
  @scala.inline
  def apply(): DeleteGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGlobalClusterResult]
  }
  
  @scala.inline
  implicit class DeleteGlobalClusterResultMutableBuilder[Self <: DeleteGlobalClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalCluster(value: GlobalCluster): Self = StObject.set(x, "GlobalCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalClusterUndefined: Self = StObject.set(x, "GlobalCluster", js.undefined)
  }
}
