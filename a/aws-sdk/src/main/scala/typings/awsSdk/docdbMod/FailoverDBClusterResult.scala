package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverDBClusterResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.docdbMod.DBCluster] = js.undefined
}
object FailoverDBClusterResult {
  
  inline def apply(): FailoverDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverDBClusterResult]
  }
  
  extension [Self <: FailoverDBClusterResult](x: Self) {
    
    inline def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    inline def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
