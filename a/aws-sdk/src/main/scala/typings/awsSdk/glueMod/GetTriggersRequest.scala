package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTriggersRequest extends js.Object {
  /**
    * The name of the job to retrieve triggers for. The trigger that can start this job is returned, and if there is no such trigger, all triggers are returned.
    */
  var DependentJobName: js.UndefOr[NameString] = js.native
  /**
    * The maximum size of the response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object GetTriggersRequest {
  @scala.inline
  def apply(
    DependentJobName: NameString = null,
    MaxResults: Int | Double = null,
    NextToken: GenericString = null
  ): GetTriggersRequest = {
    val __obj = js.Dynamic.literal()
    if (DependentJobName != null) __obj.updateDynamic("DependentJobName")(DependentJobName.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTriggersRequest]
  }
}

