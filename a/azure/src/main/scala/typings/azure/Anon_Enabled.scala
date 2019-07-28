package typings.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var Enabled: Boolean
  var IncludeAPIs: Boolean
  var RetentionPolicy: Anon_Days
  var Version: Double
}

object Anon_Enabled {
  @scala.inline
  def apply(Enabled: Boolean, IncludeAPIs: Boolean, RetentionPolicy: Anon_Days, Version: Double): Anon_Enabled = {
    val __obj = js.Dynamic.literal(Enabled = Enabled, IncludeAPIs = IncludeAPIs, RetentionPolicy = RetentionPolicy, Version = Version)
  
    __obj.asInstanceOf[Anon_Enabled]
  }
}

