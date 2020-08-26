package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesForWebACLResponse extends js.Object {
  /**
    * An array of ARNs (Amazon Resource Names) of the resources associated with the specified web ACL. An array with zero elements is returned if there are no resources associated with the web ACL.
    */
  var ResourceArns: js.UndefOr[typings.awsSdk.wafregionalMod.ResourceArns] = js.native
}

object ListResourcesForWebACLResponse {
  @scala.inline
  def apply(): ListResourcesForWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesForWebACLResponse]
  }
  @scala.inline
  implicit class ListResourcesForWebACLResponseOps[Self <: ListResourcesForWebACLResponse] (val x: Self) extends AnyVal {
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
    def setResourceArnsVarargs(value: ResourceArn*): Self = this.set("ResourceArns", js.Array(value :_*))
    @scala.inline
    def setResourceArns(value: ResourceArns): Self = this.set("ResourceArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArns: Self = this.set("ResourceArns", js.undefined)
  }
  
}

