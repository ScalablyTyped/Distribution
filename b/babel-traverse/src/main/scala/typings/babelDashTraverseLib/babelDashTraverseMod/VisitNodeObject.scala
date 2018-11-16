package typings
package babelDashTraverseLib.babelDashTraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VisitNodeObject[T] extends js.Object {
  var enter: js.UndefOr[js.Function2[/* path */ NodePath[T], /* state */ js.Any, scala.Unit]] = js.undefined
  var exit: js.UndefOr[js.Function2[/* path */ NodePath[T], /* state */ js.Any, scala.Unit]] = js.undefined
}

