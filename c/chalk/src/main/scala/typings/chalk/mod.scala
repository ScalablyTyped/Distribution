package typings.chalk

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.chalk.sourceVendorAnsiStylesMod.BackgroundColorName
import typings.chalk.sourceVendorAnsiStylesMod.ColorName
import typings.chalk.sourceVendorAnsiStylesMod.ForegroundColorName
import typings.chalk.sourceVendorAnsiStylesMod.ModifierName
import typings.chalk.sourceVendorSupportsColorMod.ColorInfo
import typings.chalk.sourceVendorSupportsColorMod.ColorSupportLevel
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
  
  @JSImport("chalk", "backgroundColorNames")
  @js.native
  val backgroundColorNames: js.Array[BackgroundColorName] = js.native
  
  @JSImport("chalk", "backgroundColors")
  @js.native
  val backgroundColors: js.Array[BackgroundColor] = js.native
  
  @JSImport("chalk", "chalkStderr")
  @js.native
  val chalkStderr: ChalkInstance = js.native
  
  @JSImport("chalk", "colorNames")
  @js.native
  val colorNames: js.Array[ColorName] = js.native
  
  @JSImport("chalk", "colors")
  @js.native
  val colors: js.Array[Color] = js.native
  
  @JSImport("chalk", "foregroundColorNames")
  @js.native
  val foregroundColorNames: js.Array[ForegroundColorName] = js.native
  
  @JSImport("chalk", "foregroundColors")
  @js.native
  val foregroundColors: js.Array[ForegroundColor] = js.native
  
  @JSImport("chalk", "modifierNames")
  @js.native
  val modifierNames: js.Array[ModifierName] = js.native
  
  @JSImport("chalk", "modifiers")
  @js.native
  val modifiers: js.Array[Modifiers_] = js.native
  
  @JSImport("chalk", "supportsColor")
  @js.native
  val supportsColor: ColorInfo = js.native
  
  @JSImport("chalk", "supportsColorStderr")
  @js.native
  val supportsColorStderr: ColorInfo = js.native
  
  type BackgroundColor = BackgroundColorName
  
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
  
  type Color = ColorName
  
  type ForegroundColor = ForegroundColorName
  
  type Modifiers_ = ModifierName
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: ColorSupportLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  type _To = ChalkInstance
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ChalkInstance = default
}
