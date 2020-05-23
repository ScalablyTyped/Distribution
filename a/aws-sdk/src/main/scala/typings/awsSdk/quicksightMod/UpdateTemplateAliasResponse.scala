package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTemplateAliasResponse extends js.Object {
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * The template alias.
    */
  var TemplateAlias: js.UndefOr[typings.awsSdk.quicksightMod.TemplateAlias] = js.native
}

object UpdateTemplateAliasResponse {
  @scala.inline
  def apply(
    RequestId: String = null,
    Status: js.UndefOr[StatusCode] = js.undefined,
    TemplateAlias: TemplateAlias = null
  ): UpdateTemplateAliasResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status.get.asInstanceOf[js.Any])
    if (TemplateAlias != null) __obj.updateDynamic("TemplateAlias")(TemplateAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateAliasResponse]
  }
}

