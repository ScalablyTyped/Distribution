package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBClusterFromS3Result extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.rdsMod.DBCluster] = js.undefined
}
object RestoreDBClusterFromS3Result {
  
  inline def apply(): RestoreDBClusterFromS3Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBClusterFromS3Result]
  }
  
  extension [Self <: RestoreDBClusterFromS3Result](x: Self) {
    
    inline def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    inline def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
