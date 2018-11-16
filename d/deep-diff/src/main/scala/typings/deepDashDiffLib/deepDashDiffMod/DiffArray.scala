package typings
package deepDashDiffLib.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DiffArray[LHS, RHS] extends js.Object {
  var index: scala.Double
  var item: Diff[LHS, RHS]
  var kind: deepDashDiffLib.deepDashDiffLibStrings.A
  var path: js.UndefOr[js.Array[_]] = js.undefined
}

