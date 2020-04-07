package typings.awsSdkClientS3Node.typesCreateBucketOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _Location shape
    */
  var Location: js.UndefOr[String] = js.undefined
}

object CreateBucketOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Location: String = null): CreateBucketOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketOutput]
  }
}

