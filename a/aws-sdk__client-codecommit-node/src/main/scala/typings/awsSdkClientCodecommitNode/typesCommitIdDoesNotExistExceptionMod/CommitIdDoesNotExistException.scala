package typings.awsSdkClientCodecommitNode.typesCommitIdDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.getCommitExceptionsUnionMod.GetCommitExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitIdDoesNotExistException
  extends ServiceException[CommitIdDoesNotExistExceptionDetails]
     with GetCommitExceptionsUnion {
  @JSName("name")
  var name_CommitIdDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitIdDoesNotExistException = js.native
}

