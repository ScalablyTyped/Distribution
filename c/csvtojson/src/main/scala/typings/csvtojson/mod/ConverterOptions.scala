package typings.csvtojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Converter options
  */
@js.native
trait ConverterOptions extends js.Object {
  
  /**
    * Whether or not to check if the column number of a row is the same as headers. If column number
    * mismatched headers number, an error of "mismatched_column" will be emitted. (default: false)
    */
  var checkColumn: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter turns on and off whether check field type. (default: true)
    */
  var checkType: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to construct final json object in memory which will be populated in "end_parsed"
    * event. Set to false if deal with huge csv data. default: true.
    */
  var constructResult: js.UndefOr[Boolean] = js.native
  
  /**
    * Delimiter used for seperating columns. Use "auto" if delimiter is unknown in advance,
    * in this case, delimiter will be auto-detected (by best attempt). Use an array to give
    * a list of potential delimiters e.g. [",","|","$"]. (default: ",")
    */
  var delimiter: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * End of line character. If omitted, parser will attempt retrieve it from first chunk of CSV data.
    * If no valid eol found, then operation system eol will be used.
    */
  var eol: js.UndefOr[String] = js.native
  
  /**
    * Escape character used in quoted column. Default is double quote (") according to RFC4108. Change
    * to back slash (\) or other chars for your own case. (default: " (double quote))
    */
  var escape: js.UndefOr[String] = js.native
  
  /**
    * Don't interpret dots (.) and square brackets in header fields as nested object or array identifiers
    * at all (treat them like regular characters for JSON field identifiers). (default: false)
    */
  var flatKeys: js.UndefOr[Boolean] = js.native
  
  /**
    * Deprecated. Use workerNum instead.
    */
  var fork: js.UndefOr[Double] = js.native
  
  /**
    * An array to specify the headers of CSV data. If noheader is false, this value will override
    * CSV header row. Example: ["my field","name"] (default: null)
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * This parameter instructs the parser to ignore columns as specified by an array of column indexes.
    * Example: [1,3,5] will ignore columns 1, 3, and 5 and will not return them in the JSON output.
    */
  var ignoreColumns: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Ignore the empty value in CSV columns. If a column value is not giving, set this to true to
    * skip them. (default: false)
    */
  var ignoreEmpty: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter instructs the parser to include only those columns as specified by an array of
    * column indexes. Example: [0,2,3] will parse and include only columns 0, 2, and 3 in the JSON output.
    */
  var includeColumns: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The max character a CSV row could have. 0 means infinite. If max number exceeded, parser will emit
    * "error" of "row_exceed". if a possibly corrupted CSV data provided, give it a number like 65535
    * so the parser wont consume memory. (default: 0)
    */
  var maxRowLength: js.UndefOr[Double] = js.native
  
  /**
    * Indicating CSV data has no header row and first row is data row. (default: false)
    */
  var noheader: js.UndefOr[Boolean] = js.native
  
  /**
    * If a column contains delimiter, it is able to use quote character to surround the column
    * content. e.g. "hello, world" wont be split into two columns while parsing. Set to "off"
    * will ignore all quotes. (default: " (double quote))
    */
  var quote: js.UndefOr[String] = js.native
  
  /**
    * Stringify the stream output to JSON array. This is useful when pipe output to a file
    * which expects stringified JSON array. (default: false and only stringified JSON (without [])
    * will be pushed to downstream)
    */
  var toArrayString: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicate if parser trim off spaces surrounding column content. e.g. " content " will be
    * trimmed to "content". (default: true)
    */
  var trim: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of worker processes. The worker process will use multi-cores to help process CSV data.
    * Set to number of cores to improve the performance of processing large CSV file. Keep 1 for
    * small csv files. (default: 1)
    */
  var workerNum: js.UndefOr[Double] = js.native
}
object ConverterOptions {
  
  @scala.inline
  def apply(): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterOptions]
  }
  
  @scala.inline
  implicit class ConverterOptionsOps[Self <: ConverterOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckColumn(value: Boolean): Self = this.set("checkColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckColumn: Self = this.set("checkColumn", js.undefined)
    
    @scala.inline
    def setCheckType(value: Boolean): Self = this.set("checkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckType: Self = this.set("checkType", js.undefined)
    
    @scala.inline
    def setConstructResult(value: Boolean): Self = this.set("constructResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstructResult: Self = this.set("constructResult", js.undefined)
    
    @scala.inline
    def setDelimiterVarargs(value: String*): Self = this.set("delimiter", js.Array(value :_*))
    
    @scala.inline
    def setDelimiter(value: String | js.Array[String]): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    
    @scala.inline
    def setEscape(value: String): Self = this.set("escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setFlatKeys(value: Boolean): Self = this.set("flatKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatKeys: Self = this.set("flatKeys", js.undefined)
    
    @scala.inline
    def setFork(value: Double): Self = this.set("fork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFork: Self = this.set("fork", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIgnoreColumnsVarargs(value: Double*): Self = this.set("ignoreColumns", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreColumns(value: js.Array[Double]): Self = this.set("ignoreColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreColumns: Self = this.set("ignoreColumns", js.undefined)
    
    @scala.inline
    def setIgnoreEmpty(value: Boolean): Self = this.set("ignoreEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEmpty: Self = this.set("ignoreEmpty", js.undefined)
    
    @scala.inline
    def setIncludeColumnsVarargs(value: Double*): Self = this.set("includeColumns", js.Array(value :_*))
    
    @scala.inline
    def setIncludeColumns(value: js.Array[Double]): Self = this.set("includeColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeColumns: Self = this.set("includeColumns", js.undefined)
    
    @scala.inline
    def setMaxRowLength(value: Double): Self = this.set("maxRowLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRowLength: Self = this.set("maxRowLength", js.undefined)
    
    @scala.inline
    def setNoheader(value: Boolean): Self = this.set("noheader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoheader: Self = this.set("noheader", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setToArrayString(value: Boolean): Self = this.set("toArrayString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToArrayString: Self = this.set("toArrayString", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setWorkerNum(value: Double): Self = this.set("workerNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerNum: Self = this.set("workerNum", js.undefined)
  }
}
