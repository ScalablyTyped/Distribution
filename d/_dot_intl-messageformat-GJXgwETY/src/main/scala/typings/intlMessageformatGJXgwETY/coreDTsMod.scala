package typings.intlMessageformatGJXgwETY

import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.MessageFormatElement
import typings.intlMessageformatGJXgwETY.anon.FnCall
import typings.intlMessageformatGJXgwETY.anon.Locale
import typings.intlMessageformatGJXgwETY.anon.PartialFormats
import typings.intlMessageformatGJXgwETY.formattersDTsMod.FormatXMLElementFn
import typings.intlMessageformatGJXgwETY.formattersDTsMod.Formats
import typings.intlMessageformatGJXgwETY.formattersDTsMod.Formatters
import typings.intlMessageformatGJXgwETY.formattersDTsMod.MessageFormatPart
import typings.intlMessageformatGJXgwETY.formattersDTsMod.PrimitiveType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreDTsMod {
  
  @JSImport(".intl-messageformat-GJXgwETY/lib/src/core.d.ts", "IntlMessageFormat")
  @js.native
  open class IntlMessageFormat protected () extends StObject {
    def this(message: String) = this()
    def this(message: js.Array[MessageFormatElement]) = this()
    def this(message: String, locales: String) = this()
    def this(message: String, locales: js.Array[String]) = this()
    def this(message: js.Array[MessageFormatElement], locales: String) = this()
    def this(message: js.Array[MessageFormatElement], locales: js.Array[String]) = this()
    def this(message: String, locales: String, overrideFormats: PartialFormats) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats) = this()
    def this(message: String, locales: Unit, overrideFormats: PartialFormats) = this()
    def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: PartialFormats) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: PartialFormats
    ) = this()
    def this(message: js.Array[MessageFormatElement], locales: Unit, overrideFormats: PartialFormats) = this()
    def this(message: String, locales: String, overrideFormats: Unit, opts: Options) = this()
    def this(message: String, locales: String, overrideFormats: PartialFormats, opts: Options) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: Unit, opts: Options) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats, opts: Options) = this()
    def this(message: String, locales: Unit, overrideFormats: Unit, opts: Options) = this()
    def this(message: String, locales: Unit, overrideFormats: PartialFormats, opts: Options) = this()
    def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: Unit, opts: Options) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: String,
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: Unit,
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(message: js.Array[MessageFormatElement], locales: Unit, overrideFormats: Unit, opts: Options) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: Unit,
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    
    /* private */ val ast: Any = js.native
    
    def format[T](): String | T | (js.Array[String | T]) = js.native
    def format[T](
      values: Record[
          String, 
          PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
        ]
    ): String | T | (js.Array[String | T]) = js.native
    
    def formatToParts[T](): js.Array[MessageFormatPart[T]] = js.native
    def formatToParts[T](
      values: Record[
          String, 
          PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
        ]
    ): js.Array[MessageFormatPart[T]] = js.native
    
    /* private */ val formats: Any = js.native
    
    /* private */ val formatterCache: Any = js.native
    
    /* private */ val formatters: Any = js.native
    
    def getAst(): js.Array[MessageFormatElement] = js.native
    
    /* private */ val locales: Any = js.native
    
    /* private */ val message: Any = js.native
    
    /* private */ val resolvedLocale: Any = js.native
    
    def resolvedOptions(): Locale = js.native
  }
  /* static members */
  object IntlMessageFormat {
    
    @JSImport(".intl-messageformat-GJXgwETY/lib/src/core.d.ts", "IntlMessageFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".intl-messageformat-GJXgwETY/lib/src/core.d.ts", "IntlMessageFormat.__parse")
    @js.native
    def __parse: js.UndefOr[FnCall] = js.native
    inline def __parse_=(x: js.UndefOr[FnCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__parse")(x.asInstanceOf[js.Any])
    
    @JSImport(".intl-messageformat-GJXgwETY/lib/src/core.d.ts", "IntlMessageFormat.formats")
    @js.native
    def formats: Formats = js.native
    inline def formats_=(x: Formats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport(".intl-messageformat-GJXgwETY/lib/src/core.d.ts", "IntlMessageFormat.memoizedDefaultLocale")
    @js.native
    def memoizedDefaultLocale: Any = js.native
    inline def memoizedDefaultLocale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoizedDefaultLocale")(x.asInstanceOf[js.Any])
    
    inline def resolveLocale(locales: String): typings.std.Intl.Locale = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLocale")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.std.Intl.Locale]
    inline def resolveLocale(locales: js.Array[String]): typings.std.Intl.Locale = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLocale")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.std.Intl.Locale]
  }
  
  trait Options extends StObject {
    
    var formatters: js.UndefOr[Formatters] = js.undefined
    
    /**
      * Whether to treat HTML/XML tags as string literal
      * instead of parsing them as tag token.
      * When this is false we only allow simple tags without
      * any attributes
      */
    var ignoreTag: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFormatters(value: Formatters): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
      
      inline def setIgnoreTag(value: Boolean): Self = StObject.set(x, "ignoreTag", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTagUndefined: Self = StObject.set(x, "ignoreTag", js.undefined)
    }
  }
}
