package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
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
    
    inline def apply($metadata: ResponseMetadata): GetBucketPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketPolicyOutput]
    }
    
    extension [Self <: GetBucketPolicyOutput](x: Self) {
      
      inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    }
  }
}
