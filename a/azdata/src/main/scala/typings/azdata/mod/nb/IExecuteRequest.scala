package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExecuteRequest extends IExecuteOptions {
  var code: String | js.Array[String] = js.native
}

object IExecuteRequest {
  @scala.inline
  def apply(code: String | js.Array[String]): IExecuteRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteRequest]
  }
  @scala.inline
  implicit class IExecuteRequestOps[Self <: IExecuteRequest] (val x: Self) extends AnyVal {
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
    def setCodeVarargs(value: String*): Self = this.set("code", js.Array(value :_*))
    @scala.inline
    def setCode(value: String | js.Array[String]): Self = this.set("code", value.asInstanceOf[js.Any])
  }
  
}

