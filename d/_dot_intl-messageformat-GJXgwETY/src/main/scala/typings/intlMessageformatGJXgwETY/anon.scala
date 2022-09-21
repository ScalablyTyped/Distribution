package typings.intlMessageformatGJXgwETY

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserParserMod.ParserOptions
import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.MessageFormatElement
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.PluralRules
import typings.std.Intl.PluralRulesOptions
import typings.std.Record
import typings.std.anon.LocaleMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(message: String): js.Array[MessageFormatElement] = js.native
    def apply(message: String, opts: ParserOptions): js.Array[MessageFormatElement] = js.native
  }
  
  trait Locale extends StObject {
    
    var locale: String
  }
  object Locale {
    
    inline def apply(locale: String): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<.intl-messageformat-GJXgwETY..intl-messageformat-GJXgwETY/src/formatters.d.ts.Formats> */
  trait PartialFormats extends StObject {
    
    var date: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.undefined
    
    var number: js.UndefOr[Record[String, NumberFormatOptions]] = js.undefined
    
    var time: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.undefined
  }
  object PartialFormats {
    
    inline def apply(): PartialFormats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFormats]
    }
    
    extension [Self <: PartialFormats](x: Self) {
      
      inline def setDate(value: Record[String, DateTimeFormatOptions]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setNumber(value: Record[String, NumberFormatOptions]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setTime(value: Record[String, DateTimeFormatOptions]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  @js.native
  trait TypeofDateTimeFormat extends StObject {
    
    /* standard es5 */
    def apply(): DateTimeFormat = js.native
    def apply(locales: String): DateTimeFormat = js.native
    def apply(locales: String, options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: js.Array[String]): DateTimeFormat = js.native
    def apply(locales: js.Array[String], options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: Unit, options: DateTimeFormatOptions): DateTimeFormat = js.native
    
    /* standard es5 */
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofPluralRules extends StObject {
    
    /* standard es2018.intl */
    def apply(): PluralRules = js.native
    def apply(locales: String): PluralRules = js.native
    def apply(locales: String, options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: js.Array[String]): PluralRules = js.native
    def apply(locales: js.Array[String], options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: Unit, options: PluralRulesOptions): PluralRules = js.native
    
    /* standard es2018.intl */
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: LocaleMatcher): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: LocaleMatcher): js.Array[String] = js.native
  }
}
