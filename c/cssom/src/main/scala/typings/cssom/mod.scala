package typings.cssom

import org.scalablytyped.runtime.NumberDictionary
import typings.cssom.anon.Error
import typings.cssom.anon.Expression
import typings.cssom.cssomNumbers.`1001`
import typings.cssom.cssomNumbers.`12`
import typings.cssom.cssomNumbers.`13`
import typings.cssom.cssomNumbers.`1`
import typings.cssom.cssomNumbers.`3`
import typings.cssom.cssomNumbers.`4`
import typings.cssom.cssomNumbers.`5`
import typings.cssom.cssomNumbers.`7`
import typings.cssom.cssomNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cssom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def clone(stylesheet: CSSStyleSheet): CSSStyleSheet = js.native
  
  def parse(token: String): CSSStyleSheet = js.native
  
  @js.native
  class CSSDocumentRule () extends CSSRule {
    
    var cssRules: js.Array[CSSRule] = js.native
    
    var matcher: MatcherList = js.native
    
    @JSName("type")
    val type_CSSDocumentRule: `13` = js.native
  }
  
  @js.native
  class CSSFontFaceRule () extends CSSRule {
    
    var style: CSSStyleDeclaration = js.native
    
    @JSName("type")
    val type_CSSFontFaceRule: `5` = js.native
  }
  
  @js.native
  class CSSHostRule () extends CSSRule {
    
    var cssRules: js.Array[CSSRule] = js.native
    
    @JSName("type")
    val type_CSSHostRule: `1001` = js.native
  }
  
  @js.native
  class CSSImportRule () extends CSSRule {
    
    var href: String = js.native
    
    var media: MediaList = js.native
    
    var styleSheet: CSSStyleSheet = js.native
    
    @JSName("type")
    val type_CSSImportRule: `3` = js.native
  }
  
  @js.native
  class CSSKeyframeRule () extends CSSRule {
    
    var keyText: String = js.native
    
    var style: CSSStyleDeclaration = js.native
    
    @JSName("type")
    val type_CSSKeyframeRule: `8` = js.native
  }
  
  @js.native
  class CSSKeyframesRule () extends CSSRule {
    
    var cssRules: js.Array[CSSRule] = js.native
    
    var name: String = js.native
    
    @JSName("type")
    val type_CSSKeyframesRule: `7` = js.native
  }
  
  @js.native
  class CSSMediaRule () extends CSSRule {
    
    var cssRules: js.Array[CSSRule] = js.native
    
    var media: MediaList = js.native
    
    @JSName("type")
    val type_CSSMediaRule: `4` = js.native
  }
  
  @js.native
  abstract class CSSRule () extends js.Object {
    
    val cssText: String = js.native
    
    var parentRule: CSSRule | Null = js.native
    
    var parentStyleSheet: StyleSheet | Null = js.native
    
    val `type`: Double = js.native
  }
  @js.native
  object CSSRule extends js.Object {
    
    /** @deprecated Obsolete */
    val CHARSET_RULE: /* 2 */ Double = js.native
    
    val COUNTER_STYLE_RULE: /* 11 */ Double = js.native
    
    val DOCUMENT_RULE: /* 13 */ Double = js.native
    
    val FONT_FACE_RULE: /* 5 */ Double = js.native
    
    val FONT_FEATURE_VALUES_RULE: /* 14 */ Double = js.native
    
    val IMPORT_RULE: /* 3 */ Double = js.native
    
    val KEYFRAMES_RULE: /* 7 */ Double = js.native
    
    val KEYFRAME_RULE: /* 8 */ Double = js.native
    
    val MARGIN_RULE: /* 9 */ Double = js.native
    
    val MEDIA_RULE: /* 4 */ Double = js.native
    
    val NAMESPACE_RULE: /* 10 */ Double = js.native
    
    val PAGE_RULE: /* 6 */ Double = js.native
    
    val REGION_STYLE_RULE: /* 16 */ Double = js.native
    
    val STYLE_RULE: /* 1 */ Double = js.native
    
    val SUPPORTS_RULE: /* 12 */ Double = js.native
    
    /** @deprecated Obsolete */
    val UNKNOWN_RULE: /* 0 */ Double = js.native
    
    val VIEWPORT_RULE: /* 15 */ Double = js.native
  }
  
  @js.native
  class CSSStyleDeclaration () extends /* index */ NumberDictionary[String] {
    
    var cssText: String = js.native
    
    def getPropertyPriority(name: String): String = js.native
    
    def getPropertyValue(name: String): String = js.native
    
    var length: Double = js.native
    
    var parentRule: CSSRule | Null = js.native
    
    def removeProperty(name: String): String = js.native
    
    def setProperty(name: String): Unit = js.native
    def setProperty(name: String, value: String): Unit = js.native
    def setProperty(name: String, value: String, priority: String): Unit = js.native
    def setProperty(name: String, value: Null, priority: String): Unit = js.native
  }
  
  @js.native
  class CSSStyleRule () extends CSSRule {
    
    var selectorText: String = js.native
    
    var style: CSSStyleDeclaration = js.native
    
    @JSName("type")
    val type_CSSStyleRule: `1` = js.native
  }
  /* static members */
  @js.native
  object CSSStyleRule extends js.Object {
    
    def parse(ruleText: js.Any): js.Any = js.native
  }
  
  @js.native
  class CSSStyleSheet () extends StyleSheet {
    
    var cssRules: js.Array[CSSRule] = js.native
    
    def deleteRule(index: Double): Unit = js.native
    
    def insertRule(rule: String): Double = js.native
    def insertRule(rule: String, index: Double): Double = js.native
  }
  
  @js.native
  class CSSSupportsRule () extends CSSRule {
    
    var conditionText: String = js.native
    
    var cssRules: js.Array[CSSRule] = js.native
    
    @JSName("type")
    val type_CSSSupportsRule: `12` = js.native
  }
  
  @js.native
  class CSSValue () extends js.Object {
    
    /** @unsupported The getter and setter are currently unimplemented and throw unconditionally. */
    var cssText: String = js.native
  }
  
  @js.native
  class CSSValueExpression protected () extends CSSValue {
    def this(token: String, idx: Double) = this()
    
    def parse(): Error | Expression = js.native
  }
  
  @js.native
  class MatcherList () extends /* index */ NumberDictionary[String] {
    
    def appendMatcher(matcher: String): Unit = js.native
    
    def deleteMatcher(matcher: String): Unit = js.native
    
    var length: Double = js.native
    
    var matcherText: String = js.native
  }
  
  @js.native
  class MediaList () extends /* index */ NumberDictionary[String] {
    
    def appendMedium(medium: String): Unit = js.native
    
    def deleteMedium(medium: String): Unit = js.native
    
    var length: Double = js.native
    
    var mediaText: String = js.native
  }
  
  @js.native
  abstract class StyleSheet () extends js.Object {
    
    var parentStyleSheet: StyleSheet | Null = js.native
  }
}
