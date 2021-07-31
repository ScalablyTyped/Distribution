package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBClusterResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.rdsMod.DBCluster] = js.undefined
}
object ModifyDBClusterResult {
  
  @scala.inline
  def apply(): ModifyDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBClusterResult]
  }
  
  @scala.inline
  implicit class ModifyDBClusterResultMutableBuilder[Self <: ModifyDBClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
