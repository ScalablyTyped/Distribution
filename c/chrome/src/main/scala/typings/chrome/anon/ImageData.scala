package typings.chrome.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageData extends js.Object {
  var imageData: js.UndefOr[typings.std.ImageData | StringDictionary[typings.std.ImageData]] = js.undefined
}

object ImageData {
  @scala.inline
  def apply(imageData: typings.std.ImageData | StringDictionary[typings.std.ImageData] = null): ImageData = {
    val __obj = js.Dynamic.literal()
    if (imageData != null) __obj.updateDynamic("imageData")(imageData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
}

