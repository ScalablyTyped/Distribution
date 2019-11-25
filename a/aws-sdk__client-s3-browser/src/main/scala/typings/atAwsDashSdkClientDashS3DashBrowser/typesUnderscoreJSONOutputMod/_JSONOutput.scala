package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreJSONOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _JSONOutput extends js.Object {
  /**
    * <p>The value used to separate individual records in the output.</p>
    */
  var RecordDelimiter: js.UndefOr[String] = js.undefined
}

object _JSONOutput {
  @scala.inline
  def apply(RecordDelimiter: String = null): _JSONOutput = {
    val __obj = js.Dynamic.literal()
    if (RecordDelimiter != null) __obj.updateDynamic("RecordDelimiter")(RecordDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[_JSONOutput]
  }
}

