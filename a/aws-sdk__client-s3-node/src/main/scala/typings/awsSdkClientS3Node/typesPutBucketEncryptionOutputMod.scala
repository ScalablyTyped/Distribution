package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketEncryptionOutputMod {
  
  trait PutBucketEncryptionOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion
  object PutBucketEncryptionOutput {
    
    inline def apply($metadata: ResponseMetadata): PutBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketEncryptionOutput]
    }
  }
}
