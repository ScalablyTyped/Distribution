package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySchemaRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory into which the schema is copied. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Published schema Amazon Resource Name (ARN) that needs to be copied. For more information, see arns.
    */
  var PublishedSchemaArn: Arn = js.native
}

object ApplySchemaRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, PublishedSchemaArn: Arn): ApplySchemaRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], PublishedSchemaArn = PublishedSchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySchemaRequest]
  }
  @scala.inline
  implicit class ApplySchemaRequestOps[Self <: ApplySchemaRequest] (val x: Self) extends AnyVal {
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
    def setPublishedSchemaArn(value: Arn): Self = this.set("PublishedSchemaArn", value.asInstanceOf[js.Any])
  }
  
}

