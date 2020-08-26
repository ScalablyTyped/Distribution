package typings.awsSdkClientGlacierNode.typesInsufficientCapacityExceptionMod

import typings.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsufficientCapacityException
  extends ServiceException[InsufficientCapacityExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_InsufficientCapacityException: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException = js.native
}

object InsufficientCapacityException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InsufficientCapacityExceptionDetails,
    message: String,
    name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException
  ): InsufficientCapacityException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsufficientCapacityException]
  }
  @scala.inline
  implicit class InsufficientCapacityExceptionOps[Self <: InsufficientCapacityException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(
      value: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

