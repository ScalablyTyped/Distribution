package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesLoggingEnabledMod.UnmarshalledLoggingEnabled
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetBucketLoggingOutput", JSImport.Namespace)
@js.native
object typesGetBucketLoggingOutputMod extends js.Object {
  @js.native
  trait GetBucketLoggingOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
      */
    var LoggingEnabled: js.UndefOr[UnmarshalledLoggingEnabled] = js.native
  }
  
}

