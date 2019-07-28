package typings.deepDashDiff.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreFilterObject[LHS, RHS] extends js.Object {
  var normalize: js.UndefOr[
    js.Function4[
      /* currentPath */ js.Any, 
      /* key */ js.Any, 
      /* lhs */ LHS, 
      /* rhs */ RHS, 
      js.UndefOr[js.Tuple2[LHS, RHS]]
    ]
  ] = js.undefined
  var prefilter: js.UndefOr[js.Function2[/* path */ js.Array[_], /* key */ js.Any, Boolean]] = js.undefined
}

object PreFilterObject {
  @scala.inline
  def apply[LHS, RHS](
    normalize: (/* currentPath */ js.Any, /* key */ js.Any, /* lhs */ LHS, /* rhs */ RHS) => js.UndefOr[js.Tuple2[LHS, RHS]] = null,
    prefilter: (/* path */ js.Array[_], /* key */ js.Any) => Boolean = null
  ): PreFilterObject[LHS, RHS] = {
    val __obj = js.Dynamic.literal()
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction4(normalize))
    if (prefilter != null) __obj.updateDynamic("prefilter")(js.Any.fromFunction2(prefilter))
    __obj.asInstanceOf[PreFilterObject[LHS, RHS]]
  }
}

