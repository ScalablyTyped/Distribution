package typings
package bittorrentDashProtocolLib.bittorrentDashProtocolMod.BittorrentProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Extension extends js.Object {
  var name: java.lang.String
  var onExtendedHandshake: js.UndefOr[
    js.Function1[/* handshake */ ScalablyTyped.runtime.StringDictionary[js.Any], scala.Unit]
  ] = js.undefined
  var onHandshake: js.UndefOr[
    js.Function3[
      /* infoHash */ java.lang.String, 
      /* peerId */ java.lang.String, 
      /* extensions */ ScalablyTyped.runtime.StringDictionary[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* buf */ nodeLib.Buffer, scala.Unit]] = js.undefined
}

