package typings.codsenUtils

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("codsen-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("codsen-utils", "backslash")
  @js.native
  val backslash: /* "\\" */ String = js.native
  
  @JSImport("codsen-utils", "backtick")
  @js.native
  val backtick: /* "`" */ String = js.native
  
  /**
    * Related to @typescript-eslint/require-array-sort-compare lint error
    */
  inline def compareFn(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareFn")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def detectEol(str: String): js.UndefOr[EolChar] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectEol")(str.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[EolChar]]
  inline def detectEol(str: Any): js.UndefOr[EolChar] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectEol")(str.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[EolChar]]
  
  @JSImport("codsen-utils", "doublePrime")
  @js.native
  val doublePrime: /* "\\u2033" */ String = js.native
  
  @JSImport("codsen-utils", "ellipsis")
  @js.native
  val ellipsis: /* "\\u2026" */ String = js.native
  
  inline def existy(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existy")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Gives array of indexes of all found substring occurrences
    * @param string source string
    * @param substring what to look for
    * @returns array of findings' position indexes
    * adapted from https://stackoverflow.com/a/10710406
    * console.log(findAllIdx("scissors", "s"));
    * -> [0, 3, 4, 7]
    */
  inline def findAllIdx(value: Any, substring: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllIdx")(value.asInstanceOf[js.Any], substring.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @JSImport("codsen-utils", "hairspace")
  @js.native
  val hairspace: /* "\\u200A" */ String = js.native
  
  inline def hasOwnProp(obj: Any, prop: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProp")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Like Array.prototype.includes() but it takes a mix of strings and/or
    * regex'es, and matches that against a string. It's also a friendly API,
    * it will not throw if the inputs are wrong.
    * @param arr - array of zero or more strings or regex'es
    * @param whatToMatch - string to match
    * @returns boolean
    */
  inline def includes(arr: js.Array[String | js.RegExp], whatToMatch: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(arr.asInstanceOf[js.Any], whatToMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("codsen-utils", "inlineTags")
  @js.native
  val inlineTags: Set[String] = js.native
  
  /** Alternative to lodash.intersection */
  inline def intersection[T, U](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")().asInstanceOf[js.Array[T]]
  inline def intersection[T, U](a: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def intersection[T, U](a: js.Array[T], b: js.Array[U]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def intersection[T, U](a: Unit, b: js.Array[U]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def isBool(something: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBool")(something.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isCurrencyChar(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCurrencyChar")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCurrencySymbol(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCurrencySymbol")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInt(something: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInt")(something.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isLatinLetter(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLatinLetter")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLetter(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLetter")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLowercaseLetter(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLowercaseLetter")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(something: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(something.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNum(something: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNum")(something.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isNumberChar(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberChar")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Tells, is given input a plain object (an object literal,
    * a container object Object.create(null) or created by new Object())
    * @param value unknown
    * @returns boolean
    */
  inline def isPlainObject(value: Any): /* is codsen-utils.codsen-utils.JSONObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is codsen-utils.codsen-utils.JSONObject */ Boolean]
  
  inline def isQuote(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQuote")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExp(something: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(something.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isStr(something: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStr")(something.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isUppercaseLetter(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUppercaseLetter")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWhitespaceChar(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhitespaceChar")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("codsen-utils", "leftDoubleQuote")
  @js.native
  val leftDoubleQuote: /* "\\u201C" */ String = js.native
  
  @JSImport("codsen-utils", "leftSingleQuote")
  @js.native
  val leftSingleQuote: /* "\\u2018" */ String = js.native
  
  @JSImport("codsen-utils", "multiplicationSign")
  @js.native
  val multiplicationSign: /* "\\u00D7" */ String = js.native
  
  /** Alternative to lodash.omit */
  inline def omit(obj: JSONObject_): JSONObject_ = ^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any]).asInstanceOf[JSONObject_]
  inline def omit(obj: JSONObject_, keysToRemove: js.Array[String]): JSONObject_ = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], keysToRemove.asInstanceOf[js.Any])).asInstanceOf[JSONObject_]
  
  /**
    * Unlike lodash equivalent, it does not mutate the input array
    * @param input
    * @param remove
    * @returns
    */
  inline def pullAll[T, U](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pullAll")().asInstanceOf[js.Array[T]]
  inline def pullAll[T, U](input: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pullAll")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def pullAll[T, U](input: js.Array[T], remove: js.Array[U]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pullAll")(input.asInstanceOf[js.Any], remove.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def pullAll[T, U](input: Unit, remove: js.Array[U]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pullAll")(input.asInstanceOf[js.Any], remove.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("codsen-utils", "punctuationChars")
  @js.native
  val punctuationChars: js.Array[String] = js.native
  
  @JSImport("codsen-utils", "rawMDash")
  @js.native
  val rawMDash: /* "\\u2014" */ String = js.native
  
  @JSImport("codsen-utils", "rawNDash")
  @js.native
  val rawNDash: /* "\\u2013" */ String = js.native
  
  @JSImport("codsen-utils", "rawNbsp")
  @js.native
  val rawNbsp: /* "\\u00A0" */ String = js.native
  
  @JSImport("codsen-utils", "rawReplacementMark")
  @js.native
  val rawReplacementMark: /* "\\uFFFD" */ String = js.native
  
  inline def removeTrailingSlash[T](value: T): String | T = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTrailingSlash")(value.asInstanceOf[js.Any]).asInstanceOf[String | T]
  
  inline def resolveEolSetting(str: String, eolSetting: Any): EolChar = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEolSetting")(str.asInstanceOf[js.Any], eolSetting.asInstanceOf[js.Any])).asInstanceOf[EolChar]
  inline def resolveEolSetting(str: String, eolSetting: Any, defaultEolChar: EolChar): EolChar = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEolSetting")(str.asInstanceOf[js.Any], eolSetting.asInstanceOf[js.Any], defaultEolChar.asInstanceOf[js.Any])).asInstanceOf[EolChar]
  inline def resolveEolSetting(str: String, eolSetting: EolSetting): EolChar = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEolSetting")(str.asInstanceOf[js.Any], eolSetting.asInstanceOf[js.Any])).asInstanceOf[EolChar]
  inline def resolveEolSetting(str: String, eolSetting: EolSetting, defaultEolChar: EolChar): EolChar = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEolSetting")(str.asInstanceOf[js.Any], eolSetting.asInstanceOf[js.Any], defaultEolChar.asInstanceOf[js.Any])).asInstanceOf[EolChar]
  inline def resolveEolSetting(str: Any, eolSetting: Any): EolChar = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEolSetting")(str.asInstanceOf[js.Any], eolSetting.asInstanceOf[js.Any])).asInstanceOf[EolChar]
  inline def resolveEolSetting(str: Any, eolSetting: Any, defaultEolChar: EolChar): EolChar = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEolSetting")(str.asInstanceOf[js.Any], eolSetting.asInstanceOf[js.Any], defaultEolChar.asInstanceOf[js.Any])).asInstanceOf[EolChar]
  inline def resolveEolSetting(str: Any, eolSetting: EolSetting): EolChar = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEolSetting")(str.asInstanceOf[js.Any], eolSetting.asInstanceOf[js.Any])).asInstanceOf[EolChar]
  inline def resolveEolSetting(str: Any, eolSetting: EolSetting, defaultEolChar: EolChar): EolChar = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEolSetting")(str.asInstanceOf[js.Any], eolSetting.asInstanceOf[js.Any], defaultEolChar.asInstanceOf[js.Any])).asInstanceOf[EolChar]
  
  @JSImport("codsen-utils", "rightDoubleQuote")
  @js.native
  val rightDoubleQuote: /* "\\u201D" */ String = js.native
  
  @JSImport("codsen-utils", "rightSingleQuote")
  @js.native
  val rightSingleQuote: /* "\\u2019" */ String = js.native
  
  @JSImport("codsen-utils", "singlePrime")
  @js.native
  val singlePrime: /* "\\u2032" */ String = js.native
  
  /**
    * @param str input string
    * @param index starting index
    * @param count how many characters to replace
    * @param add what string to insert
    * @returns string
    * Adapted from https://stackoverflow.com/a/21350614
    */
  inline def stringSplice(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")().asInstanceOf[String]
  inline def stringSplice(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringSplice(str: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: String, index: Double, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: String, index: Double, count: Double, add: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any], add.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: String, index: Double, count: Unit, add: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any], add.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: String, index: Unit, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: String, index: Unit, count: Double, add: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any], add.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: String, index: Unit, count: Unit, add: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any], add.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: Unit, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: Unit, index: Double, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: Unit, index: Double, count: Double, add: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any], add.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: Unit, index: Double, count: Unit, add: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any], add.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: Unit, index: Unit, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: Unit, index: Unit, count: Double, add: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any], add.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringSplice(str: Unit, index: Unit, count: Unit, add: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplice")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any], add.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("codsen-utils", "thinSpace")
  @js.native
  val thinSpace: /* "\\u2009" */ String = js.native
  
  /**
    * Returns a shallow copy of input array, with only unique elements
    * @param input array
    * @returns de-duped array
    */
  inline def uniq[T](input: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @JSImport("codsen-utils", "version")
  @js.native
  val version: String = js.native
  
  @JSImport("codsen-utils", "voidTags")
  @js.native
  val voidTags: js.Array[String] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.codsenUtils.codsenUtilsStrings.Linefeed
    - typings.codsenUtils.codsenUtilsStrings.Carriagereturn
    - typings.codsenUtils.codsenUtilsStrings.CarriagereturnLinefeed
  */
  trait EolChar extends StObject
  object EolChar {
    
    inline def Carriagereturn: typings.codsenUtils.codsenUtilsStrings.Carriagereturn = "\r".asInstanceOf[typings.codsenUtils.codsenUtilsStrings.Carriagereturn]
    
    inline def CarriagereturnLinefeed: typings.codsenUtils.codsenUtilsStrings.CarriagereturnLinefeed = "\r\n".asInstanceOf[typings.codsenUtils.codsenUtilsStrings.CarriagereturnLinefeed]
    
    inline def Linefeed: typings.codsenUtils.codsenUtilsStrings.Linefeed = "\n".asInstanceOf[typings.codsenUtils.codsenUtilsStrings.Linefeed]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.codsenUtils.codsenUtilsStrings.lf
    - typings.codsenUtils.codsenUtilsStrings.crlf
    - typings.codsenUtils.codsenUtilsStrings.cr
  */
  trait EolSetting extends StObject
  object EolSetting {
    
    inline def cr: typings.codsenUtils.codsenUtilsStrings.cr = "cr".asInstanceOf[typings.codsenUtils.codsenUtilsStrings.cr]
    
    inline def crlf: typings.codsenUtils.codsenUtilsStrings.crlf = "crlf".asInstanceOf[typings.codsenUtils.codsenUtilsStrings.crlf]
    
    inline def lf: typings.codsenUtils.codsenUtilsStrings.lf = "lf".asInstanceOf[typings.codsenUtils.codsenUtilsStrings.lf]
  }
  
  type JSONArray = js.Array[JSONValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONObject = {[key: string] : codsen-utils.codsen-utils.JSONValue}
  }}}
  to avoid circular code involving: 
  - codsen-utils.codsen-utils.JSONArray
  - codsen-utils.codsen-utils.JSONObject
  - codsen-utils.codsen-utils.JSONValue
  - codsen-utils.codsen-utils.Obj
  */
  trait JSONObject_
    extends StObject
       with /* key */ StringDictionary[JSONValue]
  object JSONObject_ {
    
    inline def apply(): JSONObject_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject_]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONValue = string | number | boolean | null | codsen-utils.codsen-utils.JSONObject | codsen-utils.codsen-utils.JSONArray
  }}}
  to avoid circular code involving: 
  - codsen-utils.codsen-utils.JSONArray
  - codsen-utils.codsen-utils.JSONValue
  */
  type JSONValue = String | Double | Boolean | Null | JSONObject_ | Any
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Key in string ]:? codsen-utils.codsen-utils.JSONValue}
    }}}
    */
  @js.native
  trait JsonObject extends StObject
  
  type Obj = JSONObject_
}
