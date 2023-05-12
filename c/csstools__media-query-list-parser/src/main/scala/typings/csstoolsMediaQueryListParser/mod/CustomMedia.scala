package typings.csstoolsMediaQueryListParser.mod

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@csstools/media-query-list-parser", "CustomMedia")
@js.native
open class CustomMedia protected ()
  extends typings.csstoolsMediaQueryListParser.distNodesCustomMediaMod.CustomMedia {
  def this(name: js.Array[CSSToken]) = this()
  def this(name: js.Array[CSSToken], mediaQueryList: js.Array[MediaQuery]) = this()
  def this(
    name: js.Array[CSSToken],
    mediaQueryList: js.Array[MediaQuery],
    trueOrFalseKeyword: js.Array[CSSToken]
  ) = this()
  def this(name: js.Array[CSSToken], mediaQueryList: Null, trueOrFalseKeyword: js.Array[CSSToken]) = this()
}
/* static members */
object CustomMedia {
  
  @JSImport("@csstools/media-query-list-parser", "CustomMedia")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCustomMedia(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/custom-media.CustomMedia */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomMedia")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/custom-media.CustomMedia */ Boolean]
}
