package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTemplateRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the template that you're deleting.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * An ID for the template you want to delete.
    */
  var TemplateId: RestrictiveResourceId = js.native
  /**
    * Specifies the version of the template that you want to delete. If you don't provide a version number, DeleteTemplate deletes all versions of the template. 
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.native
}

object DeleteTemplateRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    TemplateId: RestrictiveResourceId,
    VersionNumber: Int | scala.Double = null
  ): DeleteTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    if (VersionNumber != null) __obj.updateDynamic("VersionNumber")(VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTemplateRequest]
  }
}

