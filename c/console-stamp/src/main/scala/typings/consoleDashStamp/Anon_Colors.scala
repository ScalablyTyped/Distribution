package typings.consoleDashStamp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  /**
    * An object representing a color theme. More info https://www.npmjs.com/package/colors
    */
  var colors: js.UndefOr[Anon_Label] = js.undefined
  /**
    * An array containing the methods to exclude in the patch)
    */
  var exclude: js.UndefOr[js.Any] = js.undefined
  /**
    * An array containing the methods to include in the patch
    */
  var include: js.UndefOr[js.Any] = js.undefined
  /**
    * If true it will show the label (LOG | INFO | WARN | ERROR)
    */
  var label: js.UndefOr[Boolean] = js.undefined
  /**
    * A custom prefix for the label.
    */
  var labelPrefix: js.UndefOr[String] = js.undefined
  /**
    * A custom suffix for the label.
    */
  var labelSuffix: js.UndefOr[String] = js.undefined
  /**
    * Types can be String, Object (interpreted with util.inspect), or Function. See the test-metadata.js for examples.
    * Note that metadata can still be sent as the third parameter (as in vesion 1.6) as a backward compatibillity feature, but this is deprecated.
    */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /**
    * A string with date format based on Javascript Date Format
    */
  var pattern: js.UndefOr[String] = js.undefined
}

object Anon_Colors {
  @scala.inline
  def apply(
    colors: Anon_Label = null,
    exclude: js.Any = null,
    include: js.Any = null,
    label: js.UndefOr[Boolean] = js.undefined,
    labelPrefix: String = null,
    labelSuffix: String = null,
    metadata: js.Any = null,
    pattern: String = null
  ): Anon_Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPrefix != null) __obj.updateDynamic("labelPrefix")(labelPrefix.asInstanceOf[js.Any])
    if (labelSuffix != null) __obj.updateDynamic("labelSuffix")(labelSuffix.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Colors]
  }
}

