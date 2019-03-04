package typings
package commonDashTagsLib.commonDashTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-tags", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TemplateTag: commonDashTagsLib.Anon_PluginFunctions = js.native
  val codeBlock: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val commaLists: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val commaListsAnd: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val commaListsOr: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val html: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val id: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val inlineLists: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val oneLine: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val oneLineCommaLists: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val oneLineCommaListsAnd: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val oneLineCommaListsOr: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val oneLineInlineLists: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val oneLineTrim: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val safeHtml: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val source: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val stripIndent: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  val stripIndents: commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  def createTag(): commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  def createTag(
    transformers: (commonDashTagsLib.commonDashTagsMod.PluginFunction | commonDashTagsLib.commonDashTagsMod.TemplateTransformer[_])*
  ): commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  def createTag(transformers: js.Array[commonDashTagsLib.commonDashTagsMod.TemplateTransformer[_]]): commonDashTagsLib.commonDashTagsMod.TemplateTag = js.native
  def inlineArrayTransformer(): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def inlineArrayTransformer(opts: commonDashTagsLib.Anon_Conjunction): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceResultTransformer(replaceWhat: java.lang.String, replaceWith: java.lang.String): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceResultTransformer(
    replaceWhat: java.lang.String,
    replaceWith: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceResultTransformer(replaceWhat: stdLib.RegExp, replaceWith: java.lang.String): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceResultTransformer(
    replaceWhat: stdLib.RegExp,
    replaceWith: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceStringTransformer(replaceWhat: java.lang.String, replaceWith: java.lang.String): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceStringTransformer(
    replaceWhat: java.lang.String,
    replaceWith: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceStringTransformer(replaceWhat: stdLib.RegExp, replaceWith: java.lang.String): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceStringTransformer(
    replaceWhat: stdLib.RegExp,
    replaceWith: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceSubstitutionTransformer(replaceWhat: java.lang.String, replaceWith: java.lang.String): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceSubstitutionTransformer(
    replaceWhat: java.lang.String,
    replaceWith: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceSubstitutionTransformer(replaceWhat: stdLib.RegExp, replaceWith: java.lang.String): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceSubstitutionTransformer(
    replaceWhat: stdLib.RegExp,
    replaceWith: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def splitStringTransformer(splitBy: java.lang.String): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def stripIndentTransformer(): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("stripIndentTransformer")
  def stripIndentTransformer_all(`type`: commonDashTagsLib.commonDashTagsLibStrings.all): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("stripIndentTransformer")
  def stripIndentTransformer_initial(`type`: commonDashTagsLib.commonDashTagsLibStrings.initial): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def trimResultTransformer(): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_(side: commonDashTagsLib.commonDashTagsLibStrings.Empty): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_end(side: commonDashTagsLib.commonDashTagsLibStrings.end): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_left(side: commonDashTagsLib.commonDashTagsLibStrings.left): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_right(side: commonDashTagsLib.commonDashTagsLibStrings.right): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_start(side: commonDashTagsLib.commonDashTagsLibStrings.start): commonDashTagsLib.commonDashTagsMod.TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
}

