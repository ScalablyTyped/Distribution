package typings.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesLoggingEnabledMod.UnmarshalledLoggingEnabled
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLoggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
    */
  var LoggingEnabled: js.UndefOr[UnmarshalledLoggingEnabled] = js.undefined
}

object GetBucketLoggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, LoggingEnabled: UnmarshalledLoggingEnabled = null): GetBucketLoggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (LoggingEnabled != null) __obj.updateDynamic("LoggingEnabled")(LoggingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLoggingOutput]
  }
}

