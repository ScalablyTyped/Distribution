package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachment extends js.Object {
  /**
    * The content of the attachment file.
    */
  var data: js.UndefOr[Data] = js.native
  /**
    * The name of the attachment file.
    */
  var fileName: js.UndefOr[FileName] = js.native
}

object Attachment {
  @scala.inline
  def apply(data: Data = null, fileName: FileName = null): Attachment = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

