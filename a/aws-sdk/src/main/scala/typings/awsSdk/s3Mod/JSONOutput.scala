package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONOutput extends js.Object {
  /**
    * The value used to separate individual records in the output.
    */
  var RecordDelimiter: js.UndefOr[typings.awsSdk.s3Mod.RecordDelimiter] = js.native
}

object JSONOutput {
  @scala.inline
  def apply(RecordDelimiter: RecordDelimiter = null): JSONOutput = {
    val __obj = js.Dynamic.literal()
    if (RecordDelimiter != null) __obj.updateDynamic("RecordDelimiter")(RecordDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONOutput]
  }
}

