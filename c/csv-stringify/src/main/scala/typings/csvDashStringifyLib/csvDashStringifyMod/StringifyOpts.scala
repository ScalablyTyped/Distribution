package typings
package csvDashStringifyLib.csvDashStringifyMod

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
    org.scalablytyped.runtime.StringDictionary[java.lang.String] | js.Array[java.lang.String]
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

object StringifyOpts {
  @scala.inline
  def apply(
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String] | js.Array[java.lang.String] = null,
    delimiter: java.lang.String = null,
    eof: js.UndefOr[scala.Boolean] = js.undefined,
    escape: js.UndefOr[scala.Boolean] = js.undefined,
    formatters: FormatterOpts = null,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    lineBreaks: java.lang.String = null,
    quote: java.lang.String = null,
    quoted: js.UndefOr[scala.Boolean] = js.undefined,
    quotedEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    quotedString: js.UndefOr[scala.Boolean] = js.undefined,
    rowDelimiter: java.lang.String = null
  ): StringifyOpts = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(eof)) __obj.updateDynamic("eof")(eof)
    if (!js.isUndefined(escape)) __obj.updateDynamic("escape")(escape)
    if (formatters != null) __obj.updateDynamic("formatters")(formatters)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (lineBreaks != null) __obj.updateDynamic("lineBreaks")(lineBreaks)
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (!js.isUndefined(quoted)) __obj.updateDynamic("quoted")(quoted)
    if (!js.isUndefined(quotedEmpty)) __obj.updateDynamic("quotedEmpty")(quotedEmpty)
    if (!js.isUndefined(quotedString)) __obj.updateDynamic("quotedString")(quotedString)
    if (rowDelimiter != null) __obj.updateDynamic("rowDelimiter")(rowDelimiter)
    __obj.asInstanceOf[StringifyOpts]
  }
}

