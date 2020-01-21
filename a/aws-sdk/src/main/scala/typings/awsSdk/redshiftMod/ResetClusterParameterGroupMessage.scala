package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the cluster parameter group to be reset.
    */
  var ParameterGroupName: String = js.native
  /**
    * An array of names of parameters to be reset. If ResetAllParameters option is not used, then at least one parameter name must be supplied.  Constraints: A maximum of 20 parameters can be reset in a single request.
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
  /**
    * If true, all parameters in the specified parameter group will be reset to their default values.  Default: true 
    */
  var ResetAllParameters: js.UndefOr[Boolean] = js.native
}

object ResetClusterParameterGroupMessage {
  @scala.inline
  def apply(
    ParameterGroupName: String,
    Parameters: ParametersList = null,
    ResetAllParameters: js.UndefOr[scala.Boolean] = js.undefined
  ): ResetClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (!js.isUndefined(ResetAllParameters)) __obj.updateDynamic("ResetAllParameters")(ResetAllParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetClusterParameterGroupMessage]
  }
}

