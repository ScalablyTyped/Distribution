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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cssom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cssom", "CSSDocumentRule")
  @js.native
  class CSSDocumentRule () extends CSSRule {
    
    var cssRules: js.Array[CSSRule] = js.native
    
    var matcher: MatcherList = js.native
    
    @JSName("type")
    val type_CSSDocumentRule: `13` = js.native
  }
  
  @JSImport("cssom", "CSSFontFaceRule")
  @js.native
  class CSSFontFaceRule () extends CSSRule {
    
    var style: CSSStyleDeclaration = js.native
    
    @JSName("type")
    val type_CSSFontFaceRule: `5` = js.native
  }
  
  @JSImport("cssom", "CSSHostRule")
  @js.native
  class CSSHostRule () extends CSSRule {
    
    var cssRules: js.Array[CSSRule] = js.native
    
    @JSName("type")
    val type_CSSHostRule: `1001` = js.native
  }
  
  @JSImport("cssom", "CSSImportRule")
  @js.native
  class CSSImportRule () extends CSSRule {
    
    var href: String = js.native
    
    var media: MediaList = js.native
    
    var styleSheet: CSSStyleSheet = js.native
    
    @JSName("type")
    val type_CSSImportRule: `3` = js.native
  }
  
  @JSImport("cssom", "CSSKeyframeRule")
  @js.native
  class CSSKeyframeRule () extends CSSRule {
    
    var keyText: String = js.native
    
    var style: CSSStyleDeclaration = js.native
    
    @JSName("type")
    val type_CSSKeyframeRule: `8` = js.native
  }
  
  @JSImport("cssom", "CSSKeyframesRule")
  @js.native
  class CSSKeyframesRule () extends CSSRule {
    
    var cssRules: js.Array[CSSRule] = js.native
    
    var name: String = js.native
    
    @JSName("type")
    val type_CSSKeyframesRule: `7` = js.native
  }
  
  @JSImport("cssom", "CSSMediaRule")
  @js.native
  class CSSMediaRule () extends CSSRule {
    
    var cssRules: js.Array[CSSRule] = js.native
    
    var media: MediaList = js.native
    
    @JSName("type")
    val type_CSSMediaRule: `4` = js.native
  }
  
  @JSImport("cssom", "CSSRule")
  @js.native
  abstract class CSSRule () extends StObject {
    
    val cssText: String = js.native
    
    var parentRule: CSSRule | Null = js.native
    
    var parentStyleSheet: StyleSheet | Null = js.native
    
    val `type`: Double = js.native
  }
  object CSSRule {
    
    /** @deprecated Obsolete */
    @JSImport("cssom", "CSSRule.CHARSET_RULE")
    @js.native
    val CHARSET_RULE: /* 2 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.COUNTER_STYLE_RULE")
    @js.native
    val COUNTER_STYLE_RULE: /* 11 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.DOCUMENT_RULE")
    @js.native
    val DOCUMENT_RULE: /* 13 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.FONT_FACE_RULE")
    @js.native
    val FONT_FACE_RULE: /* 5 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.FONT_FEATURE_VALUES_RULE")
    @js.native
    val FONT_FEATURE_VALUES_RULE: /* 14 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.IMPORT_RULE")
    @js.native
    val IMPORT_RULE: /* 3 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.KEYFRAMES_RULE")
    @js.native
    val KEYFRAMES_RULE: /* 7 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.KEYFRAME_RULE")
    @js.native
    val KEYFRAME_RULE: /* 8 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.MARGIN_RULE")
    @js.native
    val MARGIN_RULE: /* 9 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.MEDIA_RULE")
    @js.native
    val MEDIA_RULE: /* 4 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.NAMESPACE_RULE")
    @js.native
    val NAMESPACE_RULE: /* 10 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.PAGE_RULE")
    @js.native
    val PAGE_RULE: /* 6 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.REGION_STYLE_RULE")
    @js.native
    val REGION_STYLE_RULE: /* 16 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.STYLE_RULE")
    @js.native
    val STYLE_RULE: /* 1 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.SUPPORTS_RULE")
    @js.native
    val SUPPORTS_RULE: /* 12 */ Double = js.native
    
    /** @deprecated Obsolete */
    @JSImport("cssom", "CSSRule.UNKNOWN_RULE")
    @js.native
    val UNKNOWN_RULE: /* 0 */ Double = js.native
    
    @JSImport("cssom", "CSSRule.VIEWPORT_RULE")
    @js.native
    val VIEWPORT_RULE: /* 15 */ Double = js.native
  }
  
  @JSImport("cssom", "CSSStyleDeclaration")
  @js.native
  class CSSStyleDeclaration ()
    extends StObject
       with /* index */ NumberDictionary[String] {
    
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
  
  @JSImport("cssom", "CSSStyleRule")
  @js.native
  class CSSStyleRule () extends CSSRule {
    
    var selectorText: String = js.native
    
    var style: CSSStyleDeclaration = js.native
    
    @JSName("type")
    val type_CSSStyleRule: `1` = js.native
  }
  /* static members */
  object CSSStyleRule {
    
    @JSImport("cssom", "CSSStyleRule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(ruleText: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(ruleText.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @JSImport("cssom", "CSSStyleSheet")
  @js.native
  class CSSStyleSheet () extends StyleSheet {
    
    var cssRules: js.Array[CSSRule] = js.native
    
    def deleteRule(index: Double): Unit = js.native
    
    def insertRule(rule: String): Double = js.native
    def insertRule(rule: String, index: Double): Double = js.native
  }
  
  @JSImport("cssom", "CSSSupportsRule")
  @js.native
  class CSSSupportsRule () extends CSSRule {
    
    var conditionText: String = js.native
    
    var cssRules: js.Array[CSSRule] = js.native
    
    @JSName("type")
    val type_CSSSupportsRule: `12` = js.native
  }
  
  @JSImport("cssom", "CSSValue")
  @js.native
  class CSSValue () extends StObject {
    
    /** @unsupported The getter and setter are currently unimplemented and throw unconditionally. */
    var cssText: String = js.native
  }
  
  @JSImport("cssom", "CSSValueExpression")
  @js.native
  class CSSValueExpression protected () extends CSSValue {
    def this(token: String, idx: Double) = this()
    
    def parse(): Error | Expression = js.native
  }
  
  @JSImport("cssom", "MatcherList")
  @js.native
  class MatcherList ()
    extends StObject
       with /* index */ NumberDictionary[String] {
    
    def appendMatcher(matcher: String): Unit = js.native
    
    def deleteMatcher(matcher: String): Unit = js.native
    
    var length: Double = js.native
    
    var matcherText: String = js.native
  }
  
  @JSImport("cssom", "MediaList")
  @js.native
  class MediaList ()
    extends StObject
       with /* index */ NumberDictionary[String] {
    
    def appendMedium(medium: String): Unit = js.native
    
    def deleteMedium(medium: String): Unit = js.native
    
    var length: Double = js.native
    
    var mediaText: String = js.native
  }
  
  @JSImport("cssom", "StyleSheet")
  @js.native
  abstract class StyleSheet () extends StObject {
    
    var parentStyleSheet: StyleSheet | Null = js.native
  }
  
  inline def clone_(stylesheet: CSSStyleSheet): CSSStyleSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(stylesheet.asInstanceOf[js.Any]).asInstanceOf[CSSStyleSheet]
  
  inline def parse(token: String): CSSStyleSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(token.asInstanceOf[js.Any]).asInstanceOf[CSSStyleSheet]
}
