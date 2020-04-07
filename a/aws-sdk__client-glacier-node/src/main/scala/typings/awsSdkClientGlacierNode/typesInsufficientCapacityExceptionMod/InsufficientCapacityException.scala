package typings.awsSdkClientGlacierNode.typesInsufficientCapacityExceptionMod

import typings.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsufficientCapacityException
  extends ServiceException[InsufficientCapacityExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_InsufficientCapacityException: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException
}

object InsufficientCapacityException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InsufficientCapacityExceptionDetails,
    message: String,
    name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException,
    stack: String = null
  ): InsufficientCapacityException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsufficientCapacityException]
  }
}

