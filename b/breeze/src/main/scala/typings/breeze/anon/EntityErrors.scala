package typings.breeze.anon

import typings.breeze.breeze.EntityError
import typings.breeze.breeze.HttpResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityErrors extends js.Object {
  var entityErrors: js.Array[EntityError] = js.native
  var httpResponse: HttpResponse = js.native
  var message: String = js.native
  var stack: js.UndefOr[String] = js.native
  var status: js.UndefOr[Double] = js.native
}

object EntityErrors {
  @scala.inline
  def apply(entityErrors: js.Array[EntityError], httpResponse: HttpResponse, message: String): EntityErrors = {
    val __obj = js.Dynamic.literal(entityErrors = entityErrors.asInstanceOf[js.Any], httpResponse = httpResponse.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityErrors]
  }
  @scala.inline
  implicit class EntityErrorsOps[Self <: EntityErrors] (val x: Self) extends AnyVal {
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
    def setEntityErrorsVarargs(value: EntityError*): Self = this.set("entityErrors", js.Array(value :_*))
    @scala.inline
    def setEntityErrors(value: js.Array[EntityError]): Self = this.set("entityErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpResponse(value: HttpResponse): Self = this.set("httpResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

