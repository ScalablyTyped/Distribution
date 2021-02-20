package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketAccelerateConfigurationOutputMod {
  
  @js.native
  trait PutBucketAccelerateConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion
  object PutBucketAccelerateConfigurationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutBucketAccelerateConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketAccelerateConfigurationOutput]
    }
  }
}
