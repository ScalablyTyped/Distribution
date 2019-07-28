package typings.commonDashTags.commonDashTagsMod

import org.scalablytyped.runtime.StringDictionary
import typings.commonDashTags.Anon_Conjunction
import typings.commonDashTags.commonDashTagsStrings.Empty
import typings.commonDashTags.commonDashTagsStrings.all
import typings.commonDashTags.commonDashTagsStrings.end
import typings.commonDashTags.commonDashTagsStrings.initial
import typings.commonDashTags.commonDashTagsStrings.left
import typings.commonDashTags.commonDashTagsStrings.right
import typings.commonDashTags.commonDashTagsStrings.start
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-tags", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val codeBlock: TemplateTag = js.native
  val commaLists: TemplateTag = js.native
  val commaListsAnd: TemplateTag = js.native
  val commaListsOr: TemplateTag = js.native
  val html: TemplateTag = js.native
  val id: TemplateTag = js.native
  val inlineLists: TemplateTag = js.native
  val oneLine: TemplateTag = js.native
  val oneLineCommaLists: TemplateTag = js.native
  val oneLineCommaListsAnd: TemplateTag = js.native
  val oneLineCommaListsOr: TemplateTag = js.native
  val oneLineInlineLists: TemplateTag = js.native
  val oneLineTrim: TemplateTag = js.native
  val safeHtml: TemplateTag = js.native
  val source: TemplateTag = js.native
  val stripIndent: TemplateTag = js.native
  val stripIndents: TemplateTag = js.native
  def createTag(): TemplateTag = js.native
  def createTag(transformers: (PluginFunction | TemplateTransformer[_])*): TemplateTag = js.native
  def createTag(transformers: js.Array[TemplateTransformer[_]]): TemplateTag = js.native
  def inlineArrayTransformer(): TemplateTransformer[StringDictionary[_]] = js.native
  def inlineArrayTransformer(opts: Anon_Conjunction): TemplateTransformer[StringDictionary[_]] = js.native
  def replaceResultTransformer(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  def replaceResultTransformer(
    replaceWhat: String,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  def replaceResultTransformer(replaceWhat: RegExp, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  def replaceResultTransformer(
    replaceWhat: RegExp,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  def replaceStringTransformer(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  def replaceStringTransformer(
    replaceWhat: String,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  def replaceStringTransformer(replaceWhat: RegExp, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  def replaceStringTransformer(
    replaceWhat: RegExp,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  def replaceSubstitutionTransformer(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  def replaceSubstitutionTransformer(
    replaceWhat: String,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  def replaceSubstitutionTransformer(replaceWhat: RegExp, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  def replaceSubstitutionTransformer(
    replaceWhat: RegExp,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  def splitStringTransformer(splitBy: String): TemplateTransformer[StringDictionary[_]] = js.native
  def stripIndentTransformer(): TemplateTransformer[StringDictionary[_]] = js.native
  @JSName("stripIndentTransformer")
  def stripIndentTransformer_all(`type`: all): TemplateTransformer[StringDictionary[_]] = js.native
  @JSName("stripIndentTransformer")
  def stripIndentTransformer_initial(`type`: initial): TemplateTransformer[StringDictionary[_]] = js.native
  def trimResultTransformer(): TemplateTransformer[StringDictionary[_]] = js.native
  def trimResultTransformer(side: Empty): TemplateTransformer[StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_end(side: end): TemplateTransformer[StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_left(side: left): TemplateTransformer[StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_right(side: right): TemplateTransformer[StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_start(side: start): TemplateTransformer[StringDictionary[_]] = js.native
}

