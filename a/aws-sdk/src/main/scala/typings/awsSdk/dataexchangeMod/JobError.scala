package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobError extends js.Object {
  /**
    * The code for the job error.
    */
  var Code: typings.awsSdk.dataexchangeMod.Code = js.native
  var Details: js.UndefOr[typings.awsSdk.dataexchangeMod.Details] = js.native
  /**
    * The name of the limit that was reached.
    */
  var LimitName: js.UndefOr[JobErrorLimitName] = js.native
  /**
    * The value of the exceeded limit.
    */
  var LimitValue: js.UndefOr[double] = js.native
  /**
    * The message related to the job error.
    */
  var Message: string = js.native
  /**
    * The unique identifier for the resource related to the error.
    */
  var ResourceId: js.UndefOr[string] = js.native
  /**
    * The type of resource related to the error.
    */
  var ResourceType: js.UndefOr[JobErrorResourceTypes] = js.native
}

object JobError {
  @scala.inline
  def apply(
    Code: Code,
    Message: string,
    Details: Details = null,
    LimitName: JobErrorLimitName = null,
    LimitValue: js.UndefOr[double] = js.undefined,
    ResourceId: string = null,
    ResourceType: JobErrorResourceTypes = null
  ): JobError = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (LimitName != null) __obj.updateDynamic("LimitName")(LimitName.asInstanceOf[js.Any])
    if (!js.isUndefined(LimitValue)) __obj.updateDynamic("LimitValue")(LimitValue.get.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobError]
  }
}

