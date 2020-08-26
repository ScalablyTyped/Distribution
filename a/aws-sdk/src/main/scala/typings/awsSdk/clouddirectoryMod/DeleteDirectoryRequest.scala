package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectoryRequest extends js.Object {
  /**
    * The ARN of the directory to delete.
    */
  var DirectoryArn: Arn = js.native
}

object DeleteDirectoryRequest {
  @scala.inline
  def apply(DirectoryArn: Arn): DeleteDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectoryRequest]
  }
  @scala.inline
  implicit class DeleteDirectoryRequestOps[Self <: DeleteDirectoryRequest] (val x: Self) extends AnyVal {
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
  }
  
}

