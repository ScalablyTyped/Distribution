package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUploadBufferInput extends js.Object {
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object DescribeUploadBufferInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeUploadBufferInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeUploadBufferInput]
  }
}

