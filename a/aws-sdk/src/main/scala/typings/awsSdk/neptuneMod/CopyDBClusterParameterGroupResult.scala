package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyDBClusterParameterGroupResult extends StObject {
  
  var DBClusterParameterGroup: js.UndefOr[typings.awsSdk.neptuneMod.DBClusterParameterGroup] = js.native
}
object CopyDBClusterParameterGroupResult {
  
  @scala.inline
  def apply(): CopyDBClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDBClusterParameterGroupResult]
  }
  
  @scala.inline
  implicit class CopyDBClusterParameterGroupResultMutableBuilder[Self <: CopyDBClusterParameterGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterParameterGroup(value: DBClusterParameterGroup): Self = StObject.set(x, "DBClusterParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterParameterGroupUndefined: Self = StObject.set(x, "DBClusterParameterGroup", js.undefined)
  }
}
