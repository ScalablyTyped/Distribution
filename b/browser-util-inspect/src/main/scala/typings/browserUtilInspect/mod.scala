package typings.browserUtilInspect

import typings.browserUtilInspect.browserUtilInspectStrings.black
import typings.browserUtilInspect.browserUtilInspectStrings.blue
import typings.browserUtilInspect.browserUtilInspectStrings.bold
import typings.browserUtilInspect.browserUtilInspectStrings.cyan
import typings.browserUtilInspect.browserUtilInspectStrings.green
import typings.browserUtilInspect.browserUtilInspectStrings.grey
import typings.browserUtilInspect.browserUtilInspectStrings.inverse
import typings.browserUtilInspect.browserUtilInspectStrings.italic
import typings.browserUtilInspect.browserUtilInspectStrings.magenta
import typings.browserUtilInspect.browserUtilInspectStrings.red
import typings.browserUtilInspect.browserUtilInspectStrings.underline
import typings.browserUtilInspect.browserUtilInspectStrings.white
import typings.browserUtilInspect.browserUtilInspectStrings.yellow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Inspect a value as a string.
    *
    * Circular references are replaced by `[Circular]`.
    *
    * @param value a value to be inspected
    * @param options an optional {@link inspect.Options} object
    * @returns a string representation of {@link value}
    * @see https://nodejs.org/api/util.html#utilinspectobject-options the documentation for the Node.js function this is based on
    */
  /**
    * See {@link inspect}.
    *
    * @variation 2
    * @param value a value to be inspected
    * @param showHidden see {@link inspect.Options#showHidden}
    * @param depth see {@link inspect.Options#depth}
    * @param colors see {@link inspect.Options#colors}
    * @returns a string representation of {@link value}
    */
  inline def apply(value: Any): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: Any, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, showHidden: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, showHidden: Boolean, depth: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, showHidden: Boolean, depth: Double, colors: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, showHidden: Boolean, depth: Unit, colors: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, showHidden: Unit, depth: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, showHidden: Unit, depth: Double, colors: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, showHidden: Unit, depth: Unit, colors: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("browser-util-inspect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An object containing {@link Effect}s.
    *
    * It is used when {@link Options#colors} is `true`.
    *
    * @default Effects
    */
  @JSImport("browser-util-inspect", "colors")
  @js.native
  def colors: Effects = js.native
  inline def colors_=(x: Effects): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
  
  /**
    * An object mapping {@link OutputType}s to keys of {@link colors}.
    *
    * It is used when {@link Options#colors} is `true`.
    *
    * @default {boolean:'yellow',date:'magenta',null:'bold',number:'yellow',regexp:'red',special:'cyan',string:'green',undefined:'grey',}
    */
  /* Inlined {[ _ in browser-util-inspect.browser-util-inspect.OutputType ]:? keyof browser-util-inspect.browser-util-inspect.Effects | undefined} */
  object styles {
    
    @JSImport("browser-util-inspect", "styles")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("browser-util-inspect", "styles.boolean")
    @js.native
    def boolean: js.UndefOr[
        bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
      ] = js.native
    inline def boolean_=(
      x: js.UndefOr[
          bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
    
    @JSImport("browser-util-inspect", "styles.date")
    @js.native
    def date: js.UndefOr[
        bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
      ] = js.native
    inline def date_=(
      x: js.UndefOr[
          bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    @JSImport("browser-util-inspect", "styles.name")
    @js.native
    def name: js.UndefOr[
        bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
      ] = js.native
    inline def name_=(
      x: js.UndefOr[
          bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("browser-util-inspect", "styles.null")
    @js.native
    val `null`: js.UndefOr[
        bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
      ] = js.native
    
    @JSImport("browser-util-inspect", "styles.number")
    @js.native
    def number: js.UndefOr[
        bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
      ] = js.native
    inline def number_=(
      x: js.UndefOr[
          bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("browser-util-inspect", "styles.regexp")
    @js.native
    def regexp: js.UndefOr[
        bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
      ] = js.native
    inline def regexp_=(
      x: js.UndefOr[
          bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
    
    @JSImport("browser-util-inspect", "styles.special")
    @js.native
    def special: js.UndefOr[
        bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
      ] = js.native
    inline def special_=(
      x: js.UndefOr[
          bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("special")(x.asInstanceOf[js.Any])
    
    @JSImport("browser-util-inspect", "styles.string")
    @js.native
    def string: js.UndefOr[
        bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
      ] = js.native
    inline def string_=(
      x: js.UndefOr[
          bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("browser-util-inspect", "styles.undefined")
    @js.native
    def undefined: js.UndefOr[
        bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
      ] = js.native
    inline def undefined_=(
      x: js.UndefOr[
          bold | italic | underline | inverse | white | grey | black | blue | cyan | green | magenta | red | yellow
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Expected type of custom inspect functions of objects. It must be named `inspect`.
    *
    * @param this the object
    * @param depth the current remaining depth to expand nested objects up to
    * @param options the {@link Options} passed into {@link inspect}
    * @returns a custom string or object representation of `this`
    */
  type CustomInspect = js.ThisFunction2[/* this */ Any, /* depth */ Double, /* options */ Options, Any]
  
  /**
    * Effect type. Two Select Graphic Rendition (SGR) codes are expected.
    * The first one applies the effect while the second one undoes the effect (without affecting other effects).
    *
    * @see https://en.wikipedia.org/wiki/ANSI_escape_code#SGR Select Graphic Rendition (SGR) codes
    */
  type Effect = js.Tuple2[/* applySgr */ Double, /* undoSgr */ Double]
  
  /**
    * Type containing {@link Effect}s.
    *
    * It can be extended using interface augmentation.
    */
  trait Effects extends StObject {
    
    /**
      * Black color effect.
      *
      * @default [30,39]
      */
    var black: Effect
    
    /**
      * Blue color effect.
      *
      * @default [34,39]
      */
    var blue: Effect
    
    /**
      * Bold effect.
      *
      * @default [1,22]
      */
    var bold: Effect
    
    /**
      * Cyan color effect.
      *
      * @default [36,39]
      */
    var cyan: Effect
    
    /**
      * Green color effect.
      *
      * @default [32,39]
      */
    var green: Effect
    
    /**
      * Grey color effect.
      *
      * @default [90,39]
      */
    var grey: Effect
    
    /**
      * Color inversion effect.
      *
      * @default [7,27]
      */
    var inverse: Effect
    
    /**
      * Italic effect.
      *
      * @default [3,23]
      */
    var italic: Effect
    
    /**
      * Magenta color effect.
      *
      * @default [35,39]
      */
    var magenta: Effect
    
    /**
      * Red color effect.
      *
      * @default [31,39]
      */
    var red: Effect
    
    /**
      * Underline effect.
      *
      * @default [4,24]
      */
    var underline: Effect
    
    /**
      * White color effect.
      *
      * @default [37,39]
      */
    var white: Effect
    
    /**
      * Yellow color effect.
      *
      * @default [33,39]
      */
    var yellow: Effect
  }
  object Effects {
    
    inline def apply(
      black: Effect,
      blue: Effect,
      bold: Effect,
      cyan: Effect,
      green: Effect,
      grey: Effect,
      inverse: Effect,
      italic: Effect,
      magenta: Effect,
      red: Effect,
      underline: Effect,
      white: Effect,
      yellow: Effect
    ): Effects = {
      val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Effects]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Effects] (val x: Self) extends AnyVal {
      
      inline def setBlack(value: Effect): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      inline def setBlue(value: Effect): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setBold(value: Effect): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setCyan(value: Effect): Self = StObject.set(x, "cyan", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Effect): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setGrey(value: Effect): Self = StObject.set(x, "grey", value.asInstanceOf[js.Any])
      
      inline def setInverse(value: Effect): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setItalic(value: Effect): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setMagenta(value: Effect): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Effect): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      inline def setUnderline(value: Effect): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setWhite(value: Effect): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
      
      inline def setYellow(value: Effect): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Type of options passed into {@link inspect}.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.browserUtilInspect.anon.readonlycolorsbooleanunde
    - typings.browserUtilInspect.anon.readonlycolorsundefinedre
  */
  trait Options extends StObject
  object Options {
    
    inline def readonlycolorsbooleanunde(stylize: Unit): typings.browserUtilInspect.anon.readonlycolorsbooleanunde = {
      val __obj = js.Dynamic.literal(stylize = stylize.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.browserUtilInspect.anon.readonlycolorsbooleanunde]
    }
    
    inline def readonlycolorsundefinedre(colors: Unit): typings.browserUtilInspect.anon.readonlycolorsundefinedre = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.browserUtilInspect.anon.readonlycolorsundefinedre]
    }
  }
  
  /**
    * Union of output types for styling.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.browserUtilInspect.browserUtilInspectStrings.boolean
    - typings.browserUtilInspect.browserUtilInspectStrings.date
    - typings.browserUtilInspect.browserUtilInspectStrings.name
    - typings.browserUtilInspect.browserUtilInspectStrings.`null`
    - typings.browserUtilInspect.browserUtilInspectStrings.number
    - typings.browserUtilInspect.browserUtilInspectStrings.regexp
    - typings.browserUtilInspect.browserUtilInspectStrings.special
    - typings.browserUtilInspect.browserUtilInspectStrings.string
    - typings.browserUtilInspect.browserUtilInspectStrings.undefined
  */
  trait OutputType extends StObject
  object OutputType {
    
    inline def boolean: typings.browserUtilInspect.browserUtilInspectStrings.boolean = "boolean".asInstanceOf[typings.browserUtilInspect.browserUtilInspectStrings.boolean]
    
    inline def date: typings.browserUtilInspect.browserUtilInspectStrings.date = "date".asInstanceOf[typings.browserUtilInspect.browserUtilInspectStrings.date]
    
    inline def name: typings.browserUtilInspect.browserUtilInspectStrings.name = "name".asInstanceOf[typings.browserUtilInspect.browserUtilInspectStrings.name]
    
    inline def `null`: typings.browserUtilInspect.browserUtilInspectStrings.`null` = "null".asInstanceOf[typings.browserUtilInspect.browserUtilInspectStrings.`null`]
    
    inline def number: typings.browserUtilInspect.browserUtilInspectStrings.number = "number".asInstanceOf[typings.browserUtilInspect.browserUtilInspectStrings.number]
    
    inline def regexp: typings.browserUtilInspect.browserUtilInspectStrings.regexp = "regexp".asInstanceOf[typings.browserUtilInspect.browserUtilInspectStrings.regexp]
    
    inline def special: typings.browserUtilInspect.browserUtilInspectStrings.special = "special".asInstanceOf[typings.browserUtilInspect.browserUtilInspectStrings.special]
    
    inline def string: typings.browserUtilInspect.browserUtilInspectStrings.string = "string".asInstanceOf[typings.browserUtilInspect.browserUtilInspectStrings.string]
    
    inline def undefined: typings.browserUtilInspect.browserUtilInspectStrings.undefined = "undefined".asInstanceOf[typings.browserUtilInspect.browserUtilInspectStrings.undefined]
  }
  
  /**
    * Type of custom function for styling the output.
    *
    * @param str the string representation of the value
    * @param type the type of the value
    * @returns a stylized string representation of the value
    */
  type Stylizer = js.Function2[/* str */ String, /* type */ OutputType, String]
}
