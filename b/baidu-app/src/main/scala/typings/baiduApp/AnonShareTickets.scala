package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShareTickets extends js.Object {
  /** 每一项是一个 shareTicket ，对应一个转发对象 */
  var shareTickets: js.Array[String]
}

object AnonShareTickets {
  @scala.inline
  def apply(shareTickets: js.Array[String]): AnonShareTickets = {
    val __obj = js.Dynamic.literal(shareTickets = shareTickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShareTickets]
  }
}

