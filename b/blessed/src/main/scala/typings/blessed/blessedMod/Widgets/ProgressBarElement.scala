package typings.blessed.blessedMod.Widgets

import typings.blessed.blessedStrings.complete
import typings.blessed.blessedStrings.reset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A progress bar allowing various styles. This can also be used as a form input.
  */
@JSImport("blessed", "Widgets.ProgressBarElement")
@js.native
class ProgressBarElement () extends InputElement {
  def this(options: ProgressBarOptions) = this()
  @JSName("options")
  var options_ProgressBarElement: ProgressBarOptions = js.native
  @JSName("on")
  def on_complete(event: complete, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_reset(event: reset, callback: js.Function0[Unit]): this.type = js.native
  /**
    * progress the bar by a fill amount.
    */
  def progress(amount: Double): Unit = js.native
  /**
    * reset the bar.
    */
  def reset(): Unit = js.native
  /**
    * set progress to specific amount.
    */
  def setProgress(amount: Double): Unit = js.native
}

