package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRecordOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * Information about the product.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetail] = js.native
  
  /**
    * Information about the product created as the result of a request. For example, the output for a CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
    */
  var RecordOutputs: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordOutputs] = js.native
}
object DescribeRecordOutput {
  
  @scala.inline
  def apply(): DescribeRecordOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecordOutput]
  }
  
  @scala.inline
  implicit class DescribeRecordOutputMutableBuilder[Self <: DescribeRecordOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setRecordDetail(value: RecordDetail): Self = StObject.set(x, "RecordDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordDetailUndefined: Self = StObject.set(x, "RecordDetail", js.undefined)
    
    @scala.inline
    def setRecordOutputs(value: RecordOutputs): Self = StObject.set(x, "RecordOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordOutputsUndefined: Self = StObject.set(x, "RecordOutputs", js.undefined)
    
    @scala.inline
    def setRecordOutputsVarargs(value: RecordOutput*): Self = StObject.set(x, "RecordOutputs", js.Array(value :_*))
  }
}
