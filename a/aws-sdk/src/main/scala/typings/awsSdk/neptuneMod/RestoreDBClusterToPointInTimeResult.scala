package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBClusterToPointInTimeResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.neptuneMod.DBCluster] = js.undefined
}
object RestoreDBClusterToPointInTimeResult {
  
  @scala.inline
  def apply(): RestoreDBClusterToPointInTimeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBClusterToPointInTimeResult]
  }
  
  @scala.inline
  implicit class RestoreDBClusterToPointInTimeResultMutableBuilder[Self <: RestoreDBClusterToPointInTimeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
