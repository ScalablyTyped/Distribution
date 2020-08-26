package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryRequest extends js.Object {
  /**
    * The name of the Directory. Should be unique per account, per region.
    */
  var Name: DirectoryName = js.native
  /**
    * The Amazon Resource Name (ARN) of the published schema that will be copied into the data Directory. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object CreateDirectoryRequest {
  @scala.inline
  def apply(Name: DirectoryName, SchemaArn: Arn): CreateDirectoryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryRequest]
  }
  @scala.inline
  implicit class CreateDirectoryRequestOps[Self <: CreateDirectoryRequest] (val x: Self) extends AnyVal {
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
    def setName(value: DirectoryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaArn(value: Arn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
  }
  
}

