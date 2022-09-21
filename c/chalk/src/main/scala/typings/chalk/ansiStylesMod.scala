package typings.chalk

import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ansiStylesMod {
  
  /* Inlined { readonly modifier :chalk.chalk/source/vendor/ansi-styles.Modifier,  readonly color :chalk.chalk/source/vendor/ansi-styles.ColorBase & chalk.chalk/source/vendor/ansi-styles.ForegroundColor,  readonly bgColor :chalk.chalk/source/vendor/ansi-styles.ColorBase & chalk.chalk/source/vendor/ansi-styles.BackgroundColor,  readonly codes :std.ReadonlyMap<number, number>} & chalk.chalk/source/vendor/ansi-styles.ForegroundColor & chalk.chalk/source/vendor/ansi-styles.BackgroundColor & chalk.chalk/source/vendor/ansi-styles.Modifier & chalk.chalk/source/vendor/ansi-styles.ConvertColor */
  object default {
    
    @JSImport("chalk/source/vendor/ansi-styles", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Convert from the ANSI 256 color space to the ANSI 16 color space.
    	@param code - A number representing the ANSI 256 color.
    	*/
    inline def ansi256ToAnsi(code: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ansi256ToAnsi")(code.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgBlack")
    @js.native
    val bgBlack: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgBlackBright")
    @js.native
    val bgBlackBright: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgBlue")
    @js.native
    val bgBlue: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgBlueBright")
    @js.native
    val bgBlueBright: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgColor")
    @js.native
    val bgColor: ColorBase & BackgroundColor = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgCyan")
    @js.native
    val bgCyan: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgCyanBright")
    @js.native
    val bgCyanBright: CSPair = js.native
    
    /**
    	Alias for `bgBlackBright`.
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgGray")
    @js.native
    val bgGray: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgGreen")
    @js.native
    val bgGreen: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgGreenBright")
    @js.native
    val bgGreenBright: CSPair = js.native
    
    /**
    	Alias for `bgBlackBright`.
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgGrey")
    @js.native
    val bgGrey: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgMagenta")
    @js.native
    val bgMagenta: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgMagentaBright")
    @js.native
    val bgMagentaBright: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgRed")
    @js.native
    val bgRed: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgRedBright")
    @js.native
    val bgRedBright: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgWhite")
    @js.native
    val bgWhite: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgWhiteBright")
    @js.native
    val bgWhiteBright: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgYellow")
    @js.native
    val bgYellow: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.bgYellowBright")
    @js.native
    val bgYellowBright: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.black")
    @js.native
    val black: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.blackBright")
    @js.native
    val blackBright: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.blue")
    @js.native
    val blue: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.blueBright")
    @js.native
    val blueBright: CSPair = js.native
    
    /**
    	Make text bold.
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.bold")
    @js.native
    val bold: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.codes")
    @js.native
    val codes: ReadonlyMap[Double, Double] = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.color")
    @js.native
    val color: ColorBase & ForegroundColor = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.cyan")
    @js.native
    val cyan: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.cyanBright")
    @js.native
    val cyanBright: CSPair = js.native
    
    /**
    	Emitting only a small amount of light.
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.dim")
    @js.native
    val dim: CSPair = js.native
    
    /**
    	Alias for `blackBright`.
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.gray")
    @js.native
    val gray: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.green")
    @js.native
    val green: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.greenBright")
    @js.native
    val greenBright: CSPair = js.native
    
    /**
    	Alias for `blackBright`.
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.grey")
    @js.native
    val grey: CSPair = js.native
    
    /**
    	Convert from the RGB HEX color space to the ANSI 16 color space.
    	@param hex - A hexadecimal string containing RGB data.
    	*/
    inline def hexToAnsi(hex: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToAnsi")(hex.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
    	Convert from the RGB HEX color space to the ANSI 256 color space.
    	@param hex - A hexadecimal string containing RGB data.
    	*/
    inline def hexToAnsi256(hex: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToAnsi256")(hex.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
    	Convert from the RGB HEX color space to the RGB color space.
    	@param hex - A hexadecimal string containing RGB data.
    	*/
    inline def hexToRgb(hex: String): js.Tuple3[/* red */ Double, /* green */ Double, /* blue */ Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[/* red */ Double, /* green */ Double, /* blue */ Double]]
    
    /**
    	Prints the text, but makes it invisible.
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.hidden")
    @js.native
    val hidden: CSPair = js.native
    
    /**
    	Inverse background and foreground colors.
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.inverse")
    @js.native
    val inverse: CSPair = js.native
    
    /**
    	Make text italic. (Not widely supported)
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.italic")
    @js.native
    val italic: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.magenta")
    @js.native
    val magenta: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.magentaBright")
    @js.native
    val magentaBright: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.modifier")
    @js.native
    val modifier: Modifier = js.native
    
    /**
    	Make text overline.
    	Supported on VTE-based terminals, the GNOME terminal, mintty, and Git Bash.
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.overline")
    @js.native
    val overline: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.red")
    @js.native
    val red: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.redBright")
    @js.native
    val redBright: CSPair = js.native
    
    /**
    	Resets the current color chain.
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.reset")
    @js.native
    val reset: CSPair = js.native
    
    /**
    	Convert from the RGB color space to the ANSI 16 color space.
    	@param red - (`0...255`)
    	@param green - (`0...255`)
    	@param blue - (`0...255`)
    	*/
    inline def rgbToAnsi(red: Double, green: Double, blue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToAnsi")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
    	Convert from the RGB color space to the ANSI 256 color space.
    	@param red - (`0...255`)
    	@param green - (`0...255`)
    	@param blue - (`0...255`)
    	*/
    inline def rgbToAnsi256(red: Double, green: Double, blue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToAnsi256")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
    	Puts a horizontal line through the center of the text. (Not widely supported)
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.strikethrough")
    @js.native
    val strikethrough: CSPair = js.native
    
    /**
    	Make text underline. (Not widely supported)
    	*/
    @JSImport("chalk/source/vendor/ansi-styles", "default.underline")
    @js.native
    val underline: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.white")
    @js.native
    val white: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.whiteBright")
    @js.native
    val whiteBright: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.yellow")
    @js.native
    val yellow: CSPair = js.native
    
    @JSImport("chalk/source/vendor/ansi-styles", "default.yellowBright")
    @js.native
    val yellowBright: CSPair = js.native
  }
  
  trait BackgroundColor extends StObject {
    
    val bgBlack: CSPair
    
    val bgBlackBright: CSPair
    
    val bgBlue: CSPair
    
    val bgBlueBright: CSPair
    
    val bgCyan: CSPair
    
    val bgCyanBright: CSPair
    
    /**
    	Alias for `bgBlackBright`.
    	*/
    val bgGray: CSPair
    
    val bgGreen: CSPair
    
    val bgGreenBright: CSPair
    
    /**
    	Alias for `bgBlackBright`.
    	*/
    val bgGrey: CSPair
    
    val bgMagenta: CSPair
    
    val bgMagentaBright: CSPair
    
    val bgRed: CSPair
    
    val bgRedBright: CSPair
    
    val bgWhite: CSPair
    
    val bgWhiteBright: CSPair
    
    val bgYellow: CSPair
    
    val bgYellowBright: CSPair
  }
  object BackgroundColor {
    
    inline def apply(
      bgBlack: CSPair,
      bgBlackBright: CSPair,
      bgBlue: CSPair,
      bgBlueBright: CSPair,
      bgCyan: CSPair,
      bgCyanBright: CSPair,
      bgGray: CSPair,
      bgGreen: CSPair,
      bgGreenBright: CSPair,
      bgGrey: CSPair,
      bgMagenta: CSPair,
      bgMagentaBright: CSPair,
      bgRed: CSPair,
      bgRedBright: CSPair,
      bgWhite: CSPair,
      bgWhiteBright: CSPair,
      bgYellow: CSPair,
      bgYellowBright: CSPair
    ): BackgroundColor = {
      val __obj = js.Dynamic.literal(bgBlack = bgBlack.asInstanceOf[js.Any], bgBlackBright = bgBlackBright.asInstanceOf[js.Any], bgBlue = bgBlue.asInstanceOf[js.Any], bgBlueBright = bgBlueBright.asInstanceOf[js.Any], bgCyan = bgCyan.asInstanceOf[js.Any], bgCyanBright = bgCyanBright.asInstanceOf[js.Any], bgGray = bgGray.asInstanceOf[js.Any], bgGreen = bgGreen.asInstanceOf[js.Any], bgGreenBright = bgGreenBright.asInstanceOf[js.Any], bgGrey = bgGrey.asInstanceOf[js.Any], bgMagenta = bgMagenta.asInstanceOf[js.Any], bgMagentaBright = bgMagentaBright.asInstanceOf[js.Any], bgRed = bgRed.asInstanceOf[js.Any], bgRedBright = bgRedBright.asInstanceOf[js.Any], bgWhite = bgWhite.asInstanceOf[js.Any], bgWhiteBright = bgWhiteBright.asInstanceOf[js.Any], bgYellow = bgYellow.asInstanceOf[js.Any], bgYellowBright = bgYellowBright.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundColor]
    }
    
    extension [Self <: BackgroundColor](x: Self) {
      
      inline def setBgBlack(value: CSPair): Self = StObject.set(x, "bgBlack", value.asInstanceOf[js.Any])
      
      inline def setBgBlackBright(value: CSPair): Self = StObject.set(x, "bgBlackBright", value.asInstanceOf[js.Any])
      
      inline def setBgBlue(value: CSPair): Self = StObject.set(x, "bgBlue", value.asInstanceOf[js.Any])
      
      inline def setBgBlueBright(value: CSPair): Self = StObject.set(x, "bgBlueBright", value.asInstanceOf[js.Any])
      
      inline def setBgCyan(value: CSPair): Self = StObject.set(x, "bgCyan", value.asInstanceOf[js.Any])
      
      inline def setBgCyanBright(value: CSPair): Self = StObject.set(x, "bgCyanBright", value.asInstanceOf[js.Any])
      
      inline def setBgGray(value: CSPair): Self = StObject.set(x, "bgGray", value.asInstanceOf[js.Any])
      
      inline def setBgGreen(value: CSPair): Self = StObject.set(x, "bgGreen", value.asInstanceOf[js.Any])
      
      inline def setBgGreenBright(value: CSPair): Self = StObject.set(x, "bgGreenBright", value.asInstanceOf[js.Any])
      
      inline def setBgGrey(value: CSPair): Self = StObject.set(x, "bgGrey", value.asInstanceOf[js.Any])
      
      inline def setBgMagenta(value: CSPair): Self = StObject.set(x, "bgMagenta", value.asInstanceOf[js.Any])
      
      inline def setBgMagentaBright(value: CSPair): Self = StObject.set(x, "bgMagentaBright", value.asInstanceOf[js.Any])
      
      inline def setBgRed(value: CSPair): Self = StObject.set(x, "bgRed", value.asInstanceOf[js.Any])
      
      inline def setBgRedBright(value: CSPair): Self = StObject.set(x, "bgRedBright", value.asInstanceOf[js.Any])
      
      inline def setBgWhite(value: CSPair): Self = StObject.set(x, "bgWhite", value.asInstanceOf[js.Any])
      
      inline def setBgWhiteBright(value: CSPair): Self = StObject.set(x, "bgWhiteBright", value.asInstanceOf[js.Any])
      
      inline def setBgYellow(value: CSPair): Self = StObject.set(x, "bgYellow", value.asInstanceOf[js.Any])
      
      inline def setBgYellowBright(value: CSPair): Self = StObject.set(x, "bgYellowBright", value.asInstanceOf[js.Any])
    }
  }
  
  trait CSPair extends StObject {
    
    /**
    	The ANSI terminal control sequence for ending this style.
    	*/
    val close: String
    
    // eslint-disable-line @typescript-eslint/naming-convention
    /**
    	The ANSI terminal control sequence for starting this style.
    	*/
    val open: String
  }
  object CSPair {
    
    inline def apply(close: String, open: String): CSPair = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSPair]
    }
    
    extension [Self <: CSPair](x: Self) {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColorBase extends StObject {
    
    def ansi(code: Double): String
    
    def ansi16m(red: Double, green: Double, blue: Double): String
    
    def ansi256(code: Double): String
    
    /**
    	The ANSI terminal control sequence for ending this color.
    	*/
    val close: String
  }
  object ColorBase {
    
    inline def apply(
      ansi: Double => String,
      ansi16m: (Double, Double, Double) => String,
      ansi256: Double => String,
      close: String
    ): ColorBase = {
      val __obj = js.Dynamic.literal(ansi = js.Any.fromFunction1(ansi), ansi16m = js.Any.fromFunction3(ansi16m), ansi256 = js.Any.fromFunction1(ansi256), close = close.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorBase]
    }
    
    extension [Self <: ColorBase](x: Self) {
      
      inline def setAnsi(value: Double => String): Self = StObject.set(x, "ansi", js.Any.fromFunction1(value))
      
      inline def setAnsi16m(value: (Double, Double, Double) => String): Self = StObject.set(x, "ansi16m", js.Any.fromFunction3(value))
      
      inline def setAnsi256(value: Double => String): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConvertColor extends StObject {
    
    /**
    	Convert from the ANSI 256 color space to the ANSI 16 color space.
    	@param code - A number representing the ANSI 256 color.
    	*/
    def ansi256ToAnsi(code: Double): Double
    
    /**
    	Convert from the RGB HEX color space to the ANSI 16 color space.
    	@param hex - A hexadecimal string containing RGB data.
    	*/
    def hexToAnsi(hex: String): Double
    
    /**
    	Convert from the RGB HEX color space to the ANSI 256 color space.
    	@param hex - A hexadecimal string containing RGB data.
    	*/
    def hexToAnsi256(hex: String): Double
    
    /**
    	Convert from the RGB HEX color space to the RGB color space.
    	@param hex - A hexadecimal string containing RGB data.
    	*/
    def hexToRgb(hex: String): js.Tuple3[/* red */ Double, /* green */ Double, /* blue */ Double]
    
    /**
    	Convert from the RGB color space to the ANSI 16 color space.
    	@param red - (`0...255`)
    	@param green - (`0...255`)
    	@param blue - (`0...255`)
    	*/
    def rgbToAnsi(red: Double, green: Double, blue: Double): Double
    
    /**
    	Convert from the RGB color space to the ANSI 256 color space.
    	@param red - (`0...255`)
    	@param green - (`0...255`)
    	@param blue - (`0...255`)
    	*/
    def rgbToAnsi256(red: Double, green: Double, blue: Double): Double
  }
  object ConvertColor {
    
    inline def apply(
      ansi256ToAnsi: Double => Double,
      hexToAnsi: String => Double,
      hexToAnsi256: String => Double,
      hexToRgb: String => js.Tuple3[/* red */ Double, /* green */ Double, /* blue */ Double],
      rgbToAnsi: (Double, Double, Double) => Double,
      rgbToAnsi256: (Double, Double, Double) => Double
    ): ConvertColor = {
      val __obj = js.Dynamic.literal(ansi256ToAnsi = js.Any.fromFunction1(ansi256ToAnsi), hexToAnsi = js.Any.fromFunction1(hexToAnsi), hexToAnsi256 = js.Any.fromFunction1(hexToAnsi256), hexToRgb = js.Any.fromFunction1(hexToRgb), rgbToAnsi = js.Any.fromFunction3(rgbToAnsi), rgbToAnsi256 = js.Any.fromFunction3(rgbToAnsi256))
      __obj.asInstanceOf[ConvertColor]
    }
    
    extension [Self <: ConvertColor](x: Self) {
      
      inline def setAnsi256ToAnsi(value: Double => Double): Self = StObject.set(x, "ansi256ToAnsi", js.Any.fromFunction1(value))
      
      inline def setHexToAnsi(value: String => Double): Self = StObject.set(x, "hexToAnsi", js.Any.fromFunction1(value))
      
      inline def setHexToAnsi256(value: String => Double): Self = StObject.set(x, "hexToAnsi256", js.Any.fromFunction1(value))
      
      inline def setHexToRgb(value: String => js.Tuple3[/* red */ Double, /* green */ Double, /* blue */ Double]): Self = StObject.set(x, "hexToRgb", js.Any.fromFunction1(value))
      
      inline def setRgbToAnsi(value: (Double, Double, Double) => Double): Self = StObject.set(x, "rgbToAnsi", js.Any.fromFunction3(value))
      
      inline def setRgbToAnsi256(value: (Double, Double, Double) => Double): Self = StObject.set(x, "rgbToAnsi256", js.Any.fromFunction3(value))
    }
  }
  
  trait ForegroundColor extends StObject {
    
    val black: CSPair
    
    val blackBright: CSPair
    
    val blue: CSPair
    
    val blueBright: CSPair
    
    val cyan: CSPair
    
    val cyanBright: CSPair
    
    /**
    	Alias for `blackBright`.
    	*/
    val gray: CSPair
    
    val green: CSPair
    
    val greenBright: CSPair
    
    /**
    	Alias for `blackBright`.
    	*/
    val grey: CSPair
    
    val magenta: CSPair
    
    val magentaBright: CSPair
    
    val red: CSPair
    
    val redBright: CSPair
    
    val white: CSPair
    
    val whiteBright: CSPair
    
    val yellow: CSPair
    
    val yellowBright: CSPair
  }
  object ForegroundColor {
    
    inline def apply(
      black: CSPair,
      blackBright: CSPair,
      blue: CSPair,
      blueBright: CSPair,
      cyan: CSPair,
      cyanBright: CSPair,
      gray: CSPair,
      green: CSPair,
      greenBright: CSPair,
      grey: CSPair,
      magenta: CSPair,
      magentaBright: CSPair,
      red: CSPair,
      redBright: CSPair,
      white: CSPair,
      whiteBright: CSPair,
      yellow: CSPair,
      yellowBright: CSPair
    ): ForegroundColor = {
      val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], blackBright = blackBright.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], blueBright = blueBright.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], cyanBright = cyanBright.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], greenBright = greenBright.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], magentaBright = magentaBright.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], redBright = redBright.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any], whiteBright = whiteBright.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any], yellowBright = yellowBright.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForegroundColor]
    }
    
    extension [Self <: ForegroundColor](x: Self) {
      
      inline def setBlack(value: CSPair): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      inline def setBlackBright(value: CSPair): Self = StObject.set(x, "blackBright", value.asInstanceOf[js.Any])
      
      inline def setBlue(value: CSPair): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setBlueBright(value: CSPair): Self = StObject.set(x, "blueBright", value.asInstanceOf[js.Any])
      
      inline def setCyan(value: CSPair): Self = StObject.set(x, "cyan", value.asInstanceOf[js.Any])
      
      inline def setCyanBright(value: CSPair): Self = StObject.set(x, "cyanBright", value.asInstanceOf[js.Any])
      
      inline def setGray(value: CSPair): Self = StObject.set(x, "gray", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: CSPair): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setGreenBright(value: CSPair): Self = StObject.set(x, "greenBright", value.asInstanceOf[js.Any])
      
      inline def setGrey(value: CSPair): Self = StObject.set(x, "grey", value.asInstanceOf[js.Any])
      
      inline def setMagenta(value: CSPair): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
      
      inline def setMagentaBright(value: CSPair): Self = StObject.set(x, "magentaBright", value.asInstanceOf[js.Any])
      
      inline def setRed(value: CSPair): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      inline def setRedBright(value: CSPair): Self = StObject.set(x, "redBright", value.asInstanceOf[js.Any])
      
      inline def setWhite(value: CSPair): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
      
      inline def setWhiteBright(value: CSPair): Self = StObject.set(x, "whiteBright", value.asInstanceOf[js.Any])
      
      inline def setYellow(value: CSPair): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
      
      inline def setYellowBright(value: CSPair): Self = StObject.set(x, "yellowBright", value.asInstanceOf[js.Any])
    }
  }
  
  trait Modifier extends StObject {
    
    /**
    	Make text bold.
    	*/
    val bold: CSPair
    
    /**
    	Emitting only a small amount of light.
    	*/
    val dim: CSPair
    
    /**
    	Prints the text, but makes it invisible.
    	*/
    val hidden: CSPair
    
    /**
    	Inverse background and foreground colors.
    	*/
    val inverse: CSPair
    
    /**
    	Make text italic. (Not widely supported)
    	*/
    val italic: CSPair
    
    /**
    	Make text overline.
    	Supported on VTE-based terminals, the GNOME terminal, mintty, and Git Bash.
    	*/
    val overline: CSPair
    
    /**
    	Resets the current color chain.
    	*/
    val reset: CSPair
    
    /**
    	Puts a horizontal line through the center of the text. (Not widely supported)
    	*/
    val strikethrough: CSPair
    
    /**
    	Make text underline. (Not widely supported)
    	*/
    val underline: CSPair
  }
  object Modifier {
    
    inline def apply(
      bold: CSPair,
      dim: CSPair,
      hidden: CSPair,
      inverse: CSPair,
      italic: CSPair,
      overline: CSPair,
      reset: CSPair,
      strikethrough: CSPair,
      underline: CSPair
    ): Modifier = {
      val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], dim = dim.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], overline = overline.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], strikethrough = strikethrough.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modifier]
    }
    
    extension [Self <: Modifier](x: Self) {
      
      inline def setBold(value: CSPair): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setDim(value: CSPair): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: CSPair): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setInverse(value: CSPair): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setItalic(value: CSPair): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setOverline(value: CSPair): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
      
      inline def setReset(value: CSPair): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setStrikethrough(value: CSPair): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
      
      inline def setUnderline(value: CSPair): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    }
  }
}
