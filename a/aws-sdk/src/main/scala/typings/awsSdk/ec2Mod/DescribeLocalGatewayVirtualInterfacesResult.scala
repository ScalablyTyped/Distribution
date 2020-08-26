package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayVirtualInterfacesResult extends js.Object {
  /**
    * Information about the virtual interfaces.
    */
  var LocalGatewayVirtualInterfaces: js.UndefOr[LocalGatewayVirtualInterfaceSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLocalGatewayVirtualInterfacesResult {
  @scala.inline
  def apply(): DescribeLocalGatewayVirtualInterfacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayVirtualInterfacesResult]
  }
  @scala.inline
  implicit class DescribeLocalGatewayVirtualInterfacesResultOps[Self <: DescribeLocalGatewayVirtualInterfacesResult] (val x: Self) extends AnyVal {
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
    def setLocalGatewayVirtualInterfacesVarargs(value: LocalGatewayVirtualInterface*): Self = this.set("LocalGatewayVirtualInterfaces", js.Array(value :_*))
    @scala.inline
    def setLocalGatewayVirtualInterfaces(value: LocalGatewayVirtualInterfaceSet): Self = this.set("LocalGatewayVirtualInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayVirtualInterfaces: Self = this.set("LocalGatewayVirtualInterfaces", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

