package typings.atAwsDashSdkUtilDashErrorDashConstructor

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.atAwsDashSdkUtilDashErrorDashConstructor.atAwsDashSdkUtilDashErrorDashConstructorMod.ServiceExceptionOption
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/util-error-constructor", JSImport.Namespace)
@js.native
object atAwsDashSdkUtilDashErrorDashConstructorMod extends js.Object {
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

