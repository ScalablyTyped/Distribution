package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteBucketEncryptionOutputMod {
  
  trait DeleteBucketEncryptionOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion
  object DeleteBucketEncryptionOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteBucketEncryptionOutput]
    }
  }
}
