package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSolutionResponse extends js.Object {
  /**
    * The ARN of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.native
}

object CreateSolutionResponse {
  @scala.inline
  def apply(solutionArn: Arn = null): CreateSolutionResponse = {
    val __obj = js.Dynamic.literal()
    if (solutionArn != null) __obj.updateDynamic("solutionArn")(solutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSolutionResponse]
  }
}

