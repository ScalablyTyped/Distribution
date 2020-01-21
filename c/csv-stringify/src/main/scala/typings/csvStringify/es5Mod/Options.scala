package typings.csvStringify.es5Mod

import typings.csvStringify.AnonBoolean
import typings.node.Buffer
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Key-value object which defines custom cast for certain data types
    */
  var cast: js.UndefOr[AnonBoolean] = js.undefined
  /**
    * List of fields, applied when `transform` returns an object
    * order matters
    * read the transformer documentation for additionnal information
    * columns are auto discovered in the first record when the user write objects
    * can refer to nested properties of the input JSON
    * see the "header" option on how to print columns names on the first line
    */
  var columns: js.UndefOr[(js.Array[ColumnOption | String]) | PlainObject[String]] = js.undefined
  /**
    * Set the field delimiter, one character only, defaults to a comma.
    */
  var delimiter: js.UndefOr[String | Buffer] = js.undefined
  /**
    * Add the value of "options.RecordDelimiter" on the last line, default to true.
    */
  var eof: js.UndefOr[Boolean] = js.undefined
  /**
    * Defaults to the escape read option.
    */
  var escape: js.UndefOr[String | Buffer] = js.undefined
  /**
    * Display the column names on the first line if the columns option is provided or discovered.
    */
  var header: js.UndefOr[Boolean] = js.undefined
  /**
    * The quote characters, defaults to the ", an empty quote value will preserve the original field.
    */
  var quote: js.UndefOr[String | Buffer | Boolean] = js.undefined
  /**
    * Boolean, default to false, quote all the non-empty fields even if not required.
    */
  var quoted: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean, no default, quote empty fields and overrides `quoted_string` on empty strings when defined.
    */
  var quoted_empty: js.UndefOr[Boolean] = js.undefined
  /**
    * String or RegExp, no default, quote all fields matching a regular expression.
    */
  var quoted_match: js.UndefOr[String | RegExp] = js.undefined
  /**
    * Boolean, default to false, quote all fields of type string even if not required.
    */
  var quoted_string: js.UndefOr[Boolean] = js.undefined
  /**
    * String used to delimit record rows or a special value
    * special values are 'auto', 'unix', 'mac', 'windows', 'ascii', 'unicode'
    * defaults to 'auto' (discovered in source or 'unix' if no source is specified).
    */
  var record_delimiter: js.UndefOr[RecordDelimiter] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cast: AnonBoolean = null,
    columns: (js.Array[ColumnOption | String]) | PlainObject[String] = null,
    delimiter: String | Buffer = null,
    eof: js.UndefOr[Boolean] = js.undefined,
    escape: String | Buffer = null,
    header: js.UndefOr[Boolean] = js.undefined,
    quote: String | Buffer | Boolean = null,
    quoted: js.UndefOr[Boolean] = js.undefined,
    quoted_empty: js.UndefOr[Boolean] = js.undefined,
    quoted_match: String | RegExp = null,
    quoted_string: js.UndefOr[Boolean] = js.undefined,
    record_delimiter: RecordDelimiter = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cast != null) __obj.updateDynamic("cast")(cast.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(eof)) __obj.updateDynamic("eof")(eof.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (!js.isUndefined(quoted)) __obj.updateDynamic("quoted")(quoted.asInstanceOf[js.Any])
    if (!js.isUndefined(quoted_empty)) __obj.updateDynamic("quoted_empty")(quoted_empty.asInstanceOf[js.Any])
    if (quoted_match != null) __obj.updateDynamic("quoted_match")(quoted_match.asInstanceOf[js.Any])
    if (!js.isUndefined(quoted_string)) __obj.updateDynamic("quoted_string")(quoted_string.asInstanceOf[js.Any])
    if (record_delimiter != null) __obj.updateDynamic("record_delimiter")(record_delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

