package typings.cliProgress.mod

import typings.cliProgress.cliProgressStrings.center
import typings.cliProgress.cliProgressStrings.left
import typings.cliProgress.cliProgressStrings.right
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**  position of the progress bar - 'left' (default), 'right' or 'center  */
  var align: js.UndefOr[left | right | center] = js.native
  
  /** add padding chars to formatted time and percentage to force fixed width (default: false) */
  var autopadding: js.UndefOr[Boolean] = js.native
  
  /** the character sequence used for autopadding (default: " ") */
  var autopaddingChar: js.UndefOr[String] = js.native
  
  /** character to use as "complete" indicator in the bar (default: "=") */
  var barCompleteChar: js.UndefOr[String] = js.native
  
  /** character to use as "complete" indicator in the bar (default: "=") */
  var barCompleteString: js.UndefOr[String] = js.native
  
  /** character to use as "incomplete" indicator in the bar (default: "-") */
  var barIncompleteChar: js.UndefOr[String] = js.native
  
  /** character to use as "incomplete" indicator in the bar (default: "-") */
  var barIncompleteString: js.UndefOr[String] = js.native
  
  /** the length of the progress bar in chars (default: 40) */
  var barsize: js.UndefOr[Double] = js.native
  
  /** clear the progress bar on complete / stop() call (default: false) */
  var clearOnComplete: js.UndefOr[Boolean] = js.native
  
  /** display progress bars with 'total' of zero(0) as empty, not full (default: false) */
  var emptyOnZero: js.UndefOr[Boolean] = js.native
  
  /**
    *  trigger an eta calculation update during asynchronous rendering trigger using the current value
    * - should only be used for long running processes in conjunction with lof `fps` values and large `etaBuffer`
    * @default false
    */
  var etaAsynchronousUpdate: js.UndefOr[Boolean] = js.native
  
  /** number of updates with which to calculate the eta; higher numbers give a more stable eta (default: 10) */
  var etaBuffer: js.UndefOr[Double] = js.native
  
  /** trigger redraw on every frame even if progress remains the same; can be useful if progress bar gets overwritten by other concurrent writes to the terminal (default: false) */
  var forceRedraw: js.UndefOr[Boolean] = js.native
  
  /**
    * progress bar output format.
    * The progressbar can be customized by using the following build-in placeholders. They can be combined in any order.
    *   {bar} - the progress bar, customizable by the options barsize, barCompleteString and barIncompleteString
    *   {percentage} - the current progress in percent (0-100)
    *   {total} - the end value
    *   {value} - the current value set by last update() call
    *   {eta} - expected time of accomplishment in seconds
    *   {duration} - elapsed time in seconds
    *   {eta_formatted} - expected time of accomplishment formatted into appropriate units
    *   {duration_formatted} - elapsed time formatted into appropriate units
    *
    * Example:
    *      progress [{bar}] {percentage}% | ETA: {eta}s | {value}/{total}
    *    is rendered as
    *      progress [========================================] 100% | ETA: 0s | 200/200
    */
  var format: js.UndefOr[
    String | (js.Function3[/* options */ this.type, /* params */ Params, /* payload */ js.Any, String])
  ] = js.native
  
  /** a custom bar formatter function which renders the bar-element (default: format-bar.js) */
  var formatBar: js.UndefOr[js.Function2[/* progress */ Double, /* options */ this.type, String]] = js.native
  
  /** a custom timer formatter function which renders the formatted time elements like eta_formatted and duration-formatted (default: format-time.js) */
  var formatTime: js.UndefOr[
    js.Function3[/* t */ Double, /* options */ this.type, /* roundToMultipleOf */ Double, String]
  ] = js.native
  
  /** a custom value formatter function which renders all other values (default: format-value.js) */
  var formatValue: js.UndefOr[js.Function3[/* v */ Double, /* options */ this.type, /* type */ String, String]] = js.native
  
  /** the maximum update rate (default: 10) */
  var fps: js.UndefOr[Double] = js.native
  
  /**
    * hide the cursor during progress operation; restored on complete (default: false)
    * - pass `null` to keep terminal settings
    */
  var hideCursor: js.UndefOr[Boolean | Null] = js.native
  
  /** disable line wrapping (default: false) - pass null to keep terminal settings; pass true to trim the output to terminal width */
  var linewrap: js.UndefOr[Boolean | Null] = js.native
  
  /** enable scheduled output to notty streams - e.g. redirect to files (default: false) */
  var noTTYOutput: js.UndefOr[Boolean] = js.native
  
  /** set the output schedule/interval for notty output in ms (default: 2000ms) */
  var notTTYSchedule: js.UndefOr[Double] = js.native
  
  /**  automatically call stop() when the value reaches the total (default: false) */
  var stopOnComplete: js.UndefOr[Boolean] = js.native
  
  /** output stream to use (default: process.stderr) */
  var stream: js.UndefOr[WritableStream] = js.native
  
  /** trigger redraw during update() in case threshold time x2 is exceeded (default: true) - limited to single bar usage */
  var synchronousUpdate: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlign(value: left | right | center): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAutopadding(value: Boolean): Self = this.set("autopadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutopadding: Self = this.set("autopadding", js.undefined)
    
    @scala.inline
    def setAutopaddingChar(value: String): Self = this.set("autopaddingChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutopaddingChar: Self = this.set("autopaddingChar", js.undefined)
    
    @scala.inline
    def setBarCompleteChar(value: String): Self = this.set("barCompleteChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarCompleteChar: Self = this.set("barCompleteChar", js.undefined)
    
    @scala.inline
    def setBarCompleteString(value: String): Self = this.set("barCompleteString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarCompleteString: Self = this.set("barCompleteString", js.undefined)
    
    @scala.inline
    def setBarIncompleteChar(value: String): Self = this.set("barIncompleteChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarIncompleteChar: Self = this.set("barIncompleteChar", js.undefined)
    
    @scala.inline
    def setBarIncompleteString(value: String): Self = this.set("barIncompleteString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarIncompleteString: Self = this.set("barIncompleteString", js.undefined)
    
    @scala.inline
    def setBarsize(value: Double): Self = this.set("barsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarsize: Self = this.set("barsize", js.undefined)
    
    @scala.inline
    def setClearOnComplete(value: Boolean): Self = this.set("clearOnComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearOnComplete: Self = this.set("clearOnComplete", js.undefined)
    
    @scala.inline
    def setEmptyOnZero(value: Boolean): Self = this.set("emptyOnZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyOnZero: Self = this.set("emptyOnZero", js.undefined)
    
    @scala.inline
    def setEtaAsynchronousUpdate(value: Boolean): Self = this.set("etaAsynchronousUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtaAsynchronousUpdate: Self = this.set("etaAsynchronousUpdate", js.undefined)
    
    @scala.inline
    def setEtaBuffer(value: Double): Self = this.set("etaBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtaBuffer: Self = this.set("etaBuffer", js.undefined)
    
    @scala.inline
    def setForceRedraw(value: Boolean): Self = this.set("forceRedraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRedraw: Self = this.set("forceRedraw", js.undefined)
    
    @scala.inline
    def setFormatFunction3(value: (Options, /* params */ Params, /* payload */ js.Any) => String): Self = this.set("format", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormat(value: String | (js.Function3[Options, /* params */ Params, /* payload */ js.Any, String])): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatBar(value: (/* progress */ Double, Options) => String): Self = this.set("formatBar", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatBar: Self = this.set("formatBar", js.undefined)
    
    @scala.inline
    def setFormatTime(value: (/* t */ Double, Options, /* roundToMultipleOf */ Double) => String): Self = this.set("formatTime", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFormatTime: Self = this.set("formatTime", js.undefined)
    
    @scala.inline
    def setFormatValue(value: (/* v */ Double, Options, /* type */ String) => String): Self = this.set("formatValue", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFormatValue: Self = this.set("formatValue", js.undefined)
    
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFps: Self = this.set("fps", js.undefined)
    
    @scala.inline
    def setHideCursor(value: Boolean): Self = this.set("hideCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideCursor: Self = this.set("hideCursor", js.undefined)
    
    @scala.inline
    def setHideCursorNull: Self = this.set("hideCursor", null)
    
    @scala.inline
    def setLinewrap(value: Boolean): Self = this.set("linewrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinewrap: Self = this.set("linewrap", js.undefined)
    
    @scala.inline
    def setLinewrapNull: Self = this.set("linewrap", null)
    
    @scala.inline
    def setNoTTYOutput(value: Boolean): Self = this.set("noTTYOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoTTYOutput: Self = this.set("noTTYOutput", js.undefined)
    
    @scala.inline
    def setNotTTYSchedule(value: Double): Self = this.set("notTTYSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotTTYSchedule: Self = this.set("notTTYSchedule", js.undefined)
    
    @scala.inline
    def setStopOnComplete(value: Boolean): Self = this.set("stopOnComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOnComplete: Self = this.set("stopOnComplete", js.undefined)
    
    @scala.inline
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setSynchronousUpdate(value: Boolean): Self = this.set("synchronousUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronousUpdate: Self = this.set("synchronousUpdate", js.undefined)
  }
}
