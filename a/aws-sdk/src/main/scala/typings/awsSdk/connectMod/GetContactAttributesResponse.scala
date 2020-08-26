package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactAttributesResponse extends js.Object {
  /**
    * Information about the attributes.
    */
  var Attributes: js.UndefOr[typings.awsSdk.connectMod.Attributes] = js.native
}

object GetContactAttributesResponse {
  @scala.inline
  def apply(): GetContactAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactAttributesResponse]
  }
  @scala.inline
  implicit class GetContactAttributesResponseOps[Self <: GetContactAttributesResponse] (val x: Self) extends AnyVal {
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
    def setAttributes(value: Attributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
  }
  
}

