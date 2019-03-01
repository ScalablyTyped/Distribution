package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHyphenFallback[TLength] extends js.Object {
  var bleed: js.UndefOr[
    csstypeLib.PageBleedProperty[TLength] | js.Array[csstypeLib.PageBleedProperty[TLength]]
  ] = js.undefined
  var marks: js.UndefOr[csstypeLib.PageMarksProperty | js.Array[csstypeLib.PageMarksProperty]] = js.undefined
}

object PageHyphenFallback {
  @scala.inline
  def apply[TLength](
    bleed: csstypeLib.PageBleedProperty[TLength] | js.Array[csstypeLib.PageBleedProperty[TLength]] = null,
    marks: csstypeLib.PageMarksProperty | js.Array[csstypeLib.PageMarksProperty] = null
  ): PageHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    if (bleed != null) __obj.updateDynamic("bleed")(bleed.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHyphenFallback[TLength]]
  }
}

