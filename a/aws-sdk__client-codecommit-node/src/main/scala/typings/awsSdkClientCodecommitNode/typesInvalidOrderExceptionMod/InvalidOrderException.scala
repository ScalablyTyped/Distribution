package typings.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod

import typings.awsSdkClientCodecommitNode.listRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidOrderException
  extends ServiceException[InvalidOrderExceptionDetails]
     with ListRepositoriesExceptionsUnion {
  @JSName("name")
  var name_InvalidOrderException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidOrderException = js.native
}

