package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputParallelism extends js.Object {
  /**
    * Number of in-application streams to create. For more information, see Limits. 
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

