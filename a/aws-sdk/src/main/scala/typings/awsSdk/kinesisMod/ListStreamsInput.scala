package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsInput extends js.Object {
  /**
    * The name of the stream to start the list with.
    */
  var ExclusiveStartStreamName: js.UndefOr[StreamName] = js.native
  /**
    * The maximum number of streams to list.
    */
  var Limit: js.UndefOr[ListStreamsInputLimit] = js.native
}

object ListStreamsInput {
  @scala.inline
  def apply(
    ExclusiveStartStreamName: StreamName = null,
    Limit: js.UndefOr[ListStreamsInputLimit] = js.undefined
  ): ListStreamsInput = {
    val __obj = js.Dynamic.literal()
    if (ExclusiveStartStreamName != null) __obj.updateDynamic("ExclusiveStartStreamName")(ExclusiveStartStreamName.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamsInput]
  }
}

