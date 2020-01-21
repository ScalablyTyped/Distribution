package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlgorithmRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm to describe.
    */
  var algorithmArn: Arn = js.native
}

object DescribeAlgorithmRequest {
  @scala.inline
  def apply(algorithmArn: Arn): DescribeAlgorithmRequest = {
    val __obj = js.Dynamic.literal(algorithmArn = algorithmArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAlgorithmRequest]
  }
}

