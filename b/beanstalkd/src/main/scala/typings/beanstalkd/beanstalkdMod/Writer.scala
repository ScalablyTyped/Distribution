package typings.beanstalkd.beanstalkdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Writer extends js.Object {
  var command: String
}

object Writer {
  @scala.inline
  def apply(command: String): Writer = {
    val __obj = js.Dynamic.literal(command = command)
  
    __obj.asInstanceOf[Writer]
  }
}

