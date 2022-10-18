package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMilestoneInput extends StObject {
  
  var ClientRequestToken: typings.awsSdk.clientsWellarchitectedMod.ClientRequestToken
  
  var MilestoneName: typings.awsSdk.clientsWellarchitectedMod.MilestoneName
  
  var WorkloadId: typings.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object CreateMilestoneInput {
  
  inline def apply(ClientRequestToken: ClientRequestToken, MilestoneName: MilestoneName, WorkloadId: WorkloadId): CreateMilestoneInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], MilestoneName = MilestoneName.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMilestoneInput]
  }
  
  extension [Self <: CreateMilestoneInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setMilestoneName(value: MilestoneName): Self = StObject.set(x, "MilestoneName", value.asInstanceOf[js.Any])
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
