package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSMSAttributesResponse extends js.Object {
  /**
    * The SMS attribute names and their values.
    */
  var attributes: js.UndefOr[MapStringToString] = js.native
}

object GetSMSAttributesResponse {
  @scala.inline
  def apply(): GetSMSAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSMSAttributesResponse]
  }
  @scala.inline
  implicit class GetSMSAttributesResponseOps[Self <: GetSMSAttributesResponse] (val x: Self) extends AnyVal {
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
    def setAttributes(value: MapStringToString): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
  }
  
}

