package typings.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxSchemaAgreementWaitSeconds extends js.Object {
  var maxSchemaAgreementWaitSeconds: js.UndefOr[Double] = js.undefined
  var maxVersion: js.UndefOr[Double] = js.undefined
  var noCompact: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object AnonMaxSchemaAgreementWaitSeconds {
  @scala.inline
  def apply(
    maxSchemaAgreementWaitSeconds: Int | Double = null,
    maxVersion: Int | Double = null,
    noCompact: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null
  ): AnonMaxSchemaAgreementWaitSeconds = {
    val __obj = js.Dynamic.literal()
    if (maxSchemaAgreementWaitSeconds != null) __obj.updateDynamic("maxSchemaAgreementWaitSeconds")(maxSchemaAgreementWaitSeconds.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(noCompact)) __obj.updateDynamic("noCompact")(noCompact.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxSchemaAgreementWaitSeconds]
  }
}

