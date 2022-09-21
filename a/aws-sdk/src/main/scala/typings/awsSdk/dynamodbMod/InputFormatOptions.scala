package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputFormatOptions extends StObject {
  
  /**
    *  The options for imported source files in CSV format. The values are Delimiter and HeaderList. 
    */
  var Csv: js.UndefOr[CsvOptions] = js.undefined
}
object InputFormatOptions {
  
  inline def apply(): InputFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputFormatOptions]
  }
  
  extension [Self <: InputFormatOptions](x: Self) {
    
    inline def setCsv(value: CsvOptions): Self = StObject.set(x, "Csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "Csv", js.undefined)
  }
}
