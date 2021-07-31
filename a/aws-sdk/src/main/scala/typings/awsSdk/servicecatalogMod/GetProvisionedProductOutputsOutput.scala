package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProvisionedProductOutputsOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Information about the product created as the result of a request. For example, the output for a CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL. 
    */
  var Outputs: js.UndefOr[RecordOutputs] = js.undefined
}
object GetProvisionedProductOutputsOutput {
  
  @scala.inline
  def apply(): GetProvisionedProductOutputsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProvisionedProductOutputsOutput]
  }
  
  @scala.inline
  implicit class GetProvisionedProductOutputsOutputMutableBuilder[Self <: GetProvisionedProductOutputsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setOutputs(value: RecordOutputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: RecordOutput*): Self = StObject.set(x, "Outputs", js.Array(value :_*))
  }
}
