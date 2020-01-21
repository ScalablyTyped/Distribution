package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSolutionVersionResponse extends js.Object {
  /**
    * The ARN of the new solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
}

object CreateSolutionVersionResponse {
  @scala.inline
  def apply(solutionVersionArn: Arn = null): CreateSolutionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSolutionVersionResponse]
  }
}

