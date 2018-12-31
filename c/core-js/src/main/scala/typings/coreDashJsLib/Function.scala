package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #############################################################################################
// Partial application - https://github.com/zloirock/core-js/#partial-application
// Modules: core.function.part
// #############################################################################################
@js.native
trait Function extends js.Object {
  /**
    * Non-standard.
    */
  def part(args: js.Any*): js.Any = js.native
}

