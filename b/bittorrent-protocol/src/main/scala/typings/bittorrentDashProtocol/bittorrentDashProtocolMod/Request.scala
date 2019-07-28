package typings.bittorrentDashProtocol.bittorrentDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var length: Double
  var offset: Double
  var piece: Double
  def callback(): Unit
}

object Request {
  @scala.inline
  def apply(callback: () => Unit, length: Double, offset: Double, piece: Double): Request = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), length = length, offset = offset, piece = piece)
  
    __obj.asInstanceOf[Request]
  }
}

