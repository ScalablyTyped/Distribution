package typings.csstoolsMediaQueryListParser.mod

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@csstools/media-query-list-parser", "MediaQueryWithType")
@js.native
open class MediaQueryWithType protected ()
  extends typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithType {
  def this(modifier: js.Array[CSSToken], mediaType: js.Array[CSSToken]) = this()
  def this(modifier: js.Array[CSSToken], mediaType: js.Array[CSSToken], and: js.Array[CSSToken]) = this()
  def this(
    modifier: js.Array[CSSToken],
    mediaType: js.Array[CSSToken],
    and: js.Array[CSSToken],
    media: typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition
  ) = this()
  def this(
    modifier: js.Array[CSSToken],
    mediaType: js.Array[CSSToken],
    and: Unit,
    media: typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition
  ) = this()
}
/* static members */
object MediaQueryWithType {
  
  @JSImport("@csstools/media-query-list-parser", "MediaQueryWithType")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMediaQueryWithType(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryWithType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaQueryWithType")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryWithType */ Boolean]
}
