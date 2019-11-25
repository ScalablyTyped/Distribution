package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.baiduDashApp.baiduDashAppStrings.transitionend
  - typings.baiduDashApp.baiduDashAppStrings.animationstart
  - typings.baiduDashApp.baiduDashAppStrings.animationiteration
  - typings.baiduDashApp.baiduDashAppStrings.animationend
*/
trait TransitionEventType extends js.Object

object TransitionEventType {
  @scala.inline
  def animationend: typings.baiduDashApp.baiduDashAppStrings.animationend = this.cast("animationend")
  @scala.inline
  def animationiteration: typings.baiduDashApp.baiduDashAppStrings.animationiteration = this.cast("animationiteration")
  @scala.inline
  def animationstart: typings.baiduDashApp.baiduDashAppStrings.animationstart = this.cast("animationstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def transitionend: typings.baiduDashApp.baiduDashAppStrings.transitionend = this.cast("transitionend")
}

