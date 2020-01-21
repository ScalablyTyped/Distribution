package typings.awsSdkClientCodecommitNode.typesSameFileContentExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SameFileContentException
  extends ServiceException[SameFileContentExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_SameFileContentException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SameFileContentException = js.native
}

