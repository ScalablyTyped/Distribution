package typings.csstoolsMediaQueryListParser.mod

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@csstools/media-query-list-parser", "MediaConditionListWithAnd")
@js.native
open class MediaConditionListWithAnd protected ()
  extends typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAnd {
  def this(
    leading: typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens,
    list: js.Array[typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAnd]
  ) = this()
  def this(
    leading: typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens,
    list: js.Array[typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAnd],
    before: js.Array[CSSToken]
  ) = this()
  def this(
    leading: typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens,
    list: js.Array[typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAnd],
    before: js.Array[CSSToken],
    after: js.Array[CSSToken]
  ) = this()
  def this(
    leading: typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens,
    list: js.Array[typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAnd],
    before: Unit,
    after: js.Array[CSSToken]
  ) = this()
}
/* static members */
object MediaConditionListWithAnd {
  
  @JSImport("@csstools/media-query-list-parser", "MediaConditionListWithAnd")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMediaConditionListWithAnd(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithAnd */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaConditionListWithAnd")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithAnd */ Boolean]
}
