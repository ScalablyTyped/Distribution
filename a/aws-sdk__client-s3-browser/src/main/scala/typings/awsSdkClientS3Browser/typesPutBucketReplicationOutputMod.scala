package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketReplicationOutputMod {
  
  trait PutBucketReplicationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion
  object PutBucketReplicationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutBucketReplicationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketReplicationOutput]
    }
  }
}
