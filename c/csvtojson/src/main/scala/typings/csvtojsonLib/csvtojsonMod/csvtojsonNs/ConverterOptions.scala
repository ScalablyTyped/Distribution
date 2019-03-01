package typings
package csvtojsonLib.csvtojsonMod.csvtojsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Converter options
  */
trait ConverterOptions extends js.Object {
  /**
    * Whether or not to check if the column number of a row is the same as headers. If column number
    * mismatched headers number, an error of "mismatched_column" will be emitted. (default: false)
    */
  var checkColumn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This parameter turns on and off whether check field type. (default: true)
    */
  var checkType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to construct final json object in memory which will be populated in "end_parsed"
    * event. Set to false if deal with huge csv data. default: true.
    */
  var constructResult: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delimiter used for seperating columns. Use "auto" if delimiter is unknown in advance,
    * in this case, delimiter will be auto-detected (by best attempt). Use an array to give
    * a list of potential delimiters e.g. [",","|","$"]. (default: ",")
    */
  var delimiter: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * End of line character. If omitted, parser will attempt retrieve it from first chunk of CSV data.
    * If no valid eol found, then operation system eol will be used.
    */
  var eol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Escape character used in quoted column. Default is double quote (") according to RFC4108. Change
    * to back slash (\) or other chars for your own case. (default: " (double quote))
    */
  var escape: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Don't interpret dots (.) and square brackets in header fields as nested object or array identifiers
    * at all (treat them like regular characters for JSON field identifiers). (default: false)
    */
  var flatKeys: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Deprecated. Use workerNum instead.
    */
  var fork: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array to specify the headers of CSV data. If noheader is false, this value will override
    * CSV header row. Example: ["my field","name"] (default: null)
    */
  var headers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * This parameter instructs the parser to ignore columns as specified by an array of column indexes.
    * Example: [1,3,5] will ignore columns 1, 3, and 5 and will not return them in the JSON output.
    */
  var ignoreColumns: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Ignore the empty value in CSV columns. If a column value is not giving, set this to true to
    * skip them. (default: false)
    */
  var ignoreEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This parameter instructs the parser to include only those columns as specified by an array of
    * column indexes. Example: [0,2,3] will parse and include only columns 0, 2, and 3 in the JSON output.
    */
  var includeColumns: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The max character a CSV row could have. 0 means infinite. If max number exceeded, parser will emit
    * "error" of "row_exceed". if a possibly corrupted CSV data provided, give it a number like 65535
    * so the parser wont consume memory. (default: 0)
    */
  var maxRowLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicating CSV data has no header row and first row is data row. (default: false)
    */
  var noheader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If a column contains delimiter, it is able to use quote character to surround the column
    * content. e.g. "hello, world" wont be split into two columns while parsing. Set to "off"
    * will ignore all quotes. (default: " (double quote))
    */
  var quote: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Stringify the stream output to JSON array. This is useful when pipe output to a file
    * which expects stringified JSON array. (default: false and only stringified JSON (without [])
    * will be pushed to downstream)
    */
  var toArrayString: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicate if parser trim off spaces surrounding column content. e.g. " content " will be
    * trimmed to "content". (default: true)
    */
  var trim: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number of worker processes. The worker process will use multi-cores to help process CSV data.
    * Set to number of cores to improve the performance of processing large CSV file. Keep 1 for
    * small csv files. (default: 1)
    */
  var workerNum: js.UndefOr[scala.Double] = js.undefined
}

object ConverterOptions {
  @scala.inline
  def apply(
    checkColumn: js.UndefOr[scala.Boolean] = js.undefined,
    checkType: js.UndefOr[scala.Boolean] = js.undefined,
    constructResult: js.UndefOr[scala.Boolean] = js.undefined,
    delimiter: java.lang.String | js.Array[java.lang.String] = null,
    eol: java.lang.String = null,
    escape: java.lang.String = null,
    flatKeys: js.UndefOr[scala.Boolean] = js.undefined,
    fork: scala.Int | scala.Double = null,
    headers: js.Array[java.lang.String] = null,
    ignoreColumns: js.Array[scala.Double] = null,
    ignoreEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    includeColumns: js.Array[scala.Double] = null,
    maxRowLength: scala.Int | scala.Double = null,
    noheader: js.UndefOr[scala.Boolean] = js.undefined,
    quote: java.lang.String = null,
    toArrayString: js.UndefOr[scala.Boolean] = js.undefined,
    trim: js.UndefOr[scala.Boolean] = js.undefined,
    workerNum: scala.Int | scala.Double = null
  ): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkColumn)) __obj.updateDynamic("checkColumn")(checkColumn)
    if (!js.isUndefined(checkType)) __obj.updateDynamic("checkType")(checkType)
    if (!js.isUndefined(constructResult)) __obj.updateDynamic("constructResult")(constructResult)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (escape != null) __obj.updateDynamic("escape")(escape)
    if (!js.isUndefined(flatKeys)) __obj.updateDynamic("flatKeys")(flatKeys)
    if (fork != null) __obj.updateDynamic("fork")(fork.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (ignoreColumns != null) __obj.updateDynamic("ignoreColumns")(ignoreColumns)
    if (!js.isUndefined(ignoreEmpty)) __obj.updateDynamic("ignoreEmpty")(ignoreEmpty)
    if (includeColumns != null) __obj.updateDynamic("includeColumns")(includeColumns)
    if (maxRowLength != null) __obj.updateDynamic("maxRowLength")(maxRowLength.asInstanceOf[js.Any])
    if (!js.isUndefined(noheader)) __obj.updateDynamic("noheader")(noheader)
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (!js.isUndefined(toArrayString)) __obj.updateDynamic("toArrayString")(toArrayString)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (workerNum != null) __obj.updateDynamic("workerNum")(workerNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterOptions]
  }
}

