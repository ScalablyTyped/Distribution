package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreDBClusterFromS3Result extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.rdsMod.DBCluster] = js.native
}
object RestoreDBClusterFromS3Result {
  
  @scala.inline
  def apply(): RestoreDBClusterFromS3Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBClusterFromS3Result]
  }
  
  @scala.inline
  implicit class RestoreDBClusterFromS3ResultMutableBuilder[Self <: RestoreDBClusterFromS3Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
