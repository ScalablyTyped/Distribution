package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputParallelism extends js.Object {
  /**
    * The number of in-application streams to create.
    */
  var Count: js.UndefOr[InputParallelismCount] = js.native
}

object InputParallelism {
  @scala.inline
  def apply(Count: js.UndefOr[InputParallelismCount] = js.undefined): InputParallelism = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParallelism]
  }
}

