package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TraversalHandlers[T] extends js.Object {
  var enter: js.UndefOr[TraversalHandler[T]] = js.undefined
  var exit: js.UndefOr[TraversalHandler[T]] = js.undefined
}

