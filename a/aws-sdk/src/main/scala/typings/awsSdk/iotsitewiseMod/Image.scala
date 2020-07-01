package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  var file: js.UndefOr[ImageFile] = js.native
  /**
    * The ID of an existing image. Specify this parameter to keep an existing image.
    */
  var id: js.UndefOr[ID] = js.native
}

object Image {
  @scala.inline
  def apply(file: ImageFile = null, id: ID = null): Image = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

