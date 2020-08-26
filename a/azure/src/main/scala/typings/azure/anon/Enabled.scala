package typings.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enabled extends js.Object {
  var Enabled: Boolean = js.native
  var IncludeAPIs: Boolean = js.native
  var RetentionPolicy: Days = js.native
  var Version: Double = js.native
}

object Enabled {
  @scala.inline
  def apply(Enabled: Boolean, IncludeAPIs: Boolean, RetentionPolicy: Days, Version: Double): Enabled = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], IncludeAPIs = IncludeAPIs.asInstanceOf[js.Any], RetentionPolicy = RetentionPolicy.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  @scala.inline
  implicit class EnabledOps[Self <: Enabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeAPIs(value: Boolean): Self = this.set("IncludeAPIs", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetentionPolicy(value: Days): Self = this.set("RetentionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
  
}

