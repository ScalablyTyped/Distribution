package typings.bittorrentProtocol.mod

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
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], piece = piece.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

