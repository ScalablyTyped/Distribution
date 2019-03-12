package typings
package atBabelCoreLib.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginObj[S] extends js.Object {
  var inherits: js.UndefOr[js.Any] = js.undefined
  var manipulateOptions: js.UndefOr[js.Function2[/* opts */ js.Any, /* parserOpts */ js.Any, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var post: js.UndefOr[js.ThisFunction1[/* this */ S, /* state */ js.Any, scala.Unit]] = js.undefined
  var pre: js.UndefOr[js.ThisFunction1[/* this */ S, /* state */ js.Any, scala.Unit]] = js.undefined
  var visitor: atBabelTraverseLib.atBabelTraverseMod.Visitor[S]
}

object PluginObj {
  @scala.inline
  def apply[S](
    visitor: atBabelTraverseLib.atBabelTraverseMod.Visitor[S],
    inherits: js.Any = null,
    manipulateOptions: (/* opts */ js.Any, /* parserOpts */ js.Any) => scala.Unit = null,
    name: java.lang.String = null,
    post: js.ThisFunction1[/* this */ S, /* state */ js.Any, scala.Unit] = null,
    pre: js.ThisFunction1[/* this */ S, /* state */ js.Any, scala.Unit] = null
  ): PluginObj[S] = {
    val __obj = js.Dynamic.literal(visitor = visitor)
    if (inherits != null) __obj.updateDynamic("inherits")(inherits)
    if (manipulateOptions != null) __obj.updateDynamic("manipulateOptions")(js.Any.fromFunction2(manipulateOptions))
    if (name != null) __obj.updateDynamic("name")(name)
    if (post != null) __obj.updateDynamic("post")(post)
    if (pre != null) __obj.updateDynamic("pre")(pre)
    __obj.asInstanceOf[PluginObj[S]]
  }
}

