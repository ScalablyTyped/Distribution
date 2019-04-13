package typings
package bittorrentDashProtocolLib.bittorrentDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var name: java.lang.String
  var onExtendedHandshake: js.UndefOr[
    js.Function1[/* handshake */ org.scalablytyped.runtime.StringDictionary[js.Any], scala.Unit]
  ] = js.undefined
  var onHandshake: js.UndefOr[
    js.Function3[
      /* infoHash */ java.lang.String, 
      /* peerId */ java.lang.String, 
      /* extensions */ org.scalablytyped.runtime.StringDictionary[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* buf */ nodeLib.Buffer, scala.Unit]] = js.undefined
}

object Extension {
  @scala.inline
  def apply(
    name: java.lang.String,
    onExtendedHandshake: /* handshake */ org.scalablytyped.runtime.StringDictionary[js.Any] => scala.Unit = null,
    onHandshake: (/* infoHash */ java.lang.String, /* peerId */ java.lang.String, /* extensions */ org.scalablytyped.runtime.StringDictionary[scala.Boolean]) => scala.Unit = null,
    onMessage: /* buf */ nodeLib.Buffer => scala.Unit = null
  ): Extension = {
    val __obj = js.Dynamic.literal(name = name)
    if (onExtendedHandshake != null) __obj.updateDynamic("onExtendedHandshake")(js.Any.fromFunction1(onExtendedHandshake))
    if (onHandshake != null) __obj.updateDynamic("onHandshake")(js.Any.fromFunction3(onHandshake))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    __obj.asInstanceOf[Extension]
  }
}

