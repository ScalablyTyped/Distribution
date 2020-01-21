package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCacheParameterGroupResult extends js.Object {
  var CacheParameterGroup: js.UndefOr[typings.awsSdk.elasticacheMod.CacheParameterGroup] = js.native
}

object CreateCacheParameterGroupResult {
  @scala.inline
  def apply(CacheParameterGroup: CacheParameterGroup = null): CreateCacheParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    if (CacheParameterGroup != null) __obj.updateDynamic("CacheParameterGroup")(CacheParameterGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCacheParameterGroupResult]
  }
}

