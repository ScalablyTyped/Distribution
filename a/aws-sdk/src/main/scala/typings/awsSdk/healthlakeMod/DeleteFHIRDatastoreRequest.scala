package typings.awsSdk.healthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFHIRDatastoreRequest extends StObject {
  
  /**
    *  The AWS-generated ID for the Data Store to be deleted.
    */
  var DatastoreId: js.UndefOr[typings.awsSdk.healthlakeMod.DatastoreId] = js.undefined
}
object DeleteFHIRDatastoreRequest {
  
  inline def apply(): DeleteFHIRDatastoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFHIRDatastoreRequest]
  }
  
  extension [Self <: DeleteFHIRDatastoreRequest](x: Self) {
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setDatastoreIdUndefined: Self = StObject.set(x, "DatastoreId", js.undefined)
  }
}
