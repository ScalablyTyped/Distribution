package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typings.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
import typings.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.UnmarshalledAbortIncompleteMultipartUpload
import typings.awsSdkClientS3Browser.typesLifecycleExpirationMod.LifecycleExpiration
import typings.awsSdkClientS3Browser.typesLifecycleExpirationMod.UnmarshalledLifecycleExpiration
import typings.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
import typings.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.UnmarshalledNoncurrentVersionExpiration
import typings.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod.NoncurrentVersionTransition
import typings.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod.UnmarshalledNoncurrentVersionTransition
import typings.awsSdkClientS3Browser.typesTransitionMod.Transition
import typings.awsSdkClientS3Browser.typesTransitionMod.UnmarshalledTransition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuleMod {
  
  trait Rule extends StObject {
    
    /**
      * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
      */
    var AbortIncompleteMultipartUpload: js.UndefOr[
        typings.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
      ] = js.undefined
    
    /**
      * _LifecycleExpiration shape
      */
    var Expiration: js.UndefOr[LifecycleExpiration] = js.undefined
    
    /**
      * <p>Unique identifier for the rule. The value cannot be longer than 255 characters.</p>
      */
    var ID: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
      */
    var NoncurrentVersionExpiration: js.UndefOr[
        typings.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
      ] = js.undefined
    
    /**
      * <p>Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA or GLACIER storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA or GLACIER storage class at a specific period in the object's lifetime.</p>
      */
    var NoncurrentVersionTransition: js.UndefOr[
        typings.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod.NoncurrentVersionTransition
      ] = js.undefined
    
    /**
      * <p>Prefix identifying one or more objects to which the rule applies.</p>
      */
    var Prefix: String
    
    /**
      * <p>If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.</p>
      */
    var Status: Enabled | Disabled | String
    
    /**
      * _Transition shape
      */
    var Transition: js.UndefOr[typings.awsSdkClientS3Browser.typesTransitionMod.Transition] = js.undefined
  }
  object Rule {
    
    @scala.inline
    def apply(Prefix: String, Status: Enabled | Disabled | String): Rule = {
      val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload): Self = StObject.set(x, "AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "AbortIncompleteMultipartUpload", js.undefined)
      
      @scala.inline
      def setExpiration(value: LifecycleExpiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      @scala.inline
      def setNoncurrentVersionExpiration(value: NoncurrentVersionExpiration): Self = StObject.set(x, "NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "NoncurrentVersionExpiration", js.undefined)
      
      @scala.inline
      def setNoncurrentVersionTransition(value: NoncurrentVersionTransition): Self = StObject.set(x, "NoncurrentVersionTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoncurrentVersionTransitionUndefined: Self = StObject.set(x, "NoncurrentVersionTransition", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Enabled | Disabled | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransition(value: Transition): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "Transition", js.undefined)
    }
  }
  
  trait UnmarshalledRule
    extends StObject
       with Rule {
    
    /**
      * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
      */
    @JSName("AbortIncompleteMultipartUpload")
    var AbortIncompleteMultipartUpload_UnmarshalledRule: js.UndefOr[UnmarshalledAbortIncompleteMultipartUpload] = js.undefined
    
    /**
      * _LifecycleExpiration shape
      */
    @JSName("Expiration")
    var Expiration_UnmarshalledRule: js.UndefOr[UnmarshalledLifecycleExpiration] = js.undefined
    
    /**
      * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
      */
    @JSName("NoncurrentVersionExpiration")
    var NoncurrentVersionExpiration_UnmarshalledRule: js.UndefOr[UnmarshalledNoncurrentVersionExpiration] = js.undefined
    
    /**
      * <p>Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA or GLACIER storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA or GLACIER storage class at a specific period in the object's lifetime.</p>
      */
    @JSName("NoncurrentVersionTransition")
    var NoncurrentVersionTransition_UnmarshalledRule: js.UndefOr[UnmarshalledNoncurrentVersionTransition] = js.undefined
    
    /**
      * _Transition shape
      */
    @JSName("Transition")
    var Transition_UnmarshalledRule: js.UndefOr[UnmarshalledTransition] = js.undefined
  }
  object UnmarshalledRule {
    
    @scala.inline
    def apply(Prefix: String, Status: Enabled | Disabled | String): UnmarshalledRule = {
      val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledRule]
    }
    
    @scala.inline
    implicit class UnmarshalledRuleMutableBuilder[Self <: UnmarshalledRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbortIncompleteMultipartUpload(value: UnmarshalledAbortIncompleteMultipartUpload): Self = StObject.set(x, "AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "AbortIncompleteMultipartUpload", js.undefined)
      
      @scala.inline
      def setExpiration(value: UnmarshalledLifecycleExpiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
      
      @scala.inline
      def setNoncurrentVersionExpiration(value: UnmarshalledNoncurrentVersionExpiration): Self = StObject.set(x, "NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "NoncurrentVersionExpiration", js.undefined)
      
      @scala.inline
      def setNoncurrentVersionTransition(value: UnmarshalledNoncurrentVersionTransition): Self = StObject.set(x, "NoncurrentVersionTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoncurrentVersionTransitionUndefined: Self = StObject.set(x, "NoncurrentVersionTransition", js.undefined)
      
      @scala.inline
      def setTransition(value: UnmarshalledTransition): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "Transition", js.undefined)
    }
  }
}
