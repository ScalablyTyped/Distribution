package typings.awsSdkClientCodecommitNode.typesInvalidFileModeExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidFileModeException
  extends ServiceException[InvalidFileModeExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_InvalidFileModeException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFileModeException = js.native
}

