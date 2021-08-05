package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesJsonoutputMod {
  
  trait JSONOutput extends StObject {
    
    /**
      * <p>The value used to separate individual records in the output.</p>
      */
    var RecordDelimiter: js.UndefOr[String] = js.undefined
  }
  object JSONOutput {
    
    inline def apply(): JSONOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONOutput]
    }
    
    extension [Self <: JSONOutput](x: Self) {
      
      inline def setRecordDelimiter(value: String): Self = StObject.set(x, "RecordDelimiter", value.asInstanceOf[js.Any])
      
      inline def setRecordDelimiterUndefined: Self = StObject.set(x, "RecordDelimiter", js.undefined)
    }
  }
  
  type UnmarshalledJSONOutput = JSONOutput
}
