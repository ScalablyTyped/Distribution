package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDBClusterResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.docdbMod.DBCluster] = js.undefined
}
object StartDBClusterResult {
  
  @scala.inline
  def apply(): StartDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDBClusterResult]
  }
  
  @scala.inline
  implicit class StartDBClusterResultMutableBuilder[Self <: StartDBClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
