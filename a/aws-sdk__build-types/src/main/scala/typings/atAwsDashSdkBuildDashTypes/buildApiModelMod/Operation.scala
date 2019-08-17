package typings.atAwsDashSdkBuildDashTypes.buildApiModelMod

import typings.atAwsDashSdkTypes.buildProtocolMod.HttpTrait
import typings.atAwsDashSdkTypes.buildProtocolMod.SupportedSignatureVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  var authtype: js.UndefOr[SupportedSignatureVersion] = js.undefined
  var deprecated: js.UndefOr[scala.Boolean] = js.undefined
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  var documentationUrl: js.UndefOr[java.lang.String] = js.undefined
  var errors: js.UndefOr[js.Array[StructureMember]] = js.undefined
  var http: HttpTrait
  var input: js.UndefOr[StructureMember] = js.undefined
  var name: java.lang.String
  var output: js.UndefOr[StructureMember] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    http: HttpTrait,
    name: java.lang.String,
    authtype: SupportedSignatureVersion = null,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    documentationUrl: java.lang.String = null,
    errors: js.Array[StructureMember] = null,
    input: StructureMember = null,
    output: StructureMember = null
  ): Operation = {
    val __obj = js.Dynamic.literal(http = http, name = name)
    if (authtype != null) __obj.updateDynamic("authtype")(authtype)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (documentationUrl != null) __obj.updateDynamic("documentationUrl")(documentationUrl)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (input != null) __obj.updateDynamic("input")(input)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[Operation]
  }
}

