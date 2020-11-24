package typings.awsSdkClientS3Node.typesDeleteBucketCorsOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBucketCorsOutput
  extends MetadataBearer
     with _OutputTypesUnion
object DeleteBucketCorsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketCorsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketCorsOutput]
  }
}
