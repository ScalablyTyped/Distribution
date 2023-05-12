package typings.csstoolsMediaQueryListParser.mod

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@csstools/media-query-list-parser", "MediaAnd")
@js.native
open class MediaAnd protected ()
  extends typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAnd {
  def this(
    modifier: js.Array[CSSToken],
    media: typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens
  ) = this()
}
/* static members */
object MediaAnd {
  
  @JSImport("@csstools/media-query-list-parser", "MediaAnd")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMediaAnd(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-and.MediaAnd */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaAnd")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-and.MediaAnd */ Boolean]
}
