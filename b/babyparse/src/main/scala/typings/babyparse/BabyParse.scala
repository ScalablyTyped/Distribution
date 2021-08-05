package typings.babyparse

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BabyParse {
  
  trait FileObject extends StObject {
    
    var config: js.UndefOr[ParseConfig] = js.undefined
    
    var file: String
  }
  object FileObject {
    
    inline def apply(file: String): FileObject = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileObject]
    }
    
    extension [Self <: FileObject](x: Self) {
      
      inline def setConfig(value: ParseConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseConfig extends StObject {
    
    // default: false
    var comments: js.UndefOr[Boolean] = js.undefined
    
    // default: undefined
    var complete: js.UndefOr[js.Function1[/* results */ ParseResult, Unit]] = js.undefined
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    // default: false
    var download: js.UndefOr[Boolean] = js.undefined
    
    // default: false
    var dynamicTyping: js.UndefOr[Boolean] = js.undefined
    
    // default: 0
    var encoding: js.UndefOr[String] = js.undefined
    
    // default: false
    var fastMode: js.UndefOr[Boolean] = js.undefined
    
    // default: ""
    var header: js.UndefOr[Boolean] = js.undefined
    
    // default: ""
    var newline: js.UndefOr[String] = js.undefined
    
    // default: false
    var preview: js.UndefOr[Double] = js.undefined
    
    // default: false
    var skipEmptyLines: js.UndefOr[Boolean] = js.undefined
    
    // default: undefined
    // Callbacks
    var step: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, Unit]] = js.undefined
    
    // default: ""
    var worker: js.UndefOr[Boolean] = js.undefined
  }
  object ParseConfig {
    
    inline def apply(): ParseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseConfig]
    }
    
    extension [Self <: ParseConfig](x: Self) {
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setComplete(value: /* results */ ParseResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setDynamicTyping(value: Boolean): Self = StObject.set(x, "dynamicTyping", value.asInstanceOf[js.Any])
      
      inline def setDynamicTypingUndefined: Self = StObject.set(x, "dynamicTyping", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFastMode(value: Boolean): Self = StObject.set(x, "fastMode", value.asInstanceOf[js.Any])
      
      inline def setFastModeUndefined: Self = StObject.set(x, "fastMode", js.undefined)
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setPreview(value: Double): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setSkipEmptyLines(value: Boolean): Self = StObject.set(x, "skipEmptyLines", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyLinesUndefined: Self = StObject.set(x, "skipEmptyLines", js.undefined)
      
      inline def setStep(value: (/* results */ ParseResult, /* parser */ Parser) => Unit): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  trait ParseError extends StObject {
    
    // A generalization of the error
    var code: String
    
    // Standardized error code
    var message: String
    
    // Human-readable details
    var row: Double
    
    var `type`: String
  }
  object ParseError {
    
    inline def apply(code: String, message: String, row: Double, `type`: String): ParseError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseError]
    }
    
    extension [Self <: ParseError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseMeta extends StObject {
    
    // Line break sequence used
    var aborted: Boolean
    
    var delimiter: String
    
    // Whether process was aborted
    var fields: js.Array[String]
    
    // Delimiter used
    var linebreak: String
    
    // Array of field names
    var truncated: Boolean
  }
  object ParseMeta {
    
    inline def apply(
      aborted: Boolean,
      delimiter: String,
      fields: js.Array[String],
      linebreak: String,
      truncated: Boolean
    ): ParseMeta = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], linebreak = linebreak.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseMeta]
    }
    
    extension [Self <: ParseMeta](x: Self) {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      inline def setLinebreak(value: String): Self = StObject.set(x, "linebreak", value.asInstanceOf[js.Any])
      
      inline def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @interface ParseResult
    *
    * data: is an array of rows. If header is false, rows are arrays; otherwise they are objects of data keyed by the field name.
    * errors: is an array of errors
    * meta: contains extra information about the parse, such as delimiter used, the newline sequence, whether the process was aborted, etc. Properties in this object are not guaranteed to exist in all situations
    */
  trait ParseResult extends StObject {
    
    var data: js.Array[js.Any]
    
    var errors: js.Array[ParseError]
    
    var meta: ParseMeta
  }
  object ParseResult {
    
    inline def apply(data: js.Array[js.Any], errors: js.Array[ParseError], meta: ParseMeta): ParseResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult]
    }
    
    extension [Self <: ParseResult](x: Self) {
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setMeta(value: ParseMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parser extends StObject {
    
    // Sets the abort flag
    def abort(): Unit
    
    // Gets the cursor position
    def getCharIndex(): Double
    
    // Parses the input
    def parse(input: String): js.Any
  }
  object Parser {
    
    inline def apply(abort: () => Unit, getCharIndex: () => Double, parse: String => js.Any): Parser = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), getCharIndex = js.Any.fromFunction0(getCharIndex), parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[Parser]
    }
    
    extension [Self <: Parser](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setGetCharIndex(value: () => Double): Self = StObject.set(x, "getCharIndex", js.Any.fromFunction0(value))
      
      inline def setParse(value: String => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ParserConstructor
    extends StObject
       with Instantiable1[/* config */ ParseConfig, Parser]
  
  @js.native
  trait Static extends StObject {
    
    /**
      * Read-Only Properties
      */
    // An array of characters that are not allowed as delimiters.
    var BAD_DELIMETERS: js.Array[String] = js.native
    
    // The delimiter used when it is left unspecified and cannot be detected automatically. Default is comma.
    var DefaultDelimiter: String = js.native
    
    /**
      * Configurable Properties
      */
    // The size in bytes of each file chunk. Used when streaming files obtained from the DOM that exist on the local computer. Default 10 MB.
    var LocalChunkSize: String = js.native
    
    /**
      * On Papa there are actually more classes exposed
      * but none of them are officially documented
      * Since we can interact with the Parser from one of the callbacks
      * I have included the API for this class.
      */
    var Parser: ParserConstructor = js.native
    
    // The true delimiter. Invisible. ASCII code 30. Should be doing the job we strangely rely upon commas and tabs for.
    var RECORD_SEP: String = js.native
    
    // Same as LocalChunkSize, but for downloading files from remote locations. Default 5 MB.
    var RemoteChunkSize: String = js.native
    
    // The relative path to Papa Parse. This is automatically detected when Papa Parse is loaded synchronously.
    var SCRIPT_PATH: String = js.native
    
    // Also sometimes used as a delimiting character. ASCII code 31.
    var UNIT_SEP: String = js.native
    
    // Whether or not the browser supports HTML5 Web Workers. If false, worker: true will have no effect.
    var WORKERS_SUPPORTED: Boolean = js.native
    
    /**
      * Parse a csv string or a csv file
      */
    def parse(csvString: String): ParseResult = js.native
    def parse(csvString: String, config: ParseConfig): ParseResult = js.native
    
    /**
      * Parse single file or multiple files
      */
    def parseFiles(input: String): ParseResult = js.native
    def parseFiles(input: String, config: ParseConfig): ParseResult = js.native
    def parseFiles(input: js.Array[FileObject | String]): ParseResult = js.native
    def parseFiles(input: js.Array[FileObject | String], config: ParseConfig): ParseResult = js.native
    def parseFiles(input: FileObject): ParseResult = js.native
    def parseFiles(input: FileObject, config: ParseConfig): ParseResult = js.native
    
    /**
      * Unparses javascript data objects and returns a csv string
      */
    def unparse(data: js.Array[js.Array[js.Any] | js.Object]): String = js.native
    def unparse(data: js.Array[js.Array[js.Any] | js.Object], config: UnparseConfig): String = js.native
    def unparse(data: UnparseObject): String = js.native
    def unparse(data: UnparseObject, config: UnparseConfig): String = js.native
  }
  
  trait UnparseConfig extends StObject {
    
    // default: false
    var delimiter: js.UndefOr[String] = js.undefined
    
    // default: ","
    var newline: js.UndefOr[String] = js.undefined
    
    var quotes: js.UndefOr[Boolean | js.Array[Boolean]] = js.undefined
  }
  object UnparseConfig {
    
    inline def apply(): UnparseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnparseConfig]
    }
    
    extension [Self <: UnparseConfig](x: Self) {
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setQuotes(value: Boolean | js.Array[Boolean]): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      inline def setQuotesVarargs(value: Boolean*): Self = StObject.set(x, "quotes", js.Array(value :_*))
    }
  }
  
  trait UnparseObject extends StObject {
    
    var data: String | js.Array[js.Any]
    
    var fields: js.Array[js.Any]
  }
  object UnparseObject {
    
    inline def apply(data: String | js.Array[js.Any], fields: js.Array[js.Any]): UnparseObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnparseObject]
    }
    
    extension [Self <: UnparseObject](x: Self) {
      
      inline def setData(value: String | js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setFields(value: js.Array[js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: js.Any*): Self = StObject.set(x, "fields", js.Array(value :_*))
    }
  }
}
