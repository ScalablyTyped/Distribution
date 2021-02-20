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
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesS3LocationMod {
  
  @js.native
  trait S3Location extends StObject {
    
    /**
      * <p>A list of grants that control access to the staged results.</p>
      */
    var AccessControlList: js.UndefOr[js.Array[Grant] | Iterable[Grant]] = js.native
    
    /**
      * <p>The name of the Amazon S3 bucket where the job results are stored.</p>
      */
    var BucketName: js.UndefOr[String] = js.native
    
    /**
      * <p>The canned access control list (ACL) to apply to the job results.</p>
      */
    var CannedACL: js.UndefOr[
        `private` | `public-read` | `public-read-write` | `aws-exec-read` | `authenticated-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
      ] = js.native
    
    /**
      * <p>Contains information about the encryption used to store the job results in Amazon S3.</p>
      */
    var Encryption: js.UndefOr[typings.awsSdkClientGlacierNode.typesEncryptionMod.Encryption] = js.native
    
    /**
      * <p>The prefix that is prepended to the results for this request.</p>
      */
    var Prefix: js.UndefOr[String] = js.native
    
    /**
      * <p>The storage class used to store the job results.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | String] = js.native
    
    /**
      * <p>The tag-set that is applied to the job results.</p>
      */
    var Tagging: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
    
    /**
      * <p>A map of metadata to store with the job results in Amazon S3.</p>
      */
    var UserMetadata: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  }
  object S3Location {
    
    @scala.inline
    def apply(): S3Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3Location]
    }
    
    @scala.inline
    implicit class S3LocationMutableBuilder[Self <: S3Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessControlList(value: js.Array[Grant] | Iterable[Grant]): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
      
      @scala.inline
      def setAccessControlListVarargs(value: Grant*): Self = StObject.set(x, "AccessControlList", js.Array(value :_*))
      
      @scala.inline
      def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
      
      @scala.inline
      def setCannedACL(
        value: `private` | `public-read` | `public-read-write` | `aws-exec-read` | `authenticated-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
      ): Self = StObject.set(x, "CannedACL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCannedACLUndefined: Self = StObject.set(x, "CannedACL", js.undefined)
      
      @scala.inline
      def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      @scala.inline
      def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      @scala.inline
      def setTagging(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
      
      @scala.inline
      def setUserMetadata(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledS3Location extends S3Location {
    
    /**
      * <p>A list of grants that control access to the staged results.</p>
      */
    @JSName("AccessControlList")
    var AccessControlList_UnmarshalledS3Location: js.UndefOr[js.Array[UnmarshalledGrant]] = js.native
    
    /**
      * <p>Contains information about the encryption used to store the job results in Amazon S3.</p>
      */
    @JSName("Encryption")
    var Encryption_UnmarshalledS3Location: js.UndefOr[UnmarshalledEncryption] = js.native
    
    /**
      * <p>The tag-set that is applied to the job results.</p>
      */
    @JSName("Tagging")
    var Tagging_UnmarshalledS3Location: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * <p>A map of metadata to store with the job results in Amazon S3.</p>
      */
    @JSName("UserMetadata")
    var UserMetadata_UnmarshalledS3Location: js.UndefOr[StringDictionary[String]] = js.native
  }
  object UnmarshalledS3Location {
    
    @scala.inline
    def apply(): UnmarshalledS3Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledS3Location]
    }
    
    @scala.inline
    implicit class UnmarshalledS3LocationMutableBuilder[Self <: UnmarshalledS3Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessControlList(value: js.Array[UnmarshalledGrant]): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
      
      @scala.inline
      def setAccessControlListVarargs(value: UnmarshalledGrant*): Self = StObject.set(x, "AccessControlList", js.Array(value :_*))
      
      @scala.inline
      def setEncryption(value: UnmarshalledEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
      
      @scala.inline
      def setTagging(value: StringDictionary[String]): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
      
      @scala.inline
      def setUserMetadata(value: StringDictionary[String]): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
    }
  }
}
