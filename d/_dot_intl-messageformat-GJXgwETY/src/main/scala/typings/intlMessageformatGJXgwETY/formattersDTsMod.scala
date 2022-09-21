package typings.intlMessageformatGJXgwETY

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.MessageFormatElement
import typings.intlMessageformatGJXgwETY.anon.TypeofDateTimeFormat
import typings.intlMessageformatGJXgwETY.anon.TypeofPluralRules
import typings.intlMessageformatGJXgwETY.formattersDTsMod.PART_TYPE.`object`
import typings.intlMessageformatGJXgwETY.formattersDTsMod.PART_TYPE.literal
import typings.std.ConstructorParameters
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formattersDTsMod {
  
  @JSImport(".intl-messageformat-GJXgwETY/lib/src/formatters.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait PART_TYPE extends StObject
  @JSImport(".intl-messageformat-GJXgwETY/lib/src/formatters.d.ts", "PART_TYPE")
  @js.native
  object PART_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PART_TYPE & Double] = js.native
    
    @js.native
    sealed trait literal
      extends StObject
         with PART_TYPE
    /* 0 */ val literal: typings.intlMessageformatGJXgwETY.formattersDTsMod.PART_TYPE.literal & Double = js.native
    
    @js.native
    sealed trait `object`
      extends StObject
         with PART_TYPE
    /* 1 */ val `object`: typings.intlMessageformatGJXgwETY.formattersDTsMod.PART_TYPE.`object` & Double = js.native
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
  
  inline def isFormatXMLElementFn[T](el: PrimitiveType | T): /* is .intl-messageformat-GJXgwETY..intl-messageformat-GJXgwETY/lib/src/formatters.d.ts.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormatXMLElementFn")(el.asInstanceOf[js.Any]).asInstanceOf[/* is .intl-messageformat-GJXgwETY..intl-messageformat-GJXgwETY/lib/src/formatters.d.ts.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean]
  inline def isFormatXMLElementFn[T](el: FormatXMLElementFn[T, String | T | (js.Array[String | T])]): /* is .intl-messageformat-GJXgwETY..intl-messageformat-GJXgwETY/lib/src/formatters.d.ts.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormatXMLElementFn")(el.asInstanceOf[js.Any]).asInstanceOf[/* is .intl-messageformat-GJXgwETY..intl-messageformat-GJXgwETY/lib/src/formatters.d.ts.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean]
  
  type FormatXMLElementFn[T, R] = js.Function1[/* parts */ js.Array[String | T], R]
  
  trait Formats extends StObject {
    
    var date: Record[String, DateTimeFormatOptions]
    
    var number: Record[String, NumberFormatOptions]
    
    var time: Record[String, DateTimeFormatOptions]
  }
  object Formats {
    
    inline def apply(
      date: Record[String, DateTimeFormatOptions],
      number: Record[String, NumberFormatOptions],
      time: Record[String, DateTimeFormatOptions]
    ): Formats = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formats]
    }
    
    extension [Self <: Formats](x: Self) {
      
      inline def setDate(value: Record[String, DateTimeFormatOptions]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Record[String, NumberFormatOptions]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Record[String, DateTimeFormatOptions]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatterCache extends StObject {
    
    var dateTime: Record[String, DateTimeFormat]
    
    var number: Record[String, NumberFormatOptions]
    
    var pluralRules: Record[String, PluralRules]
  }
  object FormatterCache {
    
    inline def apply(
      dateTime: Record[String, DateTimeFormat],
      number: Record[String, NumberFormatOptions],
      pluralRules: Record[String, PluralRules]
    ): FormatterCache = {
      val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pluralRules = pluralRules.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatterCache]
    }
    
    extension [Self <: FormatterCache](x: Self) {
      
      inline def setDateTime(value: Record[String, DateTimeFormat]): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Record[String, NumberFormatOptions]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPluralRules(value: Record[String, PluralRules]): Self = StObject.set(x, "pluralRules", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Formatters extends StObject {
    
    def getDateTimeFormat(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[TypeofDateTimeFormat]
    ): DateTimeFormat = js.native
    
    def getNumberFormat(): NumberFormat = js.native
    def getNumberFormat(locals: String): NumberFormat = js.native
    def getNumberFormat(locals: String, opts: NumberFormatOptions): NumberFormat = js.native
    def getNumberFormat(locals: js.Array[String]): NumberFormat = js.native
    def getNumberFormat(locals: js.Array[String], opts: NumberFormatOptions): NumberFormat = js.native
    def getNumberFormat(locals: Unit, opts: NumberFormatOptions): NumberFormat = js.native
    
    def getPluralRules(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[TypeofPluralRules]
    ): PluralRules = js.native
  }
  
  trait LiteralPart
    extends StObject
       with MessageFormatPart[Any] {
    
    var `type`: literal
    
    var value: String
  }
  object LiteralPart {
    
    inline def apply(`type`: literal, value: String): LiteralPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiteralPart]
    }
    
    extension [Self <: LiteralPart](x: Self) {
      
      inline def setType(value: literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intlMessageformatGJXgwETY.formattersDTsMod.LiteralPart
    - typings.intlMessageformatGJXgwETY.formattersDTsMod.ObjectPart[T]
  */
  trait MessageFormatPart[T] extends StObject
  object MessageFormatPart {
    
    inline def LiteralPart(`type`: literal, value: String): typings.intlMessageformatGJXgwETY.formattersDTsMod.LiteralPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intlMessageformatGJXgwETY.formattersDTsMod.LiteralPart]
    }
    
    inline def ObjectPart[T](`type`: `object`, value: T): typings.intlMessageformatGJXgwETY.formattersDTsMod.ObjectPart[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intlMessageformatGJXgwETY.formattersDTsMod.ObjectPart[T]]
    }
  }
  
  trait ObjectPart[T]
    extends StObject
       with MessageFormatPart[T] {
    
    var `type`: `object`
    
    var value: T
  }
  object ObjectPart {
    
    inline def apply[T](`type`: `object`, value: T): ObjectPart[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectPart[T]]
    }
    
    extension [Self <: ObjectPart[?], T](x: Self & ObjectPart[T]) {
      
      inline def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type PrimitiveType = js.UndefOr[String | Double | Boolean | Null | js.Date]
}
