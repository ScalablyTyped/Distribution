package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesRuleMod.UnmarshalledRule
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketLifecycleOutputMod {
  
  @js.native
  trait GetBucketLifecycleOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _Rules shape
      */
    var Rules: js.UndefOr[js.Array[UnmarshalledRule]] = js.native
  }
  object GetBucketLifecycleOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketLifecycleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketLifecycleOutput]
    }
    
    @scala.inline
    implicit class GetBucketLifecycleOutputMutableBuilder[Self <: GetBucketLifecycleOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[UnmarshalledRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: UnmarshalledRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
}
