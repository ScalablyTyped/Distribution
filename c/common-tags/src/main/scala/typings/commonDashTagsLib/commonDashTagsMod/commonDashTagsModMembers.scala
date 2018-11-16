package typings
package commonDashTagsLib.commonDashTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-tags", JSImport.Namespace)
@js.native
object commonDashTagsModMembers extends js.Object {
  var TemplateTag: commonDashTagsLib.Anon_Transformers = js.native
  var codeBlock: TemplateTag = js.native
  var commaLists: TemplateTag = js.native
  var commaListsAnd: TemplateTag = js.native
  var commaListsOr: TemplateTag = js.native
  var html: TemplateTag = js.native
  var inlineArrayTransformer: js.Function1[/* opts */ js.UndefOr[commonDashTagsLib.Anon_Conjunction], TemplateTransformer] = js.native
  var inlineLists: TemplateTag = js.native
  var oneLine: TemplateTag = js.native
  var oneLineCommaLists: TemplateTag = js.native
  var oneLineCommaListsAnd: TemplateTag = js.native
  var oneLineCommaListsOr: TemplateTag = js.native
  var oneLineInlineLists: TemplateTag = js.native
  var oneLineTrim: TemplateTag = js.native
  var replaceResultTransformer: js.Function2[
    /* replaceWhat */ java.lang.String | stdLib.RegExp, 
    /* replaceWith */ java.lang.String, 
    TemplateTransformer
  ] = js.native
  var replaceSubstitutionTransformer: js.Function2[
    /* replaceWhat */ java.lang.String | stdLib.RegExp, 
    /* replaceWith */ java.lang.String, 
    TemplateTransformer
  ] = js.native
  var safeHtml: TemplateTag = js.native
  var source: TemplateTag = js.native
  var splitStringTransformer: js.Function1[/* splitBy */ java.lang.String, TemplateTransformer] = js.native
  var stripIndent: TemplateTag = js.native
  var stripIndentTransformer: js.Function1[
    /* type */ js.UndefOr[
      commonDashTagsLib.commonDashTagsLibStrings.initial | commonDashTagsLib.commonDashTagsLibStrings.all
    ], 
    TemplateTransformer
  ] = js.native
  var stripIndents: TemplateTag = js.native
  var trimResultTransformer: js.Function1[
    /* side */ js.UndefOr[
      commonDashTagsLib.commonDashTagsLibStrings.left | commonDashTagsLib.commonDashTagsLibStrings.right
    ], 
    TemplateTransformer
  ] = js.native
}

