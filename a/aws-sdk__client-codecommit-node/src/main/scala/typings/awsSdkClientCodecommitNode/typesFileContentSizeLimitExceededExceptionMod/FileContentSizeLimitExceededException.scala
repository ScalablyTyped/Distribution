package typings.awsSdkClientCodecommitNode.typesFileContentSizeLimitExceededExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileContentSizeLimitExceededException
  extends ServiceException[FileContentSizeLimitExceededExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_FileContentSizeLimitExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentSizeLimitExceededException = js.native
}

