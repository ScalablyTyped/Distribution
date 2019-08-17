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
    errors: js.Array[TreeModelOperationMember],
    http: HttpTrait,
    input: TreeModelOperationMember,
    metadata: ServiceMetadata,
    name: String,
    output: TreeModelOperationMember,
    authtype: SupportedSignatureVersion = null
  ): TreeModelOperation = {
    val __obj = js.Dynamic.literal(documentation = documentation, errors = errors, http = http, input = input, metadata = metadata, name = name, output = output)
    if (authtype != null) __obj.updateDynamic("authtype")(authtype)
    __obj.asInstanceOf[TreeModelOperation]
  }
}

