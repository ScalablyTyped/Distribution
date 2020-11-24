package typings.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketLoggingOutput
  extends MetadataBearer
     with _OutputTypesUnion
object PutBucketLoggingOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketLoggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLoggingOutput]
  }
}
