package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketEncryptionOutput extends js.Object {
  var ServerSideEncryptionConfiguration: js.UndefOr[typings.awsSdk.s3Mod.ServerSideEncryptionConfiguration] = js.native
}

object GetBucketEncryptionOutput {
  @scala.inline
  def apply(): GetBucketEncryptionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketEncryptionOutput]
  }
  @scala.inline
  implicit class GetBucketEncryptionOutputOps[Self <: GetBucketEncryptionOutput] (val x: Self) extends AnyVal {
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
    def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = this.set("ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideEncryptionConfiguration: Self = this.set("ServerSideEncryptionConfiguration", js.undefined)
  }
  
}

