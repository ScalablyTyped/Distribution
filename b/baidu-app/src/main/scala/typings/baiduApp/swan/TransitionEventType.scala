package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.baiduApp.baiduAppStrings.transitionend
  - typings.baiduApp.baiduAppStrings.animationstart
  - typings.baiduApp.baiduAppStrings.animationiteration
  - typings.baiduApp.baiduAppStrings.animationend
*/
trait TransitionEventType extends js.Object

object TransitionEventType {
  @scala.inline
  def animationend: typings.baiduApp.baiduAppStrings.animationend = this.cast("animationend")
  @scala.inline
  def animationiteration: typings.baiduApp.baiduAppStrings.animationiteration = this.cast("animationiteration")
  @scala.inline
  def animationstart: typings.baiduApp.baiduAppStrings.animationstart = this.cast("animationstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def transitionend: typings.baiduApp.baiduAppStrings.transitionend = this.cast("transitionend")
}

