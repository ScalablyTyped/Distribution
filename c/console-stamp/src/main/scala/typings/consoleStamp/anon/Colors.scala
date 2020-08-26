package typings.consoleStamp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colors extends js.Object {
  /**
    * An object representing a color theme. More info https://www.npmjs.com/package/colors
    */
  var colors: js.UndefOr[Label] = js.native
  /**
    * An array containing the methods to exclude in the patch)
    */
  var exclude: js.UndefOr[js.Any] = js.native
  /**
    * An array containing the methods to include in the patch
    */
  var include: js.UndefOr[js.Any] = js.native
  /**
    * If true it will show the label (LOG | INFO | WARN | ERROR)
    */
  var label: js.UndefOr[Boolean] = js.native
  /**
    * A custom prefix for the label.
    */
  var labelPrefix: js.UndefOr[String] = js.native
  /**
    * A custom suffix for the label.
    */
  var labelSuffix: js.UndefOr[String] = js.native
  /**
    * Types can be String, Object (interpreted with util.inspect), or Function. See the test-metadata.js for examples.
    * Note that metadata can still be sent as the third parameter (as in vesion 1.6) as a backward compatibillity feature, but this is deprecated.
    */
  var metadata: js.UndefOr[js.Any] = js.native
  /**
    * A string with date format based on Javascript Date Format
    */
  var pattern: js.UndefOr[String] = js.native
}

object Colors {
  @scala.inline
  def apply(): Colors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colors]
  }
  @scala.inline
  implicit class ColorsOps[Self <: Colors] (val x: Self) extends AnyVal {
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
    def setColors(value: Label): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setExclude(value: js.Any): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setInclude(value: js.Any): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setLabel(value: Boolean): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelPrefix(value: String): Self = this.set("labelPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPrefix: Self = this.set("labelPrefix", js.undefined)
    @scala.inline
    def setLabelSuffix(value: String): Self = this.set("labelSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelSuffix: Self = this.set("labelSuffix", js.undefined)
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
  
}

