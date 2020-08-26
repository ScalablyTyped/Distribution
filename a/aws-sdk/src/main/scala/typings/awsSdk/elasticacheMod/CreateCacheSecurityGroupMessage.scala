package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCacheSecurityGroupMessage extends js.Object {
  /**
    * A name for the cache security group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default". Example: mysecuritygroup 
    */
  var CacheSecurityGroupName: String = js.native
  /**
    * A description for the cache security group.
    */
  var Description: String = js.native
}

object CreateCacheSecurityGroupMessage {
  @scala.inline
  def apply(CacheSecurityGroupName: String, Description: String): CreateCacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCacheSecurityGroupMessage]
  }
  @scala.inline
  implicit class CreateCacheSecurityGroupMessageOps[Self <: CreateCacheSecurityGroupMessage] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
  }
  
}

