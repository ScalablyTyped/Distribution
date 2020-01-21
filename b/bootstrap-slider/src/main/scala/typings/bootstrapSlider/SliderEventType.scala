package typings.bootstrapSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bootstrapSlider.bootstrapSliderStrings.slide
  - typings.bootstrapSlider.bootstrapSliderStrings.slideStart
  - typings.bootstrapSlider.bootstrapSliderStrings.slideStop
  - typings.bootstrapSlider.bootstrapSliderStrings.change
  - typings.bootstrapSlider.bootstrapSliderStrings.slideEnabled
  - typings.bootstrapSlider.bootstrapSliderStrings.slideDisabled
*/
trait SliderEventType extends js.Object

object SliderEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.bootstrapSlider.bootstrapSliderStrings.change = this.cast("change")
  @scala.inline
  def slide: typings.bootstrapSlider.bootstrapSliderStrings.slide = this.cast("slide")
  @scala.inline
  def slideDisabled: typings.bootstrapSlider.bootstrapSliderStrings.slideDisabled = this.cast("slideDisabled")
  @scala.inline
  def slideEnabled: typings.bootstrapSlider.bootstrapSliderStrings.slideEnabled = this.cast("slideEnabled")
  @scala.inline
  def slideStart: typings.bootstrapSlider.bootstrapSliderStrings.slideStart = this.cast("slideStart")
  @scala.inline
  def slideStop: typings.bootstrapSlider.bootstrapSliderStrings.slideStop = this.cast("slideStop")
}

