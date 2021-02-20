package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Location extends StObject {
  
  /**
    * A list of grants that control access to the staged results.
    */
  var AccessControlList: js.UndefOr[Grants] = js.native
  
  /**
    * The name of the bucket where the restore results will be placed.
    */
  var BucketName: typings.awsSdk.s3Mod.BucketName = js.native
  
  /**
    * The canned ACL to apply to the restore results.
    */
  var CannedACL: js.UndefOr[ObjectCannedACL] = js.native
  
  var Encryption: js.UndefOr[typings.awsSdk.s3Mod.Encryption] = js.native
  
  /**
    * The prefix that is prepended to the restore results for this request.
    */
  var Prefix: LocationPrefix = js.native
  
  /**
    * The class of storage used to store the restore results.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.s3Mod.StorageClass] = js.native
  
  /**
    * The tag-set that is applied to the restore results.
    */
  var Tagging: js.UndefOr[typings.awsSdk.s3Mod.Tagging] = js.native
  
  /**
    * A list of metadata to store with the restore results in S3.
    */
  var UserMetadata: js.UndefOr[typings.awsSdk.s3Mod.UserMetadata] = js.native
}
object S3Location {
  
  @scala.inline
  def apply(BucketName: BucketName, Prefix: LocationPrefix): S3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
  
  @scala.inline
  implicit class S3LocationMutableBuilder[Self <: S3Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlList(value: Grants): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
    
    @scala.inline
    def setAccessControlListVarargs(value: Grant*): Self = StObject.set(x, "AccessControlList", js.Array(value :_*))
    
    @scala.inline
    def setBucketName(value: BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCannedACL(value: ObjectCannedACL): Self = StObject.set(x, "CannedACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCannedACLUndefined: Self = StObject.set(x, "CannedACL", js.undefined)
    
    @scala.inline
    def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setPrefix(value: LocationPrefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    @scala.inline
    def setTagging(value: Tagging): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
    
    @scala.inline
    def setUserMetadata(value: UserMetadata): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
    
    @scala.inline
    def setUserMetadataVarargs(value: MetadataEntry*): Self = StObject.set(x, "UserMetadata", js.Array(value :_*))
  }
}
