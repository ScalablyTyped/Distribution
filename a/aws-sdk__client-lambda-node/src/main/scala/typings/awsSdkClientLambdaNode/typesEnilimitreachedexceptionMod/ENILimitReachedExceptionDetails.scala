package typings.awsSdkClientLambdaNode.typesEnilimitreachedexceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ENILimitReachedExceptionDetails extends js.Object {
  /**
    * _String shape
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.native
}

object ENILimitReachedExceptionDetails {
  @scala.inline
  def apply(): ENILimitReachedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ENILimitReachedExceptionDetails]
  }
  @scala.inline
  implicit class ENILimitReachedExceptionDetailsOps[Self <: ENILimitReachedExceptionDetails] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

