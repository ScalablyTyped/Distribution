package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribedAgreement extends StObject {
  
  /**
    * With AS2, you can send files by calling StartFileTransfer and specifying the file paths in the request parameter, SendFilePaths. We use the file’s parent directory (for example, for --send-file-paths /bucket/dir/file.txt, parent directory is /bucket/dir/) to temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a final JSON file containing relevant metadata of the transmission. So, the AccessRole needs to provide read and write access to the parent directory of the file location used in the StartFileTransfer request. Additionally, you need to provide read and write access to the parent directory of the files that you intend to send with StartFileTransfer.
    */
  var AccessRole: js.UndefOr[Role] = js.undefined
  
  /**
    * A unique identifier for the agreement. This identifier is returned when you create an agreement.
    */
  var AgreementId: js.UndefOr[typings.awsSdk.clientsTransferMod.AgreementId] = js.undefined
  
  /**
    * The unique Amazon Resource Name (ARN) for the agreement.
    */
  var Arn: typings.awsSdk.clientsTransferMod.Arn
  
  /**
    * The landing directory (folder) for files that are transferred by using the AS2 protocol.
    */
  var BaseDirectory: js.UndefOr[HomeDirectory] = js.undefined
  
  /**
    * The name or short description that's used to identify the agreement.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsTransferMod.Description] = js.undefined
  
  /**
    * A unique identifier for the AS2 local profile.
    */
  var LocalProfileId: js.UndefOr[ProfileId] = js.undefined
  
  /**
    * A unique identifier for the partner profile used in the agreement.
    */
  var PartnerProfileId: js.UndefOr[ProfileId] = js.undefined
  
  /**
    * A system-assigned unique identifier for a server instance. This identifier indicates the specific server that the agreement uses.
    */
  var ServerId: js.UndefOr[typings.awsSdk.clientsTransferMod.ServerId] = js.undefined
  
  /**
    * The current status of the agreement, either ACTIVE or INACTIVE.
    */
  var Status: js.UndefOr[AgreementStatusType] = js.undefined
  
  /**
    * Key-value pairs that can be used to group and search for agreements.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsTransferMod.Tags] = js.undefined
}
object DescribedAgreement {
  
  inline def apply(Arn: Arn): DescribedAgreement = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedAgreement]
  }
  
  extension [Self <: DescribedAgreement](x: Self) {
    
    inline def setAccessRole(value: Role): Self = StObject.set(x, "AccessRole", value.asInstanceOf[js.Any])
    
    inline def setAccessRoleUndefined: Self = StObject.set(x, "AccessRole", js.undefined)
    
    inline def setAgreementId(value: AgreementId): Self = StObject.set(x, "AgreementId", value.asInstanceOf[js.Any])
    
    inline def setAgreementIdUndefined: Self = StObject.set(x, "AgreementId", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setBaseDirectory(value: HomeDirectory): Self = StObject.set(x, "BaseDirectory", value.asInstanceOf[js.Any])
    
    inline def setBaseDirectoryUndefined: Self = StObject.set(x, "BaseDirectory", js.undefined)
    
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
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
