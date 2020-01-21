package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.baiduApp.baiduAppStrings.tap
  - typings.baiduApp.baiduAppStrings.touchstart
  - typings.baiduApp.baiduAppStrings.touchmove
  - typings.baiduApp.baiduAppStrings.touchcancel
  - typings.baiduApp.baiduAppStrings.touchend
  - typings.baiduApp.baiduAppStrings.touchforcechange
*/
trait TouchEventType extends js.Object

object TouchEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typings.baiduApp.baiduAppStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typings.baiduApp.baiduAppStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typings.baiduApp.baiduAppStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchforcechange: typings.baiduApp.baiduAppStrings.touchforcechange = this.cast("touchforcechange")
  @scala.inline
  def touchmove: typings.baiduApp.baiduAppStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typings.baiduApp.baiduAppStrings.touchstart = this.cast("touchstart")
}

