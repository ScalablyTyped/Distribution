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
  def apply(GrantId: GrantIdType = null, GrantToken: GrantTokenType = null, KeyId: KeyIdType = null): RetireGrantRequest = {
    val __obj = js.Dynamic.literal()
    if (GrantId != null) __obj.updateDynamic("GrantId")(GrantId.asInstanceOf[js.Any])
    if (GrantToken != null) __obj.updateDynamic("GrantToken")(GrantToken.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetireGrantRequest]
  }
}

