package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----动画
/* Rewritten from type alias, can be one of: 
  - typings.baiduDashApp.baiduDashAppStrings.linear
  - typings.baiduDashApp.baiduDashAppStrings.ease
  - typings.baiduDashApp.baiduDashAppStrings.`ease-in`
  - typings.baiduDashApp.baiduDashAppStrings.`ease-in-out`
  - typings.baiduDashApp.baiduDashAppStrings.`ease-out`
  - typings.baiduDashApp.baiduDashAppStrings.`step-start`
  - typings.baiduDashApp.baiduDashAppStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typings.baiduDashApp.baiduDashAppStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typings.baiduDashApp.baiduDashAppStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typings.baiduDashApp.baiduDashAppStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typings.baiduDashApp.baiduDashAppStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typings.baiduDashApp.baiduDashAppStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typings.baiduDashApp.baiduDashAppStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typings.baiduDashApp.baiduDashAppStrings.`step-start` = this.cast("step-start")
}

