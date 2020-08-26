package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the parameter group to be modified.
    */
  var ParameterGroupName: String = js.native
  /**
    * An array of parameters to be modified. A maximum of 20 parameters can be modified in a single request. For each parameter to be modified, you must supply at least the parameter name and parameter value; other name-value pairs of the parameter are optional. For the workload management (WLM) configuration, you must supply all the name-value pairs in the wlm_json_configuration parameter.
    */
  var Parameters: ParametersList = js.native
}

object ModifyClusterParameterGroupMessage {
  @scala.inline
  def apply(ParameterGroupName: String, Parameters: ParametersList): ModifyClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterParameterGroupMessage]
  }
  @scala.inline
  implicit class ModifyClusterParameterGroupMessageOps[Self <: ModifyClusterParameterGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameterGroupName(value: String): Self = this.set("ParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("Parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: ParametersList): Self = this.set("Parameters", value.asInstanceOf[js.Any])
  }
  
}

