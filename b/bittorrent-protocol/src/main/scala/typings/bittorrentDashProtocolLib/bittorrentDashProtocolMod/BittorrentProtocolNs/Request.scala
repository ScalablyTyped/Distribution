package typings
package bittorrentDashProtocolLib.bittorrentDashProtocolMod.BittorrentProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var length: scala.Double
  var offset: scala.Double
  var piece: scala.Double
  def callback(): scala.Unit
}

object Request {
  @scala.inline
  def apply(
    callback: js.Function0[scala.Unit],
    length: scala.Double,
    offset: scala.Double,
    piece: scala.Double
  ): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("piece")(piece)
    __obj.asInstanceOf[Request]
  }
}

