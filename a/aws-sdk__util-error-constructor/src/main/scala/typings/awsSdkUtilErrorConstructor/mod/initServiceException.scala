package typings.awsSdkUtilErrorConstructor.mod

import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/util-error-constructor", "initServiceException")
@js.native
object initServiceException extends js.Object {
  def apply(error: Error, option: ServiceExceptionOption): ServiceException[_] = js.native
}

