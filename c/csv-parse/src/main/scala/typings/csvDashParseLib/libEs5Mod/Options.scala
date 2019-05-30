package typings
package csvDashParseLib.libEs5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If true, the parser will attempt to convert read data types to native types.
    * @deprecated Use {@link cast}
    */
  var auto_parse: js.UndefOr[scala.Boolean | CastingFunction] = js.undefined
  /**
    * If true, the parser will attempt to convert read data types to dates. It requires the "auto_parse" option.
    * @deprecated Use {@link cast_date}
    */
  var auto_parse_date: js.UndefOr[scala.Boolean | CastingDateFunction] = js.undefined
  /**
    * If true, detect and exclude the byte order mark (BOM) from the CSV input if present.
    */
  var bom: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the parser will attempt to convert input string to native types.
    * If a function, receive the value as first argument, a context as second argument and return a new value. More information about the context properties is available below.
    */
  var cast: js.UndefOr[scala.Boolean | CastingFunction] = js.undefined
  /**
    * If true, the parser will attempt to convert input string to dates.
    * If a function, receive the value as argument and return a new value. It requires the "auto_parse" option. Be careful, it relies on Date.parse.
    */
  var cast_date: js.UndefOr[scala.Boolean | CastingDateFunction] = js.undefined
  /**
    * List of fields as an array,
    * a user defined callback accepting the first line and returning the column names or true if autodiscovered in the first CSV line,
    * default to null,
    * affect the result data set in the sense that records will be objects instead of arrays.
    */
  var columns: js.UndefOr[
    js.Array[ColumnOption] | scala.Boolean | (js.Function1[/* record */ js.Any, js.Array[ColumnOption]])
  ] = js.undefined
  /**
    * Treat all the characters after this one as a comment, default to '' (disabled).
    */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the field delimiter. One character only, defaults to comma.
    */
  var delimiter: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /**
    * Set the escape character, one character only, defaults to double quotes.
    */
  var escape: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /**
    * Start handling records from the requested number of records.
    */
  var from: js.UndefOr[scala.Double] = js.undefined
  /**
    * Start handling records from the requested line number.
    */
  var from_line: js.UndefOr[scala.Double] = js.undefined
  /**
    * Generate two properties `info` and `record` where `info` is a snapshot of the info object at the time the record was created and `record` is the parsed array or object.
    */
  var info: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, ignore whitespace immediately following the delimiter (i.e. left-trim all fields), defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var ltrim: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum numer of characters to be contained in the field and line buffers before an exception is raised,
    * used to guard against a wrong delimiter or record_delimiter,
    * default to 128000 characters.
    */
  var max_record_size: js.UndefOr[scala.Double] = js.undefined
  /**
    * Name of header-record title to name objects by.
    */
  var objname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional character surrounding a field, one character only, defaults to double quotes.
    */
  var quote: js.UndefOr[java.lang.String | scala.Boolean | nodeLib.Buffer] = js.undefined
  /**
    * Generate two properties raw and row where raw is the original CSV row content and row is the parsed array or object.
    */
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * One or multiple characters used to delimit record rows; defaults to auto discovery if not provided.
    * Supported auto discovery method are Linux ("\n"), Apple ("\r") and Windows ("\r\n") row delimiters.
    */
  var record_delimiter: js.UndefOr[
    java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer
  ] = js.undefined
  /**
    * Preserve quotes inside unquoted field.
    */
  var relax: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Discard inconsistent columns count, default to false.
    */
  var relax_column_count: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, ignore whitespace immediately preceding the delimiter (i.e. right-trim all fields), defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var rtrim: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Dont generate empty values for empty lines.
    * Defaults to false
    */
  var skip_empty_lines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Don't generate records for lines containing empty column values (column matching /\s*\/), defaults to false.
    */
  var skip_lines_with_empty_values: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Skip a line with error found inside and directly go process the next line.
    */
  var skip_lines_with_error: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Stop handling records after the requested number of records.
    */
  var to: js.UndefOr[scala.Double] = js.undefined
  /**
    * Stop handling records after the requested line number.
    */
  var to_line: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true, ignore whitespace immediately around the delimiter, defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var trim: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    auto_parse: scala.Boolean | CastingFunction = null,
    auto_parse_date: scala.Boolean | CastingDateFunction = null,
    bom: js.UndefOr[scala.Boolean] = js.undefined,
    cast: scala.Boolean | CastingFunction = null,
    cast_date: scala.Boolean | CastingDateFunction = null,
    columns: js.Array[ColumnOption] | scala.Boolean | (js.Function1[/* record */ js.Any, js.Array[ColumnOption]]) = null,
    comment: java.lang.String = null,
    delimiter: java.lang.String | nodeLib.Buffer = null,
    escape: java.lang.String | nodeLib.Buffer = null,
    from: scala.Int | scala.Double = null,
    from_line: scala.Int | scala.Double = null,
    info: js.UndefOr[scala.Boolean] = js.undefined,
    ltrim: js.UndefOr[scala.Boolean] = js.undefined,
    max_record_size: scala.Int | scala.Double = null,
    objname: java.lang.String = null,
    quote: java.lang.String | scala.Boolean | nodeLib.Buffer = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    record_delimiter: java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer = null,
    relax: js.UndefOr[scala.Boolean] = js.undefined,
    relax_column_count: js.UndefOr[scala.Boolean] = js.undefined,
    rtrim: js.UndefOr[scala.Boolean] = js.undefined,
    skip_empty_lines: js.UndefOr[scala.Boolean] = js.undefined,
    skip_lines_with_empty_values: js.UndefOr[scala.Boolean] = js.undefined,
    skip_lines_with_error: js.UndefOr[scala.Boolean] = js.undefined,
    to: scala.Int | scala.Double = null,
    to_line: scala.Int | scala.Double = null,
    trim: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (auto_parse != null) __obj.updateDynamic("auto_parse")(auto_parse.asInstanceOf[js.Any])
    if (auto_parse_date != null) __obj.updateDynamic("auto_parse_date")(auto_parse_date.asInstanceOf[js.Any])
    if (!js.isUndefined(bom)) __obj.updateDynamic("bom")(bom)
    if (cast != null) __obj.updateDynamic("cast")(cast.asInstanceOf[js.Any])
    if (cast_date != null) __obj.updateDynamic("cast_date")(cast_date.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (from_line != null) __obj.updateDynamic("from_line")(from_line.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info)
    if (!js.isUndefined(ltrim)) __obj.updateDynamic("ltrim")(ltrim)
    if (max_record_size != null) __obj.updateDynamic("max_record_size")(max_record_size.asInstanceOf[js.Any])
    if (objname != null) __obj.updateDynamic("objname")(objname)
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (record_delimiter != null) __obj.updateDynamic("record_delimiter")(record_delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(relax)) __obj.updateDynamic("relax")(relax)
    if (!js.isUndefined(relax_column_count)) __obj.updateDynamic("relax_column_count")(relax_column_count)
    if (!js.isUndefined(rtrim)) __obj.updateDynamic("rtrim")(rtrim)
    if (!js.isUndefined(skip_empty_lines)) __obj.updateDynamic("skip_empty_lines")(skip_empty_lines)
    if (!js.isUndefined(skip_lines_with_empty_values)) __obj.updateDynamic("skip_lines_with_empty_values")(skip_lines_with_empty_values)
    if (!js.isUndefined(skip_lines_with_error)) __obj.updateDynamic("skip_lines_with_error")(skip_lines_with_error)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (to_line != null) __obj.updateDynamic("to_line")(to_line.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[Options]
  }
}

