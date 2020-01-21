package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----动画
/* Rewritten from type alias, can be one of: 
  - typings.baiduApp.baiduAppStrings.linear
  - typings.baiduApp.baiduAppStrings.ease
  - typings.baiduApp.baiduAppStrings.`ease-in`
  - typings.baiduApp.baiduAppStrings.`ease-in-out`
  - typings.baiduApp.baiduAppStrings.`ease-out`
  - typings.baiduApp.baiduAppStrings.`step-start`
  - typings.baiduApp.baiduAppStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typings.baiduApp.baiduAppStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typings.baiduApp.baiduAppStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typings.baiduApp.baiduAppStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typings.baiduApp.baiduAppStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typings.baiduApp.baiduAppStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typings.baiduApp.baiduAppStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typings.baiduApp.baiduAppStrings.`step-start` = this.cast("step-start")
}

