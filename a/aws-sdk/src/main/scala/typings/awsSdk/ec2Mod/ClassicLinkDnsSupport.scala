package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassicLinkDnsSupport extends js.Object {
  /**
    * Indicates whether ClassicLink DNS support is enabled for the VPC.
    */
  var ClassicLinkDnsSupported: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object ClassicLinkDnsSupport {
  @scala.inline
  def apply(): ClassicLinkDnsSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassicLinkDnsSupport]
  }
  @scala.inline
  implicit class ClassicLinkDnsSupportOps[Self <: ClassicLinkDnsSupport] (val x: Self) extends AnyVal {
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
    def setClassicLinkDnsSupported(value: Boolean): Self = this.set("ClassicLinkDnsSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassicLinkDnsSupported: Self = this.set("ClassicLinkDnsSupported", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

