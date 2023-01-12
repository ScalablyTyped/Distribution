package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesRuleMod.UnmarshalledRule
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketLifecycleOutputMod {
  
  trait GetBucketLifecycleOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _Rules shape
      */
    var Rules: js.UndefOr[js.Array[UnmarshalledRule]] = js.undefined
  }
  object GetBucketLifecycleOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketLifecycleOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetBucketLifecycleOutput] (val x: Self) extends AnyVal {
      
      inline def setRules(value: js.Array[UnmarshalledRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
      
      inline def setRulesVarargs(value: UnmarshalledRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    }
  }
}
