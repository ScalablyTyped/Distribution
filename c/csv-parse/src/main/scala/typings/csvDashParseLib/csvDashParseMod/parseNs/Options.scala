package typings
package csvDashParseLib.csvDashParseMod.parseNs

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

