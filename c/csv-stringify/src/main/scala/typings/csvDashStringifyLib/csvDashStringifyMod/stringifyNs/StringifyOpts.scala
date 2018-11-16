package typings
package csvDashStringifyLib.csvDashStringifyMod.stringifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StringifyOpts extends js.Object {
  /**
           * List of fields, applied when transform returns an object.
           * Order matters, read the transformer documentation for additionnal information,
           * columns are auto discovered when the user write object, see the "header" option on how to print columns names on the first line.
           */
  var columns: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[java.lang.String] | js.Array[java.lang.String]
  ] = js.undefined
  /**
           * Set the field delimiter, one character only, defaults to a comma.
           */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Add the value of "options.rowDelimiter" on the last line, default to true.
           */
  var eof: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defaults to the escape read option.
           */
  var escape: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Override serialization of boolean, dates and complex objects.
           */
  var formatters: js.UndefOr[FormatterOpts] = js.undefined
  /**
           * Display the column names on the first line if the columns option is provided or discovered.
           */
  var header: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * String used to delimit record rows or a special value;
           * special values are 'auto', 'unix', 'mac', 'windows', 'unicode'; defaults to 'auto' (discovered in source or 'unix' if no source is specified).
           */
  var lineBreaks: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Defaults to the quote read option.
           */
  var quote: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Boolean, default to false, quote all the non-empty fields even if not required.
           */
  var quoted: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Boolean, no default, quote empty fields? If specified, overrides quotedString for empty strings.
           */
  var quotedEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Boolean, default to false, quote all fields of type string even if not required.
           */
  var quotedString: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * String used to delimit record rows or a special value;
           * special values are 'auto', 'unix', 'mac', 'windows', 'unicode'; defaults to 'auto' (discovered in source or 'unix' if no source is specified).
           */
  var rowDelimiter: js.UndefOr[java.lang.String] = js.undefined
}

