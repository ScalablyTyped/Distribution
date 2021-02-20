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
import typings.std.RegExp
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("common-tags", "TemplateTag")
  @js.native
  /**
    * New Tag Constructor
    * @deprecated
    */
  class TemplateTagCls () extends TemplateTag {
    def this(transformers: (PluginFunction | TemplateTransformer[_])*) = this()
    def this(transformers: js.Array[TemplateTransformer[_]]) = this()
  }
  
  @JSImport("common-tags", "codeBlock")
  @js.native
  val codeBlock: TemplateTag = js.native
  
  @JSImport("common-tags", "commaLists")
  @js.native
  val commaLists: TemplateTag = js.native
  
  @JSImport("common-tags", "commaListsAnd")
  @js.native
  val commaListsAnd: TemplateTag = js.native
  
  @JSImport("common-tags", "commaListsOr")
  @js.native
  val commaListsOr: TemplateTag = js.native
  
  @JSImport("common-tags", "createTag")
  @js.native
  def createTag(): TemplateTag = js.native
  @JSImport("common-tags", "createTag")
  @js.native
  def createTag(transformers: (PluginFunction | TemplateTransformer[_])*): TemplateTag = js.native
  @JSImport("common-tags", "createTag")
  @js.native
  def createTag(transformers: js.Array[TemplateTransformer[_]]): TemplateTag = js.native
  
  @JSImport("common-tags", "html")
  @js.native
  val html: TemplateTag = js.native
  
  @JSImport("common-tags", "id")
  @js.native
  val id: TemplateTag = js.native
  
  @JSImport("common-tags", "inlineArrayTransformer")
  @js.native
  def inlineArrayTransformer(): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "inlineArrayTransformer")
  @js.native
  def inlineArrayTransformer(opts: Conjunction): TemplateTransformer[StringDictionary[_]] = js.native
  
  @JSImport("common-tags", "inlineLists")
  @js.native
  val inlineLists: TemplateTag = js.native
  
  @JSImport("common-tags", "oneLine")
  @js.native
  val oneLine: TemplateTag = js.native
  
  @JSImport("common-tags", "oneLineCommaLists")
  @js.native
  val oneLineCommaLists: TemplateTag = js.native
  
  @JSImport("common-tags", "oneLineCommaListsAnd")
  @js.native
  val oneLineCommaListsAnd: TemplateTag = js.native
  
  @JSImport("common-tags", "oneLineCommaListsOr")
  @js.native
  val oneLineCommaListsOr: TemplateTag = js.native
  
  @JSImport("common-tags", "oneLineInlineLists")
  @js.native
  val oneLineInlineLists: TemplateTag = js.native
  
  @JSImport("common-tags", "oneLineTrim")
  @js.native
  val oneLineTrim: TemplateTag = js.native
  
  @JSImport("common-tags", "replaceResultTransformer")
  @js.native
  def replaceResultTransformer(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "replaceResultTransformer")
  @js.native
  def replaceResultTransformer(
    replaceWhat: String,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "replaceResultTransformer")
  @js.native
  def replaceResultTransformer(replaceWhat: RegExp, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "replaceResultTransformer")
  @js.native
  def replaceResultTransformer(
    replaceWhat: RegExp,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  
  @JSImport("common-tags", "replaceStringTransformer")
  @js.native
  def replaceStringTransformer(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "replaceStringTransformer")
  @js.native
  def replaceStringTransformer(
    replaceWhat: String,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "replaceStringTransformer")
  @js.native
  def replaceStringTransformer(replaceWhat: RegExp, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "replaceStringTransformer")
  @js.native
  def replaceStringTransformer(
    replaceWhat: RegExp,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  
  @JSImport("common-tags", "replaceSubstitutionTransformer")
  @js.native
  def replaceSubstitutionTransformer(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "replaceSubstitutionTransformer")
  @js.native
  def replaceSubstitutionTransformer(
    replaceWhat: String,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "replaceSubstitutionTransformer")
  @js.native
  def replaceSubstitutionTransformer(replaceWhat: RegExp, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "replaceSubstitutionTransformer")
  @js.native
  def replaceSubstitutionTransformer(
    replaceWhat: RegExp,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  
  @JSImport("common-tags", "safeHtml")
  @js.native
  val safeHtml: TemplateTag = js.native
  
  @JSImport("common-tags", "source")
  @js.native
  val source: TemplateTag = js.native
  
  @JSImport("common-tags", "splitStringTransformer")
  @js.native
  def splitStringTransformer(splitBy: String): TemplateTransformer[StringDictionary[_]] = js.native
  
  @JSImport("common-tags", "stripIndent")
  @js.native
  val stripIndent: TemplateTag = js.native
  
  @JSImport("common-tags", "stripIndentTransformer")
  @js.native
  def stripIndentTransformer(): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "stripIndentTransformer")
  @js.native
  def stripIndentTransformer_all(`type`: all): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "stripIndentTransformer")
  @js.native
  def stripIndentTransformer_initial(`type`: initial): TemplateTransformer[StringDictionary[_]] = js.native
  
  @JSImport("common-tags", "stripIndents")
  @js.native
  val stripIndents: TemplateTag = js.native
  
  @JSImport("common-tags", "trimResultTransformer")
  @js.native
  def trimResultTransformer(): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "trimResultTransformer")
  @js.native
  def trimResultTransformer(side: _empty): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "trimResultTransformer")
  @js.native
  def trimResultTransformer_end(side: end): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "trimResultTransformer")
  @js.native
  def trimResultTransformer_left(side: left): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "trimResultTransformer")
  @js.native
  def trimResultTransformer_right(side: right): TemplateTransformer[StringDictionary[_]] = js.native
  @JSImport("common-tags", "trimResultTransformer")
  @js.native
  def trimResultTransformer_start(side: start): TemplateTransformer[StringDictionary[_]] = js.native
  
  type JSTag = js.Function2[/* literals */ TemplateStringsArray, /* repeated */ js.Any, String]
  
  type PluginFunction = js.Function2[/* oldValue */ String, /* newValue */ String, TemplateTransformer[js.Any]]
  
  @js.native
  trait TemplateTag extends StObject {
    
    def apply(literals: TemplateStringsArray, placeholders: js.Any*): String = js.native
    def apply(str: String): String = js.native
    def apply(tag: JSTag): TemplateTag = js.native
  }
  
  @js.native
  trait TemplateTransformer[TCtx] extends StObject {
    
    /**
      * Called before everything else.
      * The result of this hook will be passed to other hooks as `context`.
      * If omitted, `context` will be an empty object.
      */
    var getInitialContext: js.UndefOr[js.Function0[TCtx]] = js.native
    
    /**
      * Called when all substitutions have been parsed
      * `endResult` is the final value.
      */
    var onEndResult: js.UndefOr[js.Function2[/* endResult */ String, /* context */ TCtx, String]] = js.native
    
    /**
      * Called when the tag encounters a string.
      * (a string is whatever's not inside "${}" in your template literal)
      * `str` is the value of the current string
      */
    var onString: js.UndefOr[js.Function2[/* str */ String, /* context */ TCtx, String]] = js.native
    
    /**
      * Called when the tag encounters a substitution.
      * (a substitution is whatever's inside "${}" in your template literal)
      * `substitution` is the value of the current substitution
      * `resultSoFar` is the end result up to the point of this substitution
      */
    var onSubstitution: js.UndefOr[
        js.Function3[/* substitution */ String, /* resultSoFar */ String, /* context */ TCtx, String]
      ] = js.native
  }
  object TemplateTransformer {
    
    @scala.inline
    def apply[TCtx](): TemplateTransformer[TCtx] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateTransformer[TCtx]]
    }
    
    @scala.inline
    implicit class TemplateTransformerMutableBuilder[Self <: TemplateTransformer[_], TCtx] (val x: Self with TemplateTransformer[TCtx]) extends AnyVal {
      
      @scala.inline
      def setGetInitialContext(value: () => TCtx): Self = StObject.set(x, "getInitialContext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInitialContextUndefined: Self = StObject.set(x, "getInitialContext", js.undefined)
      
      @scala.inline
      def setOnEndResult(value: (/* endResult */ String, /* context */ TCtx) => String): Self = StObject.set(x, "onEndResult", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEndResultUndefined: Self = StObject.set(x, "onEndResult", js.undefined)
      
      @scala.inline
      def setOnString(value: (/* str */ String, /* context */ TCtx) => String): Self = StObject.set(x, "onString", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStringUndefined: Self = StObject.set(x, "onString", js.undefined)
      
      @scala.inline
      def setOnSubstitution(value: (/* substitution */ String, /* resultSoFar */ String, /* context */ TCtx) => String): Self = StObject.set(x, "onSubstitution", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSubstitutionUndefined: Self = StObject.set(x, "onSubstitution", js.undefined)
    }
  }
}
