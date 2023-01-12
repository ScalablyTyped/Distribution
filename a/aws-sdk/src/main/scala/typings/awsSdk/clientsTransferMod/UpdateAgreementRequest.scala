package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAgreementRequest extends StObject {
  
  /**
    * With AS2, you can send files by calling StartFileTransfer and specifying the file paths in the request parameter, SendFilePaths. We use the file’s parent directory (for example, for --send-file-paths /bucket/dir/file.txt, parent directory is /bucket/dir/) to temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a final JSON file containing relevant metadata of the transmission. So, the AccessRole needs to provide read and write access to the parent directory of the file location used in the StartFileTransfer request. Additionally, you need to provide read and write access to the parent directory of the files that you intend to send with StartFileTransfer.
    */
  var AccessRole: js.UndefOr[Role] = js.undefined
  
  /**
    * A unique identifier for the agreement. This identifier is returned when you create an agreement.
    */
  var AgreementId: typings.awsSdk.clientsTransferMod.AgreementId
  
  /**
    * To change the landing directory (folder) for files that are transferred, provide the bucket folder that you want to use; for example, /DOC-EXAMPLE-BUCKET/home/mydirectory .
    */
  var BaseDirectory: js.UndefOr[HomeDirectory] = js.undefined
  
  /**
    * To replace the existing description, provide a short description for the agreement. 
    */
  var Description: js.UndefOr[typings.awsSdk.clientsTransferMod.Description] = js.undefined
  
  /**
    * A unique identifier for the AS2 local profile. To change the local profile identifier, provide a new value here.
    */
  var LocalProfileId: js.UndefOr[ProfileId] = js.undefined
  
  /**
    * A unique identifier for the partner profile. To change the partner profile identifier, provide a new value here.
    */
  var PartnerProfileId: js.UndefOr[ProfileId] = js.undefined
  
  /**
    * A system-assigned unique identifier for a server instance. This is the specific server that the agreement uses.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
  
  /**
    * You can update the status for the agreement, either activating an inactive agreement or the reverse.
    */
  var Status: js.UndefOr[AgreementStatusType] = js.undefined
}
object UpdateAgreementRequest {
  
  inline def apply(AgreementId: AgreementId, ServerId: ServerId): UpdateAgreementRequest = {
    val __obj = js.Dynamic.literal(AgreementId = AgreementId.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgreementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAgreementRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessRole(value: Role): Self = StObject.set(x, "AccessRole", value.asInstanceOf[js.Any])
    
    inline def setAccessRoleUndefined: Self = StObject.set(x, "AccessRole", js.undefined)
    
    inline def setAgreementId(value: AgreementId): Self = StObject.set(x, "AgreementId", value.asInstanceOf[js.Any])
    
    inline def setBaseDirectory(value: HomeDirectory): Self = StObject.set(x, "BaseDirectory", value.asInstanceOf[js.Any])
    
    inline def setBaseDirectoryUndefined: Self = StObject.set(x, "BaseDirectory", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLocalProfileId(value: ProfileId): Self = StObject.set(x, "LocalProfileId", value.asInstanceOf[js.Any])
    
    inline def setLocalProfileIdUndefined: Self = StObject.set(x, "LocalProfileId", js.undefined)
    
    inline def setPartnerProfileId(value: ProfileId): Self = StObject.set(x, "PartnerProfileId", value.asInstanceOf[js.Any])
    
    inline def setPartnerProfileIdUndefined: Self = StObject.set(x, "PartnerProfileId", js.undefined)
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AgreementStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
