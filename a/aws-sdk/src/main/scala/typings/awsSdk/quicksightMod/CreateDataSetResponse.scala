package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSetResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The ARN for the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
    */
  var IngestionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
    */
  var IngestionId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object CreateDataSetResponse {
  
  inline def apply(): CreateDataSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataSetResponse]
  }
  
  extension [Self <: CreateDataSetResponse](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDataSetId(value: ResourceId): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetIdUndefined: Self = StObject.set(x, "DataSetId", js.undefined)
    
    inline def setIngestionArn(value: Arn): Self = StObject.set(x, "IngestionArn", value.asInstanceOf[js.Any])
    
    inline def setIngestionArnUndefined: Self = StObject.set(x, "IngestionArn", js.undefined)
    
    inline def setIngestionId(value: ResourceId): Self = StObject.set(x, "IngestionId", value.asInstanceOf[js.Any])
    
    inline def setIngestionIdUndefined: Self = StObject.set(x, "IngestionId", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
