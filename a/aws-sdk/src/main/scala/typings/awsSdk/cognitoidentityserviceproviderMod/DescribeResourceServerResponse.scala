package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourceServerResponse extends js.Object {
  /**
    * The resource server.
    */
  var ResourceServer: ResourceServerType = js.native
}

object DescribeResourceServerResponse {
  @scala.inline
  def apply(ResourceServer: ResourceServerType): DescribeResourceServerResponse = {
    val __obj = js.Dynamic.literal(ResourceServer = ResourceServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceServerResponse]
  }
  @scala.inline
  implicit class DescribeResourceServerResponseOps[Self <: DescribeResourceServerResponse] (val x: Self) extends AnyVal {
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
    def setResourceServer(value: ResourceServerType): Self = this.set("ResourceServer", value.asInstanceOf[js.Any])
  }
  
}

