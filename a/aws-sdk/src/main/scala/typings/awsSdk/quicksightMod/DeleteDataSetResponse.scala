package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataSetResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DeleteDataSetResponse {
  
  @scala.inline
  def apply(): DeleteDataSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDataSetResponse]
  }
  
  @scala.inline
  implicit class DeleteDataSetResponseMutableBuilder[Self <: DeleteDataSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setDataSetId(value: ResourceId): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetIdUndefined: Self = StObject.set(x, "DataSetId", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
