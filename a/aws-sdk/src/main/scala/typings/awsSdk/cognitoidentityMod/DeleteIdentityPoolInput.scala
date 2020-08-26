package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIdentityPoolInput extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsSdk.cognitoidentityMod.IdentityPoolId = js.native
}

object DeleteIdentityPoolInput {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): DeleteIdentityPoolInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentityPoolInput]
  }
  @scala.inline
  implicit class DeleteIdentityPoolInputOps[Self <: DeleteIdentityPoolInput] (val x: Self) extends AnyVal {
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
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
  }
  
}

