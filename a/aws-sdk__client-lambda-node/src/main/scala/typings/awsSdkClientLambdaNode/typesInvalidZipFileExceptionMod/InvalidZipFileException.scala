package typings.awsSdkClientLambdaNode.typesInvalidZipFileExceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidZipFileException
  extends ServiceException[InvalidZipFileExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidZipFileException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidZipFileException = js.native
}

