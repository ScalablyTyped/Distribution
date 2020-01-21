package typings.awsSdkClientCodecommitNode.typesInvalidTargetExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidTargetException
  extends ServiceException[InvalidTargetExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_InvalidTargetException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTargetException = js.native
}

