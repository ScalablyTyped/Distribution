package typings.awsSdkClientCodecommitNode.typesInvalidActorArnExceptionMod

import typings.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidActorArnException
  extends ServiceException[InvalidActorArnExceptionDetails]
     with DescribePullRequestEventsExceptionsUnion {
  @JSName("name")
  var name_InvalidActorArnException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidActorArnException = js.native
}

object InvalidActorArnException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidActorArnExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidActorArnException
  ): InvalidActorArnException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidActorArnException]
  }
  @scala.inline
  implicit class InvalidActorArnExceptionOps[Self <: InvalidActorArnException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidActorArnException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

