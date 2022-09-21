package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecordOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Information about the product.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetail] = js.undefined
  
  /**
    * Information about the product created as the result of a request. For example, the output for a CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
    */
  var RecordOutputs: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordOutputs] = js.undefined
}
object DescribeRecordOutput {
  
  inline def apply(): DescribeRecordOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecordOutput]
  }
  
  extension [Self <: DescribeRecordOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setRecordDetail(value: RecordDetail): Self = StObject.set(x, "RecordDetail", value.asInstanceOf[js.Any])
    
    inline def setRecordDetailUndefined: Self = StObject.set(x, "RecordDetail", js.undefined)
    
    inline def setRecordOutputs(value: RecordOutputs): Self = StObject.set(x, "RecordOutputs", value.asInstanceOf[js.Any])
    
    inline def setRecordOutputsUndefined: Self = StObject.set(x, "RecordOutputs", js.undefined)
    
    inline def setRecordOutputsVarargs(value: RecordOutput*): Self = StObject.set(x, "RecordOutputs", js.Array(value*))
  }
}
