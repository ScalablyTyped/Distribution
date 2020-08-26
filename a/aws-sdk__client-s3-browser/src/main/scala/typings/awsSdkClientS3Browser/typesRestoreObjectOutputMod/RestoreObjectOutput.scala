package typings.awsSdkClientS3Browser.typesRestoreObjectOutputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object RestoreObjectOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): RestoreObjectOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreObjectOutput]
  }
  @scala.inline
  implicit class RestoreObjectOutputOps[Self <: RestoreObjectOutput] (val x: Self) extends AnyVal {
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
    def setRequestCharged(value: requester_ | String): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
    @scala.inline
    def setRestoreOutputPath(value: String): Self = this.set("RestoreOutputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreOutputPath: Self = this.set("RestoreOutputPath", js.undefined)
  }
  
}

