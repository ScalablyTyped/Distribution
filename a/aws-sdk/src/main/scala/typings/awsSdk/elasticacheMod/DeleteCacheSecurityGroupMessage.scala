package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCacheSecurityGroupMessage extends js.Object {
  /**
    * The name of the cache security group to delete.  You cannot delete the default security group. 
    */
  var CacheSecurityGroupName: String = js.native
}

object DeleteCacheSecurityGroupMessage {
  @scala.inline
  def apply(CacheSecurityGroupName: String): DeleteCacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheSecurityGroupMessage]
  }
  @scala.inline
  implicit class DeleteCacheSecurityGroupMessageOps[Self <: DeleteCacheSecurityGroupMessage] (val x: Self) extends AnyVal {
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
    def setCacheSecurityGroupName(value: String): Self = this.set("CacheSecurityGroupName", value.asInstanceOf[js.Any])
  }
  
}

