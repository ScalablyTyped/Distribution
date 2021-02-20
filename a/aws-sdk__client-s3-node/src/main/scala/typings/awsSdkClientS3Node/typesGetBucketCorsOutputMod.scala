package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesCorsruleMod.UnmarshalledCORSRule
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketCorsOutputMod {
  
  @js.native
  trait GetBucketCorsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _CORSRules shape
      */
    var CORSRules: js.UndefOr[js.Array[UnmarshalledCORSRule]] = js.native
  }
  object GetBucketCorsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketCorsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketCorsOutput]
    }
    
    @scala.inline
    implicit class GetBucketCorsOutputMutableBuilder[Self <: GetBucketCorsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCORSRules(value: js.Array[UnmarshalledCORSRule]): Self = StObject.set(x, "CORSRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCORSRulesUndefined: Self = StObject.set(x, "CORSRules", js.undefined)
      
      @scala.inline
      def setCORSRulesVarargs(value: UnmarshalledCORSRule*): Self = StObject.set(x, "CORSRules", js.Array(value :_*))
    }
  }
}
