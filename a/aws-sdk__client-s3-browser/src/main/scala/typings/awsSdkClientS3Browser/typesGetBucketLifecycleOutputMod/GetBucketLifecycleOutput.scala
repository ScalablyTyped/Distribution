package typings.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesRuleMod.UnmarshalledRule
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLifecycleOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _Rules shape
    */
  var Rules: js.UndefOr[js.Array[UnmarshalledRule]] = js.undefined
}

object GetBucketLifecycleOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Rules: js.Array[UnmarshalledRule] = null): GetBucketLifecycleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLifecycleOutput]
  }
}

