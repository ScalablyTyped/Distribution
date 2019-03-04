package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resp extends js.Object {
  def error(msg: js.Any): scala.Nothing
   // todo: figure out if we can have the compiler throw an error if someone adds code after this
  def success(msg: js.Any): scala.Nothing
}

object Resp {
  @scala.inline
  def apply(error: js.Function1[js.Any, scala.Nothing], success: js.Function1[js.Any, scala.Nothing]): Resp = {
    val __obj = js.Dynamic.literal(error = error, success = success)
  
    __obj.asInstanceOf[Resp]
  }
}

