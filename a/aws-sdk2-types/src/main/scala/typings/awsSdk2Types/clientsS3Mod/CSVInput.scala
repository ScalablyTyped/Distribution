package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSVInput extends StObject {
  
  /**
    * Specifies that CSV field values may contain quoted record delimiters and such records should be allowed. Default value is FALSE. Setting this value to TRUE may lower performance.
    */
  var AllowQuotedRecordDelimiter: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.AllowQuotedRecordDelimiter] = js.undefined
  
  /**
    * A single character used to indicate that a row should be ignored when the character is present at the start of that row. You can specify any character to indicate a comment line.
    */
  var Comments: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Comments] = js.undefined
  
  /**
    * A single character used to separate individual fields in a record. You can specify an arbitrary delimiter.
    */
  var FieldDelimiter: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.FieldDelimiter] = js.undefined
  
  /**
    * Describes the first line of input. Valid values are:    NONE: First line is not a header.    IGNORE: First line is a header, but you can't use the header values to indicate the column in an expression. You can use column position (such as _1, _2, …) to indicate the column (SELECT s._1 FROM OBJECT s).    Use: First line is a header, and you can use the header value to identify a column in an expression (SELECT "name" FROM OBJECT).   
    */
  var FileHeaderInfo: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.FileHeaderInfo] = js.undefined
  
  /**
    * A single character used for escaping when the field delimiter is part of the value. For example, if the value is a, b, Amazon S3 wraps this field value in quotation marks, as follows: " a , b ". Type: String Default: "  Ancestors: CSV 
    */
  var QuoteCharacter: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.QuoteCharacter] = js.undefined
  
  /**
    * A single character used for escaping the quotation mark character inside an already escaped value. For example, the value """ a , b """ is parsed as " a , b ".
    */
  var QuoteEscapeCharacter: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.QuoteEscapeCharacter] = js.undefined
  
  /**
    * A single character used to separate individual records in the input. Instead of the default value, you can specify an arbitrary delimiter.
    */
  var RecordDelimiter: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.RecordDelimiter] = js.undefined
}
object CSVInput {
  
  inline def apply(): CSVInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSVInput] (val x: Self) extends AnyVal {
    
    inline def setAllowQuotedRecordDelimiter(value: AllowQuotedRecordDelimiter): Self = StObject.set(x, "AllowQuotedRecordDelimiter", value.asInstanceOf[js.Any])
    
    inline def setAllowQuotedRecordDelimiterUndefined: Self = StObject.set(x, "AllowQuotedRecordDelimiter", js.undefined)
    
    inline def setComments(value: Comments): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
    
    inline def setFieldDelimiter(value: FieldDelimiter): Self = StObject.set(x, "FieldDelimiter", value.asInstanceOf[js.Any])
    
    inline def setFieldDelimiterUndefined: Self = StObject.set(x, "FieldDelimiter", js.undefined)
    
    inline def setFileHeaderInfo(value: FileHeaderInfo): Self = StObject.set(x, "FileHeaderInfo", value.asInstanceOf[js.Any])
    
    inline def setFileHeaderInfoUndefined: Self = StObject.set(x, "FileHeaderInfo", js.undefined)
    
    inline def setQuoteCharacter(value: QuoteCharacter): Self = StObject.set(x, "QuoteCharacter", value.asInstanceOf[js.Any])
    
    inline def setQuoteCharacterUndefined: Self = StObject.set(x, "QuoteCharacter", js.undefined)
    
    inline def setQuoteEscapeCharacter(value: QuoteEscapeCharacter): Self = StObject.set(x, "QuoteEscapeCharacter", value.asInstanceOf[js.Any])
    
    inline def setQuoteEscapeCharacterUndefined: Self = StObject.set(x, "QuoteEscapeCharacter", js.undefined)
    
    inline def setRecordDelimiter(value: RecordDelimiter): Self = StObject.set(x, "RecordDelimiter", value.asInstanceOf[js.Any])
    
    inline def setRecordDelimiterUndefined: Self = StObject.set(x, "RecordDelimiter", js.undefined)
  }
}
