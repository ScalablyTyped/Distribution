package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetCacheParameterGroupMessage extends js.Object {
  /**
    * The name of the cache parameter group to reset.
    */
  var CacheParameterGroupName: String = js.native
  /**
    * An array of parameter names to reset to their default values. If ResetAllParameters is true, do not use ParameterNameValues. If ResetAllParameters is false, you must specify the name of at least one parameter to reset.
    */
  var ParameterNameValues: js.UndefOr[ParameterNameValueList] = js.native
  /**
    * If true, all parameters in the cache parameter group are reset to their default values. If false, only the parameters listed by ParameterNameValues are reset to their default values. Valid values: true | false 
    */
  var ResetAllParameters: js.UndefOr[Boolean] = js.native
}

object ResetCacheParameterGroupMessage {
  @scala.inline
  def apply(
    CacheParameterGroupName: String,
    ParameterNameValues: ParameterNameValueList = null,
    ResetAllParameters: js.UndefOr[scala.Boolean] = js.undefined
  ): ResetCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any])
    if (ParameterNameValues != null) __obj.updateDynamic("ParameterNameValues")(ParameterNameValues.asInstanceOf[js.Any])
    if (!js.isUndefined(ResetAllParameters)) __obj.updateDynamic("ResetAllParameters")(ResetAllParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetCacheParameterGroupMessage]
  }
}

