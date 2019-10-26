package typings.beanstalkd.beanstalkdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdProtocolReply extends js.Object {
  var args: js.Array[_]
  var reply: String
}

object BeanstalkdProtocolReply {
  @scala.inline
  def apply(args: js.Array[_], reply: String): BeanstalkdProtocolReply = {
    val __obj = js.Dynamic.literal(args = args, reply = reply)
  
    __obj.asInstanceOf[BeanstalkdProtocolReply]
  }
}

