package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.baiduApp.baiduAppStrings.front
  - typings.baiduApp.baiduAppStrings.back
*/
trait CameraDevice extends js.Object

object CameraDevice {
  @scala.inline
  def back: typings.baiduApp.baiduAppStrings.back = this.cast("back")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def front: typings.baiduApp.baiduAppStrings.front = this.cast("front")
}

