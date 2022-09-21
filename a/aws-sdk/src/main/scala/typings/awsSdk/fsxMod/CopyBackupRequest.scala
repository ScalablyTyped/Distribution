package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyBackupRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  /**
    * A Boolean flag indicating whether tags from the source backup should be copied to the backup copy. This value defaults to false. If you set CopyTags to true and the source backup has existing tags, you can use the Tags parameter to create new tags, provided that the sum of the source backup tags and the new tags doesn't exceed 50. Both sets of tags are merged. If there are tag conflicts (for example, two tags with the same key but different values), the tags created with the Tags parameter take precedence.
    */
  var CopyTags: js.UndefOr[Flag] = js.undefined
  
  var KmsKeyId: js.UndefOr[typings.awsSdk.fsxMod.KmsKeyId] = js.undefined
  
  /**
    * The ID of the source backup. Specifies the ID of the backup that's being copied.
    */
  var SourceBackupId: typings.awsSdk.fsxMod.SourceBackupId
  
  /**
    * The source Amazon Web Services Region of the backup. Specifies the Amazon Web Services Region from which the backup is being copied. The source and destination Regions must be in the same Amazon Web Services partition. If you don't specify a Region, SourceRegion defaults to the Region where the request is sent from (in-Region copy).
    */
  var SourceRegion: js.UndefOr[Region] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.undefined
}
object CopyBackupRequest {
  
  inline def apply(SourceBackupId: SourceBackupId): CopyBackupRequest = {
    val __obj = js.Dynamic.literal(SourceBackupId = SourceBackupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyBackupRequest]
  }
  
  extension [Self <: CopyBackupRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setCopyTags(value: Flag): Self = StObject.set(x, "CopyTags", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsUndefined: Self = StObject.set(x, "CopyTags", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setSourceBackupId(value: SourceBackupId): Self = StObject.set(x, "SourceBackupId", value.asInstanceOf[js.Any])
    
    inline def setSourceRegion(value: Region): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    inline def setSourceRegionUndefined: Self = StObject.set(x, "SourceRegion", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
