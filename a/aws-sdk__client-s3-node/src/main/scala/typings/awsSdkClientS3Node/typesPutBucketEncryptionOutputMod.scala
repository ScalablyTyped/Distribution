package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketEncryptionOutputMod {
  
  @js.native
  trait PutBucketEncryptionOutput
    extends MetadataBearer
       with _OutputTypesUnion
  object PutBucketEncryptionOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketEncryptionOutput]
    }
  }
}
