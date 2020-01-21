package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/RestoreObjectOutput", JSImport.Namespace)
@js.native
object typesRestoreObjectOutputMod extends js.Object {
  @js.native
  trait RestoreObjectOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
    /**
      * <p>Indicates the path in the provided S3 output location where Select results will be restored to.</p>
      */
    var RestoreOutputPath: js.UndefOr[String] = js.native
  }
  
}

