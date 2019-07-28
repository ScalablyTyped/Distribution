package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHyphen[TLength] extends js.Object {
  var bleed: js.UndefOr[PageBleedProperty[TLength]] = js.undefined
  var marks: js.UndefOr[PageMarksProperty] = js.undefined
}

object PageHyphen {
  @scala.inline
  def apply[TLength](bleed: PageBleedProperty[TLength] = null, marks: PageMarksProperty = null): PageHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    if (bleed != null) __obj.updateDynamic("bleed")(bleed.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHyphen[TLength]]
  }
}

