package typings
package consoleDashStampLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Pattern extends js.Object {
  /**
       * An object representing a color theme. More info https://www.npmjs.com/package/colors
       */
  var colors: js.UndefOr[Anon_Stamp] = js.undefined
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
  var label: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A custom prefix for the label.
       */
  var labelPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A custom suffix for the label.
       */
  var labelSuffix: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Types can be String, Object (interpreted with util.inspect), or Function. See the test-metadata.js for examples.
       * Note that metadata can still be sent as the third parameter (as in vesion 1.6) as a backward compatibillity feature, but this is deprecated.
       */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /**
       * A string with date format based on Javascript Date Format
       */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
}

