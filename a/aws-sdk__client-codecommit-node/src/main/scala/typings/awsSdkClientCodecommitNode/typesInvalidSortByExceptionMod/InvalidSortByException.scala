package typings.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod

import typings.awsSdkClientCodecommitNode.listRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidSortByException
  extends ServiceException[InvalidSortByExceptionDetails]
     with ListRepositoriesExceptionsUnion {
  @JSName("name")
  var name_InvalidSortByException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException = js.native
}

