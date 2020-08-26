package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagDescription extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.native
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object TagDescription {
  @scala.inline
  def apply(): TagDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagDescription]
  }
  @scala.inline
  implicit class TagDescriptionOps[Self <: TagDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerName: Self = this.set("LoadBalancerName", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

