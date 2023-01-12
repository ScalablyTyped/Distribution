package typings.clui

import typings.cliColor.mod.Format
import typings.clui.cluiStrings.console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Gauge(value: Double, maxValue: Double, guageWidth: Double, dangerZone: Double, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("Gauge")(value.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any], guageWidth.asInstanceOf[js.Any], dangerZone.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("clui", "Line")
  @js.native
  /**
    * Create a new instance of Line object
    * @param buffer Object to be used as buffer
    */
  open class Line () extends StObject {
    def this(buffer: LineBuffer) = this()
    
    /**
      * Output text within a column of the specified width
      * @param text Text to print
      * @param width Width of the column
      * @param styles List of `cli-color` styles to apply
      */
    def column(text: String, width: Double): Line = js.native
    def column(text: String, width: Double, styles: js.Array[Format]): Line = js.native
    
    /**
      * Return the contents of this line as a string
      */
    def contents(): String = js.native
    
    /**
      * At the end of a line, fill the rest of the columns to the right edge
      */
    def fill(): Line = js.native
    
    /**
      * Print the generated line of text to the console
      */
    def output(): Line = js.native
    
    /**
      * Output `width` characters of blank space
      * @param width Number of characters to print
      */
    def padding(width: Double): Line = js.native
    
    /**
      * Store this line into the buffer
      */
    def store(): Unit = js.native
  }
  
  @JSImport("clui", "LineBuffer")
  @js.native
  open class LineBuffer protected () extends StObject {
    /**
      * Creates an object for buffering a group of text lines and then outputting them
      * @param options Values to build the buffer
      */
    def this(options: LineBufferOptions) = this()
    
    /**
      * Put a `Line` object into the `LineBuffer`
      * @param line The line object to put into the buffer
      */
    def addLine(line: Line): Unit = js.native
    
    /**
      * If you don't have enough lines in the buffer, this will fill the reset of
      * the lines with empty spaces
      */
    def fill(): Unit = js.native
    
    /**
      * Return the height of the `LineBuffer`, when specified as `console`
      */
    def height(): Double = js.native
    
    /**
      * Draw the `LineBuffer` to screen
      */
    def output(): Unit = js.native
    
    /**
      * Return the width of the `LineBuffer`, when specified as `console`
      */
    def width(): Double = js.native
  }
  
  @JSImport("clui", "Progress")
  @js.native
  open class Progress protected () extends StObject {
    /**
      * Creates a progress bar
      * @param length The desired length of the progress bar in characters
      */
    def this(length: Double) = this()
    
    /**
      * Returns the progress bar min/max context to write to stdout
      * @param currentValueOrPercent Current value (or percent) of the progress bar
      * @param maxValue Maximum value of the progress bar
      */
    def update(currentValueOrPercent: Double): String = js.native
    def update(currentValueOrPercent: Double, maxValue: Double): String = js.native
  }
  
  inline def Sparkline(values: js.Array[Double], suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("Sparkline")(values.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("clui", "Spinner")
  @js.native
  open class Spinner protected () extends StObject {
    /**
      * Creates a new spinner
      * @param statusText The default text to display while the spinner is spinning
      * @param style Array of graphical characters used to draw the spinner
      */
    def this(statusText: String) = this()
    def this(statusText: String, style: js.Array[String]) = this()
    
    /**
      * Update the status message that follows the spinner
      * @param statusMessage Message to be displayed
      */
    def message(statusMessage: String): Unit = js.native
    
    /**
      * Show the spinner on the screen
      */
    def start(): Unit = js.native
    
    /**
      * Erase the spinner from the screen
      */
    def stop(): Unit = js.native
  }
  
  trait LineBufferOptions extends StObject {
    
    var height: js.UndefOr[Double | console] = js.undefined
    
    var scroll: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double | console] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object LineBufferOptions {
    
    inline def apply(): LineBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineBufferOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineBufferOptions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double | console): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setScroll(value: Double): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setWidth(value: Double | console): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
