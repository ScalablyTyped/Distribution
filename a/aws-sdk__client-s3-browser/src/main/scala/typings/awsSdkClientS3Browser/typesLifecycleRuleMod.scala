package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typings.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
import typings.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.UnmarshalledAbortIncompleteMultipartUpload
import typings.awsSdkClientS3Browser.typesLifecycleExpirationMod.LifecycleExpiration
import typings.awsSdkClientS3Browser.typesLifecycleExpirationMod.UnmarshalledLifecycleExpiration
import typings.awsSdkClientS3Browser.typesLifecycleRuleFilterMod.LifecycleRuleFilter
import typings.awsSdkClientS3Browser.typesLifecycleRuleFilterMod.UnmarshalledLifecycleRuleFilter
import typings.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
import typings.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.UnmarshalledNoncurrentVersionExpiration
import typings.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod.NoncurrentVersionTransition
import typings.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod.UnmarshalledNoncurrentVersionTransition
import typings.awsSdkClientS3Browser.typesTransitionMod.Transition
import typings.awsSdkClientS3Browser.typesTransitionMod.UnmarshalledTransition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLifecycleRuleMod {
  
  trait LifecycleRule extends StObject {
    
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
      * <p>The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.</p>
      */
    var Filter: js.UndefOr[LifecycleRuleFilter] = js.undefined
    
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
      * _NoncurrentVersionTransitionList shape
      */
    var NoncurrentVersionTransitions: js.UndefOr[js.Array[NoncurrentVersionTransition] | js.Iterable[NoncurrentVersionTransition]] = js.undefined
    
    /**
      * <p>Prefix identifying one or more objects to which the rule applies. This is deprecated; use Filter instead.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * <p>If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.</p>
      */
    var Status: Enabled | Disabled | String
    
    /**
      * _TransitionList shape
      */
    var Transitions: js.UndefOr[js.Array[Transition] | js.Iterable[Transition]] = js.undefined
  }
  object LifecycleRule {
    
    inline def apply(Status: Enabled | Disabled | String): LifecycleRule = {
      val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecycleRule]
    }
    
    extension [Self <: LifecycleRule](x: Self) {
      
      inline def setAbortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload): Self = StObject.set(x, "AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
      
      inline def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "AbortIncompleteMultipartUpload", js.undefined)
      
      inline def setExpiration(value: LifecycleExpiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
      
      inline def setFilter(value: LifecycleRuleFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      inline def setNoncurrentVersionExpiration(value: NoncurrentVersionExpiration): Self = StObject.set(x, "NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
      
      inline def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "NoncurrentVersionExpiration", js.undefined)
      
      inline def setNoncurrentVersionTransitions(value: js.Array[NoncurrentVersionTransition] | js.Iterable[NoncurrentVersionTransition]): Self = StObject.set(x, "NoncurrentVersionTransitions", value.asInstanceOf[js.Any])
      
      inline def setNoncurrentVersionTransitionsUndefined: Self = StObject.set(x, "NoncurrentVersionTransitions", js.undefined)
      
      inline def setNoncurrentVersionTransitionsVarargs(value: NoncurrentVersionTransition*): Self = StObject.set(x, "NoncurrentVersionTransitions", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      inline def setStatus(value: Enabled | Disabled | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setTransitions(value: js.Array[Transition] | js.Iterable[Transition]): Self = StObject.set(x, "Transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "Transitions", js.undefined)
      
      inline def setTransitionsVarargs(value: Transition*): Self = StObject.set(x, "Transitions", js.Array(value*))
    }
  }
  
  trait UnmarshalledLifecycleRule
    extends StObject
       with LifecycleRule {
    
    /**
      * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
      */
    @JSName("AbortIncompleteMultipartUpload")
    var AbortIncompleteMultipartUpload_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledAbortIncompleteMultipartUpload] = js.undefined
    
    /**
      * _LifecycleExpiration shape
      */
    @JSName("Expiration")
    var Expiration_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledLifecycleExpiration] = js.undefined
    
    /**
      * <p>The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.</p>
      */
    @JSName("Filter")
    var Filter_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledLifecycleRuleFilter] = js.undefined
    
    /**
      * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
      */
    @JSName("NoncurrentVersionExpiration")
    var NoncurrentVersionExpiration_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledNoncurrentVersionExpiration] = js.undefined
    
    /**
      * _NoncurrentVersionTransitionList shape
      */
    @JSName("NoncurrentVersionTransitions")
    var NoncurrentVersionTransitions_UnmarshalledLifecycleRule: js.UndefOr[js.Array[UnmarshalledNoncurrentVersionTransition]] = js.undefined
    
    /**
      * _TransitionList shape
      */
    @JSName("Transitions")
    var Transitions_UnmarshalledLifecycleRule: js.UndefOr[js.Array[UnmarshalledTransition]] = js.undefined
  }
  object UnmarshalledLifecycleRule {
    
    inline def apply(Status: Enabled | Disabled | String): UnmarshalledLifecycleRule = {
      val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledLifecycleRule]
    }
    
    extension [Self <: UnmarshalledLifecycleRule](x: Self) {
      
      inline def setAbortIncompleteMultipartUpload(value: UnmarshalledAbortIncompleteMultipartUpload): Self = StObject.set(x, "AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
      
      inline def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "AbortIncompleteMultipartUpload", js.undefined)
      
      inline def setExpiration(value: UnmarshalledLifecycleExpiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
      
      inline def setFilter(value: UnmarshalledLifecycleRuleFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      inline def setNoncurrentVersionExpiration(value: UnmarshalledNoncurrentVersionExpiration): Self = StObject.set(x, "NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
      
      inline def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "NoncurrentVersionExpiration", js.undefined)
      
      inline def setNoncurrentVersionTransitions(value: js.Array[UnmarshalledNoncurrentVersionTransition]): Self = StObject.set(x, "NoncurrentVersionTransitions", value.asInstanceOf[js.Any])
      
      inline def setNoncurrentVersionTransitionsUndefined: Self = StObject.set(x, "NoncurrentVersionTransitions", js.undefined)
      
      inline def setNoncurrentVersionTransitionsVarargs(value: UnmarshalledNoncurrentVersionTransition*): Self = StObject.set(x, "NoncurrentVersionTransitions", js.Array(value*))
      
      inline def setTransitions(value: js.Array[UnmarshalledTransition]): Self = StObject.set(x, "Transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "Transitions", js.undefined)
      
      inline def setTransitionsVarargs(value: UnmarshalledTransition*): Self = StObject.set(x, "Transitions", js.Array(value*))
    }
  }
}
