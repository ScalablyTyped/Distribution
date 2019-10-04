package typings.ddDashTrace.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait Analyzable extends js.Object {
  /**
    * Whether to enable App Analytics. Can also be set to a number instead to
    * control the sample rate.
    */
  var analytics: js.UndefOr[Boolean | Double] = js.undefined
}

object Analyzable {
  @scala.inline
  def apply(analytics: Boolean | Double = null): Analyzable = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analyzable]
  }
}

