package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyVersion extends js.Object {
  /**
    * The date and time the policy was created.
    */
  var createDate: js.UndefOr[DateType] = js.native
  /**
    * Specifies whether the policy version is the default.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  /**
    * The policy version ID.
    */
  var versionId: js.UndefOr[PolicyVersionId] = js.native
}

object PolicyVersion {
  @scala.inline
  def apply(
    createDate: DateType = null,
    isDefaultVersion: js.UndefOr[scala.Boolean] = js.undefined,
    versionId: PolicyVersionId = null
  ): PolicyVersion = {
    val __obj = js.Dynamic.literal()
    if (createDate != null) __obj.updateDynamic("createDate")(createDate.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultVersion)) __obj.updateDynamic("isDefaultVersion")(isDefaultVersion.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyVersion]
  }
}

