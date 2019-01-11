package typings
package atBabelTraverseLib.atBabelTraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisitNodeObject[S, P] extends js.Object {
  var enter: js.UndefOr[VisitNodeFunction[S, P]] = js.undefined
  var exit: js.UndefOr[VisitNodeFunction[S, P]] = js.undefined
}

