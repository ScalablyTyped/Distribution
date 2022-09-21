package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDataIngestionJobRequest extends StObject {
  
  /**
    *  A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment generates one. 
    */
  var ClientToken: IdempotenceToken
  
  /**
    * The name of the dataset being used by the data ingestion job. 
    */
  var DatasetName: DatasetIdentifier
  
  /**
    *  Specifies information for the input data for the data ingestion job, including dataset S3 location. 
    */
  var IngestionInputConfiguration: typings.awsSdk.lookoutequipmentMod.IngestionInputConfiguration
  
  /**
    *  The Amazon Resource Name (ARN) of a role with permission to access the data source for the data ingestion job. 
    */
  var RoleArn: IamRoleArn
}
object StartDataIngestionJobRequest {
  
  inline def apply(
    ClientToken: IdempotenceToken,
    DatasetName: DatasetIdentifier,
    IngestionInputConfiguration: IngestionInputConfiguration,
    RoleArn: IamRoleArn
  ): StartDataIngestionJobRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], DatasetName = DatasetName.asInstanceOf[js.Any], IngestionInputConfiguration = IngestionInputConfiguration.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDataIngestionJobRequest]
  }
  
  extension [Self <: StartDataIngestionJobRequest](x: Self) {
    
    inline def setClientToken(value: IdempotenceToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDatasetName(value: DatasetIdentifier): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setIngestionInputConfiguration(value: IngestionInputConfiguration): Self = StObject.set(x, "IngestionInputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
