package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedAgreement extends StObject {
  
  /**
    * A unique identifier for the agreement. This identifier is returned when you create an agreement.
    */
  var AgreementId: js.UndefOr[typings.awsSdk.clientsTransferMod.AgreementId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the specified agreement.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsTransferMod.Arn] = js.undefined
  
  /**
    * The current description for the agreement. You can change it by calling the UpdateAgreement operation and providing a new description. 
    */
  var Description: js.UndefOr[typings.awsSdk.clientsTransferMod.Description] = js.undefined
  
  /**
    * A unique identifier for the AS2 local profile.
    */
  var LocalProfileId: js.UndefOr[ProfileId] = js.undefined
  
  /**
    * A unique identifier for the partner profile.
    */
  var PartnerProfileId: js.UndefOr[ProfileId] = js.undefined
  
  /**
    * The unique identifier for the agreement.
    */
  var ServerId: js.UndefOr[typings.awsSdk.clientsTransferMod.ServerId] = js.undefined
  
  /**
    * The agreement can be either ACTIVE or INACTIVE.
    */
  var Status: js.UndefOr[AgreementStatusType] = js.undefined
}
object ListedAgreement {
  
  inline def apply(): ListedAgreement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListedAgreement]
  }
  
  extension [Self <: ListedAgreement](x: Self) {
    
    inline def setAgreementId(value: AgreementId): Self = StObject.set(x, "AgreementId", value.asInstanceOf[js.Any])
    
    inline def setAgreementIdUndefined: Self = StObject.set(x, "AgreementId", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLocalProfileId(value: ProfileId): Self = StObject.set(x, "LocalProfileId", value.asInstanceOf[js.Any])
    
    inline def setLocalProfileIdUndefined: Self = StObject.set(x, "LocalProfileId", js.undefined)
    
    inline def setPartnerProfileId(value: ProfileId): Self = StObject.set(x, "PartnerProfileId", value.asInstanceOf[js.Any])
    
    inline def setPartnerProfileIdUndefined: Self = StObject.set(x, "PartnerProfileId", js.undefined)
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setServerIdUndefined: Self = StObject.set(x, "ServerId", js.undefined)
    
    inline def setStatus(value: AgreementStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
