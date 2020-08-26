package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listener extends js.Object {
  /**
    * The port that is used by the Listener.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * The protocol that is used by the Listener.
    */
  var Protocol: js.UndefOr[String] = js.native
}

object Listener {
  @scala.inline
  def apply(): Listener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listener]
  }
  @scala.inline
  implicit class ListenerOps[Self <: Listener] (val x: Self) extends AnyVal {
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
    def setPort(value: Integer): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
  }
  
}

