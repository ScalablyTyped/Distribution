package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxSchemaAgreementWaitSeconds extends js.Object {
  var maxSchemaAgreementWaitSeconds: js.UndefOr[Double] = js.undefined
  var maxVersion: js.UndefOr[Double] = js.undefined
  var noCompact: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object MaxSchemaAgreementWaitSeconds {
  @scala.inline
  def apply(
    maxSchemaAgreementWaitSeconds: js.UndefOr[Double] = js.undefined,
    maxVersion: js.UndefOr[Double] = js.undefined,
    noCompact: js.UndefOr[Boolean] = js.undefined,
    port: js.UndefOr[Double] = js.undefined
  ): MaxSchemaAgreementWaitSeconds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxSchemaAgreementWaitSeconds)) __obj.updateDynamic("maxSchemaAgreementWaitSeconds")(maxSchemaAgreementWaitSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxVersion)) __obj.updateDynamic("maxVersion")(maxVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noCompact)) __obj.updateDynamic("noCompact")(noCompact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxSchemaAgreementWaitSeconds]
  }
}

