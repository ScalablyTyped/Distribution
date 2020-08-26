package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySchemaResponse extends js.Object {
  /**
    * The applied schema ARN that is associated with the copied schema in the Directory. You can use this ARN to describe the schema information applied on this directory. For more information, see arns.
    */
  var AppliedSchemaArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: js.UndefOr[Arn] = js.native
}

object ApplySchemaResponse {
  @scala.inline
  def apply(): ApplySchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySchemaResponse]
  }
  @scala.inline
  implicit class ApplySchemaResponseOps[Self <: ApplySchemaResponse] (val x: Self) extends AnyVal {
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
    def setAppliedSchemaArn(value: Arn): Self = this.set("AppliedSchemaArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliedSchemaArn: Self = this.set("AppliedSchemaArn", js.undefined)
    @scala.inline
    def setDirectoryArn(value: Arn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryArn: Self = this.set("DirectoryArn", js.undefined)
  }
  
}

