package typings
package deepmergeLib.deepmergeMod.deepmergeNs

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
  var isMergeableObject: js.UndefOr[js.Function1[/* value */ js.Object, scala.Boolean]] = js.undefined
}

