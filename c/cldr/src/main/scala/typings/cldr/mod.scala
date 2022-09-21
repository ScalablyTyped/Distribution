package typings.cldr

import typings.cldr.cldrStrings.date
import typings.cldr.cldrStrings.time
import typings.std.Document
import typings.std.Node
import typings.std.Partial
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cldr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cldr", JSImport.Default)
  @js.native
  val default: Cldr = js.native
  
  inline def load(cldrPath: String): Cldr = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(cldrPath.asInstanceOf[js.Any]).asInstanceOf[Cldr]
  
  trait Alias extends StObject {
    
    var reason: String
    
    var replacement: String
  }
  object Alias {
    
    inline def apply(reason: String, replacement: String): Alias = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alias]
    }
    
    extension [Self <: Alias](x: Self) {
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cldr.cldrStrings.cardinal
    - typings.cldr.cldrStrings.ordinal
  */
  trait CardinalOrOrdinal extends StObject
  object CardinalOrOrdinal {
    
    inline def cardinal: typings.cldr.cldrStrings.cardinal = "cardinal".asInstanceOf[typings.cldr.cldrStrings.cardinal]
    
    inline def ordinal: typings.cldr.cldrStrings.ordinal = "ordinal".asInstanceOf[typings.cldr.cldrStrings.ordinal]
  }
  
  @js.native
  trait Cldr extends StObject {
    
    val calendarIds: js.Array[String] = js.native
    
    def checkValidLocaleId(localeId: String): Unit = js.native
    
    var cldrPath: String = js.native
    
    def createFinder(prioritizedDocuments: js.Array[Document]): Finder = js.native
    
    // TODO add remaining properties and methods
    var documentByFileName: Partial[Record[String, Document]] = js.native
    
    def expandLocaleIdToPrioritizedList(localeId: String): js.Array[String] = js.native
    
    def extractAllTextToSpeechCharacterLabels(): PartialStringRecord = js.native
    def extractAllTextToSpeechCharacterLabels(localeId: String): PartialStringRecord = js.native
    
    def extractCharacters(localeId: String): js.Object = js.native
    
    def extractCodePatterns(localeId: String): PartialStringRecord = js.native
    
    def extractCurrencyInfoById(localeId: String): Partial[Record[String, CurrencyInfo]] = js.native
    
    def extractCyclicNames(localeId: String): js.Object = js.native
    def extractCyclicNames(localeId: String, calendarId: String): js.Object = js.native
    
    def extractDateFormatItems(localeId: String): PartialStringRecord = js.native
    def extractDateFormatItems(localeId: String, calendarId: String): PartialStringRecord = js.native
    
    def extractDateFormats(localeId: String): PartialStringRecord = js.native
    def extractDateFormats(localeId: String, calendarId: String): PartialStringRecord = js.native
    
    def extractDateIntervalFallbackFormat(localeId: String): PartialStringRecord = js.native
    def extractDateIntervalFallbackFormat(localeId: String, calendarId: String): PartialStringRecord = js.native
    
    def extractDateIntervalFormats(localeId: String): PartialStringRecord = js.native
    def extractDateIntervalFormats(localeId: String, calendarId: String): PartialStringRecord = js.native
    
    def extractDateOrTimeFormats(localeId: String, calendarId: String, dateOrTime: date | time): PartialStringRecord = js.native
    def extractDateOrTimeFormats(localeId: String, calendarId: Unit, dateOrTime: date | time): PartialStringRecord = js.native
    
    def extractDateTimePatterns(localeId: String): js.Object = js.native
    def extractDateTimePatterns(localeId: String, calendarId: String): js.Object = js.native
    
    def extractDayNames(localeId: String): js.Object = js.native
    def extractDayNames(localeId: String, calendarId: String): js.Object = js.native
    
    def extractDayPeriods(localeId: String): js.Object = js.native
    def extractDayPeriods(localeId: String, calendarId: String): js.Object = js.native
    
    def extractDefaultNumberSystemId(localeId: String): PartialStringRecord = js.native
    
    def extractDelimiters(localeId: String): PartialStringRecord = js.native
    
    def extractDerivedTextToSpeechCharacterLabels(): PartialStringRecord = js.native
    def extractDerivedTextToSpeechCharacterLabels(localeId: String): PartialStringRecord = js.native
    
    def extractEraNames(localeId: String): js.Object = js.native
    def extractEraNames(localeId: String, calendarId: String): js.Object = js.native
    
    def extractFields(localeId: String): js.Object = js.native
    
    def extractKeyTypes(localeId: String): Partial[Record[String, KeyType]] = js.native
    
    def extractLanguageDisplayNames(localeId: String): PartialStringRecord = js.native
    
    def extractLanguageSupplementalData(): js.Object = js.native
    
    def extractLanguageSupplementalMetadata(): Partial[Record[String, Alias]] = js.native
    
    def extractLayout(localeId: String): js.Object = js.native
    
    def extractListPatterns(localeId: String): js.Object = js.native
    
    def extractLocaleDisplayPattern(localeId: String): PartialStringRecord = js.native
    
    def extractMeasurementSystemNames(localeId: String): PartialStringRecord = js.native
    
    def extractMonthNames(localeId: String): js.Object = js.native
    def extractMonthNames(localeId: String, calendarId: String): js.Object = js.native
    
    def extractMonthPatterns(localeId: String): js.Object = js.native
    def extractMonthPatterns(localeId: String, calendarId: String): js.Object = js.native
    
    def extractNumberFormats(localeId: String): js.Object = js.native
    def extractNumberFormats(localeId: String, numberSystemId: String): js.Object = js.native
    
    def extractNumberSymbols(localeId: String): PartialStringRecord = js.native
    def extractNumberSymbols(localeId: String, numberSystemId: String): PartialStringRecord = js.native
    
    def extractNumberingSystem(numberingSystemId: String): NumberingSystem = js.native
    
    def extractPluralClasses(localeId: String, cardinalOrOrdinal: CardinalOrOrdinal): js.Object = js.native
    
    def extractPluralRuleFunction(localeId: String, cardinalOrOrdinal: CardinalOrOrdinal): Any = js.native
    
    def extractQuarterNames(localeId: String): js.Object = js.native
    def extractQuarterNames(localeId: String, calendarId: String): js.Object = js.native
    
    def extractRbnfFunctionByType(localeId: String): js.Object = js.native
    def extractRbnfFunctionByType(localeId: String, types: js.Array[String]): js.Object = js.native
    
    def extractScriptDisplayNames(localeId: String): PartialStringRecord = js.native
    
    def extractSubdivisionAliases(): Partial[Record[String, Alias]] = js.native
    
    def extractSubdivisionContainmentGroups(): js.Object = js.native
    
    def extractSubdivisionDisplayNames(localeId: String): PartialStringRecord = js.native
    
    def extractTerritories(): js.Object = js.native
    
    def extractTerritoryAliases(): Partial[Record[String, Alias]] = js.native
    
    def extractTerritoryContainmentGroups(): js.Object = js.native
    
    def extractTerritoryDisplayNames(localeId: String): PartialStringRecord = js.native
    
    def extractTerritoryInfo(): js.Object = js.native
    
    def extractTextToSpeechCharacterLabels(): PartialStringRecord = js.native
    def extractTextToSpeechCharacterLabels(localeId: String): PartialStringRecord = js.native
    
    def extractTimeFormats(localeId: String): PartialStringRecord = js.native
    def extractTimeFormats(localeId: String, calendarId: String): PartialStringRecord = js.native
    
    def extractTimeZoneDisplayNames(localeId: String): PartialStringRecord = js.native
    
    def extractTimeZoneFormats(localeId: String): PartialStringRecord = js.native
    
    def extractUnitPatterns(localeId: String): js.Object = js.native
    
    def extractVariantDisplayNames(localeId: String): PartialStringRecord = js.native
    
    def extractWeekData(): WeekData = js.native
    
    def extractWindowsZonesByName(name: String): js.Array[WindowsZone] = js.native
    
    def extractWindowsZonesByTimeZone(timeZone: String): js.Array[WindowsZone] = js.native
    
    def fileNamesByTypeAndNormalizedLocaleId(`type`: String): PartialStringRecord = js.native
    
    def getDocument(fileName: String): Document = js.native
    def getDocument(fileName: String, cb: js.Function2[/* err */ Null | js.Error, /* document */ Document, Unit]): Unit = js.native
    
    def getPrioritizedDocumentsForLocale(localeId: String, `type`: String): js.Array[Document] = js.native
    
    val localeIds: js.Array[String] = js.native
    
    val localeIdsSet: Set[String] = js.native
    
    val localesByParentLocale: Partial[Record[String, js.Array[String]]] = js.native
    
    val numberSystemIds: js.Array[String] = js.native
    
    def preload(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def preload(localeIds: js.Array[String], cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def resolveParentLocaleId(localeId: String): String = js.native
    
    val windowsZonesByMapZone: js.Array[WindowsZone] = js.native
  }
  
  trait CurrencyInfo extends StObject {
    
    var displayName: String
    
    var one: String
    
    var other: String
    
    var symbol: String
  }
  object CurrencyInfo {
    
    inline def apply(displayName: String, one: String, other: String, symbol: String): CurrencyInfo = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrencyInfo]
    }
    
    extension [Self <: CurrencyInfo](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setOne(value: String): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  type Finder = js.Function1[/* xpathQuery */ String, js.Array[Node]]
  
  trait KeyType extends StObject {
    
    var displayName: String
    
    var types: PartialStringRecord
  }
  object KeyType {
    
    inline def apply(displayName: String, types: PartialStringRecord): KeyType = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyType]
    }
    
    extension [Self <: KeyType](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: PartialStringRecord): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberingSystem extends StObject {
    
    var digits: js.UndefOr[js.Array[String]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var rules: js.UndefOr[Any] = js.undefined
    
    var `type`: String
  }
  object NumberingSystem {
    
    inline def apply(`type`: String): NumberingSystem = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberingSystem]
    }
    
    extension [Self <: NumberingSystem](x: Self) {
      
      inline def setDigits(value: js.Array[String]): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
      
      inline def setDigitsVarargs(value: String*): Self = StObject.set(x, "digits", js.Array(value*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setRules(value: Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type PartialStringRecord = Partial[Record[String, String]]
  
  trait WeekData extends StObject {
    
    var firstDay: js.Array[Any]
    
    var minDays: js.Array[Any]
    
    var weekOfPreference: js.Array[Any]
    
    var weekendEnd: js.Array[Any]
    
    var weekendStart: js.Array[Any]
  }
  object WeekData {
    
    inline def apply(
      firstDay: js.Array[Any],
      minDays: js.Array[Any],
      weekOfPreference: js.Array[Any],
      weekendEnd: js.Array[Any],
      weekendStart: js.Array[Any]
    ): WeekData = {
      val __obj = js.Dynamic.literal(firstDay = firstDay.asInstanceOf[js.Any], minDays = minDays.asInstanceOf[js.Any], weekOfPreference = weekOfPreference.asInstanceOf[js.Any], weekendEnd = weekendEnd.asInstanceOf[js.Any], weekendStart = weekendStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeekData]
    }
    
    extension [Self <: WeekData](x: Self) {
      
      inline def setFirstDay(value: js.Array[Any]): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
      
      inline def setFirstDayVarargs(value: Any*): Self = StObject.set(x, "firstDay", js.Array(value*))
      
      inline def setMinDays(value: js.Array[Any]): Self = StObject.set(x, "minDays", value.asInstanceOf[js.Any])
      
      inline def setMinDaysVarargs(value: Any*): Self = StObject.set(x, "minDays", js.Array(value*))
      
      inline def setWeekOfPreference(value: js.Array[Any]): Self = StObject.set(x, "weekOfPreference", value.asInstanceOf[js.Any])
      
      inline def setWeekOfPreferenceVarargs(value: Any*): Self = StObject.set(x, "weekOfPreference", js.Array(value*))
      
      inline def setWeekendEnd(value: js.Array[Any]): Self = StObject.set(x, "weekendEnd", value.asInstanceOf[js.Any])
      
      inline def setWeekendEndVarargs(value: Any*): Self = StObject.set(x, "weekendEnd", js.Array(value*))
      
      inline def setWeekendStart(value: js.Array[Any]): Self = StObject.set(x, "weekendStart", value.asInstanceOf[js.Any])
      
      inline def setWeekendStartVarargs(value: Any*): Self = StObject.set(x, "weekendStart", js.Array(value*))
    }
  }
  
  trait WindowsZone extends StObject {
    
    var name: String
    
    var territory: String
    
    var timeZone: String
  }
  object WindowsZone {
    
    inline def apply(name: String, territory: String, timeZone: String): WindowsZone = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], territory = territory.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowsZone]
    }
    
    extension [Self <: WindowsZone](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTerritory(value: String): Self = StObject.set(x, "territory", value.asInstanceOf[js.Any])
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    }
  }
}
