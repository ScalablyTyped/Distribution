package typings.awsSdkClientSqsNode.typesMessageNotInflightMod

import typings.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageNotInflight
  extends ServiceException[MessageNotInflightDetails]
     with ChangeMessageVisibilityExceptionsUnion {
  @JSName("name")
  var name_MessageNotInflight: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight
}

object MessageNotInflight {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MessageNotInflightDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight,
    stack: String = null
  ): MessageNotInflight = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageNotInflight]
  }
}

