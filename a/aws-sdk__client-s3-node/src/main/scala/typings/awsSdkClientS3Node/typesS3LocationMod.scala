package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`authenticated-read`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`aws-exec-read`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`bucket-owner-full-control`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`bucket-owner-read`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`private`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`public-read-write`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`public-read`
import typings.awsSdkClientS3Node.typesEncryptionMod.Encryption
import typings.awsSdkClientS3Node.typesEncryptionMod.UnmarshalledEncryption
import typings.awsSdkClientS3Node.typesGrantMod.Grant
import typings.awsSdkClientS3Node.typesGrantMod.UnmarshalledGrant
import typings.awsSdkClientS3Node.typesMetadataEntryMod.MetadataEntry
import typings.awsSdkClientS3Node.typesMetadataEntryMod.UnmarshalledMetadataEntry
import typings.awsSdkClientS3Node.typesTaggingMod.Tagging
import typings.awsSdkClientS3Node.typesTaggingMod.UnmarshalledTagging
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesS3LocationMod {
  
  trait S3Location extends StObject {
    
    /**
      * <p>A list of grants that control access to the staged results.</p>
      */
    var AccessControlList: js.UndefOr[js.Array[Grant] | Iterable[Grant]] = js.undefined
    
    /**
      * <p>The name of the bucket where the restore results will be placed.</p>
      */
    var BucketName: String
    
    /**
      * <p>The canned ACL to apply to the restore results.</p>
      */
    var CannedACL: js.UndefOr[
        `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
      ] = js.undefined
    
    /**
      * <p>Describes the server-side encryption that will be applied to the restore results.</p>
      */
    var Encryption: js.UndefOr[typings.awsSdkClientS3Node.typesEncryptionMod.Encryption] = js.undefined
    
    /**
      * <p>The prefix that is prepended to the restore results for this request.</p>
      */
    var Prefix: String
    
    /**
      * <p>The class of storage used to store the restore results.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.undefined
    
    /**
      * <p>The tag-set that is applied to the restore results.</p>
      */
    var Tagging: js.UndefOr[typings.awsSdkClientS3Node.typesTaggingMod.Tagging] = js.undefined
    
    /**
      * <p>A list of metadata to store with the restore results in S3.</p>
      */
    var UserMetadata: js.UndefOr[js.Array[MetadataEntry] | Iterable[MetadataEntry]] = js.undefined
  }
  object S3Location {
    
    inline def apply(BucketName: String, Prefix: String): S3Location = {
      val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3Location]
    }
    
    extension [Self <: S3Location](x: Self) {
      
      inline def setAccessControlList(value: js.Array[Grant] | Iterable[Grant]): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
      
      inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
      
      inline def setAccessControlListVarargs(value: Grant*): Self = StObject.set(x, "AccessControlList", js.Array(value :_*))
      
      inline def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
      
      inline def setCannedACL(
        value: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
      ): Self = StObject.set(x, "CannedACL", value.asInstanceOf[js.Any])
      
      inline def setCannedACLUndefined: Self = StObject.set(x, "CannedACL", js.undefined)
      
      inline def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      inline def setTagging(value: Tagging): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
      
      inline def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
      
      inline def setUserMetadata(value: js.Array[MetadataEntry] | Iterable[MetadataEntry]): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
      
      inline def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
      
      inline def setUserMetadataVarargs(value: MetadataEntry*): Self = StObject.set(x, "UserMetadata", js.Array(value :_*))
    }
  }
  
  trait UnmarshalledS3Location
    extends StObject
       with S3Location {
    
    /**
      * <p>A list of grants that control access to the staged results.</p>
      */
    @JSName("AccessControlList")
    var AccessControlList_UnmarshalledS3Location: js.UndefOr[js.Array[UnmarshalledGrant]] = js.undefined
    
    /**
      * <p>Describes the server-side encryption that will be applied to the restore results.</p>
      */
    @JSName("Encryption")
    var Encryption_UnmarshalledS3Location: js.UndefOr[UnmarshalledEncryption] = js.undefined
    
    /**
      * <p>The tag-set that is applied to the restore results.</p>
      */
    @JSName("Tagging")
    var Tagging_UnmarshalledS3Location: js.UndefOr[UnmarshalledTagging] = js.undefined
    
    /**
      * <p>A list of metadata to store with the restore results in S3.</p>
      */
    @JSName("UserMetadata")
    var UserMetadata_UnmarshalledS3Location: js.UndefOr[js.Array[UnmarshalledMetadataEntry]] = js.undefined
  }
  object UnmarshalledS3Location {
    
    inline def apply(BucketName: String, Prefix: String): UnmarshalledS3Location = {
      val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledS3Location]
    }
    
    extension [Self <: UnmarshalledS3Location](x: Self) {
      
      inline def setAccessControlList(value: js.Array[UnmarshalledGrant]): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
      
      inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
      
      inline def setAccessControlListVarargs(value: UnmarshalledGrant*): Self = StObject.set(x, "AccessControlList", js.Array(value :_*))
      
      inline def setEncryption(value: UnmarshalledEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
      
      inline def setTagging(value: UnmarshalledTagging): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
      
      inline def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
      
      inline def setUserMetadata(value: js.Array[UnmarshalledMetadataEntry]): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
      
      inline def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
      
      inline def setUserMetadataVarargs(value: UnmarshalledMetadataEntry*): Self = StObject.set(x, "UserMetadata", js.Array(value :_*))
    }
  }
}
