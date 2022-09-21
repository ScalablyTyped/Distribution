package typings.chalk

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.chalk.supportsColorMod.ColorInfo
import typings.chalk.supportsColorMod.ColorSupportLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
  Main Chalk object that allows to chain styles together.
  Call the last one as a method with a string argument.
  Order doesn't matter, and later styles take precedent in case of a conflict.
  This simply means that `chalk.red.yellow.green` is equivalent to `chalk.green`.
  */
  @JSImport("chalk", JSImport.Default)
  @js.native
  val default: ChalkInstance = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("chalk", "Chalk")
  @js.native
  open class Chalk ()
    extends StObject
       with ChalkInstance {
    def this(options: Options) = this()
  }
  @JSImport("chalk", "Chalk")
  @js.native
  val Chalk: Instantiable1[/* options */ js.UndefOr[Options], ChalkInstance] = js.native
  
  @JSImport("chalk", "chalkStderr")
  @js.native
  val chalkStderr: ChalkInstance = js.native
  
  @JSImport("chalk", "supportsColor")
  @js.native
  val supportsColor: ColorInfo = js.native
  
  @JSImport("chalk", "supportsColorStderr")
  @js.native
  val supportsColorStderr: ColorInfo = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.chalk.chalkStrings.bgBlack
    - typings.chalk.chalkStrings.bgRed
    - typings.chalk.chalkStrings.bgGreen
    - typings.chalk.chalkStrings.bgYellow
    - typings.chalk.chalkStrings.bgBlue
    - typings.chalk.chalkStrings.bgMagenta
    - typings.chalk.chalkStrings.bgCyan
    - typings.chalk.chalkStrings.bgWhite
    - typings.chalk.chalkStrings.bgGray
    - typings.chalk.chalkStrings.bgGrey
    - typings.chalk.chalkStrings.bgBlackBright
    - typings.chalk.chalkStrings.bgRedBright
    - typings.chalk.chalkStrings.bgGreenBright
    - typings.chalk.chalkStrings.bgYellowBright
    - typings.chalk.chalkStrings.bgBlueBright
    - typings.chalk.chalkStrings.bgMagentaBright
    - typings.chalk.chalkStrings.bgCyanBright
    - typings.chalk.chalkStrings.bgWhiteBright
  */
  trait BackgroundColor extends StObject
  object BackgroundColor {
    
    inline def bgBlack: typings.chalk.chalkStrings.bgBlack = "bgBlack".asInstanceOf[typings.chalk.chalkStrings.bgBlack]
    
    inline def bgBlackBright: typings.chalk.chalkStrings.bgBlackBright = "bgBlackBright".asInstanceOf[typings.chalk.chalkStrings.bgBlackBright]
    
    inline def bgBlue: typings.chalk.chalkStrings.bgBlue = "bgBlue".asInstanceOf[typings.chalk.chalkStrings.bgBlue]
    
    inline def bgBlueBright: typings.chalk.chalkStrings.bgBlueBright = "bgBlueBright".asInstanceOf[typings.chalk.chalkStrings.bgBlueBright]
    
    inline def bgCyan: typings.chalk.chalkStrings.bgCyan = "bgCyan".asInstanceOf[typings.chalk.chalkStrings.bgCyan]
    
    inline def bgCyanBright: typings.chalk.chalkStrings.bgCyanBright = "bgCyanBright".asInstanceOf[typings.chalk.chalkStrings.bgCyanBright]
    
    inline def bgGray: typings.chalk.chalkStrings.bgGray = "bgGray".asInstanceOf[typings.chalk.chalkStrings.bgGray]
    
    inline def bgGreen: typings.chalk.chalkStrings.bgGreen = "bgGreen".asInstanceOf[typings.chalk.chalkStrings.bgGreen]
    
    inline def bgGreenBright: typings.chalk.chalkStrings.bgGreenBright = "bgGreenBright".asInstanceOf[typings.chalk.chalkStrings.bgGreenBright]
    
    inline def bgGrey: typings.chalk.chalkStrings.bgGrey = "bgGrey".asInstanceOf[typings.chalk.chalkStrings.bgGrey]
    
    inline def bgMagenta: typings.chalk.chalkStrings.bgMagenta = "bgMagenta".asInstanceOf[typings.chalk.chalkStrings.bgMagenta]
    
    inline def bgMagentaBright: typings.chalk.chalkStrings.bgMagentaBright = "bgMagentaBright".asInstanceOf[typings.chalk.chalkStrings.bgMagentaBright]
    
    inline def bgRed: typings.chalk.chalkStrings.bgRed = "bgRed".asInstanceOf[typings.chalk.chalkStrings.bgRed]
    
    inline def bgRedBright: typings.chalk.chalkStrings.bgRedBright = "bgRedBright".asInstanceOf[typings.chalk.chalkStrings.bgRedBright]
    
    inline def bgWhite: typings.chalk.chalkStrings.bgWhite = "bgWhite".asInstanceOf[typings.chalk.chalkStrings.bgWhite]
    
    inline def bgWhiteBright: typings.chalk.chalkStrings.bgWhiteBright = "bgWhiteBright".asInstanceOf[typings.chalk.chalkStrings.bgWhiteBright]
    
    inline def bgYellow: typings.chalk.chalkStrings.bgYellow = "bgYellow".asInstanceOf[typings.chalk.chalkStrings.bgYellow]
    
    inline def bgYellowBright: typings.chalk.chalkStrings.bgYellowBright = "bgYellowBright".asInstanceOf[typings.chalk.chalkStrings.bgYellowBright]
  }
  
  @js.native
  trait ChalkInstance extends StObject {
    
    def apply(text: Any*): String = js.native
    
    /**
    	Use an [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set text color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.ansi256(201);
    	```
    	*/
    def ansi256(index: Double): this.type = js.native
    
    /**
    	Use a [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set background color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.bgAnsi256(201);
    	```
    	*/
    def bgAnsi256(index: Double): this.type = js.native
    
    val bgBlack: this.type = js.native
    
    val bgBlackBright: this.type = js.native
    
    val bgBlue: this.type = js.native
    
    val bgBlueBright: this.type = js.native
    
    val bgCyan: this.type = js.native
    
    val bgCyanBright: this.type = js.native
    
    /*
    	Alias for `bgBlackBright`.
    	*/
    val bgGray: this.type = js.native
    
    val bgGreen: this.type = js.native
    
    val bgGreenBright: this.type = js.native
    
    /*
    	Alias for `bgBlackBright`.
    	*/
    val bgGrey: this.type = js.native
    
    /**
    	Use HEX value to set background color.
    	@param color - Hexadecimal value representing the desired color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.bgHex('#DEADED');
    	```
    	*/
    def bgHex(color: String): this.type = js.native
    
    val bgMagenta: this.type = js.native
    
    val bgMagentaBright: this.type = js.native
    
    val bgRed: this.type = js.native
    
    val bgRedBright: this.type = js.native
    
    /**
    	Use RGB values to set background color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.bgRgb(222, 173, 237);
    	```
    	*/
    def bgRgb(red: Double, green: Double, blue: Double): this.type = js.native
    
    val bgWhite: this.type = js.native
    
    val bgWhiteBright: this.type = js.native
    
    val bgYellow: this.type = js.native
    
    val bgYellowBright: this.type = js.native
    
    val black: this.type = js.native
    
    val blackBright: this.type = js.native
    
    val blue: this.type = js.native
    
    val blueBright: this.type = js.native
    
    /**
    	Modifier: Make the text bold.
    	*/
    val bold: this.type = js.native
    
    val cyan: this.type = js.native
    
    val cyanBright: this.type = js.native
    
    /**
    	Modifier: Make the text have lower opacity.
    	*/
    val dim: this.type = js.native
    
    /*
    	Alias for `blackBright`.
    	*/
    val gray: this.type = js.native
    
    val green: this.type = js.native
    
    val greenBright: this.type = js.native
    
    /*
    	Alias for `blackBright`.
    	*/
    val grey: this.type = js.native
    
    /**
    	Use HEX value to set text color.
    	@param color - Hexadecimal value representing the desired color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.hex('#DEADED');
    	```
    	*/
    def hex(color: String): this.type = js.native
    
    /**
    	Modifier: Print the text but make it invisible.
    	*/
    val hidden: this.type = js.native
    
    /**
    	Modifier: Invert background and foreground colors.
    	*/
    val inverse: this.type = js.native
    
    /**
    	Modifier: Make the text italic. *(Not widely supported)*
    	*/
    val italic: this.type = js.native
    
    /**
    	The color support for Chalk.
    	By default, color support is automatically detected based on the environment.
    	Levels:
    	- `0` - All colors disabled.
    	- `1` - Basic 16 colors support.
    	- `2` - ANSI 256 colors support.
    	- `3` - Truecolor 16 million colors support.
    	*/
    var level: ColorSupportLevel = js.native
    
    val magenta: this.type = js.native
    
    val magentaBright: this.type = js.native
    
    /**
    	Modifier: Put a horizontal line above the text. *(Not widely supported)*
    	*/
    val overline: this.type = js.native
    
    val red: this.type = js.native
    
    val redBright: this.type = js.native
    
    /**
    	Modifier: Reset the current style.
    	*/
    val reset: this.type = js.native
    
    /**
    	Use RGB values to set text color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.rgb(222, 173, 237);
    	```
    	*/
    def rgb(red: Double, green: Double, blue: Double): this.type = js.native
    
    /**
    	Modifier: Puts a horizontal line through the center of the text. *(Not widely supported)*
    	*/
    val strikethrough: this.type = js.native
    
    /**
    	Modifier: Put a horizontal line below the text. *(Not widely supported)*
    	*/
    val underline: this.type = js.native
    
    /**
    	Modifier: Print the text only when Chalk has a color level above zero.
    	Can be useful for things that are purely cosmetic.
    	*/
    val visible: this.type = js.native
    
    val white: this.type = js.native
    
    val whiteBright: this.type = js.native
    
    val yellow: this.type = js.native
    
    val yellowBright: this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chalk.chalkStrings.black
    - typings.chalk.chalkStrings.red
    - typings.chalk.chalkStrings.green
    - typings.chalk.chalkStrings.yellow
    - typings.chalk.chalkStrings.blue
    - typings.chalk.chalkStrings.magenta
    - typings.chalk.chalkStrings.cyan
    - typings.chalk.chalkStrings.white
    - typings.chalk.chalkStrings.gray
    - typings.chalk.chalkStrings.grey
    - typings.chalk.chalkStrings.blackBright
    - typings.chalk.chalkStrings.redBright
    - typings.chalk.chalkStrings.greenBright
    - typings.chalk.chalkStrings.yellowBright
    - typings.chalk.chalkStrings.blueBright
    - typings.chalk.chalkStrings.magentaBright
    - typings.chalk.chalkStrings.cyanBright
    - typings.chalk.chalkStrings.whiteBright
    - typings.chalk.chalkStrings.bgBlack
    - typings.chalk.chalkStrings.bgRed
    - typings.chalk.chalkStrings.bgGreen
    - typings.chalk.chalkStrings.bgYellow
    - typings.chalk.chalkStrings.bgBlue
    - typings.chalk.chalkStrings.bgMagenta
    - typings.chalk.chalkStrings.bgCyan
    - typings.chalk.chalkStrings.bgWhite
    - typings.chalk.chalkStrings.bgGray
    - typings.chalk.chalkStrings.bgGrey
    - typings.chalk.chalkStrings.bgBlackBright
    - typings.chalk.chalkStrings.bgRedBright
    - typings.chalk.chalkStrings.bgGreenBright
    - typings.chalk.chalkStrings.bgYellowBright
    - typings.chalk.chalkStrings.bgBlueBright
    - typings.chalk.chalkStrings.bgMagentaBright
    - typings.chalk.chalkStrings.bgCyanBright
    - typings.chalk.chalkStrings.bgWhiteBright
  */
  trait Color extends StObject
  object Color {
    
    inline def bgBlack: typings.chalk.chalkStrings.bgBlack = "bgBlack".asInstanceOf[typings.chalk.chalkStrings.bgBlack]
    
    inline def bgBlackBright: typings.chalk.chalkStrings.bgBlackBright = "bgBlackBright".asInstanceOf[typings.chalk.chalkStrings.bgBlackBright]
    
    inline def bgBlue: typings.chalk.chalkStrings.bgBlue = "bgBlue".asInstanceOf[typings.chalk.chalkStrings.bgBlue]
    
    inline def bgBlueBright: typings.chalk.chalkStrings.bgBlueBright = "bgBlueBright".asInstanceOf[typings.chalk.chalkStrings.bgBlueBright]
    
    inline def bgCyan: typings.chalk.chalkStrings.bgCyan = "bgCyan".asInstanceOf[typings.chalk.chalkStrings.bgCyan]
    
    inline def bgCyanBright: typings.chalk.chalkStrings.bgCyanBright = "bgCyanBright".asInstanceOf[typings.chalk.chalkStrings.bgCyanBright]
    
    inline def bgGray: typings.chalk.chalkStrings.bgGray = "bgGray".asInstanceOf[typings.chalk.chalkStrings.bgGray]
    
    inline def bgGreen: typings.chalk.chalkStrings.bgGreen = "bgGreen".asInstanceOf[typings.chalk.chalkStrings.bgGreen]
    
    inline def bgGreenBright: typings.chalk.chalkStrings.bgGreenBright = "bgGreenBright".asInstanceOf[typings.chalk.chalkStrings.bgGreenBright]
    
    inline def bgGrey: typings.chalk.chalkStrings.bgGrey = "bgGrey".asInstanceOf[typings.chalk.chalkStrings.bgGrey]
    
    inline def bgMagenta: typings.chalk.chalkStrings.bgMagenta = "bgMagenta".asInstanceOf[typings.chalk.chalkStrings.bgMagenta]
    
    inline def bgMagentaBright: typings.chalk.chalkStrings.bgMagentaBright = "bgMagentaBright".asInstanceOf[typings.chalk.chalkStrings.bgMagentaBright]
    
    inline def bgRed: typings.chalk.chalkStrings.bgRed = "bgRed".asInstanceOf[typings.chalk.chalkStrings.bgRed]
    
    inline def bgRedBright: typings.chalk.chalkStrings.bgRedBright = "bgRedBright".asInstanceOf[typings.chalk.chalkStrings.bgRedBright]
    
    inline def bgWhite: typings.chalk.chalkStrings.bgWhite = "bgWhite".asInstanceOf[typings.chalk.chalkStrings.bgWhite]
    
    inline def bgWhiteBright: typings.chalk.chalkStrings.bgWhiteBright = "bgWhiteBright".asInstanceOf[typings.chalk.chalkStrings.bgWhiteBright]
    
    inline def bgYellow: typings.chalk.chalkStrings.bgYellow = "bgYellow".asInstanceOf[typings.chalk.chalkStrings.bgYellow]
    
    inline def bgYellowBright: typings.chalk.chalkStrings.bgYellowBright = "bgYellowBright".asInstanceOf[typings.chalk.chalkStrings.bgYellowBright]
    
    inline def black: typings.chalk.chalkStrings.black = "black".asInstanceOf[typings.chalk.chalkStrings.black]
    
    inline def blackBright: typings.chalk.chalkStrings.blackBright = "blackBright".asInstanceOf[typings.chalk.chalkStrings.blackBright]
    
    inline def blue: typings.chalk.chalkStrings.blue = "blue".asInstanceOf[typings.chalk.chalkStrings.blue]
    
    inline def blueBright: typings.chalk.chalkStrings.blueBright = "blueBright".asInstanceOf[typings.chalk.chalkStrings.blueBright]
    
    inline def cyan: typings.chalk.chalkStrings.cyan = "cyan".asInstanceOf[typings.chalk.chalkStrings.cyan]
    
    inline def cyanBright: typings.chalk.chalkStrings.cyanBright = "cyanBright".asInstanceOf[typings.chalk.chalkStrings.cyanBright]
    
    inline def gray: typings.chalk.chalkStrings.gray = "gray".asInstanceOf[typings.chalk.chalkStrings.gray]
    
    inline def green: typings.chalk.chalkStrings.green = "green".asInstanceOf[typings.chalk.chalkStrings.green]
    
    inline def greenBright: typings.chalk.chalkStrings.greenBright = "greenBright".asInstanceOf[typings.chalk.chalkStrings.greenBright]
    
    inline def grey: typings.chalk.chalkStrings.grey = "grey".asInstanceOf[typings.chalk.chalkStrings.grey]
    
    inline def magenta: typings.chalk.chalkStrings.magenta = "magenta".asInstanceOf[typings.chalk.chalkStrings.magenta]
    
    inline def magentaBright: typings.chalk.chalkStrings.magentaBright = "magentaBright".asInstanceOf[typings.chalk.chalkStrings.magentaBright]
    
    inline def red: typings.chalk.chalkStrings.red = "red".asInstanceOf[typings.chalk.chalkStrings.red]
    
    inline def redBright: typings.chalk.chalkStrings.redBright = "redBright".asInstanceOf[typings.chalk.chalkStrings.redBright]
    
    inline def white: typings.chalk.chalkStrings.white = "white".asInstanceOf[typings.chalk.chalkStrings.white]
    
    inline def whiteBright: typings.chalk.chalkStrings.whiteBright = "whiteBright".asInstanceOf[typings.chalk.chalkStrings.whiteBright]
    
    inline def yellow: typings.chalk.chalkStrings.yellow = "yellow".asInstanceOf[typings.chalk.chalkStrings.yellow]
    
    inline def yellowBright: typings.chalk.chalkStrings.yellowBright = "yellowBright".asInstanceOf[typings.chalk.chalkStrings.yellowBright]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chalk.chalkStrings.black
    - typings.chalk.chalkStrings.red
    - typings.chalk.chalkStrings.green
    - typings.chalk.chalkStrings.yellow
    - typings.chalk.chalkStrings.blue
    - typings.chalk.chalkStrings.magenta
    - typings.chalk.chalkStrings.cyan
    - typings.chalk.chalkStrings.white
    - typings.chalk.chalkStrings.gray
    - typings.chalk.chalkStrings.grey
    - typings.chalk.chalkStrings.blackBright
    - typings.chalk.chalkStrings.redBright
    - typings.chalk.chalkStrings.greenBright
    - typings.chalk.chalkStrings.yellowBright
    - typings.chalk.chalkStrings.blueBright
    - typings.chalk.chalkStrings.magentaBright
    - typings.chalk.chalkStrings.cyanBright
    - typings.chalk.chalkStrings.whiteBright
  */
  trait ForegroundColor extends StObject
  object ForegroundColor {
    
    inline def black: typings.chalk.chalkStrings.black = "black".asInstanceOf[typings.chalk.chalkStrings.black]
    
    inline def blackBright: typings.chalk.chalkStrings.blackBright = "blackBright".asInstanceOf[typings.chalk.chalkStrings.blackBright]
    
    inline def blue: typings.chalk.chalkStrings.blue = "blue".asInstanceOf[typings.chalk.chalkStrings.blue]
    
    inline def blueBright: typings.chalk.chalkStrings.blueBright = "blueBright".asInstanceOf[typings.chalk.chalkStrings.blueBright]
    
    inline def cyan: typings.chalk.chalkStrings.cyan = "cyan".asInstanceOf[typings.chalk.chalkStrings.cyan]
    
    inline def cyanBright: typings.chalk.chalkStrings.cyanBright = "cyanBright".asInstanceOf[typings.chalk.chalkStrings.cyanBright]
    
    inline def gray: typings.chalk.chalkStrings.gray = "gray".asInstanceOf[typings.chalk.chalkStrings.gray]
    
    inline def green: typings.chalk.chalkStrings.green = "green".asInstanceOf[typings.chalk.chalkStrings.green]
    
    inline def greenBright: typings.chalk.chalkStrings.greenBright = "greenBright".asInstanceOf[typings.chalk.chalkStrings.greenBright]
    
    inline def grey: typings.chalk.chalkStrings.grey = "grey".asInstanceOf[typings.chalk.chalkStrings.grey]
    
    inline def magenta: typings.chalk.chalkStrings.magenta = "magenta".asInstanceOf[typings.chalk.chalkStrings.magenta]
    
    inline def magentaBright: typings.chalk.chalkStrings.magentaBright = "magentaBright".asInstanceOf[typings.chalk.chalkStrings.magentaBright]
    
    inline def red: typings.chalk.chalkStrings.red = "red".asInstanceOf[typings.chalk.chalkStrings.red]
    
    inline def redBright: typings.chalk.chalkStrings.redBright = "redBright".asInstanceOf[typings.chalk.chalkStrings.redBright]
    
    inline def white: typings.chalk.chalkStrings.white = "white".asInstanceOf[typings.chalk.chalkStrings.white]
    
    inline def whiteBright: typings.chalk.chalkStrings.whiteBright = "whiteBright".asInstanceOf[typings.chalk.chalkStrings.whiteBright]
    
    inline def yellow: typings.chalk.chalkStrings.yellow = "yellow".asInstanceOf[typings.chalk.chalkStrings.yellow]
    
    inline def yellowBright: typings.chalk.chalkStrings.yellowBright = "yellowBright".asInstanceOf[typings.chalk.chalkStrings.yellowBright]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chalk.chalkStrings.reset
    - typings.chalk.chalkStrings.bold
    - typings.chalk.chalkStrings.dim
    - typings.chalk.chalkStrings.italic
    - typings.chalk.chalkStrings.underline
    - typings.chalk.chalkStrings.overline
    - typings.chalk.chalkStrings.inverse
    - typings.chalk.chalkStrings.hidden
    - typings.chalk.chalkStrings.strikethrough
    - typings.chalk.chalkStrings.visible
  */
  trait Modifiers extends StObject
  object Modifiers {
    
    inline def bold: typings.chalk.chalkStrings.bold = "bold".asInstanceOf[typings.chalk.chalkStrings.bold]
    
    inline def dim: typings.chalk.chalkStrings.dim = "dim".asInstanceOf[typings.chalk.chalkStrings.dim]
    
    inline def hidden: typings.chalk.chalkStrings.hidden = "hidden".asInstanceOf[typings.chalk.chalkStrings.hidden]
    
    inline def inverse: typings.chalk.chalkStrings.inverse = "inverse".asInstanceOf[typings.chalk.chalkStrings.inverse]
    
    inline def italic: typings.chalk.chalkStrings.italic = "italic".asInstanceOf[typings.chalk.chalkStrings.italic]
    
    inline def overline: typings.chalk.chalkStrings.overline = "overline".asInstanceOf[typings.chalk.chalkStrings.overline]
    
    inline def reset: typings.chalk.chalkStrings.reset = "reset".asInstanceOf[typings.chalk.chalkStrings.reset]
    
    inline def strikethrough: typings.chalk.chalkStrings.strikethrough = "strikethrough".asInstanceOf[typings.chalk.chalkStrings.strikethrough]
    
    inline def underline: typings.chalk.chalkStrings.underline = "underline".asInstanceOf[typings.chalk.chalkStrings.underline]
    
    inline def visible: typings.chalk.chalkStrings.visible = "visible".asInstanceOf[typings.chalk.chalkStrings.visible]
  }
  
  trait Options extends StObject {
    
    /**
    	Specify the color support for Chalk.
    	By default, color support is automatically detected based on the environment.
    	Levels:
    	- `0` - All colors disabled.
    	- `1` - Basic 16 colors support.
    	- `2` - ANSI 256 colors support.
    	- `3` - Truecolor 16 million colors support.
    	*/
    val level: js.UndefOr[ColorSupportLevel] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLevel(value: ColorSupportLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  type _To = ChalkInstance
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ChalkInstance = default
}
