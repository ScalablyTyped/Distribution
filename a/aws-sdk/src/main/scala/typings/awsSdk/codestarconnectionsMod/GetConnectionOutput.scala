package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionOutput extends js.Object {
  /**
    * The connection details, such as status, owner, and provider type.
    */
  var Connection: js.UndefOr[typings.awsSdk.codestarconnectionsMod.Connection] = js.native
}

object GetConnectionOutput {
  @scala.inline
  def apply(): GetConnectionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionOutput]
  }
  @scala.inline
  implicit class GetConnectionOutputOps[Self <: GetConnectionOutput] (val x: Self) extends AnyVal {
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

