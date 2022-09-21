package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataSetResponse extends StObject {
  
  /**
    * Information on the dataset.
    */
  var DataSet: js.UndefOr[typings.awsSdk.quicksightMod.DataSet] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeDataSetResponse {
  
  inline def apply(): DescribeDataSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSetResponse]
  }
  
  extension [Self <: DescribeDataSetResponse](x: Self) {
    
    inline def setDataSet(value: DataSet): Self = StObject.set(x, "DataSet", value.asInstanceOf[js.Any])
    
    inline def setDataSetUndefined: Self = StObject.set(x, "DataSet", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
