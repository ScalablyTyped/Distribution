package typings.awsSdkClientSqsNode.typesOverLimitMod

import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverLimit extends ServiceException[OverLimitDetails] {
  @JSName("name")
  var name_OverLimit: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.OverLimit
}

object OverLimit {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: OverLimitDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.OverLimit,
    stack: String = null
  ): OverLimit = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverLimit]
  }
}

