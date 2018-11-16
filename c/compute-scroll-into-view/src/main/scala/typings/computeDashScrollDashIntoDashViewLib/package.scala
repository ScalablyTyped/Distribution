package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object computeDashScrollDashIntoDashViewLib {
  type CustomScrollBoundary = stdLib.Element | CustomScrollBoundaryCallback | scala.Null
  type CustomScrollBoundaryCallback = js.Function1[/* parent */ stdLib.Element, scala.Boolean]
  type ScrollLogicalPosition = computeDashScrollDashIntoDashViewLib.computeDashScrollDashIntoDashViewLibStrings.start | computeDashScrollDashIntoDashViewLib.computeDashScrollDashIntoDashViewLibStrings.center | computeDashScrollDashIntoDashViewLib.computeDashScrollDashIntoDashViewLibStrings.end | computeDashScrollDashIntoDashViewLib.computeDashScrollDashIntoDashViewLibStrings.nearest
  type ScrollMode = computeDashScrollDashIntoDashViewLib.computeDashScrollDashIntoDashViewLibStrings.always | computeDashScrollDashIntoDashViewLib.computeDashScrollDashIntoDashViewLibStrings.`if-needed`
  type SkipOverflowHiddenElements = scala.Boolean
}
