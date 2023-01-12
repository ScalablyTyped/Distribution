package typings.chalkString

import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chalk-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function2[/* styles */ Styles, /* input */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function2[/* styles */ Styles, /* input */ String, String]]
  inline def default(options: Options): js.Function2[/* styles */ Styles, /* input */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* styles */ Styles, /* input */ String, String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.chalkString.chalkStringStrings.black
    - typings.chalkString.chalkStringStrings.red
    - typings.chalkString.chalkStringStrings.green
    - typings.chalkString.chalkStringStrings.yellow
    - typings.chalkString.chalkStringStrings.blue
    - typings.chalkString.chalkStringStrings.magenta
    - typings.chalkString.chalkStringStrings.cyan
    - typings.chalkString.chalkStringStrings.white
    - typings.chalkString.chalkStringStrings.gray
  */
  trait BasicColors
    extends StObject
       with _Style
  object BasicColors {
    
    inline def black: typings.chalkString.chalkStringStrings.black = "black".asInstanceOf[typings.chalkString.chalkStringStrings.black]
    
    inline def blue: typings.chalkString.chalkStringStrings.blue = "blue".asInstanceOf[typings.chalkString.chalkStringStrings.blue]
    
    inline def cyan: typings.chalkString.chalkStringStrings.cyan = "cyan".asInstanceOf[typings.chalkString.chalkStringStrings.cyan]
    
    inline def gray: typings.chalkString.chalkStringStrings.gray = "gray".asInstanceOf[typings.chalkString.chalkStringStrings.gray]
    
    inline def green: typings.chalkString.chalkStringStrings.green = "green".asInstanceOf[typings.chalkString.chalkStringStrings.green]
    
    inline def magenta: typings.chalkString.chalkStringStrings.magenta = "magenta".asInstanceOf[typings.chalkString.chalkStringStrings.magenta]
    
    inline def red: typings.chalkString.chalkStringStrings.red = "red".asInstanceOf[typings.chalkString.chalkStringStrings.red]
    
    inline def white: typings.chalkString.chalkStringStrings.white = "white".asInstanceOf[typings.chalkString.chalkStringStrings.white]
    
    inline def yellow: typings.chalkString.chalkStringStrings.yellow = "yellow".asInstanceOf[typings.chalkString.chalkStringStrings.yellow]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chalkString.chalkStringStrings.bold
    - typings.chalkString.chalkStringStrings.underline
    - typings.chalkString.chalkStringStrings.inverse
    - typings.chalkString.chalkStringStrings.reset
    - typings.chalkString.chalkStringStrings.dim
    - typings.chalkString.chalkStringStrings.italic
    - typings.chalkString.chalkStringStrings.hidden
    - typings.chalkString.chalkStringStrings.strikethrough
    - typings.chalkString.chalkStringStrings.visible
  */
  trait BasicStyle
    extends StObject
       with _Style
  object BasicStyle {
    
    inline def bold: typings.chalkString.chalkStringStrings.bold = "bold".asInstanceOf[typings.chalkString.chalkStringStrings.bold]
    
    inline def dim: typings.chalkString.chalkStringStrings.dim = "dim".asInstanceOf[typings.chalkString.chalkStringStrings.dim]
    
    inline def hidden: typings.chalkString.chalkStringStrings.hidden = "hidden".asInstanceOf[typings.chalkString.chalkStringStrings.hidden]
    
    inline def inverse: typings.chalkString.chalkStringStrings.inverse = "inverse".asInstanceOf[typings.chalkString.chalkStringStrings.inverse]
    
    inline def italic: typings.chalkString.chalkStringStrings.italic = "italic".asInstanceOf[typings.chalkString.chalkStringStrings.italic]
    
    inline def reset: typings.chalkString.chalkStringStrings.reset = "reset".asInstanceOf[typings.chalkString.chalkStringStrings.reset]
    
    inline def strikethrough: typings.chalkString.chalkStringStrings.strikethrough = "strikethrough".asInstanceOf[typings.chalkString.chalkStringStrings.strikethrough]
    
    inline def underline: typings.chalkString.chalkStringStrings.underline = "underline".asInstanceOf[typings.chalkString.chalkStringStrings.underline]
    
    inline def visible: typings.chalkString.chalkStringStrings.visible = "visible".asInstanceOf[typings.chalkString.chalkStringStrings.visible]
  }
  
  trait Options extends StObject {
    
    /**
      * Whether colors should be enabled/disabled, regardless of terminal
      * support. Colors support is automatically detected, so this is only meant
      * to override that default behavior.
      *
      * @default undefined
      */
    val colors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stream used to detect colors support.
      * This should be the file or terminal where the colors are output.
      *
      * @default process.stdout
      */
    val stream: js.UndefOr[Stream] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chalkString.mod.BasicStyle
    - typings.chalkString.mod.BasicColors
    - / * template literal string: ${BasicColors}Bright * / java.lang.String
  */
  type Style = _Style | (/* template literal string: ${BasicColors}Bright */ String)
  
  type Styles = Style | (/* template literal string: ${Style} ${Style} */ String)
  
  trait _Style extends StObject
}
