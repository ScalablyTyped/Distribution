package typings.awsSdkClientCodecommitNode.typesInvalidAuthorArnExceptionMod

import typings.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidAuthorArnException
  extends ServiceException[InvalidAuthorArnExceptionDetails]
     with ListPullRequestsExceptionsUnion {
  @JSName("name")
  var name_InvalidAuthorArnException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidAuthorArnException = js.native
}

