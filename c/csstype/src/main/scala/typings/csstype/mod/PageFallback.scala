package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageFallback[TLength] extends js.Object {
  var bleed: js.UndefOr[PageBleedProperty[TLength] | js.Array[PageBleedProperty[TLength]]] = js.undefined
  var marks: js.UndefOr[PageMarksProperty | js.Array[PageMarksProperty]] = js.undefined
}

object PageFallback {
  @scala.inline
  def apply[TLength](
    bleed: PageBleedProperty[TLength] | js.Array[PageBleedProperty[TLength]] = null,
    marks: PageMarksProperty | js.Array[PageMarksProperty] = null
  ): PageFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    if (bleed != null) __obj.updateDynamic("bleed")(bleed.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageFallback[TLength]]
  }
}

