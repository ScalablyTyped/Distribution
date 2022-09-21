package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetRequest extends StObject {
  
  /**
    *  A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment generates one. 
    */
  var ClientToken: IdempotenceToken
  
  /**
    * The name of the dataset being created. 
    */
  var DatasetName: typings.awsSdk.lookoutequipmentMod.DatasetName
  
  /**
    * A JSON description of the data that is in each time series dataset, including names, column names, and data types. 
    */
  var DatasetSchema: js.UndefOr[typings.awsSdk.lookoutequipmentMod.DatasetSchema] = js.undefined
  
  /**
    * Provides the identifier of the KMS key used to encrypt dataset data by Amazon Lookout for Equipment. 
    */
  var ServerSideKmsKeyId: js.UndefOr[NameOrArn] = js.undefined
  
  /**
    * Any tags associated with the ingested data described in the dataset. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDatasetRequest {
  
  inline def apply(ClientToken: IdempotenceToken, DatasetName: DatasetName): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], DatasetName = DatasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  
  extension [Self <: CreateDatasetRequest](x: Self) {
    
    inline def setClientToken(value: IdempotenceToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetSchema(value: DatasetSchema): Self = StObject.set(x, "DatasetSchema", value.asInstanceOf[js.Any])
    
    inline def setDatasetSchemaUndefined: Self = StObject.set(x, "DatasetSchema", js.undefined)
    
    inline def setServerSideKmsKeyId(value: NameOrArn): Self = StObject.set(x, "ServerSideKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerSideKmsKeyIdUndefined: Self = StObject.set(x, "ServerSideKmsKeyId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
