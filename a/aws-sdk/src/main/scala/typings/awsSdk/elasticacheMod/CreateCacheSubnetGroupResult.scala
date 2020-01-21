package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCacheSubnetGroupResult extends js.Object {
  var CacheSubnetGroup: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSubnetGroup] = js.native
}

object CreateCacheSubnetGroupResult {
  @scala.inline
  def apply(CacheSubnetGroup: CacheSubnetGroup = null): CreateCacheSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    if (CacheSubnetGroup != null) __obj.updateDynamic("CacheSubnetGroup")(CacheSubnetGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCacheSubnetGroupResult]
  }
}

