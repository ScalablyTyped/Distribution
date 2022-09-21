package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkloadInput extends StObject {
  
  var ClientRequestToken: typings.awsSdk.wellarchitectedMod.ClientRequestToken
  
  var WorkloadId: typings.awsSdk.wellarchitectedMod.WorkloadId
}
object DeleteWorkloadInput {
  
  inline def apply(ClientRequestToken: ClientRequestToken, WorkloadId: WorkloadId): DeleteWorkloadInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkloadInput]
  }
  
  extension [Self <: DeleteWorkloadInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
