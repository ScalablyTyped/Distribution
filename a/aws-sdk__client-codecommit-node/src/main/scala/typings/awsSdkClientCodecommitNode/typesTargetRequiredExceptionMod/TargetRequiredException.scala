package typings.awsSdkClientCodecommitNode.typesTargetRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetRequiredException
  extends ServiceException[TargetRequiredExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_TargetRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TargetRequiredException = js.native
}

