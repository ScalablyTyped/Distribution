package typings.colorette

import typings.colorette.anon.UseColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("colorette", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("colorette", "bgBlack")
  @js.native
  val bgBlack: Color = js.native
  
  @JSImport("colorette", "bgBlackBright")
  @js.native
  val bgBlackBright: Color = js.native
  
  @JSImport("colorette", "bgBlue")
  @js.native
  val bgBlue: Color = js.native
  
  @JSImport("colorette", "bgBlueBright")
  @js.native
  val bgBlueBright: Color = js.native
  
  @JSImport("colorette", "bgCyan")
  @js.native
  val bgCyan: Color = js.native
  
  @JSImport("colorette", "bgCyanBright")
  @js.native
  val bgCyanBright: Color = js.native
  
  @JSImport("colorette", "bgGreen")
  @js.native
  val bgGreen: Color = js.native
  
  @JSImport("colorette", "bgGreenBright")
  @js.native
  val bgGreenBright: Color = js.native
  
  @JSImport("colorette", "bgMagenta")
  @js.native
  val bgMagenta: Color = js.native
  
  @JSImport("colorette", "bgMagentaBright")
  @js.native
  val bgMagentaBright: Color = js.native
  
  @JSImport("colorette", "bgRed")
  @js.native
  val bgRed: Color = js.native
  
  @JSImport("colorette", "bgRedBright")
  @js.native
  val bgRedBright: Color = js.native
  
  @JSImport("colorette", "bgWhite")
  @js.native
  val bgWhite: Color = js.native
  
  @JSImport("colorette", "bgWhiteBright")
  @js.native
  val bgWhiteBright: Color = js.native
  
  @JSImport("colorette", "bgYellow")
  @js.native
  val bgYellow: Color = js.native
  
  @JSImport("colorette", "bgYellowBright")
  @js.native
  val bgYellowBright: Color = js.native
  
  @JSImport("colorette", "black")
  @js.native
  val black: Color = js.native
  
  @JSImport("colorette", "blackBright")
  @js.native
  val blackBright: Color = js.native
  
  @JSImport("colorette", "blue")
  @js.native
  val blue: Color = js.native
  
  @JSImport("colorette", "blueBright")
  @js.native
  val blueBright: Color = js.native
  
  @JSImport("colorette", "bold")
  @js.native
  val bold: Color = js.native
  
  inline def createColors(): Colorette = ^.asInstanceOf[js.Dynamic].applyDynamic("createColors")().asInstanceOf[Colorette]
  inline def createColors(options: UseColor): Colorette = ^.asInstanceOf[js.Dynamic].applyDynamic("createColors")(options.asInstanceOf[js.Any]).asInstanceOf[Colorette]
  
  @JSImport("colorette", "cyan")
  @js.native
  val cyan: Color = js.native
  
  @JSImport("colorette", "cyanBright")
  @js.native
  val cyanBright: Color = js.native
  
  @JSImport("colorette", "dim")
  @js.native
  val dim: Color = js.native
  
  @JSImport("colorette", "gray")
  @js.native
  val gray: Color = js.native
  
  @JSImport("colorette", "green")
  @js.native
  val green: Color = js.native
  
  @JSImport("colorette", "greenBright")
  @js.native
  val greenBright: Color = js.native
  
  @JSImport("colorette", "hidden")
  @js.native
  val hidden: Color = js.native
  
  @JSImport("colorette", "inverse")
  @js.native
  val inverse: Color = js.native
  
  @JSImport("colorette", "isColorSupported")
  @js.native
  val isColorSupported: Boolean = js.native
  
  @JSImport("colorette", "italic")
  @js.native
  val italic: Color = js.native
  
  @JSImport("colorette", "magenta")
  @js.native
  val magenta: Color = js.native
  
  @JSImport("colorette", "magentaBright")
  @js.native
  val magentaBright: Color = js.native
  
  @JSImport("colorette", "red")
  @js.native
  val red: Color = js.native
  
  @JSImport("colorette", "redBright")
  @js.native
  val redBright: Color = js.native
  
  @JSImport("colorette", "reset")
  @js.native
  val reset: Color = js.native
  
  @JSImport("colorette", "strikethrough")
  @js.native
  val strikethrough: Color = js.native
  
  @JSImport("colorette", "underline")
  @js.native
  val underline: Color = js.native
  
  @JSImport("colorette", "white")
  @js.native
  val white: Color = js.native
  
  @JSImport("colorette", "whiteBright")
  @js.native
  val whiteBright: Color = js.native
  
  @JSImport("colorette", "yellow")
  @js.native
  val yellow: Color = js.native
  
  @JSImport("colorette", "yellowBright")
  @js.native
  val yellowBright: Color = js.native
  
  type Color = js.Function1[/* text */ String | Double, String]
  
  trait Colorette extends StObject {
    
    def bgBlack(text: String): String
    def bgBlack(text: Double): String
    
    def bgBlackBright(text: String): String
    def bgBlackBright(text: Double): String
    @JSName("bgBlackBright")
    var bgBlackBright_Original: Color
    
    @JSName("bgBlack")
    var bgBlack_Original: Color
    
    def bgBlue(text: String): String
    def bgBlue(text: Double): String
    
    def bgBlueBright(text: String): String
    def bgBlueBright(text: Double): String
    @JSName("bgBlueBright")
    var bgBlueBright_Original: Color
    
    @JSName("bgBlue")
    var bgBlue_Original: Color
    
    def bgCyan(text: String): String
    def bgCyan(text: Double): String
    
    def bgCyanBright(text: String): String
    def bgCyanBright(text: Double): String
    @JSName("bgCyanBright")
    var bgCyanBright_Original: Color
    
    @JSName("bgCyan")
    var bgCyan_Original: Color
    
    def bgGreen(text: String): String
    def bgGreen(text: Double): String
    
    def bgGreenBright(text: String): String
    def bgGreenBright(text: Double): String
    @JSName("bgGreenBright")
    var bgGreenBright_Original: Color
    
    @JSName("bgGreen")
    var bgGreen_Original: Color
    
    def bgMagenta(text: String): String
    def bgMagenta(text: Double): String
    
    def bgMagentaBright(text: String): String
    def bgMagentaBright(text: Double): String
    @JSName("bgMagentaBright")
    var bgMagentaBright_Original: Color
    
    @JSName("bgMagenta")
    var bgMagenta_Original: Color
    
    def bgRed(text: String): String
    def bgRed(text: Double): String
    
    def bgRedBright(text: String): String
    def bgRedBright(text: Double): String
    @JSName("bgRedBright")
    var bgRedBright_Original: Color
    
    @JSName("bgRed")
    var bgRed_Original: Color
    
    def bgWhite(text: String): String
    def bgWhite(text: Double): String
    
    def bgWhiteBright(text: String): String
    def bgWhiteBright(text: Double): String
    @JSName("bgWhiteBright")
    var bgWhiteBright_Original: Color
    
    @JSName("bgWhite")
    var bgWhite_Original: Color
    
    def bgYellow(text: String): String
    def bgYellow(text: Double): String
    
    def bgYellowBright(text: String): String
    def bgYellowBright(text: Double): String
    @JSName("bgYellowBright")
    var bgYellowBright_Original: Color
    
    @JSName("bgYellow")
    var bgYellow_Original: Color
    
    def black(text: String): String
    def black(text: Double): String
    
    def blackBright(text: String): String
    def blackBright(text: Double): String
    @JSName("blackBright")
    var blackBright_Original: Color
    
    @JSName("black")
    var black_Original: Color
    
    def blue(text: String): String
    def blue(text: Double): String
    
    def blueBright(text: String): String
    def blueBright(text: Double): String
    @JSName("blueBright")
    var blueBright_Original: Color
    
    @JSName("blue")
    var blue_Original: Color
    
    def bold(text: String): String
    def bold(text: Double): String
    @JSName("bold")
    var bold_Original: Color
    
    def cyan(text: String): String
    def cyan(text: Double): String
    
    def cyanBright(text: String): String
    def cyanBright(text: Double): String
    @JSName("cyanBright")
    var cyanBright_Original: Color
    
    @JSName("cyan")
    var cyan_Original: Color
    
    def dim(text: String): String
    def dim(text: Double): String
    @JSName("dim")
    var dim_Original: Color
    
    def gray(text: String): String
    def gray(text: Double): String
    @JSName("gray")
    var gray_Original: Color
    
    def green(text: String): String
    def green(text: Double): String
    
    def greenBright(text: String): String
    def greenBright(text: Double): String
    @JSName("greenBright")
    var greenBright_Original: Color
    
    @JSName("green")
    var green_Original: Color
    
    def hidden(text: String): String
    def hidden(text: Double): String
    @JSName("hidden")
    var hidden_Original: Color
    
    def inverse(text: String): String
    def inverse(text: Double): String
    @JSName("inverse")
    var inverse_Original: Color
    
    def italic(text: String): String
    def italic(text: Double): String
    @JSName("italic")
    var italic_Original: Color
    
    def magenta(text: String): String
    def magenta(text: Double): String
    
    def magentaBright(text: String): String
    def magentaBright(text: Double): String
    @JSName("magentaBright")
    var magentaBright_Original: Color
    
    @JSName("magenta")
    var magenta_Original: Color
    
    def red(text: String): String
    def red(text: Double): String
    
    def redBright(text: String): String
    def redBright(text: Double): String
    @JSName("redBright")
    var redBright_Original: Color
    
    @JSName("red")
    var red_Original: Color
    
    def reset(text: String): String
    def reset(text: Double): String
    @JSName("reset")
    var reset_Original: Color
    
    def strikethrough(text: String): String
    def strikethrough(text: Double): String
    @JSName("strikethrough")
    var strikethrough_Original: Color
    
    def underline(text: String): String
    def underline(text: Double): String
    @JSName("underline")
    var underline_Original: Color
    
    def white(text: String): String
    def white(text: Double): String
    
    def whiteBright(text: String): String
    def whiteBright(text: Double): String
    @JSName("whiteBright")
    var whiteBright_Original: Color
    
    @JSName("white")
    var white_Original: Color
    
    def yellow(text: String): String
    def yellow(text: Double): String
    
    def yellowBright(text: String): String
    def yellowBright(text: Double): String
    @JSName("yellowBright")
    var yellowBright_Original: Color
    
    @JSName("yellow")
    var yellow_Original: Color
  }
  object Colorette {
    
    inline def apply(
      bgBlack: /* text */ String | Double => String,
      bgBlackBright: /* text */ String | Double => String,
      bgBlue: /* text */ String | Double => String,
      bgBlueBright: /* text */ String | Double => String,
      bgCyan: /* text */ String | Double => String,
      bgCyanBright: /* text */ String | Double => String,
      bgGreen: /* text */ String | Double => String,
      bgGreenBright: /* text */ String | Double => String,
      bgMagenta: /* text */ String | Double => String,
      bgMagentaBright: /* text */ String | Double => String,
      bgRed: /* text */ String | Double => String,
      bgRedBright: /* text */ String | Double => String,
      bgWhite: /* text */ String | Double => String,
      bgWhiteBright: /* text */ String | Double => String,
      bgYellow: /* text */ String | Double => String,
      bgYellowBright: /* text */ String | Double => String,
      black: /* text */ String | Double => String,
      blackBright: /* text */ String | Double => String,
      blue: /* text */ String | Double => String,
      blueBright: /* text */ String | Double => String,
      bold: /* text */ String | Double => String,
      cyan: /* text */ String | Double => String,
      cyanBright: /* text */ String | Double => String,
      dim: /* text */ String | Double => String,
      gray: /* text */ String | Double => String,
      green: /* text */ String | Double => String,
      greenBright: /* text */ String | Double => String,
      hidden: /* text */ String | Double => String,
      inverse: /* text */ String | Double => String,
      italic: /* text */ String | Double => String,
      magenta: /* text */ String | Double => String,
      magentaBright: /* text */ String | Double => String,
      red: /* text */ String | Double => String,
      redBright: /* text */ String | Double => String,
      reset: /* text */ String | Double => String,
      strikethrough: /* text */ String | Double => String,
      underline: /* text */ String | Double => String,
      white: /* text */ String | Double => String,
      whiteBright: /* text */ String | Double => String,
      yellow: /* text */ String | Double => String,
      yellowBright: /* text */ String | Double => String
    ): Colorette = {
      val __obj = js.Dynamic.literal(bgBlack = js.Any.fromFunction1(bgBlack), bgBlackBright = js.Any.fromFunction1(bgBlackBright), bgBlue = js.Any.fromFunction1(bgBlue), bgBlueBright = js.Any.fromFunction1(bgBlueBright), bgCyan = js.Any.fromFunction1(bgCyan), bgCyanBright = js.Any.fromFunction1(bgCyanBright), bgGreen = js.Any.fromFunction1(bgGreen), bgGreenBright = js.Any.fromFunction1(bgGreenBright), bgMagenta = js.Any.fromFunction1(bgMagenta), bgMagentaBright = js.Any.fromFunction1(bgMagentaBright), bgRed = js.Any.fromFunction1(bgRed), bgRedBright = js.Any.fromFunction1(bgRedBright), bgWhite = js.Any.fromFunction1(bgWhite), bgWhiteBright = js.Any.fromFunction1(bgWhiteBright), bgYellow = js.Any.fromFunction1(bgYellow), bgYellowBright = js.Any.fromFunction1(bgYellowBright), black = js.Any.fromFunction1(black), blackBright = js.Any.fromFunction1(blackBright), blue = js.Any.fromFunction1(blue), blueBright = js.Any.fromFunction1(blueBright), bold = js.Any.fromFunction1(bold), cyan = js.Any.fromFunction1(cyan), cyanBright = js.Any.fromFunction1(cyanBright), dim = js.Any.fromFunction1(dim), gray = js.Any.fromFunction1(gray), green = js.Any.fromFunction1(green), greenBright = js.Any.fromFunction1(greenBright), hidden = js.Any.fromFunction1(hidden), inverse = js.Any.fromFunction1(inverse), italic = js.Any.fromFunction1(italic), magenta = js.Any.fromFunction1(magenta), magentaBright = js.Any.fromFunction1(magentaBright), red = js.Any.fromFunction1(red), redBright = js.Any.fromFunction1(redBright), reset = js.Any.fromFunction1(reset), strikethrough = js.Any.fromFunction1(strikethrough), underline = js.Any.fromFunction1(underline), white = js.Any.fromFunction1(white), whiteBright = js.Any.fromFunction1(whiteBright), yellow = js.Any.fromFunction1(yellow), yellowBright = js.Any.fromFunction1(yellowBright))
      __obj.asInstanceOf[Colorette]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Colorette] (val x: Self) extends AnyVal {
      
      inline def setBgBlack(value: /* text */ String | Double => String): Self = StObject.set(x, "bgBlack", js.Any.fromFunction1(value))
      
      inline def setBgBlackBright(value: /* text */ String | Double => String): Self = StObject.set(x, "bgBlackBright", js.Any.fromFunction1(value))
      
      inline def setBgBlue(value: /* text */ String | Double => String): Self = StObject.set(x, "bgBlue", js.Any.fromFunction1(value))
      
      inline def setBgBlueBright(value: /* text */ String | Double => String): Self = StObject.set(x, "bgBlueBright", js.Any.fromFunction1(value))
      
      inline def setBgCyan(value: /* text */ String | Double => String): Self = StObject.set(x, "bgCyan", js.Any.fromFunction1(value))
      
      inline def setBgCyanBright(value: /* text */ String | Double => String): Self = StObject.set(x, "bgCyanBright", js.Any.fromFunction1(value))
      
      inline def setBgGreen(value: /* text */ String | Double => String): Self = StObject.set(x, "bgGreen", js.Any.fromFunction1(value))
      
      inline def setBgGreenBright(value: /* text */ String | Double => String): Self = StObject.set(x, "bgGreenBright", js.Any.fromFunction1(value))
      
      inline def setBgMagenta(value: /* text */ String | Double => String): Self = StObject.set(x, "bgMagenta", js.Any.fromFunction1(value))
      
      inline def setBgMagentaBright(value: /* text */ String | Double => String): Self = StObject.set(x, "bgMagentaBright", js.Any.fromFunction1(value))
      
      inline def setBgRed(value: /* text */ String | Double => String): Self = StObject.set(x, "bgRed", js.Any.fromFunction1(value))
      
      inline def setBgRedBright(value: /* text */ String | Double => String): Self = StObject.set(x, "bgRedBright", js.Any.fromFunction1(value))
      
      inline def setBgWhite(value: /* text */ String | Double => String): Self = StObject.set(x, "bgWhite", js.Any.fromFunction1(value))
      
      inline def setBgWhiteBright(value: /* text */ String | Double => String): Self = StObject.set(x, "bgWhiteBright", js.Any.fromFunction1(value))
      
      inline def setBgYellow(value: /* text */ String | Double => String): Self = StObject.set(x, "bgYellow", js.Any.fromFunction1(value))
      
      inline def setBgYellowBright(value: /* text */ String | Double => String): Self = StObject.set(x, "bgYellowBright", js.Any.fromFunction1(value))
      
      inline def setBlack(value: /* text */ String | Double => String): Self = StObject.set(x, "black", js.Any.fromFunction1(value))
      
      inline def setBlackBright(value: /* text */ String | Double => String): Self = StObject.set(x, "blackBright", js.Any.fromFunction1(value))
      
      inline def setBlue(value: /* text */ String | Double => String): Self = StObject.set(x, "blue", js.Any.fromFunction1(value))
      
      inline def setBlueBright(value: /* text */ String | Double => String): Self = StObject.set(x, "blueBright", js.Any.fromFunction1(value))
      
      inline def setBold(value: /* text */ String | Double => String): Self = StObject.set(x, "bold", js.Any.fromFunction1(value))
      
      inline def setCyan(value: /* text */ String | Double => String): Self = StObject.set(x, "cyan", js.Any.fromFunction1(value))
      
      inline def setCyanBright(value: /* text */ String | Double => String): Self = StObject.set(x, "cyanBright", js.Any.fromFunction1(value))
      
      inline def setDim(value: /* text */ String | Double => String): Self = StObject.set(x, "dim", js.Any.fromFunction1(value))
      
      inline def setGray(value: /* text */ String | Double => String): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
      
      inline def setGreen(value: /* text */ String | Double => String): Self = StObject.set(x, "green", js.Any.fromFunction1(value))
      
      inline def setGreenBright(value: /* text */ String | Double => String): Self = StObject.set(x, "greenBright", js.Any.fromFunction1(value))
      
      inline def setHidden(value: /* text */ String | Double => String): Self = StObject.set(x, "hidden", js.Any.fromFunction1(value))
      
      inline def setInverse(value: /* text */ String | Double => String): Self = StObject.set(x, "inverse", js.Any.fromFunction1(value))
      
      inline def setItalic(value: /* text */ String | Double => String): Self = StObject.set(x, "italic", js.Any.fromFunction1(value))
      
      inline def setMagenta(value: /* text */ String | Double => String): Self = StObject.set(x, "magenta", js.Any.fromFunction1(value))
      
      inline def setMagentaBright(value: /* text */ String | Double => String): Self = StObject.set(x, "magentaBright", js.Any.fromFunction1(value))
      
      inline def setRed(value: /* text */ String | Double => String): Self = StObject.set(x, "red", js.Any.fromFunction1(value))
      
      inline def setRedBright(value: /* text */ String | Double => String): Self = StObject.set(x, "redBright", js.Any.fromFunction1(value))
      
      inline def setReset(value: /* text */ String | Double => String): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setStrikethrough(value: /* text */ String | Double => String): Self = StObject.set(x, "strikethrough", js.Any.fromFunction1(value))
      
      inline def setUnderline(value: /* text */ String | Double => String): Self = StObject.set(x, "underline", js.Any.fromFunction1(value))
      
      inline def setWhite(value: /* text */ String | Double => String): Self = StObject.set(x, "white", js.Any.fromFunction1(value))
      
      inline def setWhiteBright(value: /* text */ String | Double => String): Self = StObject.set(x, "whiteBright", js.Any.fromFunction1(value))
      
      inline def setYellow(value: /* text */ String | Double => String): Self = StObject.set(x, "yellow", js.Any.fromFunction1(value))
      
      inline def setYellowBright(value: /* text */ String | Double => String): Self = StObject.set(x, "yellowBright", js.Any.fromFunction1(value))
    }
  }
}
