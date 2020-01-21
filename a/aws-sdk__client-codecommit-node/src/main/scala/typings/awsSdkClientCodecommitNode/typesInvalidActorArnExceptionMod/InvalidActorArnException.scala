package typings.awsSdkClientCodecommitNode.typesInvalidActorArnExceptionMod

import typings.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
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

