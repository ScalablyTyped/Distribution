package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCacheParameterGroupMessage extends js.Object {
  /**
    * The name of the cache parameter group to delete.  The specified cache security group must not be associated with any clusters. 
    */
  var CacheParameterGroupName: String = js.native
}

object DeleteCacheParameterGroupMessage {
  @scala.inline
  def apply(CacheParameterGroupName: String): DeleteCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheParameterGroupMessage]
  }
  @scala.inline
  implicit class DeleteCacheParameterGroupMessageOps[Self <: DeleteCacheParameterGroupMessage] (val x: Self) extends AnyVal {
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
    def setCacheParameterGroupName(value: String): Self = this.set("CacheParameterGroupName", value.asInstanceOf[js.Any])
  }
  
}

