package typings.typescriptNn5FuAjk.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleOptions extends StObject {
  
  /** A string containing the language, and the script and region if available. */
  var baseName: js.UndefOr[String] = js.undefined
  
  /** The part of the Locale that indicates the locale's calendar era. */
  var calendar: js.UndefOr[String] = js.undefined
  
  /** Flag that defines whether case is taken into account for the locale's collation rules. */
  var caseFirst: js.UndefOr[LocaleCollationCaseFirst] = js.undefined
  
  /** The collation type used for sorting */
  var collation: js.UndefOr[String] = js.undefined
  
  /** The time keeping format convention used by the locale. */
  var hourCycle: js.UndefOr[LocaleHourCycleKey] = js.undefined
  
  /** The primary language subtag associated with the locale. */
  var language: js.UndefOr[String] = js.undefined
  
  /** The numeral system used by the locale. */
  var numberingSystem: js.UndefOr[String] = js.undefined
  
  /** Flag that defines whether the locale has special collation handling for numeric characters. */
  var numeric: js.UndefOr[Boolean] = js.undefined
  
  /** The region of the world (usually a country) associated with the locale. Possible values are region codes as defined by ISO 3166-1. */
  var region: js.UndefOr[String] = js.undefined
  
  /** The script used for writing the particular language used in the locale. Possible values are script codes as defined by ISO 15924. */
  var script: js.UndefOr[String] = js.undefined
}
object LocaleOptions {
  
  inline def apply(): LocaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleOptions]
  }
  
  extension [Self <: LocaleOptions](x: Self) {
    
    inline def setBaseName(value: String): Self = StObject.set(x, "baseName", value.asInstanceOf[js.Any])
    
    inline def setBaseNameUndefined: Self = StObject.set(x, "baseName", js.undefined)
    
    inline def setCalendar(value: String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setCaseFirst(value: LocaleCollationCaseFirst): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
    
    inline def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
    
    inline def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setHourCycle(value: LocaleHourCycleKey): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
    
    inline def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
