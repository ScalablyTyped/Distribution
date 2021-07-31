package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketPolicyOutputMod {
  
  trait GetBucketPolicyOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>The bucket policy as a JSON document.</p>
      */
    var Policy: js.UndefOr[String] = js.undefined
  }
  object GetBucketPolicyOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketPolicyOutput]
    }
    
    @scala.inline
    implicit class GetBucketPolicyOutputMutableBuilder[Self <: GetBucketPolicyOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    }
  }
}
