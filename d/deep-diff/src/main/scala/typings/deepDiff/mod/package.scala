package typings.deepDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Filter[LHS, RHS] = js.Function3[
    /* target */ LHS, 
    /* source */ RHS, 
    /* change */ typings.deepDiff.mod.Diff_[LHS, RHS], 
    scala.Boolean
  ]
  type Observer[LHS, RHS] = js.Function1[/* diff */ typings.deepDiff.mod.Diff_[LHS, RHS], scala.Unit]
  type PreFilter[LHS, RHS] = typings.deepDiff.mod.PreFilterFunction | (typings.deepDiff.mod.PreFilterObject[LHS, RHS])
  type PreFilterFunction = js.Function2[/* path */ js.Array[js.Any], /* key */ js.Any, scala.Boolean]
}
