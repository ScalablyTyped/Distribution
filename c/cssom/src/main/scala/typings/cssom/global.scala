package typings.cssom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CSSOM {
    
    @JSGlobal("CSSOM")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CSSOM.CSSDocumentRule")
    @js.native
    open class CSSDocumentRule ()
      extends typings.cssom.mod.CSSDocumentRule
    
    @JSGlobal("CSSOM.CSSFontFaceRule")
    @js.native
    open class CSSFontFaceRule ()
      extends typings.cssom.mod.CSSFontFaceRule
    
    @JSGlobal("CSSOM.CSSHostRule")
    @js.native
    open class CSSHostRule ()
      extends typings.cssom.mod.CSSHostRule
    
    @JSGlobal("CSSOM.CSSImportRule")
    @js.native
    open class CSSImportRule ()
      extends typings.cssom.mod.CSSImportRule
    
    @JSGlobal("CSSOM.CSSKeyframeRule")
    @js.native
    open class CSSKeyframeRule ()
      extends typings.cssom.mod.CSSKeyframeRule
    
    @JSGlobal("CSSOM.CSSKeyframesRule")
    @js.native
    open class CSSKeyframesRule ()
      extends typings.cssom.mod.CSSKeyframesRule
    
    @JSGlobal("CSSOM.CSSMediaRule")
    @js.native
    open class CSSMediaRule ()
      extends typings.cssom.mod.CSSMediaRule
    
    @JSGlobal("CSSOM.CSSRule")
    @js.native
    abstract class CSSRule ()
      extends typings.cssom.mod.CSSRule
    object CSSRule {
      
      /** @deprecated Obsolete */
      @JSGlobal("CSSOM.CSSRule.CHARSET_RULE")
      @js.native
      val CHARSET_RULE: /* 2 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.COUNTER_STYLE_RULE")
      @js.native
      val COUNTER_STYLE_RULE: /* 11 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.DOCUMENT_RULE")
      @js.native
      val DOCUMENT_RULE: /* 13 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.FONT_FACE_RULE")
      @js.native
      val FONT_FACE_RULE: /* 5 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.FONT_FEATURE_VALUES_RULE")
      @js.native
      val FONT_FEATURE_VALUES_RULE: /* 14 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.IMPORT_RULE")
      @js.native
      val IMPORT_RULE: /* 3 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.KEYFRAMES_RULE")
      @js.native
      val KEYFRAMES_RULE: /* 7 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.KEYFRAME_RULE")
      @js.native
      val KEYFRAME_RULE: /* 8 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.MARGIN_RULE")
      @js.native
      val MARGIN_RULE: /* 9 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.MEDIA_RULE")
      @js.native
      val MEDIA_RULE: /* 4 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.NAMESPACE_RULE")
      @js.native
      val NAMESPACE_RULE: /* 10 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.PAGE_RULE")
      @js.native
      val PAGE_RULE: /* 6 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.REGION_STYLE_RULE")
      @js.native
      val REGION_STYLE_RULE: /* 16 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.STYLE_RULE")
      @js.native
      val STYLE_RULE: /* 1 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.SUPPORTS_RULE")
      @js.native
      val SUPPORTS_RULE: /* 12 */ Double = js.native
      
      /** @deprecated Obsolete */
      @JSGlobal("CSSOM.CSSRule.UNKNOWN_RULE")
      @js.native
      val UNKNOWN_RULE: /* 0 */ Double = js.native
      
      @JSGlobal("CSSOM.CSSRule.VIEWPORT_RULE")
      @js.native
      val VIEWPORT_RULE: /* 15 */ Double = js.native
    }
    
    @JSGlobal("CSSOM.CSSStyleDeclaration")
    @js.native
    open class CSSStyleDeclaration ()
      extends typings.cssom.mod.CSSStyleDeclaration
    
    @JSGlobal("CSSOM.CSSStyleRule")
    @js.native
    open class CSSStyleRule ()
      extends typings.cssom.mod.CSSStyleRule
    /* static members */
    object CSSStyleRule {
      
      @JSGlobal("CSSOM.CSSStyleRule")
      @js.native
      val ^ : js.Any = js.native
      
      inline def parse(ruleText: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(ruleText.asInstanceOf[js.Any]).asInstanceOf[Any]
    }
    
    @JSGlobal("CSSOM.CSSStyleSheet")
    @js.native
    open class CSSStyleSheet ()
      extends typings.cssom.mod.CSSStyleSheet
    
    @JSGlobal("CSSOM.CSSSupportsRule")
    @js.native
    open class CSSSupportsRule ()
      extends typings.cssom.mod.CSSSupportsRule
    
    @JSGlobal("CSSOM.CSSValue")
    @js.native
    open class CSSValue ()
      extends typings.cssom.mod.CSSValue
    
    @JSGlobal("CSSOM.CSSValueExpression")
    @js.native
    open class CSSValueExpression protected ()
      extends typings.cssom.mod.CSSValueExpression {
      def this(token: String, idx: Double) = this()
    }
    
    @JSGlobal("CSSOM.MatcherList")
    @js.native
    open class MatcherList ()
      extends typings.cssom.mod.MatcherList
    
    @JSGlobal("CSSOM.MediaList")
    @js.native
    open class MediaList ()
      extends typings.cssom.mod.MediaList
    
    @JSGlobal("CSSOM.StyleSheet")
    @js.native
    abstract class StyleSheet ()
      extends typings.cssom.mod.StyleSheet
    
    inline def clone_(stylesheet: typings.cssom.mod.CSSStyleSheet): typings.cssom.mod.CSSStyleSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(stylesheet.asInstanceOf[js.Any]).asInstanceOf[typings.cssom.mod.CSSStyleSheet]
    
    inline def parse(token: String): typings.cssom.mod.CSSStyleSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(token.asInstanceOf[js.Any]).asInstanceOf[typings.cssom.mod.CSSStyleSheet]
  }
}
