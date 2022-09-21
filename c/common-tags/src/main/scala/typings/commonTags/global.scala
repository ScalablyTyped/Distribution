package typings.commonTags

import org.scalablytyped.runtime.StringDictionary
import typings.commonTags.anon.Conjunction
import typings.commonTags.commonTagsStrings._empty
import typings.commonTags.commonTagsStrings.all
import typings.commonTags.commonTagsStrings.end
import typings.commonTags.commonTagsStrings.initial
import typings.commonTags.commonTagsStrings.left
import typings.commonTags.commonTagsStrings.right
import typings.commonTags.commonTagsStrings.start
import typings.commonTags.mod.PluginFunction
import typings.commonTags.mod.TemplateTag
import typings.commonTags.mod.TemplateTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object commonTags {
    
    @JSGlobal("commonTags")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("commonTags.TemplateTag")
    @js.native
    /**
      * New Tag Constructor
      * @deprecated
      */
    open class TemplateTagCls ()
      extends StObject
         with TemplateTag {
      def this(transformers: (PluginFunction | TemplateTransformer[Any])*) = this()
      def this(transformers: js.Array[TemplateTransformer[Any]]) = this()
    }
    
    @JSGlobal("commonTags.codeBlock")
    @js.native
    val codeBlock: TemplateTag = js.native
    
    @JSGlobal("commonTags.commaLists")
    @js.native
    val commaLists: TemplateTag = js.native
    
    @JSGlobal("commonTags.commaListsAnd")
    @js.native
    val commaListsAnd: TemplateTag = js.native
    
    @JSGlobal("commonTags.commaListsOr")
    @js.native
    val commaListsOr: TemplateTag = js.native
    
    inline def createTag(): TemplateTag = ^.asInstanceOf[js.Dynamic].applyDynamic("createTag")().asInstanceOf[TemplateTag]
    inline def createTag(transformers: (PluginFunction | TemplateTransformer[Any])*): TemplateTag = ^.asInstanceOf[js.Dynamic].applyDynamic("createTag")(transformers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TemplateTag]
    inline def createTag(transformers: js.Array[TemplateTransformer[Any]]): TemplateTag = ^.asInstanceOf[js.Dynamic].applyDynamic("createTag")(transformers.asInstanceOf[js.Any]).asInstanceOf[TemplateTag]
    
    @JSGlobal("commonTags.html")
    @js.native
    val html: TemplateTag = js.native
    
    @JSGlobal("commonTags.id")
    @js.native
    val id: TemplateTag = js.native
    
    inline def inlineArrayTransformer(): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineArrayTransformer")().asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    inline def inlineArrayTransformer(opts: Conjunction): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineArrayTransformer")(opts.asInstanceOf[js.Any]).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    
    @JSGlobal("commonTags.inlineLists")
    @js.native
    val inlineLists: TemplateTag = js.native
    
    @JSGlobal("commonTags.oneLine")
    @js.native
    val oneLine: TemplateTag = js.native
    
    @JSGlobal("commonTags.oneLineCommaLists")
    @js.native
    val oneLineCommaLists: TemplateTag = js.native
    
    @JSGlobal("commonTags.oneLineCommaListsAnd")
    @js.native
    val oneLineCommaListsAnd: TemplateTag = js.native
    
    @JSGlobal("commonTags.oneLineCommaListsOr")
    @js.native
    val oneLineCommaListsOr: TemplateTag = js.native
    
    @JSGlobal("commonTags.oneLineInlineLists")
    @js.native
    val oneLineInlineLists: TemplateTag = js.native
    
    @JSGlobal("commonTags.oneLineTrim")
    @js.native
    val oneLineTrim: TemplateTag = js.native
    
    inline def replaceResultTransformer(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceResultTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    inline def replaceResultTransformer(replaceWhat: String, replaceWith: js.Function2[/* substring */ String, /* repeated */ Any, String]): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceResultTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    inline def replaceResultTransformer(replaceWhat: js.RegExp, replaceWith: String): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceResultTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    inline def replaceResultTransformer(
      replaceWhat: js.RegExp,
      replaceWith: js.Function2[/* substring */ String, /* repeated */ Any, String]
    ): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceResultTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    
    inline def replaceStringTransformer(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStringTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    inline def replaceStringTransformer(replaceWhat: String, replaceWith: js.Function2[/* substring */ String, /* repeated */ Any, String]): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStringTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    inline def replaceStringTransformer(replaceWhat: js.RegExp, replaceWith: String): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStringTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    inline def replaceStringTransformer(
      replaceWhat: js.RegExp,
      replaceWith: js.Function2[/* substring */ String, /* repeated */ Any, String]
    ): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStringTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    
    inline def replaceSubstitutionTransformer(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSubstitutionTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    inline def replaceSubstitutionTransformer(replaceWhat: String, replaceWith: js.Function2[/* substring */ String, /* repeated */ Any, String]): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSubstitutionTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    inline def replaceSubstitutionTransformer(replaceWhat: js.RegExp, replaceWith: String): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSubstitutionTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    inline def replaceSubstitutionTransformer(
      replaceWhat: js.RegExp,
      replaceWith: js.Function2[/* substring */ String, /* repeated */ Any, String]
    ): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSubstitutionTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    
    @JSGlobal("commonTags.safeHtml")
    @js.native
    val safeHtml: TemplateTag = js.native
    
    @JSGlobal("commonTags.source")
    @js.native
    val source: TemplateTag = js.native
    
    inline def splitStringTransformer(splitBy: String): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitStringTransformer")(splitBy.asInstanceOf[js.Any]).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    
    @JSGlobal("commonTags.stripIndent")
    @js.native
    val stripIndent: TemplateTag = js.native
    
    inline def stripIndentTransformer(): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripIndentTransformer")().asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    inline def stripIndentTransformer(`type`: initial | all): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripIndentTransformer")(`type`.asInstanceOf[js.Any]).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    
    @JSGlobal("commonTags.stripIndents")
    @js.native
    val stripIndents: TemplateTag = js.native
    
    inline def trimResultTransformer(): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("trimResultTransformer")().asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
    inline def trimResultTransformer(side: start | end | left | right | _empty): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("trimResultTransformer")(side.asInstanceOf[js.Any]).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  }
}
