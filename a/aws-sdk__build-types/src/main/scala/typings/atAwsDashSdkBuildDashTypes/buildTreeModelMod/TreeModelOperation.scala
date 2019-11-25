package typings.atAwsDashSdkBuildDashTypes.buildTreeModelMod

import typings.atAwsDashSdkTypes.buildProtocolMod.HttpTrait
import typings.atAwsDashSdkTypes.buildProtocolMod.Member
import typings.atAwsDashSdkTypes.buildProtocolMod.ServiceMetadata
import typings.atAwsDashSdkTypes.buildProtocolMod.SupportedSignatureVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel because var conflicts: name. Inlined errors, http, input, metadata, output */ trait TreeModelOperation
  extends Documented
     with Named {
  var authtype: js.UndefOr[SupportedSignatureVersion] = js.undefined
  var errors: js.Array[Member | TreeModelOperationMember]
  var http: HttpTrait
  var input: Member | TreeModelOperationMember
  var metadata: ServiceMetadata
  var output: Member | TreeModelOperationMember
}

object TreeModelOperation {
  @scala.inline
  def apply(
    documentation: String,
    errors: js.Array[Member | TreeModelOperationMember],
    http: HttpTrait,
    input: Member | TreeModelOperationMember,
    metadata: ServiceMetadata,
    name: String,
    output: Member | TreeModelOperationMember,
    authtype: SupportedSignatureVersion = null
  ): TreeModelOperation = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    if (authtype != null) __obj.updateDynamic("authtype")(authtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelOperation]
  }
}

