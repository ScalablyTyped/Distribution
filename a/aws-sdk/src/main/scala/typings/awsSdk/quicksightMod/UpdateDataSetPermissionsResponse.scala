package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataSetPermissionsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DataSetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID for the dataset whose permissions you want to update. This ID is unique per AWS Region for each AWS account.
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
object UpdateDataSetPermissionsResponse {
  
  inline def apply(): UpdateDataSetPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDataSetPermissionsResponse]
  }
  
  extension [Self <: UpdateDataSetPermissionsResponse](x: Self) {
    
    inline def setDataSetArn(value: Arn): Self = StObject.set(x, "DataSetArn", value.asInstanceOf[js.Any])
    
    inline def setDataSetArnUndefined: Self = StObject.set(x, "DataSetArn", js.undefined)
    
    inline def setDataSetId(value: ResourceId): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetIdUndefined: Self = StObject.set(x, "DataSetId", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
