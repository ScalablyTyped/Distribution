package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.IGNORE
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NONE
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.USE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCsvinputMod {
  
  trait CSVInput extends StObject {
    
    /**
      * <p>Specifies that CSV field values may contain quoted record delimiters and such records should be allowed. Default value is FALSE. Setting this value to TRUE may lower performance.</p>
      */
    var AllowQuotedRecordDelimiter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>Single character used to indicate a row should be ignored when present at the start of a row.</p>
      */
    var Comments: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Value used to separate individual fields in a record.</p>
      */
    var FieldDelimiter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Describes the first line of input. Valid values: None, Ignore, Use.</p>
      */
    var FileHeaderInfo: js.UndefOr[USE | IGNORE | NONE | String] = js.undefined
    
    /**
      * <p>Value used for escaping where the field delimiter is part of the value.</p>
      */
    var QuoteCharacter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Single character used for escaping the quote character inside an already escaped value.</p>
      */
    var QuoteEscapeCharacter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Value used to separate individual records.</p>
      */
    var RecordDelimiter: js.UndefOr[String] = js.undefined
  }
  object CSVInput {
    
    inline def apply(): CSVInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSVInput]
    }
    
    extension [Self <: CSVInput](x: Self) {
      
      inline def setAllowQuotedRecordDelimiter(value: Boolean): Self = StObject.set(x, "AllowQuotedRecordDelimiter", value.asInstanceOf[js.Any])
      
      inline def setAllowQuotedRecordDelimiterUndefined: Self = StObject.set(x, "AllowQuotedRecordDelimiter", js.undefined)
      
      inline def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
      
      inline def setFieldDelimiter(value: String): Self = StObject.set(x, "FieldDelimiter", value.asInstanceOf[js.Any])
      
      inline def setFieldDelimiterUndefined: Self = StObject.set(x, "FieldDelimiter", js.undefined)
      
      inline def setFileHeaderInfo(value: USE | IGNORE | NONE | String): Self = StObject.set(x, "FileHeaderInfo", value.asInstanceOf[js.Any])
      
      inline def setFileHeaderInfoUndefined: Self = StObject.set(x, "FileHeaderInfo", js.undefined)
      
      inline def setQuoteCharacter(value: String): Self = StObject.set(x, "QuoteCharacter", value.asInstanceOf[js.Any])
      
      inline def setQuoteCharacterUndefined: Self = StObject.set(x, "QuoteCharacter", js.undefined)
      
      inline def setQuoteEscapeCharacter(value: String): Self = StObject.set(x, "QuoteEscapeCharacter", value.asInstanceOf[js.Any])
      
      inline def setQuoteEscapeCharacterUndefined: Self = StObject.set(x, "QuoteEscapeCharacter", js.undefined)
      
      inline def setRecordDelimiter(value: String): Self = StObject.set(x, "RecordDelimiter", value.asInstanceOf[js.Any])
      
      inline def setRecordDelimiterUndefined: Self = StObject.set(x, "RecordDelimiter", js.undefined)
    }
  }
  
  type UnmarshalledCSVInput = CSVInput
}
