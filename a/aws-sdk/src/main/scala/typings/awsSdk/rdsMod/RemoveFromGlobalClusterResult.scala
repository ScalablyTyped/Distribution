package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFromGlobalClusterResult extends StObject {
  
  var GlobalCluster: js.UndefOr[typings.awsSdk.rdsMod.GlobalCluster] = js.undefined
}
object RemoveFromGlobalClusterResult {
  
  @scala.inline
  def apply(): RemoveFromGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFromGlobalClusterResult]
  }
  
  @scala.inline
  implicit class RemoveFromGlobalClusterResultMutableBuilder[Self <: RemoveFromGlobalClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalCluster(value: GlobalCluster): Self = StObject.set(x, "GlobalCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalClusterUndefined: Self = StObject.set(x, "GlobalCluster", js.undefined)
  }
}
