package typings
package deepDashDiffLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object deepDashDiffMod {
  type Filter[LHS, RHS] = js.Function3[/* target */ LHS, /* source */ RHS, /* change */ Diff[LHS, RHS], scala.Boolean]
  type Observer[LHS, RHS] = js.Function1[/* diff */ Diff[LHS, RHS], scala.Unit]
  type PreFilter[LHS, RHS] = PreFilterFunction | (PreFilterObject[LHS, RHS])
  type PreFilterFunction = js.Function2[/* path */ js.Array[js.Any], /* key */ js.Any, scala.Boolean]
}
