package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  /**
    * The ID of a file associated with a stream.
    */
  var fileId: js.UndefOr[FileId] = js.native
  /**
    * The stream ID.
    */
  var streamId: js.UndefOr[StreamId] = js.native
}

object Stream {
  @scala.inline
  def apply(fileId: Int | Double = null, streamId: StreamId = null): Stream = {
    val __obj = js.Dynamic.literal()
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
}

