package typings.cordovaPluginsDiagnostic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CordovaPlugins extends js.Object {
  var diagnostic: Diagnostic = js.native
}

object CordovaPlugins {
  @scala.inline
  def apply(diagnostic: Diagnostic): CordovaPlugins = {
    val __obj = js.Dynamic.literal(diagnostic = diagnostic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  @scala.inline
  implicit class CordovaPluginsOps[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
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
    def setDiagnostic(value: Diagnostic): Self = this.set("diagnostic", value.asInstanceOf[js.Any])
  }
  
}

