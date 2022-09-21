package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * A list of grants that control access to the staged results.
    */
  var AccessControlList: js.UndefOr[AccessControlPolicyList] = js.undefined
  
  /**
    * The name of the Amazon S3 bucket where the job results are stored.
    */
  var BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The canned access control list (ACL) to apply to the job results.
    */
  var CannedACL: js.UndefOr[typings.awsSdk.glacierMod.CannedACL] = js.undefined
  
  /**
    * Contains information about the encryption used to store the job results in Amazon S3.
    */
  var Encryption: js.UndefOr[typings.awsSdk.glacierMod.Encryption] = js.undefined
  
  /**
    * The prefix that is prepended to the results for this request.
    */
  var Prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The storage class used to store the job results.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.glacierMod.StorageClass] = js.undefined
  
  /**
    * The tag-set that is applied to the job results.
    */
  var Tagging: js.UndefOr[hashmap] = js.undefined
  
  /**
    * A map of metadata to store with the job results in Amazon S3.
    */
  var UserMetadata: js.UndefOr[hashmap] = js.undefined
}
object S3Location {
  
  inline def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  
  extension [Self <: S3Location](x: Self) {
    
    inline def setAccessControlList(value: AccessControlPolicyList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
    
    inline def setAccessControlListVarargs(value: Grant*): Self = StObject.set(x, "AccessControlList", js.Array(value*))
    
    inline def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setCannedACL(value: CannedACL): Self = StObject.set(x, "CannedACL", value.asInstanceOf[js.Any])
    
    inline def setCannedACLUndefined: Self = StObject.set(x, "CannedACL", js.undefined)
    
    inline def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    inline def setTagging(value: hashmap): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
    
    inline def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
    
    inline def setUserMetadata(value: hashmap): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
    
    inline def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
  }
}
