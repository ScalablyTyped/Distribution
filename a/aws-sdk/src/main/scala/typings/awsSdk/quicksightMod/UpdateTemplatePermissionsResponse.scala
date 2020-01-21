package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTemplatePermissionsResponse extends js.Object {
  /**
    * A list of resource permissions to be set on the template.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * The Amazon Resource Name (ARN) of the template.
    */
  var TemplateArn: js.UndefOr[Arn] = js.native
  /**
    * The ID for the template.
    */
  var TemplateId: js.UndefOr[RestrictiveResourceId] = js.native
}

object UpdateTemplatePermissionsResponse {
  @scala.inline
  def apply(
    Permissions: ResourcePermissionList = null,
    RequestId: String = null,
    Status: Int | scala.Double = null,
    TemplateArn: Arn = null,
    TemplateId: RestrictiveResourceId = null
  ): UpdateTemplatePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TemplateArn != null) __obj.updateDynamic("TemplateArn")(TemplateArn.asInstanceOf[js.Any])
    if (TemplateId != null) __obj.updateDynamic("TemplateId")(TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplatePermissionsResponse]
  }
}

