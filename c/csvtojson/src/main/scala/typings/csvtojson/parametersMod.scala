package typings.csvtojson

import org.scalablytyped.runtime.StringDictionary
import typings.csvtojson.anon.PartialCSVParseParam
import typings.csvtojson.csvtojsonStrings.array
import typings.csvtojson.csvtojsonStrings.csv
import typings.csvtojson.csvtojsonStrings.json
import typings.csvtojson.csvtojsonStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parametersMod {
  
  @JSImport("csvtojson/v2/Parameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeParams(): CSVParseParam = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeParams")().asInstanceOf[CSVParseParam]
  inline def mergeParams(params: PartialCSVParseParam): CSVParseParam = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeParams")(params.asInstanceOf[js.Any]).asInstanceOf[CSVParseParam]
  
  trait CSVParseParam extends StObject {
    
    /**
      *  Always interpret each line (as defined by eol) as a row. This will prevent eol characters from being used within a row (even inside a quoted field). Default is false. Change to true if you are confident no inline line breaks (like line break in a cell which has multi line text)
      */
    var alwaysSplitAtEOL: Boolean
    
    /**
      *  whether check column number of a row is the same as headers. If column number mismatched headers number, an error of "mismatched_column" will be emitted.. default: false
      */
    var checkColumn: Boolean
    
    /**
      *  This parameter turns on and off whether check field type. Default is false.
      */
    var checkType: Boolean
    
    /**
      *   Allows override parsing logic for a specific column. It accepts a JSON object with fields like: headName: <String | Function> . e.g. {field1:'number'} will use built-in number parser to convert value of the field1 column to number. Another example {"name":nameProcessFunc} will use specified function to parse the value.
      */
    var colParser: StringDictionary[String | CellParser | ColumnParam]
    
    /**
      *   delimiter used for seperating columns. Use "auto" if delimiter is unknown in advance, in this case, delimiter will be auto-detected (by best attempt). Use an array to give a list of potential delimiters e.g. [",","|","$"]. default: ","
      */
    var delimiter: String | js.Array[String]
    
    /**
      * Define the format required by downstream (this parameter does not work if objectMode is on). `line` -- json is emitted in a single line separated by a line breake like "json1\njson2" . `array` -- downstream requires array format like "[json1,json2]". Default is line.
      */
    var downstreamFormat: line | array
    
    /**
      *  End of line character. If omitted, parser will attempt to retrieve it from the first chunks of CSV data
      */
    var eol: js.UndefOr[String] = js.undefined
    
    /**
      *  escape character used in quoted column. Default is double quote (") according to RFC4108. Change to back slash (\) or other chars for your own case.
      */
    var escape: String
    
    /**
      *  Don't interpret dots (.) and square brackets in header fields as nested object or array identifiers at all (treat them like regular characters for JSON field identifiers). Default: false.
      */
    var flatKeys: Boolean
    
    /**
      *  An array to specify the headers of CSV data. If --noheader is false, this value will override CSV header row. Default: null. Example: ["my field","name"].
      */
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      *  This parameter instructs the parser to ignore columns as specified by the regular expression. Example: /(name|age)/ will ignore columns whose header contains "name" or "age"
      */
    var ignoreColumns: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      *  Ignore the empty value in CSV columns. If a column value is not given, set this to true to skip them. Default: false.
      */
    var ignoreEmpty: Boolean
    
    /**
      *  This parameter instructs the parser to include only those columns as specified by the regular expression. Example: /(name|age)/ will parse and include columns whose header contains "name" or "age"
      */
    var includeColumns: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      *  the max character a csv row could have. 0 means infinite. If max number exceeded, parser will emit "error" of "row_exceed". if a possibly corrupted csv data provided, give it a number like 65535 so the parser wont consume memory. default: 0
      */
    var maxRowLength: Double
    
    /**
      * Define whether .then(callback) returns all JSON data in its callback. Default is true. Change to false to save memory if subscribing json lines.
      */
    var needEmitAll: Boolean
    
    /**
      *  Delegate parsing work to another process.
      */
    /**
      *  Indicating csv data has no header row and first row is data row. Default is false.
      */
    var noheader: Boolean
    
    /**
      * Convert string "null" to null object in JSON outputs. Default is false.
      */
    var nullObject: Boolean
    
    /**
      * The format to be converted to. "json" (default) -- convert csv to json. "csv" -- convert csv to csv row array. "line" -- convert csv to csv line string
      */
    var output: json | csv | line
    
    /**
      *  If a column contains delimiter, it is able to use quote character to surround the column content. e.g. "hello, world" wont be split into two columns while parsing. Set to "off" will ignore all quotes. default: " (double quote)
      */
    var quote: String
    
    /**
      *  Indicate if parser trim off spaces surrounding column content. e.g. " content " will be trimmed to "content". Default: true
      */
    var trim: Boolean
  }
  object CSVParseParam {
    
    inline def apply(
      alwaysSplitAtEOL: Boolean,
      checkColumn: Boolean,
      checkType: Boolean,
      colParser: StringDictionary[String | CellParser | ColumnParam],
      delimiter: String | js.Array[String],
      downstreamFormat: line | array,
      escape: String,
      flatKeys: Boolean,
      ignoreEmpty: Boolean,
      maxRowLength: Double,
      needEmitAll: Boolean,
      noheader: Boolean,
      nullObject: Boolean,
      output: json | csv | line,
      quote: String,
      trim: Boolean
    ): CSVParseParam = {
      val __obj = js.Dynamic.literal(alwaysSplitAtEOL = alwaysSplitAtEOL.asInstanceOf[js.Any], checkColumn = checkColumn.asInstanceOf[js.Any], checkType = checkType.asInstanceOf[js.Any], colParser = colParser.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], downstreamFormat = downstreamFormat.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], flatKeys = flatKeys.asInstanceOf[js.Any], ignoreEmpty = ignoreEmpty.asInstanceOf[js.Any], maxRowLength = maxRowLength.asInstanceOf[js.Any], needEmitAll = needEmitAll.asInstanceOf[js.Any], noheader = noheader.asInstanceOf[js.Any], nullObject = nullObject.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSVParseParam]
    }
    
    extension [Self <: CSVParseParam](x: Self) {
      
      inline def setAlwaysSplitAtEOL(value: Boolean): Self = StObject.set(x, "alwaysSplitAtEOL", value.asInstanceOf[js.Any])
      
      inline def setCheckColumn(value: Boolean): Self = StObject.set(x, "checkColumn", value.asInstanceOf[js.Any])
      
      inline def setCheckType(value: Boolean): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
      
      inline def setColParser(value: StringDictionary[String | CellParser | ColumnParam]): Self = StObject.set(x, "colParser", value.asInstanceOf[js.Any])
      
      inline def setDelimiter(value: String | js.Array[String]): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterVarargs(value: String*): Self = StObject.set(x, "delimiter", js.Array(value*))
      
      inline def setDownstreamFormat(value: line | array): Self = StObject.set(x, "downstreamFormat", value.asInstanceOf[js.Any])
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setFlatKeys(value: Boolean): Self = StObject.set(x, "flatKeys", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIgnoreColumns(value: js.RegExp): Self = StObject.set(x, "ignoreColumns", value.asInstanceOf[js.Any])
      
      inline def setIgnoreColumnsUndefined: Self = StObject.set(x, "ignoreColumns", js.undefined)
      
      inline def setIgnoreEmpty(value: Boolean): Self = StObject.set(x, "ignoreEmpty", value.asInstanceOf[js.Any])
      
      inline def setIncludeColumns(value: js.RegExp): Self = StObject.set(x, "includeColumns", value.asInstanceOf[js.Any])
      
      inline def setIncludeColumnsUndefined: Self = StObject.set(x, "includeColumns", js.undefined)
      
      inline def setMaxRowLength(value: Double): Self = StObject.set(x, "maxRowLength", value.asInstanceOf[js.Any])
      
      inline def setNeedEmitAll(value: Boolean): Self = StObject.set(x, "needEmitAll", value.asInstanceOf[js.Any])
      
      inline def setNoheader(value: Boolean): Self = StObject.set(x, "noheader", value.asInstanceOf[js.Any])
      
      inline def setNullObject(value: Boolean): Self = StObject.set(x, "nullObject", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: json | csv | line): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    }
  }
  
  type CellParser = js.Function5[
    /* item */ String, 
    /* head */ String, 
    /* resultRow */ Any, 
    /* row */ js.Array[String], 
    /* columnIndex */ Double, 
    Any
  ]
  
  trait ColumnParam extends StObject {
    
    var cellParser: js.UndefOr[String | CellParser] = js.undefined
    
    var flat: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnParam {
    
    inline def apply(): ColumnParam = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnParam]
    }
    
    extension [Self <: ColumnParam](x: Self) {
      
      inline def setCellParser(value: String | CellParser): Self = StObject.set(x, "cellParser", value.asInstanceOf[js.Any])
      
      inline def setCellParserFunction5(
        value: (/* item */ String, /* head */ String, /* resultRow */ Any, /* row */ js.Array[String], /* columnIndex */ Double) => Any
      ): Self = StObject.set(x, "cellParser", js.Any.fromFunction5(value))
      
      inline def setCellParserUndefined: Self = StObject.set(x, "cellParser", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    }
  }
}
