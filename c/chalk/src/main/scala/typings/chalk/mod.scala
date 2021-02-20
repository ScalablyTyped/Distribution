package typings.chalk

import org.scalablytyped.runtime.Instantiable1
import typings.chalk.anon.ChalksupportsColorColorSu
import typings.chalk.chalkBooleans.`false`
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Main Chalk object that allows to chain styles together.
Call the last one as a method with a string argument.
Order doesn't matter, and later styles take precedent in case of a conflict.
This simply means that `chalk.red.yellow.green` is equivalent to `chalk.green`.
*/
/* Inlined chalk.chalk.Chalk & chalk.chalk.ChalkFunction & {  supportsColor :chalk.chalk.ColorSupport | false,   Level :chalk.chalk.Level,   Color :chalk.chalk.Color,   ForegroundColor :chalk.chalk.ForegroundColor,   BackgroundColor :chalk.chalk.BackgroundColor,   Modifiers :chalk.chalk.Modifiers,   stderr :chalk.chalk.Chalk & {  supportsColor :chalk.chalk.ColorSupport | false}} */
object mod {
  
  @JSImport("chalk", JSImport.Namespace)
  @js.native
  def apply(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", JSImport.Namespace)
  @js.native
  def apply(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Basic background colors.
  [More colors here.](https://github.com/chalk/chalk/blob/master/readme.md#256-and-truecolor-color-support)
  */
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
    
    @JSImport("chalk", "BackgroundColor")
    @js.native
    val ^ : BackgroundColor = js.native
    
    @scala.inline
    def bgBlack: typings.chalk.chalkStrings.bgBlack = "bgBlack".asInstanceOf[typings.chalk.chalkStrings.bgBlack]
    
    @scala.inline
    def bgBlackBright: typings.chalk.chalkStrings.bgBlackBright = "bgBlackBright".asInstanceOf[typings.chalk.chalkStrings.bgBlackBright]
    
    @scala.inline
    def bgBlue: typings.chalk.chalkStrings.bgBlue = "bgBlue".asInstanceOf[typings.chalk.chalkStrings.bgBlue]
    
    @scala.inline
    def bgBlueBright: typings.chalk.chalkStrings.bgBlueBright = "bgBlueBright".asInstanceOf[typings.chalk.chalkStrings.bgBlueBright]
    
    @scala.inline
    def bgCyan: typings.chalk.chalkStrings.bgCyan = "bgCyan".asInstanceOf[typings.chalk.chalkStrings.bgCyan]
    
    @scala.inline
    def bgCyanBright: typings.chalk.chalkStrings.bgCyanBright = "bgCyanBright".asInstanceOf[typings.chalk.chalkStrings.bgCyanBright]
    
    @scala.inline
    def bgGray: typings.chalk.chalkStrings.bgGray = "bgGray".asInstanceOf[typings.chalk.chalkStrings.bgGray]
    
    @scala.inline
    def bgGreen: typings.chalk.chalkStrings.bgGreen = "bgGreen".asInstanceOf[typings.chalk.chalkStrings.bgGreen]
    
    @scala.inline
    def bgGreenBright: typings.chalk.chalkStrings.bgGreenBright = "bgGreenBright".asInstanceOf[typings.chalk.chalkStrings.bgGreenBright]
    
    @scala.inline
    def bgGrey: typings.chalk.chalkStrings.bgGrey = "bgGrey".asInstanceOf[typings.chalk.chalkStrings.bgGrey]
    
    @scala.inline
    def bgMagenta: typings.chalk.chalkStrings.bgMagenta = "bgMagenta".asInstanceOf[typings.chalk.chalkStrings.bgMagenta]
    
    @scala.inline
    def bgMagentaBright: typings.chalk.chalkStrings.bgMagentaBright = "bgMagentaBright".asInstanceOf[typings.chalk.chalkStrings.bgMagentaBright]
    
    @scala.inline
    def bgRed: typings.chalk.chalkStrings.bgRed = "bgRed".asInstanceOf[typings.chalk.chalkStrings.bgRed]
    
    @scala.inline
    def bgRedBright: typings.chalk.chalkStrings.bgRedBright = "bgRedBright".asInstanceOf[typings.chalk.chalkStrings.bgRedBright]
    
    @scala.inline
    def bgWhite: typings.chalk.chalkStrings.bgWhite = "bgWhite".asInstanceOf[typings.chalk.chalkStrings.bgWhite]
    
    @scala.inline
    def bgWhiteBright: typings.chalk.chalkStrings.bgWhiteBright = "bgWhiteBright".asInstanceOf[typings.chalk.chalkStrings.bgWhiteBright]
    
    @scala.inline
    def bgYellow: typings.chalk.chalkStrings.bgYellow = "bgYellow".asInstanceOf[typings.chalk.chalkStrings.bgYellow]
    
    @scala.inline
    def bgYellowBright: typings.chalk.chalkStrings.bgYellowBright = "bgYellowBright".asInstanceOf[typings.chalk.chalkStrings.bgYellowBright]
  }
  
  /**
  Basic colors.
  [More colors here.](https://github.com/chalk/chalk/blob/master/readme.md#256-and-truecolor-color-support)
  */
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
    
    @JSImport("chalk", "Color")
    @js.native
    val ^ : Color = js.native
    
    @scala.inline
    def bgBlack: typings.chalk.chalkStrings.bgBlack = "bgBlack".asInstanceOf[typings.chalk.chalkStrings.bgBlack]
    
    @scala.inline
    def bgBlackBright: typings.chalk.chalkStrings.bgBlackBright = "bgBlackBright".asInstanceOf[typings.chalk.chalkStrings.bgBlackBright]
    
    @scala.inline
    def bgBlue: typings.chalk.chalkStrings.bgBlue = "bgBlue".asInstanceOf[typings.chalk.chalkStrings.bgBlue]
    
    @scala.inline
    def bgBlueBright: typings.chalk.chalkStrings.bgBlueBright = "bgBlueBright".asInstanceOf[typings.chalk.chalkStrings.bgBlueBright]
    
    @scala.inline
    def bgCyan: typings.chalk.chalkStrings.bgCyan = "bgCyan".asInstanceOf[typings.chalk.chalkStrings.bgCyan]
    
    @scala.inline
    def bgCyanBright: typings.chalk.chalkStrings.bgCyanBright = "bgCyanBright".asInstanceOf[typings.chalk.chalkStrings.bgCyanBright]
    
    @scala.inline
    def bgGray: typings.chalk.chalkStrings.bgGray = "bgGray".asInstanceOf[typings.chalk.chalkStrings.bgGray]
    
    @scala.inline
    def bgGreen: typings.chalk.chalkStrings.bgGreen = "bgGreen".asInstanceOf[typings.chalk.chalkStrings.bgGreen]
    
    @scala.inline
    def bgGreenBright: typings.chalk.chalkStrings.bgGreenBright = "bgGreenBright".asInstanceOf[typings.chalk.chalkStrings.bgGreenBright]
    
    @scala.inline
    def bgGrey: typings.chalk.chalkStrings.bgGrey = "bgGrey".asInstanceOf[typings.chalk.chalkStrings.bgGrey]
    
    @scala.inline
    def bgMagenta: typings.chalk.chalkStrings.bgMagenta = "bgMagenta".asInstanceOf[typings.chalk.chalkStrings.bgMagenta]
    
    @scala.inline
    def bgMagentaBright: typings.chalk.chalkStrings.bgMagentaBright = "bgMagentaBright".asInstanceOf[typings.chalk.chalkStrings.bgMagentaBright]
    
    @scala.inline
    def bgRed: typings.chalk.chalkStrings.bgRed = "bgRed".asInstanceOf[typings.chalk.chalkStrings.bgRed]
    
    @scala.inline
    def bgRedBright: typings.chalk.chalkStrings.bgRedBright = "bgRedBright".asInstanceOf[typings.chalk.chalkStrings.bgRedBright]
    
    @scala.inline
    def bgWhite: typings.chalk.chalkStrings.bgWhite = "bgWhite".asInstanceOf[typings.chalk.chalkStrings.bgWhite]
    
    @scala.inline
    def bgWhiteBright: typings.chalk.chalkStrings.bgWhiteBright = "bgWhiteBright".asInstanceOf[typings.chalk.chalkStrings.bgWhiteBright]
    
    @scala.inline
    def bgYellow: typings.chalk.chalkStrings.bgYellow = "bgYellow".asInstanceOf[typings.chalk.chalkStrings.bgYellow]
    
    @scala.inline
    def bgYellowBright: typings.chalk.chalkStrings.bgYellowBright = "bgYellowBright".asInstanceOf[typings.chalk.chalkStrings.bgYellowBright]
    
    @scala.inline
    def black: typings.chalk.chalkStrings.black = "black".asInstanceOf[typings.chalk.chalkStrings.black]
    
    @scala.inline
    def blackBright: typings.chalk.chalkStrings.blackBright = "blackBright".asInstanceOf[typings.chalk.chalkStrings.blackBright]
    
    @scala.inline
    def blue: typings.chalk.chalkStrings.blue = "blue".asInstanceOf[typings.chalk.chalkStrings.blue]
    
    @scala.inline
    def blueBright: typings.chalk.chalkStrings.blueBright = "blueBright".asInstanceOf[typings.chalk.chalkStrings.blueBright]
    
    @scala.inline
    def cyan: typings.chalk.chalkStrings.cyan = "cyan".asInstanceOf[typings.chalk.chalkStrings.cyan]
    
    @scala.inline
    def cyanBright: typings.chalk.chalkStrings.cyanBright = "cyanBright".asInstanceOf[typings.chalk.chalkStrings.cyanBright]
    
    @scala.inline
    def gray: typings.chalk.chalkStrings.gray = "gray".asInstanceOf[typings.chalk.chalkStrings.gray]
    
    @scala.inline
    def green: typings.chalk.chalkStrings.green = "green".asInstanceOf[typings.chalk.chalkStrings.green]
    
    @scala.inline
    def greenBright: typings.chalk.chalkStrings.greenBright = "greenBright".asInstanceOf[typings.chalk.chalkStrings.greenBright]
    
    @scala.inline
    def grey: typings.chalk.chalkStrings.grey = "grey".asInstanceOf[typings.chalk.chalkStrings.grey]
    
    @scala.inline
    def magenta: typings.chalk.chalkStrings.magenta = "magenta".asInstanceOf[typings.chalk.chalkStrings.magenta]
    
    @scala.inline
    def magentaBright: typings.chalk.chalkStrings.magentaBright = "magentaBright".asInstanceOf[typings.chalk.chalkStrings.magentaBright]
    
    @scala.inline
    def red: typings.chalk.chalkStrings.red = "red".asInstanceOf[typings.chalk.chalkStrings.red]
    
    @scala.inline
    def redBright: typings.chalk.chalkStrings.redBright = "redBright".asInstanceOf[typings.chalk.chalkStrings.redBright]
    
    @scala.inline
    def white: typings.chalk.chalkStrings.white = "white".asInstanceOf[typings.chalk.chalkStrings.white]
    
    @scala.inline
    def whiteBright: typings.chalk.chalkStrings.whiteBright = "whiteBright".asInstanceOf[typings.chalk.chalkStrings.whiteBright]
    
    @scala.inline
    def yellow: typings.chalk.chalkStrings.yellow = "yellow".asInstanceOf[typings.chalk.chalkStrings.yellow]
    
    @scala.inline
    def yellowBright: typings.chalk.chalkStrings.yellowBright = "yellowBright".asInstanceOf[typings.chalk.chalkStrings.yellowBright]
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
    
    @JSImport("chalk", "ForegroundColor")
    @js.native
    val ^ : ForegroundColor = js.native
    
    @scala.inline
    def black: typings.chalk.chalkStrings.black = "black".asInstanceOf[typings.chalk.chalkStrings.black]
    
    @scala.inline
    def blackBright: typings.chalk.chalkStrings.blackBright = "blackBright".asInstanceOf[typings.chalk.chalkStrings.blackBright]
    
    @scala.inline
    def blue: typings.chalk.chalkStrings.blue = "blue".asInstanceOf[typings.chalk.chalkStrings.blue]
    
    @scala.inline
    def blueBright: typings.chalk.chalkStrings.blueBright = "blueBright".asInstanceOf[typings.chalk.chalkStrings.blueBright]
    
    @scala.inline
    def cyan: typings.chalk.chalkStrings.cyan = "cyan".asInstanceOf[typings.chalk.chalkStrings.cyan]
    
    @scala.inline
    def cyanBright: typings.chalk.chalkStrings.cyanBright = "cyanBright".asInstanceOf[typings.chalk.chalkStrings.cyanBright]
    
    @scala.inline
    def gray: typings.chalk.chalkStrings.gray = "gray".asInstanceOf[typings.chalk.chalkStrings.gray]
    
    @scala.inline
    def green: typings.chalk.chalkStrings.green = "green".asInstanceOf[typings.chalk.chalkStrings.green]
    
    @scala.inline
    def greenBright: typings.chalk.chalkStrings.greenBright = "greenBright".asInstanceOf[typings.chalk.chalkStrings.greenBright]
    
    @scala.inline
    def grey: typings.chalk.chalkStrings.grey = "grey".asInstanceOf[typings.chalk.chalkStrings.grey]
    
    @scala.inline
    def magenta: typings.chalk.chalkStrings.magenta = "magenta".asInstanceOf[typings.chalk.chalkStrings.magenta]
    
    @scala.inline
    def magentaBright: typings.chalk.chalkStrings.magentaBright = "magentaBright".asInstanceOf[typings.chalk.chalkStrings.magentaBright]
    
    @scala.inline
    def red: typings.chalk.chalkStrings.red = "red".asInstanceOf[typings.chalk.chalkStrings.red]
    
    @scala.inline
    def redBright: typings.chalk.chalkStrings.redBright = "redBright".asInstanceOf[typings.chalk.chalkStrings.redBright]
    
    @scala.inline
    def white: typings.chalk.chalkStrings.white = "white".asInstanceOf[typings.chalk.chalkStrings.white]
    
    @scala.inline
    def whiteBright: typings.chalk.chalkStrings.whiteBright = "whiteBright".asInstanceOf[typings.chalk.chalkStrings.whiteBright]
    
    @scala.inline
    def yellow: typings.chalk.chalkStrings.yellow = "yellow".asInstanceOf[typings.chalk.chalkStrings.yellow]
    
    @scala.inline
    def yellowBright: typings.chalk.chalkStrings.yellowBright = "yellowBright".asInstanceOf[typings.chalk.chalkStrings.yellowBright]
  }
  
  /**
  		Return a new Chalk instance.
  		*/
  @JSImport("chalk", "Instance")
  @js.native
  def Instance: Instance = js.native
  /**
  	Return a new Chalk instance.
  	*/
  type Instance = Instantiable1[/* options */ js.UndefOr[Options], Chalk]
  
  /**
  		Return a new Chalk instance.
  		*/
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("chalk", "Instance")
  @js.native
  class InstanceCls () extends Chalk {
    def this(options: Options) = this()
  }
  
  @scala.inline
  def Instance_=(x: Instance): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instance")(x.asInstanceOf[js.Any])
  
  @JSImport("chalk", "Level")
  @js.native
  def Level_ : Level = js.native
  
  @scala.inline
  def Level__=(x: Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Level")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typings.chalk.chalkStrings.reset
    - typings.chalk.chalkStrings.bold
    - typings.chalk.chalkStrings.dim
    - typings.chalk.chalkStrings.italic
    - typings.chalk.chalkStrings.underline
    - typings.chalk.chalkStrings.inverse
    - typings.chalk.chalkStrings.hidden
    - typings.chalk.chalkStrings.strikethrough
    - typings.chalk.chalkStrings.visible
  */
  trait Modifiers extends StObject
  object Modifiers {
    
    @JSImport("chalk", "Modifiers")
    @js.native
    val ^ : Modifiers = js.native
    
    @scala.inline
    def bold: typings.chalk.chalkStrings.bold = "bold".asInstanceOf[typings.chalk.chalkStrings.bold]
    
    @scala.inline
    def dim: typings.chalk.chalkStrings.dim = "dim".asInstanceOf[typings.chalk.chalkStrings.dim]
    
    @scala.inline
    def hidden: typings.chalk.chalkStrings.hidden = "hidden".asInstanceOf[typings.chalk.chalkStrings.hidden]
    
    @scala.inline
    def inverse: typings.chalk.chalkStrings.inverse = "inverse".asInstanceOf[typings.chalk.chalkStrings.inverse]
    
    @scala.inline
    def italic: typings.chalk.chalkStrings.italic = "italic".asInstanceOf[typings.chalk.chalkStrings.italic]
    
    @scala.inline
    def reset: typings.chalk.chalkStrings.reset = "reset".asInstanceOf[typings.chalk.chalkStrings.reset]
    
    @scala.inline
    def strikethrough: typings.chalk.chalkStrings.strikethrough = "strikethrough".asInstanceOf[typings.chalk.chalkStrings.strikethrough]
    
    @scala.inline
    def underline: typings.chalk.chalkStrings.underline = "underline".asInstanceOf[typings.chalk.chalkStrings.underline]
    
    @scala.inline
    def visible: typings.chalk.chalkStrings.visible = "visible".asInstanceOf[typings.chalk.chalkStrings.visible]
  }
  
  /**
  		Use a [Select/Set Graphic Rendition](https://en.wikipedia.org/wiki/ANSI_escape_code#SGR_parameters) (SGR) [color code number](https://en.wikipedia.org/wiki/ANSI_escape_code#3/4_bit) to set text color.
  		30 <= code && code < 38 || 90 <= code && code < 98
  		For example, 31 for red, 91 for redBright.
  		*/
  @JSImport("chalk", "ansi")
  @js.native
  def ansi(code: Double): Chalk = js.native
  
  /**
  		Use a [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set text color.
  		*/
  @JSImport("chalk", "ansi256")
  @js.native
  def ansi256(index: Double): Chalk = js.native
  
  /**
  		Use a [Select/Set Graphic Rendition](https://en.wikipedia.org/wiki/ANSI_escape_code#SGR_parameters) (SGR) [color code number](https://en.wikipedia.org/wiki/ANSI_escape_code#3/4_bit) to set background color.
  		30 <= code && code < 38 || 90 <= code && code < 98
  		For example, 31 for red, 91 for redBright.
  		Use the foreground code, not the background code (for example, not 41, nor 101).
  		*/
  @JSImport("chalk", "bgAnsi")
  @js.native
  def bgAnsi(code: Double): Chalk = js.native
  
  /**
  		Use a [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set background color.
  		*/
  @JSImport("chalk", "bgAnsi256")
  @js.native
  def bgAnsi256(index: Double): Chalk = js.native
  
  @JSImport("chalk", "bgBlack")
  @js.native
  val bgBlack: Chalk = js.native
  @JSImport("chalk", "bgBlack")
  @js.native
  def bgBlack(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgBlack")
  @js.native
  def bgBlack(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgBlackBright")
  @js.native
  val bgBlackBright: Chalk = js.native
  @JSImport("chalk", "bgBlackBright")
  @js.native
  def bgBlackBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgBlackBright")
  @js.native
  def bgBlackBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgBlue")
  @js.native
  val bgBlue: Chalk = js.native
  @JSImport("chalk", "bgBlue")
  @js.native
  def bgBlue(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgBlue")
  @js.native
  def bgBlue(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgBlueBright")
  @js.native
  val bgBlueBright: Chalk = js.native
  @JSImport("chalk", "bgBlueBright")
  @js.native
  def bgBlueBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgBlueBright")
  @js.native
  def bgBlueBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgCyan")
  @js.native
  val bgCyan: Chalk = js.native
  @JSImport("chalk", "bgCyan")
  @js.native
  def bgCyan(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgCyan")
  @js.native
  def bgCyan(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgCyanBright")
  @js.native
  val bgCyanBright: Chalk = js.native
  @JSImport("chalk", "bgCyanBright")
  @js.native
  def bgCyanBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgCyanBright")
  @js.native
  def bgCyanBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /*
  		Alias for `bgBlackBright`.
  		*/
  @JSImport("chalk", "bgGray")
  @js.native
  val bgGray: Chalk = js.native
  /*
  		Alias for `bgBlackBright`.
  		*/
  @JSImport("chalk", "bgGray")
  @js.native
  def bgGray(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /*
  		Alias for `bgBlackBright`.
  		*/
  @JSImport("chalk", "bgGray")
  @js.native
  def bgGray(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgGreen")
  @js.native
  val bgGreen: Chalk = js.native
  @JSImport("chalk", "bgGreen")
  @js.native
  def bgGreen(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgGreen")
  @js.native
  def bgGreen(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgGreenBright")
  @js.native
  val bgGreenBright: Chalk = js.native
  @JSImport("chalk", "bgGreenBright")
  @js.native
  def bgGreenBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgGreenBright")
  @js.native
  def bgGreenBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /*
  		Alias for `bgBlackBright`.
  		*/
  @JSImport("chalk", "bgGrey")
  @js.native
  val bgGrey: Chalk = js.native
  /*
  		Alias for `bgBlackBright`.
  		*/
  @JSImport("chalk", "bgGrey")
  @js.native
  def bgGrey(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /*
  		Alias for `bgBlackBright`.
  		*/
  @JSImport("chalk", "bgGrey")
  @js.native
  def bgGrey(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /**
  		Use HEX value to set background color.
  		@param color - Hexadecimal value representing the desired color.
  		@example
  		```
  		import chalk = require('chalk');
  		chalk.bgHex('#DEADED');
  		```
  		*/
  @JSImport("chalk", "bgHex")
  @js.native
  def bgHex(color: String): Chalk = js.native
  
  /**
  		Use HSL values to set background color.
  		*/
  @JSImport("chalk", "bgHsl")
  @js.native
  def bgHsl(hue: Double, saturation: Double, lightness: Double): Chalk = js.native
  
  /**
  		Use HSV values to set background color.
  		*/
  @JSImport("chalk", "bgHsv")
  @js.native
  def bgHsv(hue: Double, saturation: Double, value: Double): Chalk = js.native
  
  /**
  		Use HWB values to set background color.
  		*/
  @JSImport("chalk", "bgHwb")
  @js.native
  def bgHwb(hue: Double, whiteness: Double, blackness: Double): Chalk = js.native
  
  /**
  		Use keyword color value to set background color.
  		@param color - Keyword value representing the desired color.
  		@example
  		```
  		import chalk = require('chalk');
  		chalk.bgKeyword('orange');
  		```
  		*/
  @JSImport("chalk", "bgKeyword")
  @js.native
  def bgKeyword(color: String): Chalk = js.native
  
  @JSImport("chalk", "bgMagenta")
  @js.native
  val bgMagenta: Chalk = js.native
  @JSImport("chalk", "bgMagenta")
  @js.native
  def bgMagenta(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgMagenta")
  @js.native
  def bgMagenta(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgMagentaBright")
  @js.native
  val bgMagentaBright: Chalk = js.native
  @JSImport("chalk", "bgMagentaBright")
  @js.native
  def bgMagentaBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgMagentaBright")
  @js.native
  def bgMagentaBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgRed")
  @js.native
  val bgRed: Chalk = js.native
  @JSImport("chalk", "bgRed")
  @js.native
  def bgRed(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgRed")
  @js.native
  def bgRed(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgRedBright")
  @js.native
  val bgRedBright: Chalk = js.native
  @JSImport("chalk", "bgRedBright")
  @js.native
  def bgRedBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgRedBright")
  @js.native
  def bgRedBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /**
  		Use RGB values to set background color.
  		*/
  @JSImport("chalk", "bgRgb")
  @js.native
  def bgRgb(red: Double, green: Double, blue: Double): Chalk = js.native
  
  @JSImport("chalk", "bgWhite")
  @js.native
  val bgWhite: Chalk = js.native
  @JSImport("chalk", "bgWhite")
  @js.native
  def bgWhite(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgWhite")
  @js.native
  def bgWhite(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgWhiteBright")
  @js.native
  val bgWhiteBright: Chalk = js.native
  @JSImport("chalk", "bgWhiteBright")
  @js.native
  def bgWhiteBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgWhiteBright")
  @js.native
  def bgWhiteBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgYellow")
  @js.native
  val bgYellow: Chalk = js.native
  @JSImport("chalk", "bgYellow")
  @js.native
  def bgYellow(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgYellow")
  @js.native
  def bgYellow(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "bgYellowBright")
  @js.native
  val bgYellowBright: Chalk = js.native
  @JSImport("chalk", "bgYellowBright")
  @js.native
  def bgYellowBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "bgYellowBright")
  @js.native
  def bgYellowBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "black")
  @js.native
  val black: Chalk = js.native
  @JSImport("chalk", "black")
  @js.native
  def black(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "black")
  @js.native
  def black(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "blackBright")
  @js.native
  val blackBright: Chalk = js.native
  @JSImport("chalk", "blackBright")
  @js.native
  def blackBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "blackBright")
  @js.native
  def blackBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "blue")
  @js.native
  val blue: Chalk = js.native
  @JSImport("chalk", "blue")
  @js.native
  def blue(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "blue")
  @js.native
  def blue(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "blueBright")
  @js.native
  val blueBright: Chalk = js.native
  @JSImport("chalk", "blueBright")
  @js.native
  def blueBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "blueBright")
  @js.native
  def blueBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /**
  		Modifier: Make text bold.
  		*/
  @JSImport("chalk", "bold")
  @js.native
  val bold: Chalk = js.native
  /**
  		Modifier: Make text bold.
  		*/
  @JSImport("chalk", "bold")
  @js.native
  def bold(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /**
  		Modifier: Make text bold.
  		*/
  @JSImport("chalk", "bold")
  @js.native
  def bold(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "cyan")
  @js.native
  val cyan: Chalk = js.native
  @JSImport("chalk", "cyan")
  @js.native
  def cyan(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "cyan")
  @js.native
  def cyan(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "cyanBright")
  @js.native
  val cyanBright: Chalk = js.native
  @JSImport("chalk", "cyanBright")
  @js.native
  def cyanBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "cyanBright")
  @js.native
  def cyanBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /**
  		Modifier: Emitting only a small amount of light.
  		*/
  @JSImport("chalk", "dim")
  @js.native
  val dim: Chalk = js.native
  /**
  		Modifier: Emitting only a small amount of light.
  		*/
  @JSImport("chalk", "dim")
  @js.native
  def dim(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /**
  		Modifier: Emitting only a small amount of light.
  		*/
  @JSImport("chalk", "dim")
  @js.native
  def dim(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /*
  		Alias for `blackBright`.
  		*/
  @JSImport("chalk", "gray")
  @js.native
  val gray: Chalk = js.native
  /*
  		Alias for `blackBright`.
  		*/
  @JSImport("chalk", "gray")
  @js.native
  def gray(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /*
  		Alias for `blackBright`.
  		*/
  @JSImport("chalk", "gray")
  @js.native
  def gray(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "green")
  @js.native
  val green: Chalk = js.native
  @JSImport("chalk", "green")
  @js.native
  def green(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "green")
  @js.native
  def green(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "greenBright")
  @js.native
  val greenBright: Chalk = js.native
  @JSImport("chalk", "greenBright")
  @js.native
  def greenBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "greenBright")
  @js.native
  def greenBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /*
  		Alias for `blackBright`.
  		*/
  @JSImport("chalk", "grey")
  @js.native
  val grey: Chalk = js.native
  /*
  		Alias for `blackBright`.
  		*/
  @JSImport("chalk", "grey")
  @js.native
  def grey(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /*
  		Alias for `blackBright`.
  		*/
  @JSImport("chalk", "grey")
  @js.native
  def grey(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /**
  		Use HEX value to set text color.
  		@param color - Hexadecimal value representing the desired color.
  		@example
  		```
  		import chalk = require('chalk');
  		chalk.hex('#DEADED');
  		```
  		*/
  @JSImport("chalk", "hex")
  @js.native
  def hex(color: String): Chalk = js.native
  
  /**
  		Modifier: Prints the text, but makes it invisible.
  		*/
  @JSImport("chalk", "hidden")
  @js.native
  val hidden: Chalk = js.native
  /**
  		Modifier: Prints the text, but makes it invisible.
  		*/
  @JSImport("chalk", "hidden")
  @js.native
  def hidden(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /**
  		Modifier: Prints the text, but makes it invisible.
  		*/
  @JSImport("chalk", "hidden")
  @js.native
  def hidden(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /**
  		Use HSL values to set text color.
  		*/
  @JSImport("chalk", "hsl")
  @js.native
  def hsl(hue: Double, saturation: Double, lightness: Double): Chalk = js.native
  
  /**
  		Use HSV values to set text color.
  		*/
  @JSImport("chalk", "hsv")
  @js.native
  def hsv(hue: Double, saturation: Double, value: Double): Chalk = js.native
  
  /**
  		Use HWB values to set text color.
  		*/
  @JSImport("chalk", "hwb")
  @js.native
  def hwb(hue: Double, whiteness: Double, blackness: Double): Chalk = js.native
  
  /**
  		Modifier: Inverse background and foreground colors.
  		*/
  @JSImport("chalk", "inverse")
  @js.native
  val inverse: Chalk = js.native
  /**
  		Modifier: Inverse background and foreground colors.
  		*/
  @JSImport("chalk", "inverse")
  @js.native
  def inverse(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /**
  		Modifier: Inverse background and foreground colors.
  		*/
  @JSImport("chalk", "inverse")
  @js.native
  def inverse(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /**
  		Modifier: Make text italic. (Not widely supported)
  		*/
  @JSImport("chalk", "italic")
  @js.native
  val italic: Chalk = js.native
  /**
  		Modifier: Make text italic. (Not widely supported)
  		*/
  @JSImport("chalk", "italic")
  @js.native
  def italic(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /**
  		Modifier: Make text italic. (Not widely supported)
  		*/
  @JSImport("chalk", "italic")
  @js.native
  def italic(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /**
  		Use keyword color value to set text color.
  		@param color - Keyword value representing the desired color.
  		@example
  		```
  		import chalk = require('chalk');
  		chalk.keyword('orange');
  		```
  		*/
  @JSImport("chalk", "keyword")
  @js.native
  def keyword(color: String): Chalk = js.native
  
  /**
  		The color support for Chalk.
  		By default, color support is automatically detected based on the environment.
  		Levels:
  		- `0` - All colors disabled.
  		- `1` - Basic 16 colors support.
  		- `2` - ANSI 256 colors support.
  		- `3` - Truecolor 16 million colors support.
  		*/
  @JSImport("chalk", "level")
  @js.native
  def level: Level = js.native
  @scala.inline
  def level_=(x: Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("level")(x.asInstanceOf[js.Any])
  
  @JSImport("chalk", "magenta")
  @js.native
  val magenta: Chalk = js.native
  @JSImport("chalk", "magenta")
  @js.native
  def magenta(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "magenta")
  @js.native
  def magenta(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "magentaBright")
  @js.native
  val magentaBright: Chalk = js.native
  @JSImport("chalk", "magentaBright")
  @js.native
  def magentaBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "magentaBright")
  @js.native
  def magentaBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "red")
  @js.native
  val red: Chalk = js.native
  @JSImport("chalk", "red")
  @js.native
  def red(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "red")
  @js.native
  def red(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "redBright")
  @js.native
  val redBright: Chalk = js.native
  @JSImport("chalk", "redBright")
  @js.native
  def redBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "redBright")
  @js.native
  def redBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /**
  		Modifier: Resets the current color chain.
  		*/
  @JSImport("chalk", "reset")
  @js.native
  val reset: Chalk = js.native
  /**
  		Modifier: Resets the current color chain.
  		*/
  @JSImport("chalk", "reset")
  @js.native
  def reset(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /**
  		Modifier: Resets the current color chain.
  		*/
  @JSImport("chalk", "reset")
  @js.native
  def reset(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /**
  		Use RGB values to set text color.
  		*/
  @JSImport("chalk", "rgb")
  @js.native
  def rgb(red: Double, green: Double, blue: Double): Chalk = js.native
  
  @JSImport("chalk", "stderr")
  @js.native
  def stderr: ChalksupportsColorColorSu = js.native
  @JSImport("chalk", "stderr")
  @js.native
  def stderr(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "stderr")
  @js.native
  def stderr(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  @scala.inline
  def stderr_=(x: ChalksupportsColorColorSu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stderr")(x.asInstanceOf[js.Any])
  
  /**
  		Modifier: Puts a horizontal line through the center of the text. (Not widely supported)
  		*/
  @JSImport("chalk", "strikethrough")
  @js.native
  val strikethrough: Chalk = js.native
  /**
  		Modifier: Puts a horizontal line through the center of the text. (Not widely supported)
  		*/
  @JSImport("chalk", "strikethrough")
  @js.native
  def strikethrough(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /**
  		Modifier: Puts a horizontal line through the center of the text. (Not widely supported)
  		*/
  @JSImport("chalk", "strikethrough")
  @js.native
  def strikethrough(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "supportsColor")
  @js.native
  def supportsColor: ColorSupport | `false` = js.native
  @scala.inline
  def supportsColor_=(x: ColorSupport | `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsColor")(x.asInstanceOf[js.Any])
  
  /**
  		Modifier: Make text underline. (Not widely supported)
  		*/
  @JSImport("chalk", "underline")
  @js.native
  val underline: Chalk = js.native
  /**
  		Modifier: Make text underline. (Not widely supported)
  		*/
  @JSImport("chalk", "underline")
  @js.native
  def underline(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /**
  		Modifier: Make text underline. (Not widely supported)
  		*/
  @JSImport("chalk", "underline")
  @js.native
  def underline(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  /**
  		Modifier: Prints the text only when Chalk has a color support level > 0.
  		Can be useful for things that are purely cosmetic.
  		*/
  @JSImport("chalk", "visible")
  @js.native
  val visible: Chalk = js.native
  /**
  		Modifier: Prints the text only when Chalk has a color support level > 0.
  		Can be useful for things that are purely cosmetic.
  		*/
  @JSImport("chalk", "visible")
  @js.native
  def visible(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  /**
  		Modifier: Prints the text only when Chalk has a color support level > 0.
  		Can be useful for things that are purely cosmetic.
  		*/
  @JSImport("chalk", "visible")
  @js.native
  def visible(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "white")
  @js.native
  val white: Chalk = js.native
  @JSImport("chalk", "white")
  @js.native
  def white(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "white")
  @js.native
  def white(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "whiteBright")
  @js.native
  val whiteBright: Chalk = js.native
  @JSImport("chalk", "whiteBright")
  @js.native
  def whiteBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "whiteBright")
  @js.native
  def whiteBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "yellow")
  @js.native
  val yellow: Chalk = js.native
  @JSImport("chalk", "yellow")
  @js.native
  def yellow(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "yellow")
  @js.native
  def yellow(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @JSImport("chalk", "yellowBright")
  @js.native
  val yellowBright: Chalk = js.native
  @JSImport("chalk", "yellowBright")
  @js.native
  def yellowBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  @JSImport("chalk", "yellowBright")
  @js.native
  def yellowBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  
  @js.native
  trait Chalk extends ChalkFunction {
    
    /**
    		Return a new Chalk instance.
    		*/
    var Instance: typings.chalk.mod.Instance = js.native
    
    /**
    		Use a [Select/Set Graphic Rendition](https://en.wikipedia.org/wiki/ANSI_escape_code#SGR_parameters) (SGR) [color code number](https://en.wikipedia.org/wiki/ANSI_escape_code#3/4_bit) to set text color.
    		30 <= code && code < 38 || 90 <= code && code < 98
    		For example, 31 for red, 91 for redBright.
    		*/
    def ansi(code: Double): Chalk = js.native
    
    /**
    		Use a [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set text color.
    		*/
    def ansi256(index: Double): Chalk = js.native
    
    /**
    		Use a [Select/Set Graphic Rendition](https://en.wikipedia.org/wiki/ANSI_escape_code#SGR_parameters) (SGR) [color code number](https://en.wikipedia.org/wiki/ANSI_escape_code#3/4_bit) to set background color.
    		30 <= code && code < 38 || 90 <= code && code < 98
    		For example, 31 for red, 91 for redBright.
    		Use the foreground code, not the background code (for example, not 41, nor 101).
    		*/
    def bgAnsi(code: Double): Chalk = js.native
    
    /**
    		Use a [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set background color.
    		*/
    def bgAnsi256(index: Double): Chalk = js.native
    
    def bgBlack(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgBlack(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def bgBlackBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgBlackBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("bgBlackBright")
    val bgBlackBright_Original: Chalk = js.native
    
    @JSName("bgBlack")
    val bgBlack_Original: Chalk = js.native
    
    def bgBlue(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgBlue(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def bgBlueBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgBlueBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("bgBlueBright")
    val bgBlueBright_Original: Chalk = js.native
    
    @JSName("bgBlue")
    val bgBlue_Original: Chalk = js.native
    
    def bgCyan(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgCyan(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def bgCyanBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgCyanBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("bgCyanBright")
    val bgCyanBright_Original: Chalk = js.native
    
    @JSName("bgCyan")
    val bgCyan_Original: Chalk = js.native
    
    /*
    		Alias for `bgBlackBright`.
    		*/
    def bgGray(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /*
    		Alias for `bgBlackBright`.
    		*/
    def bgGray(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /*
    		Alias for `bgBlackBright`.
    		*/
    @JSName("bgGray")
    val bgGray_Original: Chalk = js.native
    
    def bgGreen(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgGreen(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def bgGreenBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgGreenBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("bgGreenBright")
    val bgGreenBright_Original: Chalk = js.native
    
    @JSName("bgGreen")
    val bgGreen_Original: Chalk = js.native
    
    /*
    		Alias for `bgBlackBright`.
    		*/
    def bgGrey(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /*
    		Alias for `bgBlackBright`.
    		*/
    def bgGrey(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /*
    		Alias for `bgBlackBright`.
    		*/
    @JSName("bgGrey")
    val bgGrey_Original: Chalk = js.native
    
    /**
    		Use HEX value to set background color.
    		@param color - Hexadecimal value representing the desired color.
    		@example
    		```
    		import chalk = require('chalk');
    		chalk.bgHex('#DEADED');
    		```
    		*/
    def bgHex(color: String): Chalk = js.native
    
    /**
    		Use HSL values to set background color.
    		*/
    def bgHsl(hue: Double, saturation: Double, lightness: Double): Chalk = js.native
    
    /**
    		Use HSV values to set background color.
    		*/
    def bgHsv(hue: Double, saturation: Double, value: Double): Chalk = js.native
    
    /**
    		Use HWB values to set background color.
    		*/
    def bgHwb(hue: Double, whiteness: Double, blackness: Double): Chalk = js.native
    
    /**
    		Use keyword color value to set background color.
    		@param color - Keyword value representing the desired color.
    		@example
    		```
    		import chalk = require('chalk');
    		chalk.bgKeyword('orange');
    		```
    		*/
    def bgKeyword(color: String): Chalk = js.native
    
    def bgMagenta(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgMagenta(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def bgMagentaBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgMagentaBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("bgMagentaBright")
    val bgMagentaBright_Original: Chalk = js.native
    
    @JSName("bgMagenta")
    val bgMagenta_Original: Chalk = js.native
    
    def bgRed(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgRed(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def bgRedBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgRedBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("bgRedBright")
    val bgRedBright_Original: Chalk = js.native
    
    @JSName("bgRed")
    val bgRed_Original: Chalk = js.native
    
    /**
    		Use RGB values to set background color.
    		*/
    def bgRgb(red: Double, green: Double, blue: Double): Chalk = js.native
    
    def bgWhite(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgWhite(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def bgWhiteBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgWhiteBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("bgWhiteBright")
    val bgWhiteBright_Original: Chalk = js.native
    
    @JSName("bgWhite")
    val bgWhite_Original: Chalk = js.native
    
    def bgYellow(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgYellow(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def bgYellowBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def bgYellowBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("bgYellowBright")
    val bgYellowBright_Original: Chalk = js.native
    
    @JSName("bgYellow")
    val bgYellow_Original: Chalk = js.native
    
    def black(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def black(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def blackBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def blackBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("blackBright")
    val blackBright_Original: Chalk = js.native
    
    @JSName("black")
    val black_Original: Chalk = js.native
    
    def blue(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def blue(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def blueBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def blueBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("blueBright")
    val blueBright_Original: Chalk = js.native
    
    @JSName("blue")
    val blue_Original: Chalk = js.native
    
    /**
    		Modifier: Make text bold.
    		*/
    def bold(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /**
    		Modifier: Make text bold.
    		*/
    def bold(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /**
    		Modifier: Make text bold.
    		*/
    @JSName("bold")
    val bold_Original: Chalk = js.native
    
    def cyan(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def cyan(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def cyanBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def cyanBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("cyanBright")
    val cyanBright_Original: Chalk = js.native
    
    @JSName("cyan")
    val cyan_Original: Chalk = js.native
    
    /**
    		Modifier: Emitting only a small amount of light.
    		*/
    def dim(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /**
    		Modifier: Emitting only a small amount of light.
    		*/
    def dim(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /**
    		Modifier: Emitting only a small amount of light.
    		*/
    @JSName("dim")
    val dim_Original: Chalk = js.native
    
    /*
    		Alias for `blackBright`.
    		*/
    def gray(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /*
    		Alias for `blackBright`.
    		*/
    def gray(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /*
    		Alias for `blackBright`.
    		*/
    @JSName("gray")
    val gray_Original: Chalk = js.native
    
    def green(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def green(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def greenBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def greenBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("greenBright")
    val greenBright_Original: Chalk = js.native
    
    @JSName("green")
    val green_Original: Chalk = js.native
    
    /*
    		Alias for `blackBright`.
    		*/
    def grey(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /*
    		Alias for `blackBright`.
    		*/
    def grey(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /*
    		Alias for `blackBright`.
    		*/
    @JSName("grey")
    val grey_Original: Chalk = js.native
    
    /**
    		Use HEX value to set text color.
    		@param color - Hexadecimal value representing the desired color.
    		@example
    		```
    		import chalk = require('chalk');
    		chalk.hex('#DEADED');
    		```
    		*/
    def hex(color: String): Chalk = js.native
    
    /**
    		Modifier: Prints the text, but makes it invisible.
    		*/
    def hidden(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /**
    		Modifier: Prints the text, but makes it invisible.
    		*/
    def hidden(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /**
    		Modifier: Prints the text, but makes it invisible.
    		*/
    @JSName("hidden")
    val hidden_Original: Chalk = js.native
    
    /**
    		Use HSL values to set text color.
    		*/
    def hsl(hue: Double, saturation: Double, lightness: Double): Chalk = js.native
    
    /**
    		Use HSV values to set text color.
    		*/
    def hsv(hue: Double, saturation: Double, value: Double): Chalk = js.native
    
    /**
    		Use HWB values to set text color.
    		*/
    def hwb(hue: Double, whiteness: Double, blackness: Double): Chalk = js.native
    
    /**
    		Modifier: Inverse background and foreground colors.
    		*/
    def inverse(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /**
    		Modifier: Inverse background and foreground colors.
    		*/
    def inverse(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /**
    		Modifier: Inverse background and foreground colors.
    		*/
    @JSName("inverse")
    val inverse_Original: Chalk = js.native
    
    /**
    		Modifier: Make text italic. (Not widely supported)
    		*/
    def italic(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /**
    		Modifier: Make text italic. (Not widely supported)
    		*/
    def italic(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /**
    		Modifier: Make text italic. (Not widely supported)
    		*/
    @JSName("italic")
    val italic_Original: Chalk = js.native
    
    /**
    		Use keyword color value to set text color.
    		@param color - Keyword value representing the desired color.
    		@example
    		```
    		import chalk = require('chalk');
    		chalk.keyword('orange');
    		```
    		*/
    def keyword(color: String): Chalk = js.native
    
    /**
    		The color support for Chalk.
    		By default, color support is automatically detected based on the environment.
    		Levels:
    		- `0` - All colors disabled.
    		- `1` - Basic 16 colors support.
    		- `2` - ANSI 256 colors support.
    		- `3` - Truecolor 16 million colors support.
    		*/
    var level: Level = js.native
    
    def magenta(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def magenta(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def magentaBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def magentaBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("magentaBright")
    val magentaBright_Original: Chalk = js.native
    
    @JSName("magenta")
    val magenta_Original: Chalk = js.native
    
    def red(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def red(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def redBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def redBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("redBright")
    val redBright_Original: Chalk = js.native
    
    @JSName("red")
    val red_Original: Chalk = js.native
    
    /**
    		Modifier: Resets the current color chain.
    		*/
    def reset(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /**
    		Modifier: Resets the current color chain.
    		*/
    def reset(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /**
    		Modifier: Resets the current color chain.
    		*/
    @JSName("reset")
    val reset_Original: Chalk = js.native
    
    /**
    		Use RGB values to set text color.
    		*/
    def rgb(red: Double, green: Double, blue: Double): Chalk = js.native
    
    /**
    		Modifier: Puts a horizontal line through the center of the text. (Not widely supported)
    		*/
    def strikethrough(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /**
    		Modifier: Puts a horizontal line through the center of the text. (Not widely supported)
    		*/
    def strikethrough(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /**
    		Modifier: Puts a horizontal line through the center of the text. (Not widely supported)
    		*/
    @JSName("strikethrough")
    val strikethrough_Original: Chalk = js.native
    
    /**
    		Modifier: Make text underline. (Not widely supported)
    		*/
    def underline(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /**
    		Modifier: Make text underline. (Not widely supported)
    		*/
    def underline(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /**
    		Modifier: Make text underline. (Not widely supported)
    		*/
    @JSName("underline")
    val underline_Original: Chalk = js.native
    
    /**
    		Modifier: Prints the text only when Chalk has a color support level > 0.
    		Can be useful for things that are purely cosmetic.
    		*/
    def visible(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    /**
    		Modifier: Prints the text only when Chalk has a color support level > 0.
    		Can be useful for things that are purely cosmetic.
    		*/
    def visible(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    /**
    		Modifier: Prints the text only when Chalk has a color support level > 0.
    		Can be useful for things that are purely cosmetic.
    		*/
    @JSName("visible")
    val visible_Original: Chalk = js.native
    
    def white(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def white(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def whiteBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def whiteBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("whiteBright")
    val whiteBright_Original: Chalk = js.native
    
    @JSName("white")
    val white_Original: Chalk = js.native
    
    def yellow(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def yellow(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    
    def yellowBright(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def yellowBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("yellowBright")
    val yellowBright_Original: Chalk = js.native
    
    @JSName("yellow")
    val yellow_Original: Chalk = js.native
  }
  
  @js.native
  trait ChalkFunction extends StObject {
    
    def apply(text: js.Any*): String = js.native
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def apply(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  }
  
  /**
  	Detect whether the terminal supports color.
  	*/
  @js.native
  trait ColorSupport extends StObject {
    
    /**
    		Return whether Chalk supports Truecolor 16 million colors.
    		*/
    var has16m: Boolean = js.native
    
    /**
    		Return whether Chalk supports ANSI 256 colors.
    		*/
    var has256: Boolean = js.native
    
    /**
    		Return whether Chalk supports basic 16 colors.
    		*/
    var hasBasic: Boolean = js.native
    
    /**
    		The color level used by Chalk.
    		*/
    var level: Level = js.native
  }
  object ColorSupport {
    
    @scala.inline
    def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: Level): ColorSupport = {
      val __obj = js.Dynamic.literal(has16m = has16m.asInstanceOf[js.Any], has256 = has256.asInstanceOf[js.Any], hasBasic = hasBasic.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorSupport]
    }
    
    @scala.inline
    implicit class ColorSupportMutableBuilder[Self <: ColorSupport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHas16m(value: Boolean): Self = StObject.set(x, "has16m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas256(value: Boolean): Self = StObject.set(x, "has256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasBasic(value: Boolean): Self = StObject.set(x, "hasBasic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  	Levels:
  	- `0` - All colors disabled.
  	- `1` - Basic 16 colors support.
  	- `2` - ANSI 256 colors support.
  	- `3` - Truecolor 16 million colors support.
  	*/
  /* Rewritten from type alias, can be one of: 
    - typings.chalk.chalkNumbers.`0`
    - typings.chalk.chalkNumbers.`1`
    - typings.chalk.chalkNumbers.`2`
    - typings.chalk.chalkNumbers.`3`
  */
  trait Level extends StObject
  object Level {
    
    @scala.inline
    def `0`: typings.chalk.chalkNumbers.`0` = 0.asInstanceOf[typings.chalk.chalkNumbers.`0`]
    
    @scala.inline
    def `1`: typings.chalk.chalkNumbers.`1` = 1.asInstanceOf[typings.chalk.chalkNumbers.`1`]
    
    @scala.inline
    def `2`: typings.chalk.chalkNumbers.`2` = 2.asInstanceOf[typings.chalk.chalkNumbers.`2`]
    
    @scala.inline
    def `3`: typings.chalk.chalkNumbers.`3` = 3.asInstanceOf[typings.chalk.chalkNumbers.`3`]
  }
  
  @js.native
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
    var level: js.UndefOr[Level] = js.native
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
      def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
}
