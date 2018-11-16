package typings
package babelDashCoreLib.babelDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PluginObj[S] extends js.Object {
  var inherits: js.UndefOr[js.Any] = js.undefined
  var manipulateOptions: js.UndefOr[js.Function2[/* opts */ js.Any, /* parserOpts */ js.Any, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var post: js.UndefOr[js.ThisFunction1[/* this */ S, /* state */ js.Any, scala.Unit]] = js.undefined
  var pre: js.UndefOr[js.ThisFunction1[/* this */ S, /* state */ js.Any, scala.Unit]] = js.undefined
  var visitor: babelDashTraverseLib.babelDashTraverseMod.Visitor[S]
}

