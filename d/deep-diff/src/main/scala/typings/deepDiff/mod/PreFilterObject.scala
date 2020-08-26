package typings.deepDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreFilterObject[LHS, RHS] extends js.Object {
  var normalize: js.UndefOr[
    js.Function4[
      /* currentPath */ js.Any, 
      /* key */ js.Any, 
      /* lhs */ LHS, 
      /* rhs */ RHS, 
      js.UndefOr[js.Tuple2[LHS, RHS]]
    ]
  ] = js.native
  var prefilter: js.UndefOr[js.Function2[/* path */ js.Array[_], /* key */ js.Any, Boolean]] = js.native
}

object PreFilterObject {
  @scala.inline
  def apply[LHS, RHS](): PreFilterObject[LHS, RHS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreFilterObject[LHS, RHS]]
  }
  @scala.inline
  implicit class PreFilterObjectOps[Self <: PreFilterObject[_, _], LHS, RHS] (val x: Self with (PreFilterObject[LHS, RHS])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNormalize(
      value: (/* currentPath */ js.Any, /* key */ js.Any, /* lhs */ LHS, /* rhs */ RHS) => js.UndefOr[js.Tuple2[LHS, RHS]]
    ): Self = this.set("normalize", js.Any.fromFunction4(value))
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    @scala.inline
    def setPrefilter(value: (/* path */ js.Array[_], /* key */ js.Any) => Boolean): Self = this.set("prefilter", js.Any.fromFunction2(value))
    @scala.inline
    def deletePrefilter: Self = this.set("prefilter", js.undefined)
  }
  
}

