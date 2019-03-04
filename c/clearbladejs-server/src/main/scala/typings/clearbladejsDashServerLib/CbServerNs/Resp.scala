package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resp extends js.Object {
  def error(msg: js.Any): scala.Nothing
  def success(msg: js.Any): scala.Nothing
}

object Resp {
  @scala.inline
  def apply(error: js.Function1[js.Any, scala.Nothing], success: js.Function1[js.Any, scala.Nothing]): Resp = {
    val __obj = js.Dynamic.literal(error = error, success = success)
  
    __obj.asInstanceOf[Resp]
  }
}

