package typings.csvParse.es5Mod

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If true, the parser will attempt to convert read data types to native types.
    * @deprecated Use {@link cast}
    */
  var auto_parse: js.UndefOr[Boolean | CastingFunction] = js.native
  /**
    * If true, the parser will attempt to convert read data types to dates. It requires the "auto_parse" option.
    * @deprecated Use {@link cast_date}
    */
  var auto_parse_date: js.UndefOr[Boolean | CastingDateFunction] = js.native
  /**
    * If true, detect and exclude the byte order mark (BOM) from the CSV input if present.
    */
  var bom: js.UndefOr[Boolean] = js.native
  /**
    * If true, the parser will attempt to convert input string to native types.
    * If a function, receive the value as first argument, a context as second argument and return a new value. More information about the context properties is available below.
    */
  var cast: js.UndefOr[Boolean | CastingFunction] = js.native
  /**
    * If true, the parser will attempt to convert input string to dates.
    * If a function, receive the value as argument and return a new value. It requires the "auto_parse" option. Be careful, it relies on Date.parse.
    */
  var cast_date: js.UndefOr[Boolean | CastingDateFunction] = js.native
  /**
    * List of fields as an array,
    * a user defined callback accepting the first line and returning the column names or true if autodiscovered in the first CSV line,
    * default to null,
    * affect the result data set in the sense that records will be objects instead of arrays.
    */
  var columns: js.UndefOr[
    js.Array[ColumnOption] | Boolean | (js.Function1[/* record */ js.Any, js.Array[ColumnOption]])
  ] = js.native
  /**
    * Convert values into an array of values when columns are activated and
    * when multiple columns of the same name are found.
    */
  var columns_duplicates_to_array: js.UndefOr[Boolean] = js.native
  /**
    * Treat all the characters after this one as a comment, default to '' (disabled).
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Set the field delimiter. One character only, defaults to comma.
    */
  var delimiter: js.UndefOr[String | js.Array[String] | Buffer] = js.native
  /**
    * Set the escape character, one character only, defaults to double quotes.
    */
  var escape: js.UndefOr[String | Buffer] = js.native
  /**
    * Start handling records from the requested number of records.
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * Start handling records from the requested line number.
    */
  var from_line: js.UndefOr[Double] = js.native
  /**
    * Generate two properties `info` and `record` where `info` is a snapshot of the info object at the time the record was created and `record` is the parsed array or object.
    */
  var info: js.UndefOr[Boolean] = js.native
  /**
    * If true, ignore whitespace immediately following the delimiter (i.e. left-trim all fields), defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var ltrim: js.UndefOr[Boolean] = js.native
  /**
    * Maximum numer of characters to be contained in the field and line buffers before an exception is raised,
    * used to guard against a wrong delimiter or record_delimiter,
    * default to 128000 characters.
    */
  var max_record_size: js.UndefOr[Double] = js.native
  /**
    * Name of header-record title to name objects by.
    */
  var objname: js.UndefOr[String] = js.native
  /**
    * Alter and filter records by executing a user defined function.
    */
  var on_record: js.UndefOr[js.Function2[/* record */ js.Any, /* context */ CastingContext, _]] = js.native
  /**
    * Optional character surrounding a field, one character only, defaults to double quotes.
    */
  var quote: js.UndefOr[String | Boolean | Buffer | Null] = js.native
  /**
    * Generate two properties raw and row where raw is the original CSV row content and row is the parsed array or object.
    */
  var raw: js.UndefOr[Boolean] = js.native
  /**
    * One or multiple characters used to delimit record rows; defaults to auto discovery if not provided.
    * Supported auto discovery method are Linux ("\n"), Apple ("\r") and Windows ("\r\n") row delimiters.
    */
  var record_delimiter: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.native
  /**
    * Preserve quotes inside unquoted field.
    */
  var relax: js.UndefOr[Boolean] = js.native
  /**
    * Discard inconsistent columns count, default to false.
    */
  var relax_column_count: js.UndefOr[Boolean] = js.native
  /**
    * Discard inconsistent columns count when the record contains less fields than expected, default to false.
    */
  var relax_column_count_less: js.UndefOr[Boolean] = js.native
  /**
    * Discard inconsistent columns count when the record contains more fields than expected, default to false.
    */
  var relax_column_count_more: js.UndefOr[Boolean] = js.native
  /**
    * If true, ignore whitespace immediately preceding the delimiter (i.e. right-trim all fields), defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var rtrim: js.UndefOr[Boolean] = js.native
  /**
    * Dont generate empty values for empty lines.
    * Defaults to false
    */
  var skip_empty_lines: js.UndefOr[Boolean] = js.native
  /**
    * Don't generate records for lines containing empty column values (column matching /\s*\/), defaults to false.
    */
  var skip_lines_with_empty_values: js.UndefOr[Boolean] = js.native
  /**
    * Skip a line with error found inside and directly go process the next line.
    */
  var skip_lines_with_error: js.UndefOr[Boolean] = js.native
  /**
    * Stop handling records after the requested number of records.
    */
  var to: js.UndefOr[Double] = js.native
  /**
    * Stop handling records after the requested line number.
    */
  var to_line: js.UndefOr[Double] = js.native
  /**
    * If true, ignore whitespace immediately around the delimiter, defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var trim: js.UndefOr[Boolean] = js.native
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
    def setAuto_parseFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Any): Self = this.set("auto_parse", js.Any.fromFunction2(value))
    @scala.inline
    def setAuto_parse(value: Boolean | CastingFunction): Self = this.set("auto_parse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto_parse: Self = this.set("auto_parse", js.undefined)
    @scala.inline
    def setAuto_parse_dateFunction2(value: (/* value */ String, /* context */ CastingContext) => Date): Self = this.set("auto_parse_date", js.Any.fromFunction2(value))
    @scala.inline
    def setAuto_parse_date(value: Boolean | CastingDateFunction): Self = this.set("auto_parse_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto_parse_date: Self = this.set("auto_parse_date", js.undefined)
    @scala.inline
    def setBom(value: Boolean): Self = this.set("bom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBom: Self = this.set("bom", js.undefined)
    @scala.inline
    def setCastFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Any): Self = this.set("cast", js.Any.fromFunction2(value))
    @scala.inline
    def setCast(value: Boolean | CastingFunction): Self = this.set("cast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCast: Self = this.set("cast", js.undefined)
    @scala.inline
    def setCast_dateFunction2(value: (/* value */ String, /* context */ CastingContext) => Date): Self = this.set("cast_date", js.Any.fromFunction2(value))
    @scala.inline
    def setCast_date(value: Boolean | CastingDateFunction): Self = this.set("cast_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCast_date: Self = this.set("cast_date", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: ColumnOption*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumnsFunction1(value: /* record */ js.Any => js.Array[ColumnOption]): Self = this.set("columns", js.Any.fromFunction1(value))
    @scala.inline
    def setColumns(
      value: js.Array[ColumnOption] | Boolean | (js.Function1[/* record */ js.Any, js.Array[ColumnOption]])
    ): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setColumns_duplicates_to_array(value: Boolean): Self = this.set("columns_duplicates_to_array", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns_duplicates_to_array: Self = this.set("columns_duplicates_to_array", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setDelimiterVarargs(value: String*): Self = this.set("delimiter", js.Array(value :_*))
    @scala.inline
    def setDelimiter(value: String | js.Array[String] | Buffer): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setEscape(value: String | Buffer): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setFrom_line(value: Double): Self = this.set("from_line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom_line: Self = this.set("from_line", js.undefined)
    @scala.inline
    def setInfo(value: Boolean): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setLtrim(value: Boolean): Self = this.set("ltrim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLtrim: Self = this.set("ltrim", js.undefined)
    @scala.inline
    def setMax_record_size(value: Double): Self = this.set("max_record_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_record_size: Self = this.set("max_record_size", js.undefined)
    @scala.inline
    def setObjname(value: String): Self = this.set("objname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjname: Self = this.set("objname", js.undefined)
    @scala.inline
    def setOn_record(value: (/* record */ js.Any, /* context */ CastingContext) => _): Self = this.set("on_record", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOn_record: Self = this.set("on_record", js.undefined)
    @scala.inline
    def setQuote(value: String | Boolean | Buffer): Self = this.set("quote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    @scala.inline
    def setQuoteNull: Self = this.set("quote", null)
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setRecord_delimiterVarargs(value: (Buffer | String)*): Self = this.set("record_delimiter", js.Array(value :_*))
    @scala.inline
    def setRecord_delimiter(value: String | (js.Array[Buffer | String]) | Buffer): Self = this.set("record_delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecord_delimiter: Self = this.set("record_delimiter", js.undefined)
    @scala.inline
    def setRelax(value: Boolean): Self = this.set("relax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelax: Self = this.set("relax", js.undefined)
    @scala.inline
    def setRelax_column_count(value: Boolean): Self = this.set("relax_column_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelax_column_count: Self = this.set("relax_column_count", js.undefined)
    @scala.inline
    def setRelax_column_count_less(value: Boolean): Self = this.set("relax_column_count_less", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelax_column_count_less: Self = this.set("relax_column_count_less", js.undefined)
    @scala.inline
    def setRelax_column_count_more(value: Boolean): Self = this.set("relax_column_count_more", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelax_column_count_more: Self = this.set("relax_column_count_more", js.undefined)
    @scala.inline
    def setRtrim(value: Boolean): Self = this.set("rtrim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtrim: Self = this.set("rtrim", js.undefined)
    @scala.inline
    def setSkip_empty_lines(value: Boolean): Self = this.set("skip_empty_lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip_empty_lines: Self = this.set("skip_empty_lines", js.undefined)
    @scala.inline
    def setSkip_lines_with_empty_values(value: Boolean): Self = this.set("skip_lines_with_empty_values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip_lines_with_empty_values: Self = this.set("skip_lines_with_empty_values", js.undefined)
    @scala.inline
    def setSkip_lines_with_error(value: Boolean): Self = this.set("skip_lines_with_error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip_lines_with_error: Self = this.set("skip_lines_with_error", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setTo_line(value: Double): Self = this.set("to_line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo_line: Self = this.set("to_line", js.undefined)
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
  
}

