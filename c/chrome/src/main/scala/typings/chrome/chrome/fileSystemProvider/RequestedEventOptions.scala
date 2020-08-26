package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestedEventOptions extends js.Object {
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String = js.native
  /** The unique identifier of this request. */
  var requestId: Double = js.native
}

object RequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, requestId: Double): RequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestedEventOptions]
  }
  @scala.inline
  implicit class RequestedEventOptionsOps[Self <: RequestedEventOptions] (val x: Self) extends AnyVal {
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
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: Double): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
  
}

