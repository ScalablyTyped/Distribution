package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteFileRequestedEventOptions extends RequestedEventOptions {
  /** Buffer of bytes to be operated on the file. */
  var data: ArrayBuffer = js.native
  /** Position in the file (in bytes) to start operating from. */
  var offset: integer = js.native
  /** A request ID used to open the file. */
  var openRequestId: integer = js.native
}

object WriteFileRequestedEventOptions {
  @scala.inline
  def apply(
    data: ArrayBuffer,
    fileSystemId: String,
    offset: integer,
    openRequestId: integer,
    requestId: integer
  ): WriteFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFileRequestedEventOptions]
  }
  @scala.inline
  implicit class WriteFileRequestedEventOptionsOps[Self <: WriteFileRequestedEventOptions] (val x: Self) extends AnyVal {
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
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: integer): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenRequestId(value: integer): Self = this.set("openRequestId", value.asInstanceOf[js.Any])
  }
  
}

