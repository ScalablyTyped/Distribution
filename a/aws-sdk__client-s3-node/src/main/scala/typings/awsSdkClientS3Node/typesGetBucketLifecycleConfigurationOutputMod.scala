package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesLifecycleRuleMod.UnmarshalledLifecycleRule
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketLifecycleConfigurationOutputMod {
  
  trait GetBucketLifecycleConfigurationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _LifecycleRules shape
      */
    var Rules: js.UndefOr[js.Array[UnmarshalledLifecycleRule]] = js.undefined
  }
  object GetBucketLifecycleConfigurationOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketLifecycleConfigurationOutput]
    }
    
    extension [Self <: GetBucketLifecycleConfigurationOutput](x: Self) {
      
      inline def setRules(value: js.Array[UnmarshalledLifecycleRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
      
      inline def setRulesVarargs(value: UnmarshalledLifecycleRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    }
  }
}
