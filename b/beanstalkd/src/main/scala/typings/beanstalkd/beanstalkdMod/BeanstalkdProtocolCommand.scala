package typings.beanstalkd.beanstalkdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdProtocolCommand extends js.Object {
  var args: js.Array[_]
  var command: String
}

object BeanstalkdProtocolCommand {
  @scala.inline
  def apply(args: js.Array[_], command: String): BeanstalkdProtocolCommand = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BeanstalkdProtocolCommand]
  }
}

