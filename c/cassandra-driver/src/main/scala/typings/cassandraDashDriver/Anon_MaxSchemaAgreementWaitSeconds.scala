package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxSchemaAgreementWaitSeconds extends js.Object {
  var maxSchemaAgreementWaitSeconds: js.UndefOr[Double] = js.undefined
  var maxVersion: js.UndefOr[Double] = js.undefined
  var noCompact: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object Anon_MaxSchemaAgreementWaitSeconds {
  @scala.inline
  def apply(
    maxSchemaAgreementWaitSeconds: Int | Double = null,
    maxVersion: Int | Double = null,
    noCompact: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null
  ): Anon_MaxSchemaAgreementWaitSeconds = {
    val __obj = js.Dynamic.literal()
    if (maxSchemaAgreementWaitSeconds != null) __obj.updateDynamic("maxSchemaAgreementWaitSeconds")(maxSchemaAgreementWaitSeconds.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(noCompact)) __obj.updateDynamic("noCompact")(noCompact.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxSchemaAgreementWaitSeconds]
  }
}

