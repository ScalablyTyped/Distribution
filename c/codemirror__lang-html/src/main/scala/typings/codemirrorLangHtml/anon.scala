package typings.codemirrorLangHtml

import typings.codemirrorLangHtml.mod.NestedAttr
import typings.codemirrorLangHtml.mod.NestedLang
import typings.codemirrorLangHtml.mod.TagSpec
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoCloseTags extends StObject {
    
    /**
      Determines whether [`autoCloseTags`](https://codemirror.net/6/docs/ref/#lang-html.autoCloseTags)
      is included in the support extensions. Defaults to true.
      */
    var autoCloseTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      Add additional completable attributes to all tags.
      */
    var extraGlobalAttributes: js.UndefOr[Record[String, Null | js.Array[String]]] = js.undefined
    
    /**
      Add additional tags that can be completed.
      */
    var extraTags: js.UndefOr[Record[String, TagSpec]] = js.undefined
    
    /**
      By default, the syntax tree will highlight mismatched closing
      tags. Set this to `false` to turn that off (for example when you
      expect to only be parsing a fragment of HTML text, not a full
      document).
      */
    var matchClosingTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      Register additional languages to parse attribute values with.
      */
    var nestedAttributes: js.UndefOr[js.Array[NestedAttr]] = js.undefined
    
    /**
      Register additional languages to parse the content of specific
      tags. If given, `attrs` should be a function that, given an
      object representing the tag's attributes, returns `true` if this
      language applies.
      */
    var nestedLanguages: js.UndefOr[js.Array[NestedLang]] = js.undefined
    
    var selfClosingTags: js.UndefOr[Boolean] = js.undefined
  }
  object AutoCloseTags {
    
    inline def apply(): AutoCloseTags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoCloseTags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoCloseTags] (val x: Self) extends AnyVal {
      
      inline def setAutoCloseTags(value: Boolean): Self = StObject.set(x, "autoCloseTags", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseTagsUndefined: Self = StObject.set(x, "autoCloseTags", js.undefined)
      
      inline def setExtraGlobalAttributes(value: Record[String, Null | js.Array[String]]): Self = StObject.set(x, "extraGlobalAttributes", value.asInstanceOf[js.Any])
      
      inline def setExtraGlobalAttributesUndefined: Self = StObject.set(x, "extraGlobalAttributes", js.undefined)
      
      inline def setExtraTags(value: Record[String, TagSpec]): Self = StObject.set(x, "extraTags", value.asInstanceOf[js.Any])
      
      inline def setExtraTagsUndefined: Self = StObject.set(x, "extraTags", js.undefined)
      
      inline def setMatchClosingTags(value: Boolean): Self = StObject.set(x, "matchClosingTags", value.asInstanceOf[js.Any])
      
      inline def setMatchClosingTagsUndefined: Self = StObject.set(x, "matchClosingTags", js.undefined)
      
      inline def setNestedAttributes(value: js.Array[NestedAttr]): Self = StObject.set(x, "nestedAttributes", value.asInstanceOf[js.Any])
      
      inline def setNestedAttributesUndefined: Self = StObject.set(x, "nestedAttributes", js.undefined)
      
      inline def setNestedAttributesVarargs(value: NestedAttr*): Self = StObject.set(x, "nestedAttributes", js.Array(value*))
      
      inline def setNestedLanguages(value: js.Array[NestedLang]): Self = StObject.set(x, "nestedLanguages", value.asInstanceOf[js.Any])
      
      inline def setNestedLanguagesUndefined: Self = StObject.set(x, "nestedLanguages", js.undefined)
      
      inline def setNestedLanguagesVarargs(value: NestedLang*): Self = StObject.set(x, "nestedLanguages", js.Array(value*))
      
      inline def setSelfClosingTags(value: Boolean): Self = StObject.set(x, "selfClosingTags", value.asInstanceOf[js.Any])
      
      inline def setSelfClosingTagsUndefined: Self = StObject.set(x, "selfClosingTags", js.undefined)
    }
  }
  
  trait ExtraGlobalAttributes extends StObject {
    
    /**
      Add global attributes that are available on all tags.
      */
    var extraGlobalAttributes: js.UndefOr[Record[String, Null | js.Array[String]]] = js.undefined
    
    /**
      Define extra tag names to complete.
      */
    var extraTags: js.UndefOr[Record[String, TagSpec]] = js.undefined
  }
  object ExtraGlobalAttributes {
    
    inline def apply(): ExtraGlobalAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtraGlobalAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtraGlobalAttributes] (val x: Self) extends AnyVal {
      
      inline def setExtraGlobalAttributes(value: Record[String, Null | js.Array[String]]): Self = StObject.set(x, "extraGlobalAttributes", value.asInstanceOf[js.Any])
      
      inline def setExtraGlobalAttributesUndefined: Self = StObject.set(x, "extraGlobalAttributes", js.undefined)
      
      inline def setExtraTags(value: Record[String, TagSpec]): Self = StObject.set(x, "extraTags", value.asInstanceOf[js.Any])
      
      inline def setExtraTagsUndefined: Self = StObject.set(x, "extraTags", js.undefined)
    }
  }
}
