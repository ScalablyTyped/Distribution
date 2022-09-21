package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAgreementRequest extends StObject {
  
  /**
    * With AS2, you can send files by calling StartFileTransfer and specifying the file paths in the request parameter, SendFilePaths. We use the file’s parent directory (for example, for --send-file-paths /bucket/dir/file.txt, parent directory is /bucket/dir/) to temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a final JSON file containing relevant metadata of the transmission. So, the AccessRole needs to provide read and write access to the parent directory of the file location used in the StartFileTransfer request. Additionally, you need to provide read and write access to the parent directory of the files that you intend to send with StartFileTransfer.
    */
  var AccessRole: Role
  
  /**
    * The landing directory (folder) for files transferred by using the AS2 protocol. A BaseDirectory example is /DOC-EXAMPLE-BUCKET/home/mydirectory .
    */
  var BaseDirectory: HomeDirectory
  
  /**
    * A name or short description to identify the agreement. 
    */
  var Description: js.UndefOr[typings.awsSdk.transferMod.Description] = js.undefined
  
  /**
    * A unique identifier for the AS2 local profile.
    */
  var LocalProfileId: ProfileId
  
  /**
    * A unique identifier for the partner profile used in the agreement.
    */
  var PartnerProfileId: ProfileId
  
  /**
    * A system-assigned unique identifier for a server instance. This is the specific server that the agreement uses.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
  
  /**
    * The status of the agreement. The agreement can be either ACTIVE or INACTIVE.
    */
  var Status: js.UndefOr[AgreementStatusType] = js.undefined
  
  /**
    * Key-value pairs that can be used to group and search for agreements.
    */
  var Tags: js.UndefOr[typings.awsSdk.transferMod.Tags] = js.undefined
}
object CreateAgreementRequest {
  
  inline def apply(
    AccessRole: Role,
    BaseDirectory: HomeDirectory,
    LocalProfileId: ProfileId,
    PartnerProfileId: ProfileId,
    ServerId: ServerId
  ): CreateAgreementRequest = {
    val __obj = js.Dynamic.literal(AccessRole = AccessRole.asInstanceOf[js.Any], BaseDirectory = BaseDirectory.asInstanceOf[js.Any], LocalProfileId = LocalProfileId.asInstanceOf[js.Any], PartnerProfileId = PartnerProfileId.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgreementRequest]
  }
  
  extension [Self <: CreateAgreementRequest](x: Self) {
    
    inline def setAccessRole(value: Role): Self = StObject.set(x, "AccessRole", value.asInstanceOf[js.Any])
    
    inline def setBaseDirectory(value: HomeDirectory): Self = StObject.set(x, "BaseDirectory", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLocalProfileId(value: ProfileId): Self = StObject.set(x, "LocalProfileId", value.asInstanceOf[js.Any])
    
    inline def setPartnerProfileId(value: ProfileId): Self = StObject.set(x, "PartnerProfileId", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AgreementStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
