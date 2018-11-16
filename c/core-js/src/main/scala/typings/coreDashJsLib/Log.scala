package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #############################################################################################
// Console - https://github.com/zloirock/core-js/#console
// Modules: core.log
// #############################################################################################
@js.native
trait Log
  extends nodeLib.Console {
  def apply(): scala.Unit = js.native
  def apply(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
}

