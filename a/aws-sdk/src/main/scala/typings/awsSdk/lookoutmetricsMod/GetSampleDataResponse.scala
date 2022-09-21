package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSampleDataResponse extends StObject {
  
  /**
    * A list of header labels for the records.
    */
  var HeaderValues: js.UndefOr[HeaderValueList] = js.undefined
  
  /**
    * A list of records.
    */
  var SampleRows: js.UndefOr[typings.awsSdk.lookoutmetricsMod.SampleRows] = js.undefined
}
object GetSampleDataResponse {
  
  inline def apply(): GetSampleDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSampleDataResponse]
  }
  
  extension [Self <: GetSampleDataResponse](x: Self) {
    
    inline def setHeaderValues(value: HeaderValueList): Self = StObject.set(x, "HeaderValues", value.asInstanceOf[js.Any])
    
    inline def setHeaderValuesUndefined: Self = StObject.set(x, "HeaderValues", js.undefined)
    
    inline def setHeaderValuesVarargs(value: HeaderValue*): Self = StObject.set(x, "HeaderValues", js.Array(value*))
    
    inline def setSampleRows(value: SampleRows): Self = StObject.set(x, "SampleRows", value.asInstanceOf[js.Any])
    
    inline def setSampleRowsUndefined: Self = StObject.set(x, "SampleRows", js.undefined)
    
    inline def setSampleRowsVarargs(value: SampleRow*): Self = StObject.set(x, "SampleRows", js.Array(value*))
  }
}
