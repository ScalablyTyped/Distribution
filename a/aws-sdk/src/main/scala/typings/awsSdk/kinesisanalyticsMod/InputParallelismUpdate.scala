package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputParallelismUpdate extends js.Object {
  /**
    * Number of in-application streams to create for the specified streaming source.
    */
  var CountUpdate: js.UndefOr[InputParallelismCount] = js.native
}

object InputParallelismUpdate {
  @scala.inline
  def apply(CountUpdate: js.UndefOr[InputParallelismCount] = js.undefined): InputParallelismUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CountUpdate)) __obj.updateDynamic("CountUpdate")(CountUpdate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParallelismUpdate]
  }
}

