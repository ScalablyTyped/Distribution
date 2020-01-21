package typings.awsSdkBuildTypes.treeModelMod

import typings.awsSdkBuildTypes.apiModelMod.Operation
import typings.awsSdkBuildTypes.apiModelMod.StructureMember
import typings.awsSdkTypes.protocolMod.HttpTrait
import typings.awsSdkTypes.protocolMod.SupportedSignatureVersion
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
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    if (authtype != null) __obj.updateDynamic("authtype")(authtype.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (documentationUrl != null) __obj.updateDynamic("documentationUrl")(documentationUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOperation]
  }
}

