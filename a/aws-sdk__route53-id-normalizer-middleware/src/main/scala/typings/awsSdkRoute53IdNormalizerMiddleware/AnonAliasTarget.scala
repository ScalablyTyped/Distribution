package typings.awsSdkRoute53IdNormalizerMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAliasTarget extends js.Object {
  var AliasTarget: js.UndefOr[AnonHostedZoneId] = js.undefined
}

object AnonAliasTarget {
  @scala.inline
  def apply(AliasTarget: AnonHostedZoneId = null): AnonAliasTarget = {
    val __obj = js.Dynamic.literal()
    if (AliasTarget != null) __obj.updateDynamic("AliasTarget")(AliasTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAliasTarget]
  }
}

