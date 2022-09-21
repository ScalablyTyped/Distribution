package typings.awsSdk.healthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFHIRDatastoreResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that gives Amazon HealthLake access permission.
    */
  var DatastoreArn: typings.awsSdk.healthlakeMod.DatastoreArn
  
  /**
    * The AWS endpoint for the Data Store the user has requested to be deleted.
    */
  var DatastoreEndpoint: BoundedLengthString
  
  /**
    * The AWS-generated ID for the Data Store to be deleted.
    */
  var DatastoreId: typings.awsSdk.healthlakeMod.DatastoreId
  
  /**
    * The status of the Data Store that the user has requested to be deleted. 
    */
  var DatastoreStatus: typings.awsSdk.healthlakeMod.DatastoreStatus
}
object DeleteFHIRDatastoreResponse {
  
  inline def apply(
    DatastoreArn: DatastoreArn,
    DatastoreEndpoint: BoundedLengthString,
    DatastoreId: DatastoreId,
    DatastoreStatus: DatastoreStatus
  ): DeleteFHIRDatastoreResponse = {
    val __obj = js.Dynamic.literal(DatastoreArn = DatastoreArn.asInstanceOf[js.Any], DatastoreEndpoint = DatastoreEndpoint.asInstanceOf[js.Any], DatastoreId = DatastoreId.asInstanceOf[js.Any], DatastoreStatus = DatastoreStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFHIRDatastoreResponse]
  }
  
  extension [Self <: DeleteFHIRDatastoreResponse](x: Self) {
    
    inline def setDatastoreArn(value: DatastoreArn): Self = StObject.set(x, "DatastoreArn", value.asInstanceOf[js.Any])
    
    inline def setDatastoreEndpoint(value: BoundedLengthString): Self = StObject.set(x, "DatastoreEndpoint", value.asInstanceOf[js.Any])
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setDatastoreStatus(value: DatastoreStatus): Self = StObject.set(x, "DatastoreStatus", value.asInstanceOf[js.Any])
  }
}
