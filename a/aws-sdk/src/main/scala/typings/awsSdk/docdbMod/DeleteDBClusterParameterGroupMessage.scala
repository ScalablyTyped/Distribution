package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBClusterParameterGroupMessage extends StObject {
  
  /**
    * The name of the cluster parameter group. Constraints:   Must be the name of an existing cluster parameter group.   You can't delete a default cluster parameter group.   Cannot be associated with any clusters.  
    */
  var DBClusterParameterGroupName: String
}
object DeleteDBClusterParameterGroupMessage {
  
  @scala.inline
  def apply(DBClusterParameterGroupName: String): DeleteDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBClusterParameterGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteDBClusterParameterGroupMessageMutableBuilder[Self <: DeleteDBClusterParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
  }
}
