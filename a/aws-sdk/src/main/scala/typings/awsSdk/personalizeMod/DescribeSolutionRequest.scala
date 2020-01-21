package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSolutionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the solution to describe.
    */
  var solutionArn: Arn = js.native
}

object DescribeSolutionRequest {
  @scala.inline
  def apply(solutionArn: Arn): DescribeSolutionRequest = {
    val __obj = js.Dynamic.literal(solutionArn = solutionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeSolutionRequest]
  }
}

