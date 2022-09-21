package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.Intl.BCP47LanguageTag
import typings.typescriptNn5FuAjk.Intl.Collator
import typings.typescriptNn5FuAjk.Intl.CollatorOptions
import typings.typescriptNn5FuAjk.Intl.DateTimeFormat
import typings.typescriptNn5FuAjk.Intl.DateTimeFormatOptions
import typings.typescriptNn5FuAjk.Intl.DisplayNames
import typings.typescriptNn5FuAjk.Intl.DisplayNamesOptions
import typings.typescriptNn5FuAjk.Intl.LDMLPluralRule
import typings.typescriptNn5FuAjk.Intl.ListFormat
import typings.typescriptNn5FuAjk.Intl.ListFormatOptions
import typings.typescriptNn5FuAjk.Intl.Locale
import typings.typescriptNn5FuAjk.Intl.LocaleOptions
import typings.typescriptNn5FuAjk.Intl.LocalesArgument
import typings.typescriptNn5FuAjk.Intl.NumberFormat
import typings.typescriptNn5FuAjk.Intl.NumberFormatOptions
import typings.typescriptNn5FuAjk.Intl.PluralRules
import typings.typescriptNn5FuAjk.Intl.PluralRulesOptions
import typings.typescriptNn5FuAjk.Intl.RelativeTimeFormat
import typings.typescriptNn5FuAjk.Intl.RelativeTimeFormatOptions
import typings.typescriptNn5FuAjk.Intl.RelativeTimeFormatPart
import typings.typescriptNn5FuAjk.Intl.RelativeTimeFormatUnit
import typings.typescriptNn5FuAjk.Intl.ResolvedCollatorOptions
import typings.typescriptNn5FuAjk.Intl.ResolvedDisplayNamesOptions
import typings.typescriptNn5FuAjk.Intl.ResolvedPluralRulesOptions
import typings.typescriptNn5FuAjk.Intl.ResolvedRelativeTimeFormatOptions
import typings.typescriptNn5FuAjk.Intl.ResolvedSegmenterOptions
import typings.typescriptNn5FuAjk.Intl.Segmenter
import typings.typescriptNn5FuAjk.Intl.SegmenterOptions
import typings.typescriptNn5FuAjk.Intl.Segments
import typings.typescriptNn5FuAjk.Intl.UnicodeBCP47LocaleIdentifier
import typings.typescriptNn5FuAjk.Iterable
import typings.typescriptNn5FuAjk.anon.LocaleMatcher
import typings.typescriptNn5FuAjk.anon.PickListFormatOptionsloca
import typings.typescriptNn5FuAjk.anon.PickSegmenterOptionslocal
import typings.typescriptNn5FuAjk.anon.Type
import typings.typescriptNn5FuAjk.anon.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  object Collator {
    
    inline def apply(): typings.typescriptNn5FuAjk.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.typescriptNn5FuAjk.Intl.Collator]
    inline def apply(locales: java.lang.String): typings.typescriptNn5FuAjk.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Intl.Collator]
    inline def apply(locales: java.lang.String, options: CollatorOptions): typings.typescriptNn5FuAjk.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Intl.Collator]
    inline def apply(locales: Unit, options: CollatorOptions): typings.typescriptNn5FuAjk.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Intl.Collator]
    inline def apply(locales: typings.typescriptNn5FuAjk.Array[java.lang.String]): typings.typescriptNn5FuAjk.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Intl.Collator]
    inline def apply(locales: typings.typescriptNn5FuAjk.Array[java.lang.String], options: CollatorOptions): typings.typescriptNn5FuAjk.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Intl.Collator]
    
    @JSGlobal("Intl.Collator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportedLocalesOf(locales: java.lang.String): typings.typescriptNn5FuAjk.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): typings.typescriptNn5FuAjk.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[java.lang.String]): typings.typescriptNn5FuAjk.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[java.lang.String], options: CollatorOptions): typings.typescriptNn5FuAjk.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Collator")
  @js.native
  open class CollatorCls ()
    extends StObject
       with Collator {
    def this(locales: java.lang.String) = this()
    def this(locales: typings.typescriptNn5FuAjk.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: CollatorOptions) = this()
    def this(locales: Unit, options: CollatorOptions) = this()
    def this(locales: typings.typescriptNn5FuAjk.Array[java.lang.String], options: CollatorOptions) = this()
    
    /* CompleteClass */
    override def compare(x: java.lang.String, y: java.lang.String): Double = js.native
    
    /* CompleteClass */
    override def resolvedOptions(): ResolvedCollatorOptions = js.native
  }
  
  object DateTimeFormat {
    
    inline def apply(): typings.typescriptNn5FuAjk.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.typescriptNn5FuAjk.Intl.DateTimeFormat]
    inline def apply(locales: java.lang.String): typings.typescriptNn5FuAjk.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Intl.DateTimeFormat]
    inline def apply(locales: java.lang.String, options: DateTimeFormatOptions): typings.typescriptNn5FuAjk.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Intl.DateTimeFormat]
    inline def apply(locales: Unit, options: DateTimeFormatOptions): typings.typescriptNn5FuAjk.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Intl.DateTimeFormat]
    inline def apply(locales: typings.typescriptNn5FuAjk.Array[java.lang.String]): typings.typescriptNn5FuAjk.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Intl.DateTimeFormat]
    inline def apply(locales: typings.typescriptNn5FuAjk.Array[java.lang.String], options: DateTimeFormatOptions): typings.typescriptNn5FuAjk.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Intl.DateTimeFormat]
    
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportedLocalesOf(locales: java.lang.String): typings.typescriptNn5FuAjk.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): typings.typescriptNn5FuAjk.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[java.lang.String]): typings.typescriptNn5FuAjk.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[java.lang.String], options: DateTimeFormatOptions): typings.typescriptNn5FuAjk.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.DateTimeFormat")
  @js.native
  open class DateTimeFormatCls ()
    extends StObject
       with DateTimeFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: typings.typescriptNn5FuAjk.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
    def this(locales: Unit, options: DateTimeFormatOptions) = this()
    def this(locales: typings.typescriptNn5FuAjk.Array[java.lang.String], options: DateTimeFormatOptions) = this()
  }
  
  /**
    * The [`Intl.DisplayNames()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames)
    * object enables the consistent translation of language, region and script display names.
    *
    * [Compatibility](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames#browser_compatibility).
    */
  object DisplayNames {
    
    @JSGlobal("Intl.DisplayNames")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an array containing those of the provided locales that are supported in display names without having to fall back to the runtime's default locale.
      *
      * @param locales A string with a BCP 47 language tag, or an array of such strings.
      *   For the general form and interpretation of the `locales` argument, see the [Intl](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#locale_identification_and_negotiation)
      *   page.
      *
      * @param options An object with a locale matcher.
      *
      * @returns An array of strings representing a subset of the given locale tags that are supported in display names without having to fall back to the runtime's default locale.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/supportedLocalesOf).
      */
    inline def supportedLocalesOf(): typings.typescriptNn5FuAjk.Array[BCP47LanguageTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")().asInstanceOf[typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]]
    inline def supportedLocalesOf(locales: Unit, options: `5`): typings.typescriptNn5FuAjk.Array[BCP47LanguageTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]]
    inline def supportedLocalesOf(locales: LocalesArgument): typings.typescriptNn5FuAjk.Array[BCP47LanguageTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]]
    inline def supportedLocalesOf(locales: LocalesArgument, options: `5`): typings.typescriptNn5FuAjk.Array[BCP47LanguageTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.DisplayNames")
  @js.native
  open class DisplayNamesCls protected ()
    extends StObject
       with DisplayNames {
    /**
      * @param locales A string with a BCP 47 language tag, or an array of such strings.
      *   For the general form and interpretation of the `locales` argument, see the [Intl](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#locale_identification_and_negotiation)
      *   page.
      *
      * @param options An object for setting up a display name.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/DisplayNames).
      */
    def this(locales: LocalesArgument, options: DisplayNamesOptions) = this()
    
    /**
      * Receives a code and returns a string based on the locale and options provided when instantiating
      * [`Intl.DisplayNames()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames)
      *
      * @param code The `code` to provide depends on the `type` passed to display name during creation:
      *  - If the type is `"region"`, code should be either an [ISO-3166 two letters region code](https://www.iso.org/iso-3166-country-codes.html),
      *    or a [three digits UN M49 Geographic Regions](https://unstats.un.org/unsd/methodology/m49/).
      *  - If the type is `"script"`, code should be an [ISO-15924 four letters script code](https://unicode.org/iso15924/iso15924-codes.html).
      *  - If the type is `"language"`, code should be a `languageCode` ["-" `scriptCode`] ["-" `regionCode` ] *("-" `variant` )
      *    subsequence of the unicode_language_id grammar in [UTS 35's Unicode Language and Locale Identifiers grammar](https://unicode.org/reports/tr35/#Unicode_language_identifier).
      *    `languageCode` is either a two letters ISO 639-1 language code or a three letters ISO 639-2 language code.
      *  - If the type is `"currency"`, code should be a [3-letter ISO 4217 currency code](https://www.iso.org/iso-4217-currency-codes.html).
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/of).
      */
    /* CompleteClass */
    override def of(code: java.lang.String): js.UndefOr[java.lang.String] = js.native
    
    /**
      * Returns a new object with properties reflecting the locale and style formatting options computed during the construction of the current
      * [`Intl/DisplayNames`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames) object.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/resolvedOptions).
      */
    /* CompleteClass */
    override def resolvedOptions(): ResolvedDisplayNamesOptions = js.native
  }
  
  object ListFormat {
    
    @JSGlobal("Intl.ListFormat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]): typings.typescriptNn5FuAjk.Array[BCP47LanguageTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]]
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[BCP47LanguageTag], options: PickListFormatOptionsloca): typings.typescriptNn5FuAjk.Array[BCP47LanguageTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]]
    /**
      * Returns an array containing those of the provided locales that are
      * supported in list formatting without having to fall back to the runtime's default locale.
      *
      * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
      *  For the general form and interpretation of the `locales` argument,
      *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
      *
      * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/supportedLocalesOf#parameters).
      *  with some or all possible options.
      *
      * @returns An array of strings representing a subset of the given locale tags that are supported in list
      *  formatting without having to fall back to the runtime's default locale.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/supportedLocalesOf).
      */
    inline def supportedLocalesOf(locales: BCP47LanguageTag): typings.typescriptNn5FuAjk.Array[BCP47LanguageTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]]
    inline def supportedLocalesOf(locales: BCP47LanguageTag, options: PickListFormatOptionsloca): typings.typescriptNn5FuAjk.Array[BCP47LanguageTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.ListFormat")
  @js.native
  /**
    * Creates [Intl.ListFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat) objects that
    * enable language-sensitive list formatting.
    *
    * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
    *  For the general form and interpretation of the `locales` argument,
    *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
    *
    * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/ListFormat#parameters)
    *  with some or all options of `ListFormatOptions`.
    *
    * @returns [Intl.ListFormatOptions](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat) object.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat).
    */
  open class ListFormatCls ()
    extends StObject
       with ListFormat {
    def this(locales: typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]) = this()
    def this(locales: BCP47LanguageTag) = this()
    def this(locales: Unit, options: ListFormatOptions) = this()
    def this(locales: typings.typescriptNn5FuAjk.Array[BCP47LanguageTag], options: ListFormatOptions) = this()
    def this(locales: BCP47LanguageTag, options: ListFormatOptions) = this()
    
    /**
      * Returns a string with a language-specific representation of the list.
      *
      * @param list - An iterable object, such as an [Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array).
      *
      * @throws `TypeError` if `list` includes something other than the possible values.
      *
      * @returns {string} A language-specific formatted string representing the elements of the list.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/format).
      */
    /* CompleteClass */
    override def format(list: Iterable[java.lang.String]): java.lang.String = js.native
    
    /**
      * Returns an Array of objects representing the different components that can be used to format a list of values in a locale-aware fashion.
      *
      * @param list - An iterable object, such as an [Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array), to be formatted according to a locale.
      *
      * @throws `TypeError` if `list` includes something other than the possible values.
      *
      * @returns {{ type: "element" | "literal", value: string; }[]} An Array of components which contains the formatted parts from the list.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/formatToParts).
      */
    /* CompleteClass */
    override def formatToParts(list: Iterable[java.lang.String]): typings.typescriptNn5FuAjk.Array[Type] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Locale")
  @js.native
  open class LocaleCls protected ()
    extends StObject
       with Locale {
    def this(tag: BCP47LanguageTag) = this()
    def this(tag: Locale) = this()
    def this(tag: BCP47LanguageTag, options: LocaleOptions) = this()
    def this(tag: Locale, options: LocaleOptions) = this()
    
    /** A string containing the language, and the script and region if available. */
    /* CompleteClass */
    @JSName("baseName")
    var baseName_Locale: java.lang.String = js.native
    
    /** The primary language subtag associated with the locale. */
    /* CompleteClass */
    @JSName("language")
    var language_Locale: java.lang.String = js.native
    
    /** Gets the most likely values for the language, script, and region of the locale based on existing values. */
    /* CompleteClass */
    override def maximize(): Locale = js.native
    
    /** Attempts to remove information about the locale that would be added by calling `Locale.maximize()`. */
    /* CompleteClass */
    override def minimize(): Locale = js.native
  }
  
  object NumberFormat {
    
    inline def apply(): typings.typescriptNn5FuAjk.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.typescriptNn5FuAjk.Intl.NumberFormat]
    inline def apply(locales: java.lang.String): typings.typescriptNn5FuAjk.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Intl.NumberFormat]
    inline def apply(locales: java.lang.String, options: NumberFormatOptions): typings.typescriptNn5FuAjk.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Intl.NumberFormat]
    inline def apply(locales: Unit, options: NumberFormatOptions): typings.typescriptNn5FuAjk.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Intl.NumberFormat]
    inline def apply(locales: typings.typescriptNn5FuAjk.Array[java.lang.String]): typings.typescriptNn5FuAjk.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Intl.NumberFormat]
    inline def apply(locales: typings.typescriptNn5FuAjk.Array[java.lang.String], options: NumberFormatOptions): typings.typescriptNn5FuAjk.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Intl.NumberFormat]
    
    @JSGlobal("Intl.NumberFormat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportedLocalesOf(locales: java.lang.String): typings.typescriptNn5FuAjk.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): typings.typescriptNn5FuAjk.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[java.lang.String]): typings.typescriptNn5FuAjk.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[java.lang.String], options: NumberFormatOptions): typings.typescriptNn5FuAjk.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.NumberFormat")
  @js.native
  open class NumberFormatCls ()
    extends StObject
       with NumberFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: typings.typescriptNn5FuAjk.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: NumberFormatOptions) = this()
    def this(locales: Unit, options: NumberFormatOptions) = this()
    def this(locales: typings.typescriptNn5FuAjk.Array[java.lang.String], options: NumberFormatOptions) = this()
  }
  
  object PluralRules {
    
    inline def apply(): typings.typescriptNn5FuAjk.Intl.PluralRules = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.typescriptNn5FuAjk.Intl.PluralRules]
    inline def apply(locales: java.lang.String): typings.typescriptNn5FuAjk.Intl.PluralRules = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Intl.PluralRules]
    inline def apply(locales: java.lang.String, options: PluralRulesOptions): typings.typescriptNn5FuAjk.Intl.PluralRules = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Intl.PluralRules]
    inline def apply(locales: Unit, options: PluralRulesOptions): typings.typescriptNn5FuAjk.Intl.PluralRules = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Intl.PluralRules]
    inline def apply(locales: typings.typescriptNn5FuAjk.Array[java.lang.String]): typings.typescriptNn5FuAjk.Intl.PluralRules = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Intl.PluralRules]
    inline def apply(locales: typings.typescriptNn5FuAjk.Array[java.lang.String], options: PluralRulesOptions): typings.typescriptNn5FuAjk.Intl.PluralRules = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Intl.PluralRules]
    
    @JSGlobal("Intl.PluralRules")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportedLocalesOf(locales: java.lang.String): typings.typescriptNn5FuAjk.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: java.lang.String, options: LocaleMatcher): typings.typescriptNn5FuAjk.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[java.lang.String]): typings.typescriptNn5FuAjk.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[java.lang.String], options: LocaleMatcher): typings.typescriptNn5FuAjk.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.PluralRules")
  @js.native
  open class PluralRulesCls ()
    extends StObject
       with PluralRules {
    def this(locales: java.lang.String) = this()
    def this(locales: typings.typescriptNn5FuAjk.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: PluralRulesOptions) = this()
    def this(locales: Unit, options: PluralRulesOptions) = this()
    def this(locales: typings.typescriptNn5FuAjk.Array[java.lang.String], options: PluralRulesOptions) = this()
    
    /* CompleteClass */
    override def resolvedOptions(): ResolvedPluralRulesOptions = js.native
    
    /* CompleteClass */
    override def select(n: Double): LDMLPluralRule = js.native
  }
  
  /**
    * The [`Intl.RelativeTimeFormat`](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat)
    * object is a constructor for objects that enable language-sensitive relative time formatting.
    *
    * [Compatibility](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat#Browser_compatibility).
    */
  object RelativeTimeFormat {
    
    @JSGlobal("Intl.RelativeTimeFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an array containing those of the provided locales
      * that are supported in date and time formatting
      * without having to fall back to the runtime's default locale.
      *
      * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
      *  For the general form and interpretation of the locales argument,
      *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
      *
      * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters)
      *  with some or all of options of the formatting.
      *
      * @returns An array containing those of the provided locales
      *  that are supported in date and time formatting
      *  without having to fall back to the runtime's default locale.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/supportedLocalesOf).
      */
    inline def supportedLocalesOf(): typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")().asInstanceOf[typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier]]
    inline def supportedLocalesOf(locales: Unit, options: RelativeTimeFormatOptions): typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier]]
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier]): typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier]]
    inline def supportedLocalesOf(
      locales: typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier],
      options: RelativeTimeFormatOptions
    ): typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier]]
    inline def supportedLocalesOf(locales: UnicodeBCP47LocaleIdentifier): typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier]]
    inline def supportedLocalesOf(locales: UnicodeBCP47LocaleIdentifier, options: RelativeTimeFormatOptions): typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.RelativeTimeFormat")
  @js.native
  /**
    * Creates [Intl.RelativeTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat) objects
    *
    * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
    *  For the general form and interpretation of the locales argument,
    *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
    *
    * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters)
    *  with some or all of options of `RelativeTimeFormatOptions`.
    *
    * @returns [Intl.RelativeTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat) object.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat).
    */
  open class RelativeTimeFormatCls ()
    extends StObject
       with RelativeTimeFormat {
    def this(locales: typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier]) = this()
    def this(locales: UnicodeBCP47LocaleIdentifier) = this()
    def this(locales: Unit, options: RelativeTimeFormatOptions) = this()
    def this(
      locales: typings.typescriptNn5FuAjk.Array[UnicodeBCP47LocaleIdentifier],
      options: RelativeTimeFormatOptions
    ) = this()
    def this(locales: UnicodeBCP47LocaleIdentifier, options: RelativeTimeFormatOptions) = this()
    
    /**
      * Formats a value and a unit according to the locale
      * and formatting options of the given
      * [`Intl.RelativeTimeFormat`](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat)
      * object.
      *
      * While this method automatically provides the correct plural forms,
      * the grammatical form is otherwise as neutral as possible.
      *
      * It is the caller's responsibility to handle cut-off logic
      * such as deciding between displaying "in 7 days" or "in 1 week".
      * This API does not support relative dates involving compound units.
      * e.g "in 5 days and 4 hours".
      *
      * @param value -  Numeric value to use in the internationalized relative time message
      *
      * @param unit - [Unit](https://tc39.es/ecma402/#sec-singularrelativetimeunit) to use in the relative time internationalized message.
      *
      * @throws `RangeError` if `unit` was given something other than `unit` possible values
      *
      * @returns {string} Internationalized relative time message as string
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/format).
      */
    /* CompleteClass */
    override def format(value: Double, unit: RelativeTimeFormatUnit): java.lang.String = js.native
    
    /**
      *  Returns an array of objects representing the relative time format in parts that can be used for custom locale-aware formatting.
      *
      *  @param value - Numeric value to use in the internationalized relative time message
      *
      *  @param unit - [Unit](https://tc39.es/ecma402/#sec-singularrelativetimeunit) to use in the relative time internationalized message.
      *
      *  @throws `RangeError` if `unit` was given something other than `unit` possible values
      *
      *  [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/formatToParts).
      */
    /* CompleteClass */
    override def formatToParts(value: Double, unit: RelativeTimeFormatUnit): typings.typescriptNn5FuAjk.Array[RelativeTimeFormatPart] = js.native
    
    /**
      * Provides access to the locale and options computed during initialization of this `Intl.RelativeTimeFormat` object.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/resolvedOptions).
      */
    /* CompleteClass */
    override def resolvedOptions(): ResolvedRelativeTimeFormatOptions = js.native
  }
  
  object Segmenter {
    
    @JSGlobal("Intl.Segmenter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]): typings.typescriptNn5FuAjk.Array[BCP47LanguageTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]]
    inline def supportedLocalesOf(locales: typings.typescriptNn5FuAjk.Array[BCP47LanguageTag], options: PickSegmenterOptionslocal): typings.typescriptNn5FuAjk.Array[BCP47LanguageTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]]
    /**
      * Returns an array containing those of the provided locales that are supported without having to fall back to the runtime's default locale.
      *
      * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
      *  For the general form and interpretation of the `locales` argument,
      *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
      *
      * @param options An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segmenter/supportedLocalesOf#parameters).
      *  with some or all possible options.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segmenter/supportedLocalesOf)
      */
    inline def supportedLocalesOf(locales: BCP47LanguageTag): typings.typescriptNn5FuAjk.Array[BCP47LanguageTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]]
    inline def supportedLocalesOf(locales: BCP47LanguageTag, options: PickSegmenterOptionslocal): typings.typescriptNn5FuAjk.Array[BCP47LanguageTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Segmenter")
  @js.native
  /**
    * Creates a new `Intl.Segmenter` object.
    *
    * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
    *  For the general form and interpretation of the `locales` argument,
    *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
    *
    * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segmenter/Segmenter#parameters)
    *  with some or all options of `SegmenterOptions`.
    *
    * @returns [Intl.Segmenter](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segments) object.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segmenter).
    */
  open class SegmenterCls ()
    extends StObject
       with Segmenter {
    def this(locales: typings.typescriptNn5FuAjk.Array[BCP47LanguageTag]) = this()
    def this(locales: BCP47LanguageTag) = this()
    def this(locales: Unit, options: SegmenterOptions) = this()
    def this(locales: typings.typescriptNn5FuAjk.Array[BCP47LanguageTag], options: SegmenterOptions) = this()
    def this(locales: BCP47LanguageTag, options: SegmenterOptions) = this()
    
    /* CompleteClass */
    override def resolvedOptions(): ResolvedSegmenterOptions = js.native
    
    /**
      * Returns `Segments` object containing the segments of the input string, using the segmenter's locale and granularity.
      *
      * @param input - The text to be segmented as a `string`.
      *
      * @returns A new iterable Segments object containing the segments of the input string, using the segmenter's locale and granularity.
      */
    /* CompleteClass */
    override def segment(input: java.lang.String): Segments = js.native
  }
}
