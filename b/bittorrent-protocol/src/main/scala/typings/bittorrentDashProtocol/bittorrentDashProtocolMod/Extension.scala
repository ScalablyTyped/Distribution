package typings.bittorrentDashProtocol.bittorrentDashProtocolMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var name: String
  var onExtendedHandshake: js.UndefOr[js.Function1[/* handshake */ StringDictionary[js.Any], Unit]] = js.undefined
  var onHandshake: js.UndefOr[
    js.Function3[
      /* infoHash */ String, 
      /* peerId */ String, 
      /* extensions */ StringDictionary[Boolean], 
      Unit
    ]
  ] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* buf */ Buffer, Unit]] = js.undefined
}

object Extension {
  @scala.inline
  def apply(
    name: String,
    onExtendedHandshake: /* handshake */ StringDictionary[js.Any] => Unit = null,
    onHandshake: (/* infoHash */ String, /* peerId */ String, /* extensions */ StringDictionary[Boolean]) => Unit = null,
    onMessage: /* buf */ Buffer => Unit = null
  ): Extension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (onExtendedHandshake != null) __obj.updateDynamic("onExtendedHandshake")(js.Any.fromFunction1(onExtendedHandshake))
    if (onHandshake != null) __obj.updateDynamic("onHandshake")(js.Any.fromFunction3(onHandshake))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    __obj.asInstanceOf[Extension]
  }
}

