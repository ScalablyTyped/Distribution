package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteBucketReplicationOutputMod {
  
  trait DeleteBucketReplicationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion
  object DeleteBucketReplicationOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteBucketReplicationOutput]
    }
  }
}
