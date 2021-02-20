package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typings.awsSdkClientS3Node.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
import typings.awsSdkClientS3Node.typesAbortIncompleteMultipartUploadMod.UnmarshalledAbortIncompleteMultipartUpload
import typings.awsSdkClientS3Node.typesLifecycleExpirationMod.LifecycleExpiration
import typings.awsSdkClientS3Node.typesLifecycleExpirationMod.UnmarshalledLifecycleExpiration
import typings.awsSdkClientS3Node.typesLifecycleRuleFilterMod.LifecycleRuleFilter
import typings.awsSdkClientS3Node.typesLifecycleRuleFilterMod.UnmarshalledLifecycleRuleFilter
import typings.awsSdkClientS3Node.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
import typings.awsSdkClientS3Node.typesNoncurrentVersionExpirationMod.UnmarshalledNoncurrentVersionExpiration
import typings.awsSdkClientS3Node.typesNoncurrentVersionTransitionMod.NoncurrentVersionTransition
import typings.awsSdkClientS3Node.typesNoncurrentVersionTransitionMod.UnmarshalledNoncurrentVersionTransition
import typings.awsSdkClientS3Node.typesTransitionMod.Transition
import typings.awsSdkClientS3Node.typesTransitionMod.UnmarshalledTransition
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLifecycleRuleMod {
  
  @js.native
  trait LifecycleRule extends StObject {
    
    /**
      * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
      */
    var AbortIncompleteMultipartUpload: js.UndefOr[
        typings.awsSdkClientS3Node.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
      ] = js.native
    
    /**
      * _LifecycleExpiration shape
      */
    var Expiration: js.UndefOr[LifecycleExpiration] = js.native
    
    /**
      * <p>The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.</p>
      */
    var Filter: js.UndefOr[LifecycleRuleFilter] = js.native
    
    /**
      * <p>Unique identifier for the rule. The value cannot be longer than 255 characters.</p>
      */
    var ID: js.UndefOr[String] = js.native
    
    /**
      * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
      */
    var NoncurrentVersionExpiration: js.UndefOr[
        typings.awsSdkClientS3Node.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
      ] = js.native
    
    /**
      * _NoncurrentVersionTransitionList shape
      */
    var NoncurrentVersionTransitions: js.UndefOr[js.Array[NoncurrentVersionTransition] | Iterable[NoncurrentVersionTransition]] = js.native
    
    /**
      * <p>Prefix identifying one or more objects to which the rule applies. This is deprecated; use Filter instead.</p>
      */
    var Prefix: js.UndefOr[String] = js.native
    
    /**
      * <p>If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.</p>
      */
    var Status: Enabled | Disabled | String = js.native
    
    /**
      * _TransitionList shape
      */
    var Transitions: js.UndefOr[js.Array[Transition] | Iterable[Transition]] = js.native
  }
  object LifecycleRule {
    
    @scala.inline
    def apply(Status: Enabled | Disabled | String): LifecycleRule = {
      val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecycleRule]
    }
    
    @scala.inline
    implicit class LifecycleRuleMutableBuilder[Self <: LifecycleRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload): Self = StObject.set(x, "AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "AbortIncompleteMultipartUpload", js.undefined)
      
      @scala.inline
      def setExpiration(value: LifecycleExpiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
      
      @scala.inline
      def setFilter(value: LifecycleRuleFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      @scala.inline
      def setNoncurrentVersionExpiration(value: NoncurrentVersionExpiration): Self = StObject.set(x, "NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "NoncurrentVersionExpiration", js.undefined)
      
      @scala.inline
      def setNoncurrentVersionTransitions(value: js.Array[NoncurrentVersionTransition] | Iterable[NoncurrentVersionTransition]): Self = StObject.set(x, "NoncurrentVersionTransitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoncurrentVersionTransitionsUndefined: Self = StObject.set(x, "NoncurrentVersionTransitions", js.undefined)
      
      @scala.inline
      def setNoncurrentVersionTransitionsVarargs(value: NoncurrentVersionTransition*): Self = StObject.set(x, "NoncurrentVersionTransitions", js.Array(value :_*))
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      @scala.inline
      def setStatus(value: Enabled | Disabled | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitions(value: js.Array[Transition] | Iterable[Transition]): Self = StObject.set(x, "Transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "Transitions", js.undefined)
      
      @scala.inline
      def setTransitionsVarargs(value: Transition*): Self = StObject.set(x, "Transitions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledLifecycleRule extends LifecycleRule {
    
    /**
      * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
      */
    @JSName("AbortIncompleteMultipartUpload")
    var AbortIncompleteMultipartUpload_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledAbortIncompleteMultipartUpload] = js.native
    
    /**
      * _LifecycleExpiration shape
      */
    @JSName("Expiration")
    var Expiration_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledLifecycleExpiration] = js.native
    
    /**
      * <p>The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.</p>
      */
    @JSName("Filter")
    var Filter_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledLifecycleRuleFilter] = js.native
    
    /**
      * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
      */
    @JSName("NoncurrentVersionExpiration")
    var NoncurrentVersionExpiration_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledNoncurrentVersionExpiration] = js.native
    
    /**
      * _NoncurrentVersionTransitionList shape
      */
    @JSName("NoncurrentVersionTransitions")
    var NoncurrentVersionTransitions_UnmarshalledLifecycleRule: js.UndefOr[js.Array[UnmarshalledNoncurrentVersionTransition]] = js.native
    
    /**
      * _TransitionList shape
      */
    @JSName("Transitions")
    var Transitions_UnmarshalledLifecycleRule: js.UndefOr[js.Array[UnmarshalledTransition]] = js.native
  }
  object UnmarshalledLifecycleRule {
    
    @scala.inline
    def apply(Status: Enabled | Disabled | String): UnmarshalledLifecycleRule = {
      val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledLifecycleRule]
    }
    
    @scala.inline
    implicit class UnmarshalledLifecycleRuleMutableBuilder[Self <: UnmarshalledLifecycleRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbortIncompleteMultipartUpload(value: UnmarshalledAbortIncompleteMultipartUpload): Self = StObject.set(x, "AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "AbortIncompleteMultipartUpload", js.undefined)
      
      @scala.inline
      def setExpiration(value: UnmarshalledLifecycleExpiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
      
      @scala.inline
      def setFilter(value: UnmarshalledLifecycleRuleFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      @scala.inline
      def setNoncurrentVersionExpiration(value: UnmarshalledNoncurrentVersionExpiration): Self = StObject.set(x, "NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "NoncurrentVersionExpiration", js.undefined)
      
      @scala.inline
      def setNoncurrentVersionTransitions(value: js.Array[UnmarshalledNoncurrentVersionTransition]): Self = StObject.set(x, "NoncurrentVersionTransitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoncurrentVersionTransitionsUndefined: Self = StObject.set(x, "NoncurrentVersionTransitions", js.undefined)
      
      @scala.inline
      def setNoncurrentVersionTransitionsVarargs(value: UnmarshalledNoncurrentVersionTransition*): Self = StObject.set(x, "NoncurrentVersionTransitions", js.Array(value :_*))
      
      @scala.inline
      def setTransitions(value: js.Array[UnmarshalledTransition]): Self = StObject.set(x, "Transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "Transitions", js.undefined)
      
      @scala.inline
      def setTransitionsVarargs(value: UnmarshalledTransition*): Self = StObject.set(x, "Transitions", js.Array(value :_*))
    }
  }
}
