package typings
package csvDashParseLib.csvDashParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If true, the parser will attempt to convert read data types to native types.
    */
  var auto_parse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the parser will attempt to convert read data types to dates. It requires the "auto_parse" option.
    */
  var auto_parse_date: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of fields as an array,
    * a user defined callback accepting the first line and returning the column names or true if autodiscovered in the first CSV line,
    * default to null,
    * affect the result data set in the sense that records will be objects instead of arrays.
    */
  var columns: js.UndefOr[
    js.Array[_] | scala.Boolean | (js.Function1[/* line1 */ js.Array[_], scala.Boolean | js.Array[java.lang.String]])
  ] = js.undefined
  /**
    * Treat all the characters after this one as a comment, default to '' (disabled).
    */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the field delimiter. One character only, defaults to comma.
    */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the escape character, one character only, defaults to double quotes.
    */
  var escape: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Start returning records from a particular line.
    */
  var from: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true, ignore whitespace immediately following the delimiter (i.e. left-trim all fields), defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var ltrim: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum numer of characters to be contained in the field and line buffers before an exception is raised,
    * used to guard against a wrong delimiter or rowDelimiter,
    * default to 128000 characters.
    */
  var max_limit_on_data_read: js.UndefOr[scala.Double] = js.undefined
  /**
    * Name of header-record title to name objects by.
    */
  var objname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional character surrounding a field, one character only, defaults to double quotes.
    */
  var quote: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Preserve quotes inside unquoted field.
    */
  var relax: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Discard inconsistent columns count, default to false.
    */
  var relax_column_count: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * String used to delimit record rows or a special value;
    * special constants are 'auto', 'unix', 'mac', 'windows', 'unicode';
    * defaults to 'auto' (discovered in source or 'unix' if no source is specified).
    */
  var rowDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, ignore whitespace immediately preceding the delimiter (i.e. right-trim all fields), defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var rtrim: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Dont generate empty values for empty lines.
    */
  var skip_empty_lines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Stop returning records after a particular line.
    */
  var to: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true, ignore whitespace immediately around the delimiter, defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var trim: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    auto_parse: js.UndefOr[scala.Boolean] = js.undefined,
    auto_parse_date: js.UndefOr[scala.Boolean] = js.undefined,
    columns: js.Array[_] | scala.Boolean | (js.Function1[/* line1 */ js.Array[_], scala.Boolean | js.Array[java.lang.String]]) = null,
    comment: java.lang.String = null,
    delimiter: java.lang.String = null,
    escape: java.lang.String = null,
    from: scala.Int | scala.Double = null,
    ltrim: js.UndefOr[scala.Boolean] = js.undefined,
    max_limit_on_data_read: scala.Int | scala.Double = null,
    objname: java.lang.String = null,
    quote: java.lang.String = null,
    relax: js.UndefOr[scala.Boolean] = js.undefined,
    relax_column_count: js.UndefOr[scala.Boolean] = js.undefined,
    rowDelimiter: java.lang.String = null,
    rtrim: js.UndefOr[scala.Boolean] = js.undefined,
    skip_empty_lines: js.UndefOr[scala.Boolean] = js.undefined,
    to: scala.Int | scala.Double = null,
    trim: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auto_parse)) __obj.updateDynamic("auto_parse")(auto_parse)
    if (!js.isUndefined(auto_parse_date)) __obj.updateDynamic("auto_parse_date")(auto_parse_date)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(ltrim)) __obj.updateDynamic("ltrim")(ltrim)
    if (max_limit_on_data_read != null) __obj.updateDynamic("max_limit_on_data_read")(max_limit_on_data_read.asInstanceOf[js.Any])
    if (objname != null) __obj.updateDynamic("objname")(objname)
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (!js.isUndefined(relax)) __obj.updateDynamic("relax")(relax)
    if (!js.isUndefined(relax_column_count)) __obj.updateDynamic("relax_column_count")(relax_column_count)
    if (rowDelimiter != null) __obj.updateDynamic("rowDelimiter")(rowDelimiter)
    if (!js.isUndefined(rtrim)) __obj.updateDynamic("rtrim")(rtrim)
    if (!js.isUndefined(skip_empty_lines)) __obj.updateDynamic("skip_empty_lines")(skip_empty_lines)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[Options]
  }
}

