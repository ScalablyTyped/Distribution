package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetireGrantRequest extends js.Object {
  /**
    * Unique identifier of the grant to retire. The grant ID is returned in the response to a CreateGrant operation.   Grant ID Example - 0123456789012345678901234567890123456789012345678901234567890123  
    */
  var GrantId: js.UndefOr[GrantIdType] = js.native
  /**
    * Token that identifies the grant to be retired.
    */
  var GrantToken: js.UndefOr[GrantTokenType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the CMK associated with the grant.  For example: arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab 
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
}

object RetireGrantRequest {
  @scala.inline
  def apply(): RetireGrantRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetireGrantRequest]
  }
  @scala.inline
  implicit class RetireGrantRequestOps[Self <: RetireGrantRequest] (val x: Self) extends AnyVal {
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
    def setGrantId(value: GrantIdType): Self = this.set("GrantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantId: Self = this.set("GrantId", js.undefined)
    @scala.inline
    def setGrantToken(value: GrantTokenType): Self = this.set("GrantToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantToken: Self = this.set("GrantToken", js.undefined)
    @scala.inline
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
  }
  
}

