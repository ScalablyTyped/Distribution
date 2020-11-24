package typings.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketWebsiteOutput
  extends MetadataBearer
     with _OutputTypesUnion
object PutBucketWebsiteOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketWebsiteOutput]
  }
}
