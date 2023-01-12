package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.STANDARD
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.STANDARD_IA
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`authenticated-read`
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`aws-exec-read`
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`bucket-owner-full-control`
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`bucket-owner-read`
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`private`
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`public-read-write`
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`public-read`
import typings.awsSdkClientGlacierNode.typesEncryptionMod.Encryption
import typings.awsSdkClientGlacierNode.typesEncryptionMod.UnmarshalledEncryption
import typings.awsSdkClientGlacierNode.typesGrantMod.Grant
import typings.awsSdkClientGlacierNode.typesGrantMod.UnmarshalledGrant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesS3LocationMod {
  
  trait S3Location extends StObject {
    
    /**
      * <p>A list of grants that control access to the staged results.</p>
      */
    var AccessControlList: js.UndefOr[js.Array[Grant] | js.Iterable[Grant]] = js.undefined
    
    /**
      * <p>The name of the Amazon S3 bucket where the job results are stored.</p>
      */
    var BucketName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The canned access control list (ACL) to apply to the job results.</p>
      */
    var CannedACL: js.UndefOr[
        `private` | `public-read` | `public-read-write` | `aws-exec-read` | `authenticated-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
      ] = js.undefined
    
    /**
      * <p>Contains information about the encryption used to store the job results in Amazon S3.</p>
      */
    var Encryption: js.UndefOr[typings.awsSdkClientGlacierNode.typesEncryptionMod.Encryption] = js.undefined
    
    /**
      * <p>The prefix that is prepended to the results for this request.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The storage class used to store the job results.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | String] = js.undefined
    
    /**
      * <p>The tag-set that is applied to the job results.</p>
      */
    var Tagging: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * <p>A map of metadata to store with the job results in Amazon S3.</p>
      */
    var UserMetadata: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
  }
  object S3Location {
    
    inline def apply(): S3Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3Location]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: S3Location] (val x: Self) extends AnyVal {
      
      inline def setAccessControlList(value: js.Array[Grant] | js.Iterable[Grant]): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
      
      inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
      
      inline def setAccessControlListVarargs(value: Grant*): Self = StObject.set(x, "AccessControlList", js.Array(value*))
      
      inline def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
      
      inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
      
      inline def setCannedACL(
        value: `private` | `public-read` | `public-read-write` | `aws-exec-read` | `authenticated-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
      ): Self = StObject.set(x, "CannedACL", value.asInstanceOf[js.Any])
      
      inline def setCannedACLUndefined: Self = StObject.set(x, "CannedACL", js.undefined)
      
      inline def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      inline def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      inline def setTagging(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
      
      inline def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
      
      inline def setUserMetadata(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
      
      inline def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
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
      * <p>Contains information about the encryption used to store the job results in Amazon S3.</p>
      */
    @JSName("Encryption")
    var Encryption_UnmarshalledS3Location: js.UndefOr[UnmarshalledEncryption] = js.undefined
    
    /**
      * <p>The tag-set that is applied to the job results.</p>
      */
    @JSName("Tagging")
    var Tagging_UnmarshalledS3Location: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * <p>A map of metadata to store with the job results in Amazon S3.</p>
      */
    @JSName("UserMetadata")
    var UserMetadata_UnmarshalledS3Location: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object UnmarshalledS3Location {
    
    inline def apply(): UnmarshalledS3Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledS3Location]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledS3Location] (val x: Self) extends AnyVal {
      
      inline def setAccessControlList(value: js.Array[UnmarshalledGrant]): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
      
      inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
      
      inline def setAccessControlListVarargs(value: UnmarshalledGrant*): Self = StObject.set(x, "AccessControlList", js.Array(value*))
      
      inline def setEncryption(value: UnmarshalledEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
      
      inline def setTagging(value: StringDictionary[String]): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
      
      inline def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
      
      inline def setUserMetadata(value: StringDictionary[String]): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
      
      inline def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
    }
  }
}
