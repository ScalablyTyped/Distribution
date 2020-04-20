package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeListenerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the listener to describe.
    */
  var ListenerArn: GenericString = js.native
}

object DescribeListenerRequest {
  @scala.inline
  def apply(ListenerArn: GenericString): DescribeListenerRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeListenerRequest]
  }
}

