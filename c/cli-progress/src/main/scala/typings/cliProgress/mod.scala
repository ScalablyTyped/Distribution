package typings.cliProgress

import typings.cliProgress.cliProgressStrings.center
import typings.cliProgress.cliProgressStrings.left
import typings.cliProgress.cliProgressStrings.right
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cli-progress", "Bar")
  @js.native
  open class Bar protected () extends SingleBar {
    /** Initialize a new Progress bar. An instance can be used multiple times! it's not required to re-create it! */
    def this(opt: Options) = this()
    def this(opt: Options, preset: Preset) = this()
  }
  
  object Format {
    
    @JSImport("cli-progress", "Format")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cli-progress", "Format.BarFormat")
    @js.native
    def BarFormat: BarFormatter = js.native
    inline def BarFormat(progress: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("BarFormat")(progress.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def BarFormat_=(x: BarFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BarFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("cli-progress", "Format.Formatter")
    @js.native
    def Formatter: GenericFormatter = js.native
    inline def Formatter(options: Options, params: Params, payload: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("Formatter")(options.asInstanceOf[js.Any], params.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def Formatter_=(x: GenericFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Formatter")(x.asInstanceOf[js.Any])
    
    @JSImport("cli-progress", "Format.TimeFormat")
    @js.native
    def TimeFormat: TimeFormatter = js.native
    inline def TimeFormat(t: Double, options: Options, roundToMultipleOf: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("TimeFormat")(t.asInstanceOf[js.Any], options.asInstanceOf[js.Any], roundToMultipleOf.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def TimeFormat_=(x: TimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimeFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("cli-progress", "Format.ValueFormat")
    @js.native
    def ValueFormat: ValueFormatter = js.native
    inline def ValueFormat(v: Double, options: Options, `type`: ValueType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ValueFormat")(v.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def ValueFormat_=(x: ValueFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValueFormat")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("cli-progress", "GenericBar")
  @js.native
  open class GenericBar protected () extends ^ {
    /** Initialize a new Progress bar. An instance can be used multiple times! it's not required to re-create it! */
    def this(opt: Options) = this()
    def this(opt: Options, preset: Preset) = this()
    
    /** Calculate the actual progress value */
    def getProgress(): Double = js.native
    
    /** Get the total (limit) value */
    def getTotal(): Double = js.native
    
    /** Increases the current progress value by a specified amount (default +1). Update payload optionally */
    def increment(): Unit = js.native
    def increment(payload: js.Object): Unit = js.native
    def increment(step: Double): Unit = js.native
    def increment(step: Double, payload: js.Object): Unit = js.native
    def increment(step: Unit, payload: js.Object): Unit = js.native
    
    /** Internal render function */
    def render(): Unit = js.native
    def render(forceRendering: Boolean): Unit = js.native
    
    /** Sets the total progress value while progressbar is active. Especially useful handling dynamic tasks. */
    def setTotal(total: Double): Unit = js.native
    
    /** Starts the progress bar and set the total and initial value */
    def start(total: Double, startValue: Double): Unit = js.native
    def start(total: Double, startValue: Double, payload: js.Object): Unit = js.native
    
    /** Stops the progress bar and go to next line */
    def stop(): Unit = js.native
    
    /** Sets the current progress value and optionally the payload with values of custom tokens as a second parameter */
    def update(current: Double): Unit = js.native
    def update(current: Double, payload: js.Object): Unit = js.native
    def update(payload: js.Object): Unit = js.native
    
    /** Force eta calculation update (long running processes) without altering the progress values. */
    def updateETA(): Unit = js.native
  }
  
  @JSImport("cli-progress", "MultiBar")
  @js.native
  open class MultiBar protected () extends ^ {
    def this(opt: Options) = this()
    def this(opt: Options, preset: Preset) = this()
    
    /** add a new bar to the stack */
    def create(total: Double, startValue: Double): SingleBar = js.native
    def create(total: Double, startValue: Double, payload: Any): SingleBar = js.native
    def create(total: Double, startValue: Double, payload: Any, barOptions: Options): SingleBar = js.native
    def create(total: Double, startValue: Double, payload: Unit, barOptions: Options): SingleBar = js.native
    
    /** log output above the progress bars; string must end with newline character! */
    def log(data: String): Unit = js.native
    
    /** remove a bar from the stack */
    def remove(bar: SingleBar): Boolean = js.native
    
    def stop(): Unit = js.native
    
    /** internal update routine */
    def update(): Unit = js.native
  }
  
  object Presets {
    
    @JSImport("cli-progress", "Presets")
    @js.native
    val ^ : js.Any = js.native
    
    /** Styles as of cli-progress v1.3.0 */
    @JSImport("cli-progress", "Presets.legacy")
    @js.native
    def legacy: Preset = js.native
    inline def legacy_=(x: Preset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legacy")(x.asInstanceOf[js.Any])
    
    /** Unicode Rectangles */
    @JSImport("cli-progress", "Presets.rect")
    @js.native
    def rect: Preset = js.native
    inline def rect_=(x: Preset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rect")(x.asInstanceOf[js.Any])
    
    /** Unicode background shades are used for the bar */
    @JSImport("cli-progress", "Presets.shades_classic")
    @js.native
    def shadesClassic: Preset = js.native
    
    inline def shadesClassic_=(x: Preset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shades_classic")(x.asInstanceOf[js.Any])
    
    /** Unicode background shades with grey bar */
    @JSImport("cli-progress", "Presets.shades_grey")
    @js.native
    def shadesGrey: Preset = js.native
    
    inline def shadesGrey_=(x: Preset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shades_grey")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("cli-progress", "SingleBar")
  @js.native
  open class SingleBar protected () extends GenericBar {
    /** Initialize a new Progress bar. An instance can be used multiple times! it's not required to re-create it! */
    def this(opt: Options) = this()
    def this(opt: Options, preset: Preset) = this()
  }
  
  type BarFormatter = js.Function2[/* progress */ Double, /* options */ Options, String]
  
  type GenericFormatter = js.Function3[/* options */ Options, /* params */ Params, /* payload */ Any, String]
  
  trait Options extends StObject {
    
    /**  position of the progress bar - 'left' (default), 'right' or 'center  */
    var align: js.UndefOr[left | right | center] = js.undefined
    
    /** add padding chars to formatted time and percentage to force fixed width (default: false) */
    var autopadding: js.UndefOr[Boolean] = js.undefined
    
    /** the character sequence used for autopadding (default: " ") */
    var autopaddingChar: js.UndefOr[String] = js.undefined
    
    /** character to use as "complete" indicator in the bar (default: "=") */
    var barCompleteChar: js.UndefOr[String] = js.undefined
    
    /** character to use as "complete" indicator in the bar (default: "=") */
    var barCompleteString: js.UndefOr[String] = js.undefined
    
    /** glue sequence (control chars) between bar elements (default: '') */
    var barGlue: js.UndefOr[String] = js.undefined
    
    /** character to use as "incomplete" indicator in the bar (default: "-") */
    var barIncompleteChar: js.UndefOr[String] = js.undefined
    
    /** character to use as "incomplete" indicator in the bar (default: "-") */
    var barIncompleteString: js.UndefOr[String] = js.undefined
    
    /** the length of the progress bar in chars (default: 40) */
    var barsize: js.UndefOr[Double] = js.undefined
    
    /** clear the progress bar on complete / stop() call (default: false) */
    var clearOnComplete: js.UndefOr[Boolean] = js.undefined
    
    /** display progress bars with 'total' of zero(0) as empty, not full (default: false) */
    var emptyOnZero: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  trigger an eta calculation update during asynchronous rendering trigger using the current value
      * - should only be used for long running processes in conjunction with lof `fps` values and large `etaBuffer`
      * @default false
      */
    var etaAsynchronousUpdate: js.UndefOr[Boolean] = js.undefined
    
    /** number of updates with which to calculate the eta; higher numbers give a more stable eta (default: 10) */
    var etaBuffer: js.UndefOr[Double] = js.undefined
    
    /** trigger redraw on every frame even if progress remains the same; can be useful if progress bar gets overwritten by other concurrent writes to the terminal (default: false) */
    var forceRedraw: js.UndefOr[Boolean] = js.undefined
    
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
    var format: js.UndefOr[String | GenericFormatter] = js.undefined
    
    /** a custom bar formatter function which renders the bar-element (default: format-bar.js) */
    var formatBar: js.UndefOr[BarFormatter] = js.undefined
    
    /** a custom timer formatter function which renders the formatted time elements like eta_formatted and duration-formatted (default: format-time.js) */
    var formatTime: js.UndefOr[TimeFormatter] = js.undefined
    
    /** a custom value formatter function which renders all other values (default: format-value.js) */
    var formatValue: js.UndefOr[ValueFormatter] = js.undefined
    
    /** the maximum update rate (default: 10) */
    var fps: js.UndefOr[Double] = js.undefined
    
    /** stop bar on SIGINT/SIGTERM to restore cursor settings (default: true) */
    var gracefulExit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * hide the cursor during progress operation; restored on complete (default: false)
      * - pass `null` to keep terminal settings
      */
    var hideCursor: js.UndefOr[Boolean | Null] = js.undefined
    
    /** disable line wrapping (default: false) - pass null to keep terminal settings; pass true to trim the output to terminal width */
    var linewrap: js.UndefOr[Boolean | Null] = js.undefined
    
    /** enable scheduled output to notty streams - e.g. redirect to files (default: false) */
    var noTTYOutput: js.UndefOr[Boolean] = js.undefined
    
    /** set the output schedule/interval for notty output in ms (default: 2000ms) */
    var notTTYSchedule: js.UndefOr[Double] = js.undefined
    
    /** progress calculation relative to start value ? default start at 0 (default: false) */
    var progressCalculationRelative: js.UndefOr[Boolean] = js.undefined
    
    /**  automatically call stop() when the value reaches the total (default: false) */
    var stopOnComplete: js.UndefOr[Boolean] = js.undefined
    
    /** output stream to use (default: process.stderr) */
    var stream: js.UndefOr[WritableStream] = js.undefined
    
    /** trigger redraw during update() in case threshold time x2 is exceeded (default: true) - limited to single bar usage */
    var synchronousUpdate: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: left | right | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAutopadding(value: Boolean): Self = StObject.set(x, "autopadding", value.asInstanceOf[js.Any])
      
      inline def setAutopaddingChar(value: String): Self = StObject.set(x, "autopaddingChar", value.asInstanceOf[js.Any])
      
      inline def setAutopaddingCharUndefined: Self = StObject.set(x, "autopaddingChar", js.undefined)
      
      inline def setAutopaddingUndefined: Self = StObject.set(x, "autopadding", js.undefined)
      
      inline def setBarCompleteChar(value: String): Self = StObject.set(x, "barCompleteChar", value.asInstanceOf[js.Any])
      
      inline def setBarCompleteCharUndefined: Self = StObject.set(x, "barCompleteChar", js.undefined)
      
      inline def setBarCompleteString(value: String): Self = StObject.set(x, "barCompleteString", value.asInstanceOf[js.Any])
      
      inline def setBarCompleteStringUndefined: Self = StObject.set(x, "barCompleteString", js.undefined)
      
      inline def setBarGlue(value: String): Self = StObject.set(x, "barGlue", value.asInstanceOf[js.Any])
      
      inline def setBarGlueUndefined: Self = StObject.set(x, "barGlue", js.undefined)
      
      inline def setBarIncompleteChar(value: String): Self = StObject.set(x, "barIncompleteChar", value.asInstanceOf[js.Any])
      
      inline def setBarIncompleteCharUndefined: Self = StObject.set(x, "barIncompleteChar", js.undefined)
      
      inline def setBarIncompleteString(value: String): Self = StObject.set(x, "barIncompleteString", value.asInstanceOf[js.Any])
      
      inline def setBarIncompleteStringUndefined: Self = StObject.set(x, "barIncompleteString", js.undefined)
      
      inline def setBarsize(value: Double): Self = StObject.set(x, "barsize", value.asInstanceOf[js.Any])
      
      inline def setBarsizeUndefined: Self = StObject.set(x, "barsize", js.undefined)
      
      inline def setClearOnComplete(value: Boolean): Self = StObject.set(x, "clearOnComplete", value.asInstanceOf[js.Any])
      
      inline def setClearOnCompleteUndefined: Self = StObject.set(x, "clearOnComplete", js.undefined)
      
      inline def setEmptyOnZero(value: Boolean): Self = StObject.set(x, "emptyOnZero", value.asInstanceOf[js.Any])
      
      inline def setEmptyOnZeroUndefined: Self = StObject.set(x, "emptyOnZero", js.undefined)
      
      inline def setEtaAsynchronousUpdate(value: Boolean): Self = StObject.set(x, "etaAsynchronousUpdate", value.asInstanceOf[js.Any])
      
      inline def setEtaAsynchronousUpdateUndefined: Self = StObject.set(x, "etaAsynchronousUpdate", js.undefined)
      
      inline def setEtaBuffer(value: Double): Self = StObject.set(x, "etaBuffer", value.asInstanceOf[js.Any])
      
      inline def setEtaBufferUndefined: Self = StObject.set(x, "etaBuffer", js.undefined)
      
      inline def setForceRedraw(value: Boolean): Self = StObject.set(x, "forceRedraw", value.asInstanceOf[js.Any])
      
      inline def setForceRedrawUndefined: Self = StObject.set(x, "forceRedraw", js.undefined)
      
      inline def setFormat(value: String | GenericFormatter): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatBar(value: (/* progress */ Double, /* options */ Options) => String): Self = StObject.set(x, "formatBar", js.Any.fromFunction2(value))
      
      inline def setFormatBarUndefined: Self = StObject.set(x, "formatBar", js.undefined)
      
      inline def setFormatFunction3(value: (/* options */ Options, /* params */ Params, /* payload */ Any) => String): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      inline def setFormatTime(value: (/* t */ Double, /* options */ Options, /* roundToMultipleOf */ Double) => String): Self = StObject.set(x, "formatTime", js.Any.fromFunction3(value))
      
      inline def setFormatTimeUndefined: Self = StObject.set(x, "formatTime", js.undefined)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormatValue(value: (/* v */ Double, /* options */ Options, /* type */ ValueType) => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction3(value))
      
      inline def setFormatValueUndefined: Self = StObject.set(x, "formatValue", js.undefined)
      
      inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      inline def setGracefulExit(value: Boolean): Self = StObject.set(x, "gracefulExit", value.asInstanceOf[js.Any])
      
      inline def setGracefulExitUndefined: Self = StObject.set(x, "gracefulExit", js.undefined)
      
      inline def setHideCursor(value: Boolean): Self = StObject.set(x, "hideCursor", value.asInstanceOf[js.Any])
      
      inline def setHideCursorNull: Self = StObject.set(x, "hideCursor", null)
      
      inline def setHideCursorUndefined: Self = StObject.set(x, "hideCursor", js.undefined)
      
      inline def setLinewrap(value: Boolean): Self = StObject.set(x, "linewrap", value.asInstanceOf[js.Any])
      
      inline def setLinewrapNull: Self = StObject.set(x, "linewrap", null)
      
      inline def setLinewrapUndefined: Self = StObject.set(x, "linewrap", js.undefined)
      
      inline def setNoTTYOutput(value: Boolean): Self = StObject.set(x, "noTTYOutput", value.asInstanceOf[js.Any])
      
      inline def setNoTTYOutputUndefined: Self = StObject.set(x, "noTTYOutput", js.undefined)
      
      inline def setNotTTYSchedule(value: Double): Self = StObject.set(x, "notTTYSchedule", value.asInstanceOf[js.Any])
      
      inline def setNotTTYScheduleUndefined: Self = StObject.set(x, "notTTYSchedule", js.undefined)
      
      inline def setProgressCalculationRelative(value: Boolean): Self = StObject.set(x, "progressCalculationRelative", value.asInstanceOf[js.Any])
      
      inline def setProgressCalculationRelativeUndefined: Self = StObject.set(x, "progressCalculationRelative", js.undefined)
      
      inline def setStopOnComplete(value: Boolean): Self = StObject.set(x, "stopOnComplete", value.asInstanceOf[js.Any])
      
      inline def setStopOnCompleteUndefined: Self = StObject.set(x, "stopOnComplete", js.undefined)
      
      inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setSynchronousUpdate(value: Boolean): Self = StObject.set(x, "synchronousUpdate", value.asInstanceOf[js.Any])
      
      inline def setSynchronousUpdateUndefined: Self = StObject.set(x, "synchronousUpdate", js.undefined)
    }
  }
  
  trait Params extends StObject {
    
    var eta: Double
    
    var maxWidth: Double
    
    var progress: Double
    
    var startTime: Double
    
    var total: Double
    
    var value: Double
  }
  object Params {
    
    inline def apply(eta: Double, maxWidth: Double, progress: Double, startTime: Double, total: Double, value: Double): Params = {
      val __obj = js.Dynamic.literal(eta = eta.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setEta(value: Double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Preset extends StObject {
    
    var barCompleteChar: String
    
    var barIncompleteChar: String
    
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
      * {eta} -  expected time of accomplishment in seconds (limited to 115days, otherwise INF is displayed)
      *
      * {duration} - elapsed time in seconds
      *
      * {eta_formatted} - expected time of accomplishment formatted into appropriate units
      *
      * {duration_formatted} - elapsed time formatted into appropriate units
      *
      */
    var format: String
  }
  object Preset {
    
    inline def apply(barCompleteChar: String, barIncompleteChar: String, format: String): Preset = {
      val __obj = js.Dynamic.literal(barCompleteChar = barCompleteChar.asInstanceOf[js.Any], barIncompleteChar = barIncompleteChar.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Preset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Preset] (val x: Self) extends AnyVal {
      
      inline def setBarCompleteChar(value: String): Self = StObject.set(x, "barCompleteChar", value.asInstanceOf[js.Any])
      
      inline def setBarIncompleteChar(value: String): Self = StObject.set(x, "barIncompleteChar", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  type TimeFormatter = js.Function3[/* t */ Double, /* options */ Options, /* roundToMultipleOf */ Double, String]
  
  type ValueFormatter = js.Function3[/* v */ Double, /* options */ Options, /* type */ ValueType, String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cliProgress.cliProgressStrings.percentage
    - typings.cliProgress.cliProgressStrings.total
    - typings.cliProgress.cliProgressStrings.value
    - typings.cliProgress.cliProgressStrings.eta
    - typings.cliProgress.cliProgressStrings.duration
  */
  trait ValueType extends StObject
  object ValueType {
    
    inline def duration: typings.cliProgress.cliProgressStrings.duration = "duration".asInstanceOf[typings.cliProgress.cliProgressStrings.duration]
    
    inline def eta: typings.cliProgress.cliProgressStrings.eta = "eta".asInstanceOf[typings.cliProgress.cliProgressStrings.eta]
    
    inline def percentage: typings.cliProgress.cliProgressStrings.percentage = "percentage".asInstanceOf[typings.cliProgress.cliProgressStrings.percentage]
    
    inline def total: typings.cliProgress.cliProgressStrings.total = "total".asInstanceOf[typings.cliProgress.cliProgressStrings.total]
    
    inline def value: typings.cliProgress.cliProgressStrings.value = "value".asInstanceOf[typings.cliProgress.cliProgressStrings.value]
  }
}
