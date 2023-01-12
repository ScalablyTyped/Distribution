package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesLifecycleRuleMod.LifecycleRule
import typings.awsSdkClientS3Browser.typesLifecycleRuleMod.UnmarshalledLifecycleRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBucketLifecycleConfigurationMod {
  
  trait BucketLifecycleConfiguration extends StObject {
    
    /**
      * _LifecycleRules shape
      */
    var Rules: js.Array[LifecycleRule] | js.Iterable[LifecycleRule]
  }
  object BucketLifecycleConfiguration {
    
    inline def apply(Rules: js.Array[LifecycleRule] | js.Iterable[LifecycleRule]): BucketLifecycleConfiguration = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketLifecycleConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BucketLifecycleConfiguration] (val x: Self) extends AnyVal {
      
      inline def setRules(value: js.Array[LifecycleRule] | js.Iterable[LifecycleRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: LifecycleRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    }
  }
  
  trait UnmarshalledBucketLifecycleConfiguration
    extends StObject
       with BucketLifecycleConfiguration {
    
    /**
      * _LifecycleRules shape
      */
    @JSName("Rules")
    var Rules_UnmarshalledBucketLifecycleConfiguration: js.Array[UnmarshalledLifecycleRule]
  }
  object UnmarshalledBucketLifecycleConfiguration {
    
    inline def apply(Rules: js.Array[UnmarshalledLifecycleRule]): UnmarshalledBucketLifecycleConfiguration = {
      val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledBucketLifecycleConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledBucketLifecycleConfiguration] (val x: Self) extends AnyVal {
      
      inline def setRules(value: js.Array[UnmarshalledLifecycleRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: UnmarshalledLifecycleRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    }
  }
}
