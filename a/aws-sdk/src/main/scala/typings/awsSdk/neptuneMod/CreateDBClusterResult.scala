package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBClusterResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.neptuneMod.DBCluster] = js.native
}
object CreateDBClusterResult {
  
  @scala.inline
  def apply(): CreateDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBClusterResult]
  }
  
  @scala.inline
  implicit class CreateDBClusterResultMutableBuilder[Self <: CreateDBClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
