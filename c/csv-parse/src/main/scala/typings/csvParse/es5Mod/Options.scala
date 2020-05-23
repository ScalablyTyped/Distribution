package typings.csvParse.es5Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If true, the parser will attempt to convert read data types to native types.
    * @deprecated Use {@link cast}
    */
  var auto_parse: js.UndefOr[Boolean | CastingFunction] = js.undefined
  /**
    * If true, the parser will attempt to convert read data types to dates. It requires the "auto_parse" option.
    * @deprecated Use {@link cast_date}
    */
  var auto_parse_date: js.UndefOr[Boolean | CastingDateFunction] = js.undefined
  /**
    * If true, detect and exclude the byte order mark (BOM) from the CSV input if present.
    */
  var bom: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the parser will attempt to convert input string to native types.
    * If a function, receive the value as first argument, a context as second argument and return a new value. More information about the context properties is available below.
    */
  var cast: js.UndefOr[Boolean | CastingFunction] = js.undefined
  /**
    * If true, the parser will attempt to convert input string to dates.
    * If a function, receive the value as argument and return a new value. It requires the "auto_parse" option. Be careful, it relies on Date.parse.
    */
  var cast_date: js.UndefOr[Boolean | CastingDateFunction] = js.undefined
  /**
    * List of fields as an array,
    * a user defined callback accepting the first line and returning the column names or true if autodiscovered in the first CSV line,
    * default to null,
    * affect the result data set in the sense that records will be objects instead of arrays.
    */
  var columns: js.UndefOr[
    js.Array[ColumnOption] | Boolean | (js.Function1[/* record */ js.Any, js.Array[ColumnOption]])
  ] = js.undefined
  /**
    * Convert values into an array of values when columns are activated and
    * when multiple columns of the same name are found.
    */
  var columns_duplicates_to_array: js.UndefOr[Boolean] = js.undefined
  /**
    * Treat all the characters after this one as a comment, default to '' (disabled).
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Set the field delimiter. One character only, defaults to comma.
    */
  var delimiter: js.UndefOr[String | js.Array[String] | Buffer] = js.undefined
  /**
    * Set the escape character, one character only, defaults to double quotes.
    */
  var escape: js.UndefOr[String | Buffer] = js.undefined
  /**
    * Start handling records from the requested number of records.
    */
  var from: js.UndefOr[Double] = js.undefined
  /**
    * Start handling records from the requested line number.
    */
  var from_line: js.UndefOr[Double] = js.undefined
  /**
    * Generate two properties `info` and `record` where `info` is a snapshot of the info object at the time the record was created and `record` is the parsed array or object.
    */
  var info: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, ignore whitespace immediately following the delimiter (i.e. left-trim all fields), defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var ltrim: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum numer of characters to be contained in the field and line buffers before an exception is raised,
    * used to guard against a wrong delimiter or record_delimiter,
    * default to 128000 characters.
    */
  var max_record_size: js.UndefOr[Double] = js.undefined
  /**
    * Name of header-record title to name objects by.
    */
  var objname: js.UndefOr[String] = js.undefined
  /**
    * Alter and filter records by executing a user defined function.
    */
  var on_record: js.UndefOr[js.Function2[/* record */ js.Any, /* context */ CastingContext, _]] = js.undefined
  /**
    * Optional character surrounding a field, one character only, defaults to double quotes.
    */
  var quote: js.UndefOr[String | Boolean | Buffer | Null] = js.undefined
  /**
    * Generate two properties raw and row where raw is the original CSV row content and row is the parsed array or object.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  /**
    * One or multiple characters used to delimit record rows; defaults to auto discovery if not provided.
    * Supported auto discovery method are Linux ("\n"), Apple ("\r") and Windows ("\r\n") row delimiters.
    */
  var record_delimiter: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
  /**
    * Preserve quotes inside unquoted field.
    */
  var relax: js.UndefOr[Boolean] = js.undefined
  /**
    * Discard inconsistent columns count, default to false.
    */
  var relax_column_count: js.UndefOr[Boolean] = js.undefined
  /**
    * Discard inconsistent columns count when the record contains less fields than expected, default to false.
    */
  var relax_column_count_less: js.UndefOr[Boolean] = js.undefined
  /**
    * Discard inconsistent columns count when the record contains more fields than expected, default to false.
    */
  var relax_column_count_more: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, ignore whitespace immediately preceding the delimiter (i.e. right-trim all fields), defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var rtrim: js.UndefOr[Boolean] = js.undefined
  /**
    * Dont generate empty values for empty lines.
    * Defaults to false
    */
  var skip_empty_lines: js.UndefOr[Boolean] = js.undefined
  /**
    * Don't generate records for lines containing empty column values (column matching /\s*\/), defaults to false.
    */
  var skip_lines_with_empty_values: js.UndefOr[Boolean] = js.undefined
  /**
    * Skip a line with error found inside and directly go process the next line.
    */
  var skip_lines_with_error: js.UndefOr[Boolean] = js.undefined
  /**
    * Stop handling records after the requested number of records.
    */
  var to: js.UndefOr[Double] = js.undefined
  /**
    * Stop handling records after the requested line number.
    */
  var to_line: js.UndefOr[Double] = js.undefined
  /**
    * If true, ignore whitespace immediately around the delimiter, defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var trim: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    auto_parse: Boolean | CastingFunction = null,
    auto_parse_date: Boolean | CastingDateFunction = null,
    bom: js.UndefOr[Boolean] = js.undefined,
    cast: Boolean | CastingFunction = null,
    cast_date: Boolean | CastingDateFunction = null,
    columns: js.Array[ColumnOption] | Boolean | (js.Function1[/* record */ js.Any, js.Array[ColumnOption]]) = null,
    columns_duplicates_to_array: js.UndefOr[Boolean] = js.undefined,
    comment: String = null,
    delimiter: String | js.Array[String] | Buffer = null,
    escape: String | Buffer = null,
    from: js.UndefOr[Double] = js.undefined,
    from_line: js.UndefOr[Double] = js.undefined,
    info: js.UndefOr[Boolean] = js.undefined,
    ltrim: js.UndefOr[Boolean] = js.undefined,
    max_record_size: js.UndefOr[Double] = js.undefined,
    objname: String = null,
    on_record: (/* record */ js.Any, /* context */ CastingContext) => _ = null,
    quote: js.UndefOr[Null | String | Boolean | Buffer] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    record_delimiter: String | (js.Array[Buffer | String]) | Buffer = null,
    relax: js.UndefOr[Boolean] = js.undefined,
    relax_column_count: js.UndefOr[Boolean] = js.undefined,
    relax_column_count_less: js.UndefOr[Boolean] = js.undefined,
    relax_column_count_more: js.UndefOr[Boolean] = js.undefined,
    rtrim: js.UndefOr[Boolean] = js.undefined,
    skip_empty_lines: js.UndefOr[Boolean] = js.undefined,
    skip_lines_with_empty_values: js.UndefOr[Boolean] = js.undefined,
    skip_lines_with_error: js.UndefOr[Boolean] = js.undefined,
    to: js.UndefOr[Double] = js.undefined,
    to_line: js.UndefOr[Double] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (auto_parse != null) __obj.updateDynamic("auto_parse")(auto_parse.asInstanceOf[js.Any])
    if (auto_parse_date != null) __obj.updateDynamic("auto_parse_date")(auto_parse_date.asInstanceOf[js.Any])
    if (!js.isUndefined(bom)) __obj.updateDynamic("bom")(bom.get.asInstanceOf[js.Any])
    if (cast != null) __obj.updateDynamic("cast")(cast.asInstanceOf[js.Any])
    if (cast_date != null) __obj.updateDynamic("cast_date")(cast_date.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(columns_duplicates_to_array)) __obj.updateDynamic("columns_duplicates_to_array")(columns_duplicates_to_array.get.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from_line)) __obj.updateDynamic("from_line")(from_line.get.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ltrim)) __obj.updateDynamic("ltrim")(ltrim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_record_size)) __obj.updateDynamic("max_record_size")(max_record_size.get.asInstanceOf[js.Any])
    if (objname != null) __obj.updateDynamic("objname")(objname.asInstanceOf[js.Any])
    if (on_record != null) __obj.updateDynamic("on_record")(js.Any.fromFunction2(on_record))
    if (!js.isUndefined(quote)) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (record_delimiter != null) __obj.updateDynamic("record_delimiter")(record_delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(relax)) __obj.updateDynamic("relax")(relax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relax_column_count)) __obj.updateDynamic("relax_column_count")(relax_column_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relax_column_count_less)) __obj.updateDynamic("relax_column_count_less")(relax_column_count_less.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relax_column_count_more)) __obj.updateDynamic("relax_column_count_more")(relax_column_count_more.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtrim)) __obj.updateDynamic("rtrim")(rtrim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_empty_lines)) __obj.updateDynamic("skip_empty_lines")(skip_empty_lines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_lines_with_empty_values)) __obj.updateDynamic("skip_lines_with_empty_values")(skip_lines_with_empty_values.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_lines_with_error)) __obj.updateDynamic("skip_lines_with_error")(skip_lines_with_error.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to_line)) __obj.updateDynamic("to_line")(to_line.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

