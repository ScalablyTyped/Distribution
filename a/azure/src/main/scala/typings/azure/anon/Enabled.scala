package typings.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enabled extends js.Object {
  var Enabled: Boolean
  var IncludeAPIs: Boolean
  var RetentionPolicy: Days
  var Version: Double
}

object Enabled {
  @scala.inline
  def apply(Enabled: Boolean, IncludeAPIs: Boolean, RetentionPolicy: Days, Version: Double): Enabled = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], IncludeAPIs = IncludeAPIs.asInstanceOf[js.Any], RetentionPolicy = RetentionPolicy.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
}

