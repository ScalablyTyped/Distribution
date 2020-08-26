package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheParameterGroupNameMessage extends js.Object {
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
}

object CacheParameterGroupNameMessage {
  @scala.inline
  def apply(): CacheParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroupNameMessage]
  }
  @scala.inline
  implicit class CacheParameterGroupNameMessageOps[Self <: CacheParameterGroupNameMessage] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteCacheParameterGroupName: Self = this.set("CacheParameterGroupName", js.undefined)
  }
  
}

