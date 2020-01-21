package typings.awsSdkClientCodecommitNode.typesMultipleRepositoriesInPullRequestExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleRepositoriesInPullRequestException
  extends ServiceException[MultipleRepositoriesInPullRequestExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_MultipleRepositoriesInPullRequestException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MultipleRepositoriesInPullRequestException = js.native
}

