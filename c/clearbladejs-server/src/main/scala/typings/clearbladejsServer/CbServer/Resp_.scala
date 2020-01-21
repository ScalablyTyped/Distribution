package typings.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resp_ extends js.Object {
  def error(msg: js.Any): scala.Nothing
  def success(msg: js.Any): scala.Nothing
}

object Resp_ {
  @scala.inline
  def apply(error: js.Any => scala.Nothing, success: js.Any => scala.Nothing): Resp_ = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Resp_]
  }
}

