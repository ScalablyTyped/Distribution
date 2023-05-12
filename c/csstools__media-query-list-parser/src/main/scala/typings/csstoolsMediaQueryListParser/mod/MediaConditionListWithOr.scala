package typings.csstoolsMediaQueryListParser.mod

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@csstools/media-query-list-parser", "MediaConditionListWithOr")
@js.native
open class MediaConditionListWithOr protected ()
  extends typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOr {
  def this(
    leading: typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens,
    list: js.Array[typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOr]
  ) = this()
  def this(
    leading: typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens,
    list: js.Array[typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOr],
    before: js.Array[CSSToken]
  ) = this()
  def this(
    leading: typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens,
    list: js.Array[typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOr],
    before: js.Array[CSSToken],
    after: js.Array[CSSToken]
  ) = this()
  def this(
    leading: typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens,
    list: js.Array[typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOr],
    before: Unit,
    after: js.Array[CSSToken]
  ) = this()
}
/* static members */
object MediaConditionListWithOr {
  
  @JSImport("@csstools/media-query-list-parser", "MediaConditionListWithOr")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMediaConditionListWithOr(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithOr */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaConditionListWithOr")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithOr */ Boolean]
}
