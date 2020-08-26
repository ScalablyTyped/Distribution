package typings.awsSdkClientS3Browser.typesGetBucketLoggingOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesLoggingEnabledMod.UnmarshalledLoggingEnabled
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLoggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
    */
  var LoggingEnabled: js.UndefOr[UnmarshalledLoggingEnabled] = js.native
}

object GetBucketLoggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketLoggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLoggingOutput]
  }
  @scala.inline
  implicit class GetBucketLoggingOutputOps[Self <: GetBucketLoggingOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoggingEnabled(value: UnmarshalledLoggingEnabled): Self = this.set("LoggingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingEnabled: Self = this.set("LoggingEnabled", js.undefined)
  }
  
}

