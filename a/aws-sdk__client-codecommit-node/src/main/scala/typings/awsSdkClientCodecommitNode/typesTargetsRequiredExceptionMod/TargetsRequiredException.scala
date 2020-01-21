package typings.awsSdkClientCodecommitNode.typesTargetsRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetsRequiredException
  extends ServiceException[TargetsRequiredExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_TargetsRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TargetsRequiredException = js.native
}

