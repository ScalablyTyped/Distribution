package typings
package commonDashTagsLib.commonDashTagsMod

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
  def inlineArrayTransformer(): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def inlineArrayTransformer(opts: commonDashTagsLib.Anon_Conjunction): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceResultTransformer(replaceWhat: java.lang.String, replaceWith: java.lang.String): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceResultTransformer(
    replaceWhat: java.lang.String,
    replaceWith: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceResultTransformer(replaceWhat: stdLib.RegExp, replaceWith: java.lang.String): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceResultTransformer(
    replaceWhat: stdLib.RegExp,
    replaceWith: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceStringTransformer(replaceWhat: java.lang.String, replaceWith: java.lang.String): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceStringTransformer(
    replaceWhat: java.lang.String,
    replaceWith: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceStringTransformer(replaceWhat: stdLib.RegExp, replaceWith: java.lang.String): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceStringTransformer(
    replaceWhat: stdLib.RegExp,
    replaceWith: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceSubstitutionTransformer(replaceWhat: java.lang.String, replaceWith: java.lang.String): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceSubstitutionTransformer(
    replaceWhat: java.lang.String,
    replaceWith: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceSubstitutionTransformer(replaceWhat: stdLib.RegExp, replaceWith: java.lang.String): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def replaceSubstitutionTransformer(
    replaceWhat: stdLib.RegExp,
    replaceWith: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def splitStringTransformer(splitBy: java.lang.String): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def stripIndentTransformer(): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("stripIndentTransformer")
  def stripIndentTransformer_all(`type`: commonDashTagsLib.commonDashTagsLibStrings.all): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("stripIndentTransformer")
  def stripIndentTransformer_initial(`type`: commonDashTagsLib.commonDashTagsLibStrings.initial): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def trimResultTransformer(): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def trimResultTransformer(side: commonDashTagsLib.commonDashTagsLibStrings.Empty): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_end(side: commonDashTagsLib.commonDashTagsLibStrings.end): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_left(side: commonDashTagsLib.commonDashTagsLibStrings.left): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_right(side: commonDashTagsLib.commonDashTagsLibStrings.right): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  @JSName("trimResultTransformer")
  def trimResultTransformer_start(side: commonDashTagsLib.commonDashTagsLibStrings.start): TemplateTransformer[org.scalablytyped.runtime.StringDictionary[_]] = js.native
}

