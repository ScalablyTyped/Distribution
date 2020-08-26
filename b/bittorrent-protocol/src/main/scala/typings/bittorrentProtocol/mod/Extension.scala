package typings.bittorrentProtocol.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extension extends js.Object {
  var name: String = js.native
  var onExtendedHandshake: js.UndefOr[js.Function1[/* handshake */ StringDictionary[js.Any], Unit]] = js.native
  var onHandshake: js.UndefOr[
    js.Function3[
      /* infoHash */ String, 
      /* peerId */ String, 
      /* extensions */ StringDictionary[Boolean], 
      Unit
    ]
  ] = js.native
  var onMessage: js.UndefOr[js.Function1[/* buf */ Buffer, Unit]] = js.native
}

object Extension {
  @scala.inline
  def apply(name: String): Extension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnExtendedHandshake(value: /* handshake */ StringDictionary[js.Any] => Unit): Self = this.set("onExtendedHandshake", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExtendedHandshake: Self = this.set("onExtendedHandshake", js.undefined)
    @scala.inline
    def setOnHandshake(
      value: (/* infoHash */ String, /* peerId */ String, /* extensions */ StringDictionary[Boolean]) => Unit
    ): Self = this.set("onHandshake", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnHandshake: Self = this.set("onHandshake", js.undefined)
    @scala.inline
    def setOnMessage(value: /* buf */ Buffer => Unit): Self = this.set("onMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
  }
  
}

