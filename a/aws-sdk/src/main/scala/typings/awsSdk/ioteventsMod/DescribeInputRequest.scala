package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInputRequest extends js.Object {
  /**
    * The name of the input.
    */
  var inputName: InputName = js.native
}

object DescribeInputRequest {
  @scala.inline
  def apply(inputName: InputName): DescribeInputRequest = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeInputRequest]
  }
}

