package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicAccessBlockOutput extends js.Object {
  /**
    * The PublicAccessBlock configuration currently in effect for this Amazon Web Services account.
    */
  var PublicAccessBlockConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.PublicAccessBlockConfiguration] = js.native
}

object GetPublicAccessBlockOutput {
  @scala.inline
  def apply(): GetPublicAccessBlockOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicAccessBlockOutput]
  }
  @scala.inline
  implicit class GetPublicAccessBlockOutputOps[Self <: GetPublicAccessBlockOutput] (val x: Self) extends AnyVal {
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
    def setPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = this.set("PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicAccessBlockConfiguration: Self = this.set("PublicAccessBlockConfiguration", js.undefined)
  }
  
}

