package typings.csvStringify

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csv-stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("csv-stringify", "Stringifier")
  @js.native
  open class Stringifier protected () extends Transform {
    def this(options: Options) = this()
    
    val options: Options = js.native
  }
  
  inline def stringify(): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[Stringifier]
  inline def stringify(callback: Callback): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(callback.asInstanceOf[js.Any]).asInstanceOf[Stringifier]
  inline def stringify(input: Input): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any]).asInstanceOf[Stringifier]
  inline def stringify(input: Input, callback: Callback): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  inline def stringify(input: Input, options: Unit, callback: Callback): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  inline def stringify(input: Input, options: Options): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  inline def stringify(input: Input, options: Options, callback: Callback): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  inline def stringify(options: Options): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(options.asInstanceOf[js.Any]).asInstanceOf[Stringifier]
  inline def stringify(options: Options, callback: Callback): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  
  type Callback = js.Function2[/* err */ js.UndefOr[js.Error], /* output */ String, Unit]
  
  type Cast[T] = js.Function2[/* value */ T, /* context */ CastingContext, String | CastReturnObject]
  
  /* Inlined {  value :string} & std.Pick<csv-stringify.csv-stringify.Options, 'delimiter' | 'escape' | 'quote' | 'quoted' | 'quoted_empty' | 'quoted_string' | 'quoted_match' | 'record_delimiter'> */
  trait CastReturnObject extends StObject {
    
    var delimiter: js.UndefOr[String | Buffer] = js.undefined
    
    var escape: js.UndefOr[String | Buffer] = js.undefined
    
    var quote: js.UndefOr[String | Buffer | Boolean] = js.undefined
    
    var quoted: js.UndefOr[Boolean] = js.undefined
    
    var quoted_empty: js.UndefOr[Boolean] = js.undefined
    
    var quoted_match: js.UndefOr[String | js.RegExp] = js.undefined
    
    var quoted_string: js.UndefOr[Boolean] = js.undefined
    
    var record_delimiter: js.UndefOr[RecordDelimiter] = js.undefined
    
    var value: String
  }
  object CastReturnObject {
    
    inline def apply(value: String): CastReturnObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CastReturnObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CastReturnObject] (val x: Self) extends AnyVal {
      
      inline def setDelimiter(value: String | Buffer): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setEscape(value: String | Buffer): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setQuote(value: String | Buffer | Boolean): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
      
      inline def setQuotedUndefined: Self = StObject.set(x, "quoted", js.undefined)
      
      inline def setQuoted_empty(value: Boolean): Self = StObject.set(x, "quoted_empty", value.asInstanceOf[js.Any])
      
      inline def setQuoted_emptyUndefined: Self = StObject.set(x, "quoted_empty", js.undefined)
      
      inline def setQuoted_match(value: String | js.RegExp): Self = StObject.set(x, "quoted_match", value.asInstanceOf[js.Any])
      
      inline def setQuoted_matchUndefined: Self = StObject.set(x, "quoted_match", js.undefined)
      
      inline def setQuoted_string(value: Boolean): Self = StObject.set(x, "quoted_string", value.asInstanceOf[js.Any])
      
      inline def setQuoted_stringUndefined: Self = StObject.set(x, "quoted_string", js.undefined)
      
      inline def setRecord_delimiter(value: RecordDelimiter): Self = StObject.set(x, "record_delimiter", value.asInstanceOf[js.Any])
      
      inline def setRecord_delimiterUndefined: Self = StObject.set(x, "record_delimiter", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CastingContext extends StObject {
    
    val column: js.UndefOr[Double | String] = js.undefined
    
    val header: Boolean
    
    val index: Double
    
    val records: Double
  }
  object CastingContext {
    
    inline def apply(header: Boolean, index: Double, records: Double): CastingContext = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CastingContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CastingContext] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double | String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setRecords(value: Double): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnOption extends StObject {
    
    var header: js.UndefOr[String] = js.undefined
    
    var key: String
  }
  object ColumnOption {
    
    inline def apply(key: String): ColumnOption = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnOption] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type Input = js.Array[Any]
  
  trait Options
    extends StObject
       with TransformOptions {
    
    /**
      * Prepend the byte order mark (BOM) to the output stream.
      */
    var bom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Key-value object which defines custom cast for certain data types
      */
    var cast: js.UndefOr[typings.csvStringify.anon.Boolean] = js.undefined
    
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
    var quoted_match: js.UndefOr[String | js.RegExp] = js.undefined
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      inline def setCast(value: typings.csvStringify.anon.Boolean): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      inline def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
      
      inline def setColumns(value: (js.Array[ColumnOption | String]) | PlainObject[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: (ColumnOption | String)*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDelimiter(value: String | Buffer): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setEof(value: Boolean): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
      
      inline def setEofUndefined: Self = StObject.set(x, "eof", js.undefined)
      
      inline def setEscape(value: String | Buffer): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setQuote(value: String | Buffer | Boolean): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
      
      inline def setQuotedUndefined: Self = StObject.set(x, "quoted", js.undefined)
      
      inline def setQuoted_empty(value: Boolean): Self = StObject.set(x, "quoted_empty", value.asInstanceOf[js.Any])
      
      inline def setQuoted_emptyUndefined: Self = StObject.set(x, "quoted_empty", js.undefined)
      
      inline def setQuoted_match(value: String | js.RegExp): Self = StObject.set(x, "quoted_match", value.asInstanceOf[js.Any])
      
      inline def setQuoted_matchUndefined: Self = StObject.set(x, "quoted_match", js.undefined)
      
      inline def setQuoted_string(value: Boolean): Self = StObject.set(x, "quoted_string", value.asInstanceOf[js.Any])
      
      inline def setQuoted_stringUndefined: Self = StObject.set(x, "quoted_string", js.undefined)
      
      inline def setRecord_delimiter(value: RecordDelimiter): Self = StObject.set(x, "record_delimiter", value.asInstanceOf[js.Any])
      
      inline def setRecord_delimiterUndefined: Self = StObject.set(x, "record_delimiter", js.undefined)
    }
  }
  
  type PlainObject[T] = Record[String, T]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.bufferMod.global.Buffer
    - typings.csvStringify.csvStringifyStrings.auto
    - typings.csvStringify.csvStringifyStrings.unix
    - typings.csvStringify.csvStringifyStrings.mac
    - typings.csvStringify.csvStringifyStrings.windows
    - typings.csvStringify.csvStringifyStrings.ascii
    - typings.csvStringify.csvStringifyStrings.unicode
  */
  type RecordDelimiter = _RecordDelimiter | String | Buffer
  
  trait _RecordDelimiter extends StObject
}
