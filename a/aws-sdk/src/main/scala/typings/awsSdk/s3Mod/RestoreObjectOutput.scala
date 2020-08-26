package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreObjectOutput extends js.Object {
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
  /**
    * Indicates the path in the provided S3 output location where Select results will be restored to.
    */
  var RestoreOutputPath: js.UndefOr[typings.awsSdk.s3Mod.RestoreOutputPath] = js.native
}

object RestoreObjectOutput {
  @scala.inline
  def apply(): RestoreObjectOutput = {
    val __obj = js.Dynamic.literal()
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
    def setRequestCharged(value: RequestCharged): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
    @scala.inline
    def setRestoreOutputPath(value: RestoreOutputPath): Self = this.set("RestoreOutputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreOutputPath: Self = this.set("RestoreOutputPath", js.undefined)
  }
  
}

