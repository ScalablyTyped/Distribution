package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHyphen[TLength] extends js.Object {
  var bleed: js.UndefOr[csstypeLib.PageBleedProperty[TLength]] = js.undefined
  var marks: js.UndefOr[csstypeLib.PageMarksProperty] = js.undefined
}

object PageHyphen {
  @scala.inline
  def apply[TLength](bleed: csstypeLib.PageBleedProperty[TLength] = null, marks: csstypeLib.PageMarksProperty = null): PageHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    if (bleed != null) __obj.updateDynamic("bleed")(bleed.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHyphen[TLength]]
  }
}

