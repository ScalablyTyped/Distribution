package typings.computeScrollIntoView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomScrollBoundary = typings.std.Element | typings.computeScrollIntoView.mod.CustomScrollBoundaryCallback | scala.Null
  type CustomScrollBoundaryCallback = js.Function1[/* parent */ typings.std.Element, scala.Boolean]
  type SkipOverflowHiddenElements = scala.Boolean
}
