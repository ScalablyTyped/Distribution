package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTargetsResult extends js.Object {
  /**
    * An enumeration token that can be used in a request to return the next batch of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.NextToken] = js.native
  /**
    * The list of notification rule targets. 
    */
  var Targets: js.UndefOr[TargetsBatch] = js.native
}

object ListTargetsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Targets: TargetsBatch = null): ListTargetsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsResult]
  }
}

