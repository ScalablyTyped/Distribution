package typings.awsSdkClientS3Node.typesPutBucketCorsOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketCorsOutput
  extends MetadataBearer
     with _OutputTypesUnion
object PutBucketCorsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketCorsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketCorsOutput]
  }
}
