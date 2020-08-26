package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of a connection.
    */
  var ConnectionArn: typings.awsSdk.codestarconnectionsMod.ConnectionArn = js.native
}

object GetConnectionInput {
  @scala.inline
  def apply(ConnectionArn: ConnectionArn): GetConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionInput]
  }
  @scala.inline
  implicit class GetConnectionInputOps[Self <: GetConnectionInput] (val x: Self) extends AnyVal {
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
    def setConnectionArn(value: ConnectionArn): Self = this.set("ConnectionArn", value.asInstanceOf[js.Any])
  }
  
}

