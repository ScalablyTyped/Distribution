package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeCacheSecurityGroupIngressResult extends js.Object {
  var CacheSecurityGroup: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSecurityGroup] = js.native
}

object RevokeCacheSecurityGroupIngressResult {
  @scala.inline
  def apply(CacheSecurityGroup: CacheSecurityGroup = null): RevokeCacheSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    if (CacheSecurityGroup != null) __obj.updateDynamic("CacheSecurityGroup")(CacheSecurityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeCacheSecurityGroupIngressResult]
  }
}

