package typings.babelTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraverseOptions[S] extends Visitor[S] {
  var noScope: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[Scope] = js.undefined
}

