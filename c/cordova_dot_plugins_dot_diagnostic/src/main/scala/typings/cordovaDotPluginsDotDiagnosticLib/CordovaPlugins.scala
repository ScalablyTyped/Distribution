package typings
package cordovaDotPluginsDotDiagnosticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var diagnostic: Diagnostic
}

object CordovaPlugins {
  @scala.inline
  def apply(diagnostic: Diagnostic): CordovaPlugins = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diagnostic")(diagnostic)
    __obj.asInstanceOf[CordovaPlugins]
  }
}

