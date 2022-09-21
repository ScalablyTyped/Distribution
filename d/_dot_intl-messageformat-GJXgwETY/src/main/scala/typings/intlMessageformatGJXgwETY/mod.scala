package typings.intlMessageformatGJXgwETY

import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.MessageFormatElement
import typings.intlMessageformatGJXgwETY.anon.FnCall
import typings.intlMessageformatGJXgwETY.anon.PartialFormats
import typings.intlMessageformatGJXgwETY.coreDotDTsMod.Options
import typings.intlMessageformatGJXgwETY.errorDotDTsMod.ErrorCode
import typings.intlMessageformatGJXgwETY.formattersDotDTsMod.FormatXMLElementFn
import typings.intlMessageformatGJXgwETY.formattersDotDTsMod.Formats
import typings.intlMessageformatGJXgwETY.formattersDotDTsMod.Formatters
import typings.intlMessageformatGJXgwETY.formattersDotDTsMod.MessageFormatPart
import typings.intlMessageformatGJXgwETY.formattersDotDTsMod.PrimitiveType
import typings.std.Intl.Locale
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport(".intl-messageformat-GJXgwETY", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".intl-messageformat-GJXgwETY", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.intlMessageformatGJXgwETY.coreDotDTsMod.IntlMessageFormat {
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
  }
  /* static members */
  object default {
    
    @JSImport(".intl-messageformat-GJXgwETY", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".intl-messageformat-GJXgwETY", "default.__parse")
    @js.native
    def __parse: js.UndefOr[FnCall] = js.native
    inline def __parse_=(x: js.UndefOr[FnCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__parse")(x.asInstanceOf[js.Any])
    
    @JSImport(".intl-messageformat-GJXgwETY", "default.formats")
    @js.native
    def formats: Formats = js.native
    inline def formats_=(x: Formats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport(".intl-messageformat-GJXgwETY", "default.memoizedDefaultLocale")
    @js.native
    def memoizedDefaultLocale: Any = js.native
    inline def memoizedDefaultLocale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoizedDefaultLocale")(x.asInstanceOf[js.Any])
    
    inline def resolveLocale(locales: String): Locale = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLocale")(locales.asInstanceOf[js.Any]).asInstanceOf[Locale]
    inline def resolveLocale(locales: js.Array[String]): Locale = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLocale")(locales.asInstanceOf[js.Any]).asInstanceOf[Locale]
  }
  
  @JSImport(".intl-messageformat-GJXgwETY", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.intlMessageformatGJXgwETY.errorDotDTsMod.ErrorCode & String] = js.native
    
    /* "INVALID_VALUE" */ val INVALID_VALUE: typings.intlMessageformatGJXgwETY.errorDotDTsMod.ErrorCode.INVALID_VALUE & String = js.native
    
    /* "MISSING_INTL_API" */ val MISSING_INTL_API: typings.intlMessageformatGJXgwETY.errorDotDTsMod.ErrorCode.MISSING_INTL_API & String = js.native
    
    /* "MISSING_VALUE" */ val MISSING_VALUE: typings.intlMessageformatGJXgwETY.errorDotDTsMod.ErrorCode.MISSING_VALUE & String = js.native
  }
  
  @JSImport(".intl-messageformat-GJXgwETY", "FormatError")
  @js.native
  open class FormatError protected ()
    extends typings.intlMessageformatGJXgwETY.errorDotDTsMod.FormatError {
    def this(msg: String, code: ErrorCode) = this()
    def this(msg: String, code: ErrorCode, originalMessage: String) = this()
  }
  
  @JSImport(".intl-messageformat-GJXgwETY", "IntlMessageFormat")
  @js.native
  open class IntlMessageFormat protected ()
    extends typings.intlMessageformatGJXgwETY.coreDotDTsMod.IntlMessageFormat {
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
  }
  /* static members */
  object IntlMessageFormat {
    
    @JSImport(".intl-messageformat-GJXgwETY", "IntlMessageFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".intl-messageformat-GJXgwETY", "IntlMessageFormat.__parse")
    @js.native
    def __parse: js.UndefOr[FnCall] = js.native
    inline def __parse_=(x: js.UndefOr[FnCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__parse")(x.asInstanceOf[js.Any])
    
    @JSImport(".intl-messageformat-GJXgwETY", "IntlMessageFormat.formats")
    @js.native
    def formats: Formats = js.native
    inline def formats_=(x: Formats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport(".intl-messageformat-GJXgwETY", "IntlMessageFormat.memoizedDefaultLocale")
    @js.native
    def memoizedDefaultLocale: Any = js.native
    inline def memoizedDefaultLocale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoizedDefaultLocale")(x.asInstanceOf[js.Any])
    
    inline def resolveLocale(locales: String): Locale = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLocale")(locales.asInstanceOf[js.Any]).asInstanceOf[Locale]
    inline def resolveLocale(locales: js.Array[String]): Locale = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLocale")(locales.asInstanceOf[js.Any]).asInstanceOf[Locale]
  }
  
  @JSImport(".intl-messageformat-GJXgwETY", "InvalidValueError")
  @js.native
  open class InvalidValueError protected ()
    extends typings.intlMessageformatGJXgwETY.errorDotDTsMod.InvalidValueError {
    def this(variableId: String, value: Any, options: js.Array[String]) = this()
    def this(variableId: String, value: Any, options: js.Array[String], originalMessage: String) = this()
  }
  
  @JSImport(".intl-messageformat-GJXgwETY", "InvalidValueTypeError")
  @js.native
  open class InvalidValueTypeError protected ()
    extends typings.intlMessageformatGJXgwETY.errorDotDTsMod.InvalidValueTypeError {
    def this(value: Any, `type`: String) = this()
    def this(value: Any, `type`: String, originalMessage: String) = this()
  }
  
  @JSImport(".intl-messageformat-GJXgwETY", "MissingValueError")
  @js.native
  open class MissingValueError protected ()
    extends typings.intlMessageformatGJXgwETY.errorDotDTsMod.MissingValueError {
    def this(variableId: String) = this()
    def this(variableId: String, originalMessage: String) = this()
  }
  
  @JSImport(".intl-messageformat-GJXgwETY", "PART_TYPE")
  @js.native
  object PART_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.intlMessageformatGJXgwETY.formattersDotDTsMod.PART_TYPE & Double] = js.native
    
    /* 0 */ val literal: typings.intlMessageformatGJXgwETY.formattersDotDTsMod.PART_TYPE.literal & Double = js.native
    
    /* 1 */ val `object`: typings.intlMessageformatGJXgwETY.formattersDotDTsMod.PART_TYPE.`object` & Double = js.native
  }
  
  inline def formatToParts[T](els: js.Array[MessageFormatElement], locales: String, formatters: Formatters, formats: Formats): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Unit,
    currentPluralValue: Double
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Unit,
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Unit,
    currentPluralValue: Unit,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ]
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Double
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Unit,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Unit,
    currentPluralValue: Double
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Unit,
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Unit,
    currentPluralValue: Unit,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ]
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Double
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Unit,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  
  inline def isFormatXMLElementFn[T](el: PrimitiveType | T): /* is .intl-messageformat-GJXgwETY..intl-messageformat-GJXgwETY/src/formatters.d.ts.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormatXMLElementFn")(el.asInstanceOf[js.Any]).asInstanceOf[/* is .intl-messageformat-GJXgwETY..intl-messageformat-GJXgwETY/src/formatters.d.ts.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean]
  inline def isFormatXMLElementFn[T](el: FormatXMLElementFn[T, String | T | (js.Array[String | T])]): /* is .intl-messageformat-GJXgwETY..intl-messageformat-GJXgwETY/src/formatters.d.ts.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormatXMLElementFn")(el.asInstanceOf[js.Any]).asInstanceOf[/* is .intl-messageformat-GJXgwETY..intl-messageformat-GJXgwETY/src/formatters.d.ts.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean]
}
