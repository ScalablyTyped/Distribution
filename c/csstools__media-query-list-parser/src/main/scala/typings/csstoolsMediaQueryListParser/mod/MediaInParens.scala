package typings.csstoolsMediaQueryListParser.mod

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@csstools/media-query-list-parser", "MediaInParens")
@js.native
open class MediaInParens protected ()
  extends typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens {
  def this(media: typings.csstoolsMediaQueryListParser.distNodesGeneralEnclosedMod.GeneralEnclosed) = this()
  def this(media: typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition) = this()
  def this(media: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeature) = this()
  def this(
    media: typings.csstoolsMediaQueryListParser.distNodesGeneralEnclosedMod.GeneralEnclosed,
    before: js.Array[CSSToken]
  ) = this()
  def this(
    media: typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition,
    before: js.Array[CSSToken]
  ) = this()
  def this(
    media: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeature,
    before: js.Array[CSSToken]
  ) = this()
  def this(
    media: typings.csstoolsMediaQueryListParser.distNodesGeneralEnclosedMod.GeneralEnclosed,
    before: js.Array[CSSToken],
    after: js.Array[CSSToken]
  ) = this()
  def this(
    media: typings.csstoolsMediaQueryListParser.distNodesGeneralEnclosedMod.GeneralEnclosed,
    before: Unit,
    after: js.Array[CSSToken]
  ) = this()
  def this(
    media: typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition,
    before: js.Array[CSSToken],
    after: js.Array[CSSToken]
  ) = this()
  def this(
    media: typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition,
    before: Unit,
    after: js.Array[CSSToken]
  ) = this()
  def this(
    media: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeature,
    before: js.Array[CSSToken],
    after: js.Array[CSSToken]
  ) = this()
  def this(
    media: typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeature,
    before: Unit,
    after: js.Array[CSSToken]
  ) = this()
}
/* static members */
object MediaInParens {
  
  @JSImport("@csstools/media-query-list-parser", "MediaInParens")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMediaInParens(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-in-parens.MediaInParens */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaInParens")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-in-parens.MediaInParens */ Boolean]
}
