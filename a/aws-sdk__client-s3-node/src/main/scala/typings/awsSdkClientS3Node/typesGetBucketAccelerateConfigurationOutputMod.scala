package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Suspended
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketAccelerateConfigurationOutputMod {
  
  trait GetBucketAccelerateConfigurationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>The accelerate configuration of the bucket.</p>
      */
    var Status: js.UndefOr[Enabled | Suspended | String] = js.undefined
  }
  object GetBucketAccelerateConfigurationOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketAccelerateConfigurationOutput]
    }
    
    extension [Self <: GetBucketAccelerateConfigurationOutput](x: Self) {
      
      inline def setStatus(value: Enabled | Suspended | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
}
