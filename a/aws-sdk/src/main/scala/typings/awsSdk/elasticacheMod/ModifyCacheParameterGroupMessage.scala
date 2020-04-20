package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyCacheParameterGroupMessage extends js.Object {
  /**
    * The name of the cache parameter group to modify.
    */
  var CacheParameterGroupName: String = js.native
  /**
    * An array of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional. A maximum of 20 parameters may be modified per request.
    */
  var ParameterNameValues: ParameterNameValueList = js.native
}

object ModifyCacheParameterGroupMessage {
  @scala.inline
  def apply(CacheParameterGroupName: String, ParameterNameValues: ParameterNameValueList): ModifyCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any], ParameterNameValues = ParameterNameValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCacheParameterGroupMessage]
  }
}

