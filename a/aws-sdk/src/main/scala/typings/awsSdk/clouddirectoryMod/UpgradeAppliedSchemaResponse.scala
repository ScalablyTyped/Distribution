package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeAppliedSchemaResponse extends js.Object {
  /**
    * The ARN of the directory that is returned as part of the response.
    */
  var DirectoryArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the upgraded schema that is returned as part of the response.
    */
  var UpgradedSchemaArn: js.UndefOr[Arn] = js.native
}

object UpgradeAppliedSchemaResponse {
  @scala.inline
  def apply(): UpgradeAppliedSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeAppliedSchemaResponse]
  }
  @scala.inline
  implicit class UpgradeAppliedSchemaResponseOps[Self <: UpgradeAppliedSchemaResponse] (val x: Self) extends AnyVal {
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
    def setDirectoryArn(value: Arn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryArn: Self = this.set("DirectoryArn", js.undefined)
    @scala.inline
    def setUpgradedSchemaArn(value: Arn): Self = this.set("UpgradedSchemaArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpgradedSchemaArn: Self = this.set("UpgradedSchemaArn", js.undefined)
  }
  
}

