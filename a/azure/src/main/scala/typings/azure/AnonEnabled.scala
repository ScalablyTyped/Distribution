package typings.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnabled extends js.Object {
  var Enabled: Boolean
  var IncludeAPIs: Boolean
  var RetentionPolicy: AnonDays
  var Version: Double
}

object AnonEnabled {
  @scala.inline
  def apply(Enabled: Boolean, IncludeAPIs: Boolean, RetentionPolicy: AnonDays, Version: Double): AnonEnabled = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], IncludeAPIs = IncludeAPIs.asInstanceOf[js.Any], RetentionPolicy = RetentionPolicy.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnabled]
  }
}

