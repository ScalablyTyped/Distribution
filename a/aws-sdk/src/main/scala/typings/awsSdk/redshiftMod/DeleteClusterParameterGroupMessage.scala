package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the parameter group to be deleted. Constraints:   Must be the name of an existing cluster parameter group.   Cannot delete a default cluster parameter group.  
    */
  var ParameterGroupName: String = js.native
}

object DeleteClusterParameterGroupMessage {
  @scala.inline
  def apply(ParameterGroupName: String): DeleteClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteClusterParameterGroupMessage]
  }
}

