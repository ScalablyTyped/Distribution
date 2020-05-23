package typings.awsSdkRoute53IdNormalizerMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasTarget extends js.Object {
  var AliasTarget: js.UndefOr[HostedZoneId] = js.undefined
}

object AliasTarget {
  @scala.inline
  def apply(AliasTarget: HostedZoneId = null): AliasTarget = {
    val __obj = js.Dynamic.literal()
    if (AliasTarget != null) __obj.updateDynamic("AliasTarget")(AliasTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasTarget]
  }
}

