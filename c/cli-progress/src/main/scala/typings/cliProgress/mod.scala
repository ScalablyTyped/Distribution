package typings.cliProgress

import typings.cliProgress.cliProgressStrings.center
import typings.cliProgress.cliProgressStrings.left
import typings.cliProgress.cliProgressStrings.right
import typings.node.NodeJS.WritableStream
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cli-progress", "Bar")
  @js.native
  class Bar protected () extends SingleBar {
    /** Initialize a new Progress bar. An instance can be used multiple times! it's not required to re-create it! */
    def this(opt: Options) = this()
    def this(opt: Options, preset: Preset) = this()
  }
  
  @JSImport("cli-progress", "MultiBar")
  @js.native
  class MultiBar protected () extends StObject {
    def this(opt: Options) = this()
    def this(opt: Options, preset: Preset) = this()
    
    def create(total: Double, startValue: Double): SingleBar = js.native
    def create(total: Double, startValue: Double, payload: js.Any): SingleBar = js.native
    
    def remove(bar: SingleBar): Boolean = js.native
    
    def stop(): Unit = js.native
  }
  
  object Presets {
    
    @JSImport("cli-progress", "Presets")
    @js.native
    val ^ : js.Any = js.native
    
    /** Styles as of cli-progress v1.3.0 */
    @JSImport("cli-progress", "Presets.legacy")
    @js.native
    def legacy: Preset = js.native
    @scala.inline
    def legacy_=(x: Preset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legacy")(x.asInstanceOf[js.Any])
    
    /** Unicode Rectangles */
    @JSImport("cli-progress", "Presets.rect")
    @js.native
    def rect: Preset = js.native
    @scala.inline
    def rect_=(x: Preset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rect")(x.asInstanceOf[js.Any])
    
    /** Unicode background shades are used for the bar */
    @JSImport("cli-progress", "Presets.shades_classic")
    @js.native
    def shadesClassic: Preset = js.native
    
    @scala.inline
    def shadesClassic_=(x: Preset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shades_classic")(x.asInstanceOf[js.Any])
    
    /** Unicode background shades with grey bar */
    @JSImport("cli-progress", "Presets.shades_grey")
    @js.native
    def shadesGrey: Preset = js.native
    
    @scala.inline
    def shadesGrey_=(x: Preset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shades_grey")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("cli-progress", "SingleBar")
  @js.native
  class SingleBar protected () extends StObject {
    /** Initialize a new Progress bar. An instance can be used multiple times! it's not required to re-create it! */
    def this(opt: Options) = this()
    def this(opt: Options, preset: Preset) = this()
    
    def calculateETA(): Unit = js.native
    
    def formatTime(t: js.Any, roundToMultipleOf: js.Any): js.Any = js.native
    
    def getTotal(): js.Any = js.native
    
    /** Increases the current progress value by a specified amount (default +1). Update payload optionally */
    def increment(): Unit = js.native
    def increment(payload: js.Object): Unit = js.native
    def increment(step: js.UndefOr[scala.Nothing], payload: js.Object): Unit = js.native
    def increment(step: Double): Unit = js.native
    def increment(step: Double, payload: js.Object): Unit = js.native
    
    def render(): Unit = js.native
    
    /** Sets the total progress value while progressbar is active. Especially useful handling dynamic tasks. */
    def setTotal(total: Double): Unit = js.native
    
    /** Starts the progress bar and set the total and initial value */
    def start(total: Double, startValue: Double): Unit = js.native
    def start(total: Double, startValue: Double, payload: js.Object): Unit = js.native
    
    /** Stops the progress bar and go to next line */
    def stop(): Unit = js.native
    
    def stopTimer(): Unit = js.native
    
    /** Sets the current progress value and optionally the payload with values of custom tokens as a second parameter */
    def update(current: Double): Unit = js.native
    def update(current: Double, payload: js.Object): Unit = js.native
    def update(payload: js.Object): Unit = js.native
    
    /** Force eta calculation update (long running processes) without altering the progress values. */
    def updateETA(): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: left | right | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAutopadding(value: Boolean): Self = StObject.set(x, "autopadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutopaddingChar(value: String): Self = StObject.set(x, "autopaddingChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutopaddingCharUndefined: Self = StObject.set(x, "autopaddingChar", js.undefined)
      
      @scala.inline
      def setAutopaddingUndefined: Self = StObject.set(x, "autopadding", js.undefined)
      
      @scala.inline
      def setBarCompleteChar(value: String): Self = StObject.set(x, "barCompleteChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarCompleteCharUndefined: Self = StObject.set(x, "barCompleteChar", js.undefined)
      
      @scala.inline
      def setBarCompleteString(value: String): Self = StObject.set(x, "barCompleteString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarCompleteStringUndefined: Self = StObject.set(x, "barCompleteString", js.undefined)
      
      @scala.inline
      def setBarIncompleteChar(value: String): Self = StObject.set(x, "barIncompleteChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarIncompleteCharUndefined: Self = StObject.set(x, "barIncompleteChar", js.undefined)
      
      @scala.inline
      def setBarIncompleteString(value: String): Self = StObject.set(x, "barIncompleteString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarIncompleteStringUndefined: Self = StObject.set(x, "barIncompleteString", js.undefined)
      
      @scala.inline
      def setBarsize(value: Double): Self = StObject.set(x, "barsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarsizeUndefined: Self = StObject.set(x, "barsize", js.undefined)
      
      @scala.inline
      def setClearOnComplete(value: Boolean): Self = StObject.set(x, "clearOnComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnCompleteUndefined: Self = StObject.set(x, "clearOnComplete", js.undefined)
      
      @scala.inline
      def setEmptyOnZero(value: Boolean): Self = StObject.set(x, "emptyOnZero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyOnZeroUndefined: Self = StObject.set(x, "emptyOnZero", js.undefined)
      
      @scala.inline
      def setEtaAsynchronousUpdate(value: Boolean): Self = StObject.set(x, "etaAsynchronousUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtaAsynchronousUpdateUndefined: Self = StObject.set(x, "etaAsynchronousUpdate", js.undefined)
      
      @scala.inline
      def setEtaBuffer(value: Double): Self = StObject.set(x, "etaBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtaBufferUndefined: Self = StObject.set(x, "etaBuffer", js.undefined)
      
      @scala.inline
      def setForceRedraw(value: Boolean): Self = StObject.set(x, "forceRedraw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRedrawUndefined: Self = StObject.set(x, "forceRedraw", js.undefined)
      
      @scala.inline
      def setFormat(value: String | (js.Function3[Options, /* params */ Params, /* payload */ js.Any, String])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatBar(value: (/* progress */ Double, Options) => String): Self = StObject.set(x, "formatBar", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatBarUndefined: Self = StObject.set(x, "formatBar", js.undefined)
      
      @scala.inline
      def setFormatFunction3(value: (Options, /* params */ Params, /* payload */ js.Any) => String): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatTime(value: (/* t */ Double, Options, /* roundToMultipleOf */ Double) => String): Self = StObject.set(x, "formatTime", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatTimeUndefined: Self = StObject.set(x, "formatTime", js.undefined)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormatValue(value: (/* v */ Double, Options, /* type */ String) => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatValueUndefined: Self = StObject.set(x, "formatValue", js.undefined)
      
      @scala.inline
      def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      @scala.inline
      def setHideCursor(value: Boolean): Self = StObject.set(x, "hideCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideCursorNull: Self = StObject.set(x, "hideCursor", null)
      
      @scala.inline
      def setHideCursorUndefined: Self = StObject.set(x, "hideCursor", js.undefined)
      
      @scala.inline
      def setLinewrap(value: Boolean): Self = StObject.set(x, "linewrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinewrapNull: Self = StObject.set(x, "linewrap", null)
      
      @scala.inline
      def setLinewrapUndefined: Self = StObject.set(x, "linewrap", js.undefined)
      
      @scala.inline
      def setNoTTYOutput(value: Boolean): Self = StObject.set(x, "noTTYOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoTTYOutputUndefined: Self = StObject.set(x, "noTTYOutput", js.undefined)
      
      @scala.inline
      def setNotTTYSchedule(value: Double): Self = StObject.set(x, "notTTYSchedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotTTYScheduleUndefined: Self = StObject.set(x, "notTTYSchedule", js.undefined)
      
      @scala.inline
      def setStopOnComplete(value: Boolean): Self = StObject.set(x, "stopOnComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOnCompleteUndefined: Self = StObject.set(x, "stopOnComplete", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setSynchronousUpdate(value: Boolean): Self = StObject.set(x, "synchronousUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynchronousUpdateUndefined: Self = StObject.set(x, "synchronousUpdate", js.undefined)
    }
  }
  
  @js.native
  trait Params extends StObject {
    
    var eta: Double = js.native
    
    var maxWidth: Double = js.native
    
    var progress: Double = js.native
    
    var startTime: Date = js.native
    
    var total: Double = js.native
    
    var value: Double = js.native
  }
  object Params {
    
    @scala.inline
    def apply(eta: Double, maxWidth: Double, progress: Double, startTime: Date, total: Double, value: Double): Params = {
      val __obj = js.Dynamic.literal(eta = eta.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEta(value: Double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Preset extends StObject {
    
    var barCompleteChar: String = js.native
    
    var barIncompleteChar: String = js.native
    
    /**
      *   Example: 'progress [{bar}] {percentage}% | ETA: {eta}s | {value}/{total}'
      *
      * {bar} - the progress bar, customizable by the options barsize, barCompleteString and barIncompleteString
      *
      * {percentage} - the current progress in percent (0-100)
      *
      * {total} - the end value
      *
      * {value} - the current value set by last update() call
      *
      * {eta} - expected time of accomplishment in seconds
      *
      * {duration} - elapsed time in seconds
      *
      * {eta_formatted} - expected time of accomplishment formatted into appropriate units
      *
      * {duration_formatted} - elapsed time formatted into appropriate units
      *
      */
    var format: String = js.native
  }
  object Preset {
    
    @scala.inline
    def apply(barCompleteChar: String, barIncompleteChar: String, format: String): Preset = {
      val __obj = js.Dynamic.literal(barCompleteChar = barCompleteChar.asInstanceOf[js.Any], barIncompleteChar = barIncompleteChar.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Preset]
    }
    
    @scala.inline
    implicit class PresetMutableBuilder[Self <: Preset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarCompleteChar(value: String): Self = StObject.set(x, "barCompleteChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarIncompleteChar(value: String): Self = StObject.set(x, "barIncompleteChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
}
