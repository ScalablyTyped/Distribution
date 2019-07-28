package typings.clusterizeDotJs.clusterizeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callbacks extends js.Object {
  var clusterChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  var clusterWillChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollingProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.undefined
}

object Callbacks {
  @scala.inline
  def apply(
    clusterChanged: () => Unit = null,
    clusterWillChange: () => Unit = null,
    scrollingProgress: /* progress */ Double => Unit = null
  ): Callbacks = {
    val __obj = js.Dynamic.literal()
    if (clusterChanged != null) __obj.updateDynamic("clusterChanged")(js.Any.fromFunction0(clusterChanged))
    if (clusterWillChange != null) __obj.updateDynamic("clusterWillChange")(js.Any.fromFunction0(clusterWillChange))
    if (scrollingProgress != null) __obj.updateDynamic("scrollingProgress")(js.Any.fromFunction1(scrollingProgress))
    __obj.asInstanceOf[Callbacks]
  }
}

