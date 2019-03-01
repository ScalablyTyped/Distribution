package typings
package azureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var Enabled: scala.Boolean
  var IncludeAPIs: scala.Boolean
  var RetentionPolicy: Anon_Days
  var Version: scala.Double
}

object Anon_Enabled {
  @scala.inline
  def apply(
    Enabled: scala.Boolean,
    IncludeAPIs: scala.Boolean,
    RetentionPolicy: Anon_Days,
    Version: scala.Double
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Enabled")(Enabled)
    __obj.updateDynamic("IncludeAPIs")(IncludeAPIs)
    __obj.updateDynamic("RetentionPolicy")(RetentionPolicy)
    __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[Anon_Enabled]
  }
}

