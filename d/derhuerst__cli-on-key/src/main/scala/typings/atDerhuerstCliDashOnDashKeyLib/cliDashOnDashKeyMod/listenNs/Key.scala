package typings
package atDerhuerstCliDashOnDashKeyLib.cliDashOnDashKeyMod.listenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var ctrl: scala.Boolean
  var meta: scala.Boolean
  var name: js.UndefOr[java.lang.String] = js.undefined
   // ansi code leaving out leading \x1b's
  var raw: java.lang.String
  var sequence: java.lang.String
  var shift: scala.Boolean
}

