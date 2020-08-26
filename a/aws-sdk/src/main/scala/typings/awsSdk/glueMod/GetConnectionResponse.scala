package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionResponse extends js.Object {
  /**
    * The requested connection definition.
    */
  var Connection: js.UndefOr[typings.awsSdk.glueMod.Connection] = js.native
}

object GetConnectionResponse {
  @scala.inline
  def apply(): GetConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionResponse]
  }
  @scala.inline
  implicit class GetConnectionResponseOps[Self <: GetConnectionResponse] (val x: Self) extends AnyVal {
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
    def setConnection(value: Connection): Self = this.set("Connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("Connection", js.undefined)
  }
  
}

