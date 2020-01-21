package typings.awsSdkClientCodecommitNode.typesFileContentRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileContentRequiredException
  extends ServiceException[FileContentRequiredExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_FileContentRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentRequiredException = js.native
}

