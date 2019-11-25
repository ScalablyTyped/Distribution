package typings.bootstrapDashSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrapDashSlider.bootstrapDashSliderStrings.slide
  - typings.bootstrapDashSlider.bootstrapDashSliderStrings.slideStart
  - typings.bootstrapDashSlider.bootstrapDashSliderStrings.slideStop
  - typings.bootstrapDashSlider.bootstrapDashSliderStrings.change
  - typings.bootstrapDashSlider.bootstrapDashSliderStrings.slideEnabled
  - typings.bootstrapDashSlider.bootstrapDashSliderStrings.slideDisabled
*/
trait SliderEventType extends js.Object

object SliderEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.bootstrapDashSlider.bootstrapDashSliderStrings.change = this.cast("change")
  @scala.inline
  def slide: typings.bootstrapDashSlider.bootstrapDashSliderStrings.slide = this.cast("slide")
  @scala.inline
  def slideDisabled: typings.bootstrapDashSlider.bootstrapDashSliderStrings.slideDisabled = this.cast("slideDisabled")
  @scala.inline
  def slideEnabled: typings.bootstrapDashSlider.bootstrapDashSliderStrings.slideEnabled = this.cast("slideEnabled")
  @scala.inline
  def slideStart: typings.bootstrapDashSlider.bootstrapDashSliderStrings.slideStart = this.cast("slideStart")
  @scala.inline
  def slideStop: typings.bootstrapDashSlider.bootstrapDashSliderStrings.slideStop = this.cast("slideStop")
}

