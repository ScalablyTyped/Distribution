package typings.atCkeditorCkeditor5DashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destroy extends js.Object {
  def destroy(): Unit | Null | js.Promise[_]
}

object Anon_Destroy {
  @scala.inline
  def apply(destroy: () => Unit | Null | js.Promise[_]): Anon_Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[Anon_Destroy]
  }
}

