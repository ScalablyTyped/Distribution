package typings.csstoolsMediaQueryListParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@csstools/media-query-list-parser", "MediaCondition")
@js.native
open class MediaCondition protected ()
  extends typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition {
  def this(media: typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAnd) = this()
  def this(media: typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOr) = this()
  def this(media: typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens) = this()
  def this(media: typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNot) = this()
}
/* static members */
object MediaCondition {
  
  @JSImport("@csstools/media-query-list-parser", "MediaCondition")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMediaCondition(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition.MediaCondition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaCondition")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition.MediaCondition */ Boolean]
}
