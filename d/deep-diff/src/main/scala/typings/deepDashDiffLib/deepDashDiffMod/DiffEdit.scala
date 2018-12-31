package typings
package deepDashDiffLib.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffEdit[LHS, RHS] extends js.Object {
  var kind: deepDashDiffLib.deepDashDiffLibStrings.E
  var lhs: LHS
  var path: js.UndefOr[js.Array[_]] = js.undefined
  var rhs: RHS
}

