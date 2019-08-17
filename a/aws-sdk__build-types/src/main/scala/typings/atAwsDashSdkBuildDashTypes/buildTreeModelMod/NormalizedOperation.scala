package typings.atAwsDashSdkBuildDashTypes.buildTreeModelMod

import typings.atAwsDashSdkBuildDashTypes.buildApiModelMod.Operation
import typings.atAwsDashSdkBuildDashTypes.buildApiModelMod.StructureMember
import typings.atAwsDashSdkTypes.buildProtocolMod.HttpTrait
import typings.atAwsDashSdkTypes.buildProtocolMod.SupportedSignatureVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedOperation extends Operation {
  @JSName("errors")
  var errors_NormalizedOperation: js.Array[StructureMember]
  @JSName("input")
  var input_NormalizedOperation: StructureMember
  @JSName("output")
  var output_NormalizedOperation: StructureMember
}

object NormalizedOperation {
  @scala.inline
  def apply(
    errors: js.Array[StructureMember],
    http: HttpTrait,
    input: StructureMember,
    name: String,
    output: StructureMember,
    authtype: SupportedSignatureVersion = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    documentation: String = null,
    documentationUrl: String = null
  ): NormalizedOperation = {
    val __obj = js.Dynamic.literal(errors = errors, http = http, input = input, name = name, output = output)
    if (authtype != null) __obj.updateDynamic("authtype")(authtype)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (documentationUrl != null) __obj.updateDynamic("documentationUrl")(documentationUrl)
    __obj.asInstanceOf[NormalizedOperation]
  }
}

