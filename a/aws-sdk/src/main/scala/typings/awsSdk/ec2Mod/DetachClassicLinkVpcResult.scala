package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachClassicLinkVpcResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object DetachClassicLinkVpcResult {
  @scala.inline
  def apply(): DetachClassicLinkVpcResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachClassicLinkVpcResult]
  }
  @scala.inline
  implicit class DetachClassicLinkVpcResultOps[Self <: DetachClassicLinkVpcResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReturn(value: Boolean): Self = this.set("Return", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn: Self = this.set("Return", js.undefined)
  }
  
}

