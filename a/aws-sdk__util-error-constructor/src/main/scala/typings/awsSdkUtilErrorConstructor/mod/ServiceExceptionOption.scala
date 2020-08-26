package typings.awsSdkUtilErrorConstructor.mod

import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object ServiceExceptionOption {
  @scala.inline
  def apply($metadata: ResponseMetadata): ServiceExceptionOption = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceExceptionOption]
  }
  @scala.inline
  implicit class ServiceExceptionOptionOps[Self <: ServiceExceptionOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    @scala.inline
    def setRawException(value: js.Any): Self = this.set("rawException", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawException: Self = this.set("rawException", js.undefined)
  }
  
}

