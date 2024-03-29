package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeLensReviewInput extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ClientRequestToken] = js.undefined
  
  var LensAlias: typings.awsSdk.clientsWellarchitectedMod.LensAlias
  
  var MilestoneName: typings.awsSdk.clientsWellarchitectedMod.MilestoneName
  
  var WorkloadId: typings.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object UpgradeLensReviewInput {
  
  inline def apply(LensAlias: LensAlias, MilestoneName: MilestoneName, WorkloadId: WorkloadId): UpgradeLensReviewInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any], MilestoneName = MilestoneName.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeLensReviewInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpgradeLensReviewInput] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setMilestoneName(value: MilestoneName): Self = StObject.set(x, "MilestoneName", value.asInstanceOf[js.Any])
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
