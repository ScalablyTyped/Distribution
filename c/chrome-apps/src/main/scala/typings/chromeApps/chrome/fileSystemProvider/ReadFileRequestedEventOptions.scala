package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadFileRequestedEventOptions extends RequestedEventOptions {
  /** Number of bytes to be returned. */
  var length: double = js.native
  /** Position in the file (in bytes) to start reading from. */
  var offset: double = js.native
  /** A request ID used to open the file. */
  var openRequestId: integer = js.native
}

object ReadFileRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, length: double, offset: double, openRequestId: integer, requestId: integer): ReadFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileRequestedEventOptions]
  }
  @scala.inline
  implicit class ReadFileRequestedEventOptionsOps[Self <: ReadFileRequestedEventOptions] (val x: Self) extends AnyVal {
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
    def setLength(value: double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenRequestId(value: integer): Self = this.set("openRequestId", value.asInstanceOf[js.Any])
  }
  
}

