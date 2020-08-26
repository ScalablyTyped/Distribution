package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionResponse extends js.Object {
  /**
    * The deployment package of the function or version.
    */
  var Code: js.UndefOr[FunctionCodeLocation] = js.native
  /**
    * The function's reserved concurrency.
    */
  var Concurrency: js.UndefOr[typings.awsSdk.lambdaMod.Concurrency] = js.native
  /**
    * The configuration of the function or version.
    */
  var Configuration: js.UndefOr[FunctionConfiguration] = js.native
  /**
    * The function's tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.lambdaMod.Tags] = js.native
}

object GetFunctionResponse {
  @scala.inline
  def apply(): GetFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFunctionResponse]
  }
  @scala.inline
  implicit class GetFunctionResponseOps[Self <: GetFunctionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: FunctionCodeLocation): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setConcurrency(value: Concurrency): Self = this.set("Concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrency: Self = this.set("Concurrency", js.undefined)
    @scala.inline
    def setConfiguration(value: FunctionConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

