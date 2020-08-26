package typings.awsSdk.mediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectRequest extends js.Object {
  /**
    * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
    */
  var Path: PathNaming = js.native
}

object DeleteObjectRequest {
  @scala.inline
  def apply(Path: PathNaming): DeleteObjectRequest = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectRequest]
  }
  @scala.inline
  implicit class DeleteObjectRequestOps[Self <: DeleteObjectRequest] (val x: Self) extends AnyVal {
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
    def setPath(value: PathNaming): Self = this.set("Path", value.asInstanceOf[js.Any])
  }
  
}

