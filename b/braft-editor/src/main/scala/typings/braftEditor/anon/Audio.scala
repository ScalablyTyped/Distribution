package typings.braftEditor.anon

import typings.braftEditor.braftEditorBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audio extends js.Object {
  var audio: js.UndefOr[String | `false`] = js.undefined
  var image: js.UndefOr[String | `false`] = js.undefined
  var video: js.UndefOr[String | `false`] = js.undefined
}

object Audio {
  @scala.inline
  def apply(audio: String | `false` = null, image: String | `false` = null, video: String | `false` = null): Audio = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
}

