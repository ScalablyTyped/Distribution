package typings.csvStringify

import typings.csvStringify.anon.Date
import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.std.Error
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csv-stringify", JSImport.Namespace)
  @js.native
  def apply(): Stringifier = js.native
  @JSImport("csv-stringify", JSImport.Namespace)
  @js.native
  def apply(callback: Callback): Stringifier = js.native
  @JSImport("csv-stringify", JSImport.Namespace)
  @js.native
  def apply(input: Input): Stringifier = js.native
  @JSImport("csv-stringify", JSImport.Namespace)
  @js.native
  def apply(input: Input, callback: Callback): Stringifier = js.native
  @JSImport("csv-stringify", JSImport.Namespace)
  @js.native
  def apply(input: Input, options: js.UndefOr[scala.Nothing], callback: Callback): Stringifier = js.native
  @JSImport("csv-stringify", JSImport.Namespace)
  @js.native
  def apply(input: Input, options: Options): Stringifier = js.native
  @JSImport("csv-stringify", JSImport.Namespace)
  @js.native
  def apply(input: Input, options: Options, callback: Callback): Stringifier = js.native
  @JSImport("csv-stringify", JSImport.Namespace)
  @js.native
  def apply(options: Options): Stringifier = js.native
  @JSImport("csv-stringify", JSImport.Namespace)
  @js.native
  def apply(options: Options, callback: Callback): Stringifier = js.native
  
  @JSImport("csv-stringify", "Stringifier")
  @js.native
  class Stringifier protected () extends Transform {
    def this(options: Options) = this()
    
    val options: Options = js.native
  }
  
  type Callback = js.Function2[/* err */ js.UndefOr[Error], /* output */ String, Unit]
  
  type Cast[T] = js.Function2[/* value */ T, /* context */ CastingContext, String]
  
  @js.native
  trait CastingContext extends StObject {
    
    val column: js.UndefOr[Double | String] = js.native
    
    val header: Boolean = js.native
    
    val index: Double = js.native
    
    val records: Double = js.native
  }
  object CastingContext {
    
    @scala.inline
    def apply(header: Boolean, index: Double, records: Double): CastingContext = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CastingContext]
    }
    
    @scala.inline
    implicit class CastingContextMutableBuilder[Self <: CastingContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double | String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecords(value: Double): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ColumnOption extends StObject {
    
    var header: js.UndefOr[String] = js.native
    
    var key: String = js.native
  }
  object ColumnOption {
    
    @scala.inline
    def apply(key: String): ColumnOption = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnOption]
    }
    
    @scala.inline
    implicit class ColumnOptionMutableBuilder[Self <: ColumnOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type Input = js.Array[js.Any]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Prepend the byte order mark (BOM) to the output stream.
      */
    var bom: js.UndefOr[Boolean] = js.native
    
    /**
      * Key-value object which defines custom cast for certain data types
      */
    var cast: js.UndefOr[Date] = js.native
    
    /**
      * List of fields, applied when `transform` returns an object
      * order matters
      * read the transformer documentation for additionnal information
      * columns are auto discovered in the first record when the user write objects
      * can refer to nested properties of the input JSON
      * see the "header" option on how to print columns names on the first line
      */
    var columns: js.UndefOr[(js.Array[ColumnOption | String]) | PlainObject[String]] = js.native
    
    /**
      * Set the field delimiter, one character only, defaults to a comma.
      */
    var delimiter: js.UndefOr[String | Buffer] = js.native
    
    /**
      * Add the value of "options.RecordDelimiter" on the last line, default to true.
      */
    var eof: js.UndefOr[Boolean] = js.native
    
    /**
      * Defaults to the escape read option.
      */
    var escape: js.UndefOr[String | Buffer] = js.native
    
    /**
      * Display the column names on the first line if the columns option is provided or discovered.
      */
    var header: js.UndefOr[Boolean] = js.native
    
    /**
      * The quote characters, defaults to the ", an empty quote value will preserve the original field.
      */
    var quote: js.UndefOr[String | Buffer | Boolean] = js.native
    
    /**
      * Boolean, default to false, quote all the non-empty fields even if not required.
      */
    var quoted: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean, no default, quote empty fields and overrides `quoted_string` on empty strings when defined.
      */
    var quoted_empty: js.UndefOr[Boolean] = js.native
    
    /**
      * String or RegExp, no default, quote all fields matching a regular expression.
      */
    var quoted_match: js.UndefOr[String | RegExp] = js.native
    
    /**
      * Boolean, default to false, quote all fields of type string even if not required.
      */
    var quoted_string: js.UndefOr[Boolean] = js.native
    
    /**
      * String used to delimit record rows or a special value
      * special values are 'auto', 'unix', 'mac', 'windows', 'ascii', 'unicode'
      * defaults to 'auto' (discovered in source or 'unix' if no source is specified).
      */
    var record_delimiter: js.UndefOr[RecordDelimiter] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setCast(value: Date): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
      
      @scala.inline
      def setColumns(value: (js.Array[ColumnOption | String]) | PlainObject[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: (ColumnOption | String)*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setDelimiter(value: String | Buffer): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setEof(value: Boolean): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEofUndefined: Self = StObject.set(x, "eof", js.undefined)
      
      @scala.inline
      def setEscape(value: String | Buffer): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setQuote(value: String | Buffer | Boolean): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotedUndefined: Self = StObject.set(x, "quoted", js.undefined)
      
      @scala.inline
      def setQuoted_empty(value: Boolean): Self = StObject.set(x, "quoted_empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoted_emptyUndefined: Self = StObject.set(x, "quoted_empty", js.undefined)
      
      @scala.inline
      def setQuoted_match(value: String | RegExp): Self = StObject.set(x, "quoted_match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoted_matchUndefined: Self = StObject.set(x, "quoted_match", js.undefined)
      
      @scala.inline
      def setQuoted_string(value: Boolean): Self = StObject.set(x, "quoted_string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoted_stringUndefined: Self = StObject.set(x, "quoted_string", js.undefined)
      
      @scala.inline
      def setRecord_delimiter(value: RecordDelimiter): Self = StObject.set(x, "record_delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecord_delimiterUndefined: Self = StObject.set(x, "record_delimiter", js.undefined)
    }
  }
  
  type PlainObject[T] = Record[String, T]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
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
