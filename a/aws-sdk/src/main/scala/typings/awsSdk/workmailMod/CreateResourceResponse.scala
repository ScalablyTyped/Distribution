package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceResponse extends js.Object {
  /**
    * The identifier of the new resource.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.workmailMod.ResourceId] = js.native
}

object CreateResourceResponse {
  @scala.inline
  def apply(): CreateResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResourceResponse]
  }
  @scala.inline
  implicit class CreateResourceResponseOps[Self <: CreateResourceResponse] (val x: Self) extends AnyVal {
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
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
  }
  
}

