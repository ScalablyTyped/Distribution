package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedInstancesModification extends StObject {
  
  /**
    * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the modification request was created.
    */
  var CreateDate: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The time for the modification to become effective.
    */
  var EffectiveDate: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Contains target configurations along with their corresponding new Reserved Instance IDs.
    */
  var ModificationResults: js.UndefOr[ReservedInstancesModificationResultList] = js.undefined
  
  /**
    * The IDs of one or more Reserved Instances.
    */
  var ReservedInstancesIds: js.UndefOr[ReservedIntancesIds] = js.undefined
  
  /**
    * A unique ID for the Reserved Instance modification.
    */
  var ReservedInstancesModificationId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the Reserved Instances modification request.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The reason for the status.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the modification request was last updated.
    */
  var UpdateDate: js.UndefOr[DateTime] = js.undefined
}
object ReservedInstancesModification {
  
  inline def apply(): ReservedInstancesModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesModification]
  }
  
  extension [Self <: ReservedInstancesModification](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCreateDate(value: DateTime): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setEffectiveDate(value: DateTime): Self = StObject.set(x, "EffectiveDate", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateUndefined: Self = StObject.set(x, "EffectiveDate", js.undefined)
    
    inline def setModificationResults(value: ReservedInstancesModificationResultList): Self = StObject.set(x, "ModificationResults", value.asInstanceOf[js.Any])
    
    inline def setModificationResultsUndefined: Self = StObject.set(x, "ModificationResults", js.undefined)
    
    inline def setModificationResultsVarargs(value: ReservedInstancesModificationResult*): Self = StObject.set(x, "ModificationResults", js.Array(value :_*))
    
    inline def setReservedInstancesIds(value: ReservedIntancesIds): Self = StObject.set(x, "ReservedInstancesIds", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesIdsUndefined: Self = StObject.set(x, "ReservedInstancesIds", js.undefined)
    
    inline def setReservedInstancesIdsVarargs(value: ReservedInstancesId*): Self = StObject.set(x, "ReservedInstancesIds", js.Array(value :_*))
    
    inline def setReservedInstancesModificationId(value: String): Self = StObject.set(x, "ReservedInstancesModificationId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesModificationIdUndefined: Self = StObject.set(x, "ReservedInstancesModificationId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdateDate(value: DateTime): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateUndefined: Self = StObject.set(x, "UpdateDate", js.undefined)
  }
}
