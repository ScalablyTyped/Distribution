package typings.bootstrapSlider

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is actually not used when using the jQuery version of bootstrap-slider
  * The method documentation is still here thouh.
  * When using jQuery, slider methods like setValue(3, true) have to be called like $slider.slider('setValue', 3, true)
  */
@JSGlobal("Slider")
@js.native
class Slider protected () extends js.Object {
  def this(selector: String, opts: SliderOptions) = this()
  /**
    * Properly clean up and remove the slider instance
    */
  def destroy(): this.type = js.native
  /**
    * Disables the slider and prevents the user from changing the value
    */
  def disable(): this.type = js.native
  /**
    * Enables the slider
    */
  def enable(): this.type = js.native
  /**
    * Get the slider's attributes
    */
  def getAttribute(attribute: String): js.Any = js.native
  /**
    * Get the div slider element
    */
  def getElement(): HTMLDivElement = js.native
  /**
    * Get the current value from the slider
    */
  def getValue(): Double = js.native
  /**
    * Returns true if enabled, false if disabled
    */
  def isEnabled(): Boolean = js.native
  /**
    * Removes the callback function from the slider event eventType
    */
  def off(eventType: SliderEventType, callback: js.Function1[/* val */ js.UndefOr[Double], Unit]): Unit = js.native
  /**
    * When the slider event eventType is triggered, the callback function will be invoked
    */
  def on(eventType: SliderEventType, callback: js.Function1[/* val */ js.UndefOr[Double], Unit]): this.type = js.native
  /**
    * Refreshes the current slider
    */
  def refresh(): this.type = js.native
  /**
    * Renders the tooltip again, after initialization. Useful in situations when the slider and tooltip are initially hidden.
    */
  def relayout(): this.type = js.native
  /**
    * Updates the slider's attributes
    */
  def setAttribute(attribute: String, value: js.Any): this.type = js.native
  /**
    * Set a new value for the slider. If optional triggerSlideEvent parameter is true, 'slide' events will be triggered.
    * If optional triggerChangeEvent parameter is true, 'change' events will be triggered.
    */
  def setValue(newValue: Double): this.type = js.native
  def setValue(newValue: Double, triggerSlideEvent: Boolean): this.type = js.native
  def setValue(newValue: Double, triggerSlideEvent: Boolean, triggerChangeEvent: Boolean): this.type = js.native
  /**
    * Toggles the slider between enabled and disabled
    */
  def toggle(): this.type = js.native
}

