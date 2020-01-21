package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeAppliedSchemaRequest extends js.Object {
  /**
    * The ARN for the directory to which the upgraded schema will be applied.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Used for testing whether the major version schemas are backward compatible or not. If schema compatibility fails, an exception would be thrown else the call would succeed but no changes will be saved. This parameter is optional.
    */
  var DryRun: js.UndefOr[Bool] = js.native
  /**
    * The revision of the published schema to upgrade the directory to.
    */
  var PublishedSchemaArn: Arn = js.native
}

object UpgradeAppliedSchemaRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, PublishedSchemaArn: Arn, DryRun: js.UndefOr[Boolean] = js.undefined): UpgradeAppliedSchemaRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], PublishedSchemaArn = PublishedSchemaArn.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeAppliedSchemaRequest]
  }
}

