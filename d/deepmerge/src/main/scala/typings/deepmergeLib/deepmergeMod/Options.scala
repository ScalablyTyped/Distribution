package typings
package deepmergeLib.deepmergeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arrayMerge: js.UndefOr[
    js.Function3[
      /* target */ js.Array[_], 
      /* source */ js.Array[_], 
      /* options */ js.UndefOr[this.type], 
      js.Array[_]
    ]
  ] = js.undefined
  @JSName("clone")
  var clone_FOptions: js.UndefOr[scala.Boolean] = js.undefined
  var customMerge: js.UndefOr[
    js.Function2[
      /* key */ java.lang.String, 
      /* options */ js.UndefOr[Options], 
      js.UndefOr[js.Function2[/* x */ _, /* y */ _, _]]
    ]
  ] = js.undefined
  var isMergeableObject: js.UndefOr[js.Function1[/* value */ js.Object, scala.Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrayMerge: (/* target */ js.Array[_], /* source */ js.Array[_], /* options */ js.UndefOr[Options]) => js.Array[_] = null,
    clone: js.UndefOr[scala.Boolean] = js.undefined,
    customMerge: (/* key */ java.lang.String, /* options */ js.UndefOr[Options]) => js.UndefOr[js.Function2[/* x */ _, /* y */ _, _]] = null,
    isMergeableObject: /* value */ js.Object => scala.Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrayMerge != null) __obj.updateDynamic("arrayMerge")(js.Any.fromFunction3(arrayMerge))
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (customMerge != null) __obj.updateDynamic("customMerge")(js.Any.fromFunction2(customMerge))
    if (isMergeableObject != null) __obj.updateDynamic("isMergeableObject")(js.Any.fromFunction1(isMergeableObject))
    __obj.asInstanceOf[Options]
  }
}

