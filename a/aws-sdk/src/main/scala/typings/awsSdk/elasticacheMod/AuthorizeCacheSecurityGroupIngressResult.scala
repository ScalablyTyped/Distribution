package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeCacheSecurityGroupIngressResult extends js.Object {
  var CacheSecurityGroup: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSecurityGroup] = js.native
}

object AuthorizeCacheSecurityGroupIngressResult {
  @scala.inline
  def apply(): AuthorizeCacheSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeCacheSecurityGroupIngressResult]
  }
  @scala.inline
  implicit class AuthorizeCacheSecurityGroupIngressResultOps[Self <: AuthorizeCacheSecurityGroupIngressResult] (val x: Self) extends AnyVal {
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
    def setCacheSecurityGroup(value: CacheSecurityGroup): Self = this.set("CacheSecurityGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheSecurityGroup: Self = this.set("CacheSecurityGroup", js.undefined)
  }
  
}

