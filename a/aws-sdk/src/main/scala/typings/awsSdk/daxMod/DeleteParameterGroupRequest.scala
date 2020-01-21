package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteParameterGroupRequest extends js.Object {
  /**
    * The name of the parameter group to delete.
    */
  var ParameterGroupName: String = js.native
}

object DeleteParameterGroupRequest {
  @scala.inline
  def apply(ParameterGroupName: String): DeleteParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteParameterGroupRequest]
  }
}

