package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvOptions extends StObject {
  
  /**
    *  The delimiter used for separating items in the CSV file being imported. 
    */
  var Delimiter: js.UndefOr[CsvDelimiter] = js.undefined
  
  /**
    *  List of the headers used to specify a common header for all source CSV files being imported. If this field is specified then the first line of each CSV file is treated as data instead of the header. If this field is not specified the the first line of each CSV file is treated as the header. 
    */
  var HeaderList: js.UndefOr[CsvHeaderList] = js.undefined
}
object CsvOptions {
  
  inline def apply(): CsvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CsvOptions] (val x: Self) extends AnyVal {
    
    inline def setDelimiter(value: CsvDelimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setHeaderList(value: CsvHeaderList): Self = StObject.set(x, "HeaderList", value.asInstanceOf[js.Any])
    
    inline def setHeaderListUndefined: Self = StObject.set(x, "HeaderList", js.undefined)
    
    inline def setHeaderListVarargs(value: CsvHeader*): Self = StObject.set(x, "HeaderList", js.Array(value*))
  }
}
