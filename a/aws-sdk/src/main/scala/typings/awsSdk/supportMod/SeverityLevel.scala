package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeverityLevel extends js.Object {
  /**
    * The code for case severity level. Valid values: low | normal | high | urgent | critical 
    */
  var code: js.UndefOr[SeverityLevelCode] = js.native
  /**
    * The name of the severity level that corresponds to the severity level code.  The values returned by the API differ from the values that are displayed in the AWS Support Center. For example, for the code "low", the API name is "Low", but the name in the Support Center is "General guidance". These are the Support Center code/name mappings:    low: General guidance    normal: System impaired    high: Production system impaired    urgent: Production system down    critical: Business-critical system down    For more information, see Choosing a Severity 
    */
  var name: js.UndefOr[SeverityLevelName] = js.native
}

object SeverityLevel {
  @scala.inline
  def apply(code: SeverityLevelCode = null, name: SeverityLevelName = null): SeverityLevel = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeverityLevel]
  }
}

