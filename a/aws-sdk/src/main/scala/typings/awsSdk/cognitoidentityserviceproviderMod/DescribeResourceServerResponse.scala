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
}

