package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNetworkInterfacesResult extends js.Object {
  /**
    * Information about one or more network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[NetworkInterfaceList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeNetworkInterfacesResult {
  @scala.inline
  def apply(): DescribeNetworkInterfacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInterfacesResult]
  }
  @scala.inline
  implicit class DescribeNetworkInterfacesResultOps[Self <: DescribeNetworkInterfacesResult] (val x: Self) extends AnyVal {
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
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = this.set("NetworkInterfaces", js.Array(value :_*))
    @scala.inline
    def setNetworkInterfaces(value: NetworkInterfaceList): Self = this.set("NetworkInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("NetworkInterfaces", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

