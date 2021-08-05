package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ALWAYS
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ASNEEDED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCsvoutputMod {
  
  trait CSVOutput extends StObject {
    
    /**
      * <p>Value used to separate individual fields in a record.</p>
      */
    var FieldDelimiter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Value used for escaping where the field delimiter is part of the value.</p>
      */
    var QuoteCharacter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Single character used for escaping the quote character inside an already escaped value.</p>
      */
    var QuoteEscapeCharacter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Indicates whether or not all output fields should be quoted.</p>
      */
    var QuoteFields: js.UndefOr[ALWAYS | ASNEEDED | String] = js.undefined
    
    /**
      * <p>Value used to separate individual records.</p>
      */
    var RecordDelimiter: js.UndefOr[String] = js.undefined
  }
  object CSVOutput {
    
    inline def apply(): CSVOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSVOutput]
    }
    
    extension [Self <: CSVOutput](x: Self) {
      
      inline def setFieldDelimiter(value: String): Self = StObject.set(x, "FieldDelimiter", value.asInstanceOf[js.Any])
      
      inline def setFieldDelimiterUndefined: Self = StObject.set(x, "FieldDelimiter", js.undefined)
      
      inline def setQuoteCharacter(value: String): Self = StObject.set(x, "QuoteCharacter", value.asInstanceOf[js.Any])
      
      inline def setQuoteCharacterUndefined: Self = StObject.set(x, "QuoteCharacter", js.undefined)
      
      inline def setQuoteEscapeCharacter(value: String): Self = StObject.set(x, "QuoteEscapeCharacter", value.asInstanceOf[js.Any])
      
      inline def setQuoteEscapeCharacterUndefined: Self = StObject.set(x, "QuoteEscapeCharacter", js.undefined)
      
      inline def setQuoteFields(value: ALWAYS | ASNEEDED | String): Self = StObject.set(x, "QuoteFields", value.asInstanceOf[js.Any])
      
      inline def setQuoteFieldsUndefined: Self = StObject.set(x, "QuoteFields", js.undefined)
      
      inline def setRecordDelimiter(value: String): Self = StObject.set(x, "RecordDelimiter", value.asInstanceOf[js.Any])
      
      inline def setRecordDelimiterUndefined: Self = StObject.set(x, "RecordDelimiter", js.undefined)
    }
  }
  
  type UnmarshalledCSVOutput = CSVOutput
}
