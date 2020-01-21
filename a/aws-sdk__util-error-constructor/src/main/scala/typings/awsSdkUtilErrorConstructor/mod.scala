package typings.awsSdkUtilErrorConstructor

import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/util-error-constructor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ServiceExceptionOption extends js.Object {
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /** a human readable description of this exception */
    var message: js.UndefOr[String] = js.native
    /** name of exception */
    var name: js.UndefOr[String] = js.native
    /** the name of the operation that throws the exception */
    var operationName: js.UndefOr[String] = js.native
    /** parsed exception object normalized according to its API model */
    var rawException: js.UndefOr[js.Any] = js.native
  }
  
  def initServiceException(error: Error, option: ServiceExceptionOption): ServiceException[_] = js.native
}

