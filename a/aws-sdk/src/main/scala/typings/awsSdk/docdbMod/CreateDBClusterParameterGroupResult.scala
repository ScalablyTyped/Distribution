package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBClusterParameterGroupResult extends StObject {
  
  var DBClusterParameterGroup: js.UndefOr[typings.awsSdk.docdbMod.DBClusterParameterGroup] = js.native
}
object CreateDBClusterParameterGroupResult {
  
  @scala.inline
  def apply(): CreateDBClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBClusterParameterGroupResult]
  }
  
  @scala.inline
  implicit class CreateDBClusterParameterGroupResultMutableBuilder[Self <: CreateDBClusterParameterGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterParameterGroup(value: DBClusterParameterGroup): Self = StObject.set(x, "DBClusterParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterParameterGroupUndefined: Self = StObject.set(x, "DBClusterParameterGroup", js.undefined)
  }
}
