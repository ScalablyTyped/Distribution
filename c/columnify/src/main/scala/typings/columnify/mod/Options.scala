package typings.columnify.mod

import typings.columnify.columnifyStrings.center
import typings.columnify.columnifyStrings.centre
import typings.columnify.columnifyStrings.left
import typings.columnify.columnifyStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var align: js.UndefOr[left | center | centre | right] = js.native
  var dataTransform: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
  var headingTransform: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var paddingChr: js.UndefOr[String] = js.native
  var preserveNewLines: js.UndefOr[Boolean] = js.native
  var showHeaders: js.UndefOr[Boolean] = js.native
  var truncateMarker: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAlign(value: left | center | centre | right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setDataTransform(value: /* data */ String => String): Self = this.set("dataTransform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataTransform: Self = this.set("dataTransform", js.undefined)
    @scala.inline
    def setHeadingTransform(value: /* data */ String => String): Self = this.set("headingTransform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeadingTransform: Self = this.set("headingTransform", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setPaddingChr(value: String): Self = this.set("paddingChr", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingChr: Self = this.set("paddingChr", js.undefined)
    @scala.inline
    def setPreserveNewLines(value: Boolean): Self = this.set("preserveNewLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveNewLines: Self = this.set("preserveNewLines", js.undefined)
    @scala.inline
    def setShowHeaders(value: Boolean): Self = this.set("showHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeaders: Self = this.set("showHeaders", js.undefined)
    @scala.inline
    def setTruncateMarker(value: String): Self = this.set("truncateMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncateMarker: Self = this.set("truncateMarker", js.undefined)
  }
  
}

