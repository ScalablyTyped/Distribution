package typings.babelDashCore.babelDashCoreMod

import typings.babelDashTraverse.babelDashTraverseMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginObj[S] extends js.Object {
  var inherits: js.UndefOr[js.Any] = js.undefined
  var manipulateOptions: js.UndefOr[js.Function2[/* opts */ js.Any, /* parserOpts */ js.Any, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var post: js.UndefOr[js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit]] = js.undefined
  var pre: js.UndefOr[js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit]] = js.undefined
  var visitor: Visitor[S]
}

object PluginObj {
  @scala.inline
  def apply[S](
    visitor: Visitor[S],
    inherits: js.Any = null,
    manipulateOptions: (/* opts */ js.Any, /* parserOpts */ js.Any) => Unit = null,
    name: String = null,
    post: js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit] = null,
    pre: js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit] = null
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

