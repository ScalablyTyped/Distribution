package typings.awsSdkClientCodecommitNode.typesInvalidDeletionParameterExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidDeletionParameterException
  extends ServiceException[InvalidDeletionParameterExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_InvalidDeletionParameterException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDeletionParameterException = js.native
}

