package typings.burns.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Burns configuration settings
  */
@js.native
trait Config extends js.Object {
  var broadcaster: js.UndefOr[String | Null] = js.native
  var defaultHandler: js.UndefOr[HandlerFn] = js.native
  var pusher: js.UndefOr[Record[String, _]] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setBroadcaster(value: String): Self = this.set("broadcaster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBroadcaster: Self = this.set("broadcaster", js.undefined)
    @scala.inline
    def setBroadcasterNull: Self = this.set("broadcaster", null)
    @scala.inline
    def setDefaultHandler(value: /* payload */ js.UndefOr[js.Any] => js.Any): Self = this.set("defaultHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDefaultHandler: Self = this.set("defaultHandler", js.undefined)
    @scala.inline
    def setPusher(value: Record[String, _]): Self = this.set("pusher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePusher: Self = this.set("pusher", js.undefined)
  }
  
}

