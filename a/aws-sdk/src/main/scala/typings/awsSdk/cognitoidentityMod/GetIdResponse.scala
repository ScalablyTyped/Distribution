package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdResponse extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityId] = js.native
}

object GetIdResponse {
  @scala.inline
  def apply(): GetIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdResponse]
  }
  @scala.inline
  implicit class GetIdResponseOps[Self <: GetIdResponse] (val x: Self) extends AnyVal {
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
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityId: Self = this.set("IdentityId", js.undefined)
  }
  
}

