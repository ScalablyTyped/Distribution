package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityDkimAttributesResponse extends js.Object {
  /**
    * The DKIM attributes for an email address or a domain.
    */
  var DkimAttributes: typings.awsSdk.sesMod.DkimAttributes = js.native
}

object GetIdentityDkimAttributesResponse {
  @scala.inline
  def apply(DkimAttributes: DkimAttributes): GetIdentityDkimAttributesResponse = {
    val __obj = js.Dynamic.literal(DkimAttributes = DkimAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityDkimAttributesResponse]
  }
}

