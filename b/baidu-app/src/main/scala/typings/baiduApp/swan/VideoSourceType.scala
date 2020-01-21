package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.baiduApp.baiduAppStrings.album
  - typings.baiduApp.baiduAppStrings.camera
*/
trait VideoSourceType extends js.Object

object VideoSourceType {
  @scala.inline
  def album: typings.baiduApp.baiduAppStrings.album = this.cast("album")
  @scala.inline
  def camera: typings.baiduApp.baiduAppStrings.camera = this.cast("camera")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

