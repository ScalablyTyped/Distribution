package typings
package clusterizeDotJsLib.clusterizeDotJsMod.ClusterizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callbacks extends js.Object {
  var clusterChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var clusterWillChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var scrollingProgress: js.UndefOr[js.Function1[/* progress */ scala.Double, scala.Unit]] = js.undefined
}

