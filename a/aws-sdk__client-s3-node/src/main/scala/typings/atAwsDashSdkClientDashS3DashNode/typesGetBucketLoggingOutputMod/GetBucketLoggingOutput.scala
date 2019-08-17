package typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketLoggingOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLoggingEnabledMod._UnmarshalledLoggingEnabled
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLoggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
    */
  var LoggingEnabled: js.UndefOr[_UnmarshalledLoggingEnabled] = js.undefined
}

object GetBucketLoggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, LoggingEnabled: _UnmarshalledLoggingEnabled = null): GetBucketLoggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (LoggingEnabled != null) __obj.updateDynamic("LoggingEnabled")(LoggingEnabled)
    __obj.asInstanceOf[GetBucketLoggingOutput]
  }
}

