package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputParallelismUpdate extends js.Object {
  /**
    * The number of in-application streams to create for the specified streaming source.
    */
  var CountUpdate: InputParallelismCount = js.native
}

object InputParallelismUpdate {
  @scala.inline
  def apply(CountUpdate: InputParallelismCount): InputParallelismUpdate = {
    val __obj = js.Dynamic.literal(CountUpdate = CountUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParallelismUpdate]
  }
}

