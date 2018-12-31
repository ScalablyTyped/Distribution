package typings
package deepDashDiffLib.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffDeleted[LHS] extends js.Object {
  var kind: deepDashDiffLib.deepDashDiffLibStrings.D
  var lhs: LHS
  var path: js.UndefOr[js.Array[_]] = js.undefined
}

