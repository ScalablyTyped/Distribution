package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIngestionRequest extends StObject {
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The ID of the dataset used in the ingestion.
    */
  var DataSetId: java.lang.String
  
  /**
    * An ID for the ingestion.
    */
  var IngestionId: typings.awsSdk.quicksightMod.IngestionId
}
object CreateIngestionRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSetId: java.lang.String, IngestionId: IngestionId): CreateIngestionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], IngestionId = IngestionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIngestionRequest]
  }
  
  @scala.inline
  implicit class CreateIngestionRequestMutableBuilder[Self <: CreateIngestionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetId(value: java.lang.String): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionId(value: IngestionId): Self = StObject.set(x, "IngestionId", value.asInstanceOf[js.Any])
  }
}
