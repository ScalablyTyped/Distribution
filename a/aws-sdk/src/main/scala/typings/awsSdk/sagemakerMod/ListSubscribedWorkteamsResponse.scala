package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSubscribedWorkteamsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of work teams, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * An array of Workteam objects, each describing a work team.
    */
  var SubscribedWorkteams: typings.awsSdk.sagemakerMod.SubscribedWorkteams = js.native
}

object ListSubscribedWorkteamsResponse {
  @scala.inline
  def apply(SubscribedWorkteams: SubscribedWorkteams, NextToken: NextToken = null): ListSubscribedWorkteamsResponse = {
    val __obj = js.Dynamic.literal(SubscribedWorkteams = SubscribedWorkteams.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubscribedWorkteamsResponse]
  }
}

