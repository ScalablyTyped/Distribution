package typings.atAwsDashSdkRoute53DashIdDashNormalizerDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AliasTarget extends js.Object {
  var AliasTarget: js.UndefOr[Anon_HostedZoneId] = js.undefined
}

object Anon_AliasTarget {
  @scala.inline
  def apply(AliasTarget: Anon_HostedZoneId = null): Anon_AliasTarget = {
    val __obj = js.Dynamic.literal()
    if (AliasTarget != null) __obj.updateDynamic("AliasTarget")(AliasTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AliasTarget]
  }
}

