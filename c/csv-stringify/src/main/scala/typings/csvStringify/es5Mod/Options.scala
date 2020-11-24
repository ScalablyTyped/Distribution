package typings.csvStringify.es5Mod

import typings.node.Buffer
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Prepend the byte order mark (BOM) to the output stream.
    */
  var bom: js.UndefOr[Boolean] = js.native
  
  /**
    * Key-value object which defines custom cast for certain data types
    */
  var cast: js.UndefOr[typings.csvStringify.anon.Boolean] = js.native
  
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
    def setBom(value: Boolean): Self = this.set("bom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBom: Self = this.set("bom", js.undefined)
    
    @scala.inline
    def setCast(value: typings.csvStringify.anon.Boolean): Self = this.set("cast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCast: Self = this.set("cast", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (ColumnOption | String)*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: (js.Array[ColumnOption | String]) | PlainObject[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String | Buffer): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setEof(value: Boolean): Self = this.set("eof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEof: Self = this.set("eof", js.undefined)
    
    @scala.inline
    def setEscape(value: String | Buffer): Self = this.set("escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setQuote(value: String | Buffer | Boolean): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setQuoted(value: Boolean): Self = this.set("quoted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoted: Self = this.set("quoted", js.undefined)
    
    @scala.inline
    def setQuoted_empty(value: Boolean): Self = this.set("quoted_empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoted_empty: Self = this.set("quoted_empty", js.undefined)
    
    @scala.inline
    def setQuoted_match(value: String | RegExp): Self = this.set("quoted_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoted_match: Self = this.set("quoted_match", js.undefined)
    
    @scala.inline
    def setQuoted_string(value: Boolean): Self = this.set("quoted_string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoted_string: Self = this.set("quoted_string", js.undefined)
    
    @scala.inline
    def setRecord_delimiter(value: RecordDelimiter): Self = this.set("record_delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecord_delimiter: Self = this.set("record_delimiter", js.undefined)
  }
}
