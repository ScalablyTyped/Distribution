package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetDBClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the DB cluster parameter group to reset.
    */
  var DBClusterParameterGroupName: String = js.native
  /**
    * A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use this parameter if the ResetAllParameters parameter is set to true.
    */
  var Parameters: js.UndefOr[ParametersList] = js.native
  /**
    * A value that is set to true to reset all parameters in the DB cluster parameter group to their default values, and false otherwise. You can't use this parameter if there is a list of parameter names specified for the Parameters parameter.
    */
  var ResetAllParameters: js.UndefOr[Boolean] = js.native
}

object ResetDBClusterParameterGroupMessage {
  @scala.inline
  def apply(
    DBClusterParameterGroupName: String,
    Parameters: ParametersList = null,
    ResetAllParameters: js.UndefOr[scala.Boolean] = js.undefined
  ): ResetDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (!js.isUndefined(ResetAllParameters)) __obj.updateDynamic("ResetAllParameters")(ResetAllParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetDBClusterParameterGroupMessage]
  }
}

