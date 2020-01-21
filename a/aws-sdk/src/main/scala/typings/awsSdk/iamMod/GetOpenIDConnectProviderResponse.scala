package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpenIDConnectProviderResponse extends js.Object {
  /**
    * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider resource object. For more information, see CreateOpenIDConnectProvider.
    */
  var ClientIDList: js.UndefOr[clientIDListType] = js.native
  /**
    * The date and time when the IAM OIDC provider resource object was created in the AWS account.
    */
  var CreateDate: js.UndefOr[dateType] = js.native
  /**
    * A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource object. For more information, see CreateOpenIDConnectProvider. 
    */
  var ThumbprintList: js.UndefOr[thumbprintListType] = js.native
  /**
    * The URL that the IAM OIDC provider resource object is associated with. For more information, see CreateOpenIDConnectProvider.
    */
  var Url: js.UndefOr[OpenIDConnectProviderUrlType] = js.native
}

object GetOpenIDConnectProviderResponse {
  @scala.inline
  def apply(
    ClientIDList: clientIDListType = null,
    CreateDate: dateType = null,
    ThumbprintList: thumbprintListType = null,
    Url: OpenIDConnectProviderUrlType = null
  ): GetOpenIDConnectProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (ClientIDList != null) __obj.updateDynamic("ClientIDList")(ClientIDList.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (ThumbprintList != null) __obj.updateDynamic("ThumbprintList")(ThumbprintList.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenIDConnectProviderResponse]
  }
}

