package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenIdent
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaQueryModifierMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-query-modifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait MediaQueryModifier extends StObject
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-query-modifier", "MediaQueryModifier")
  @js.native
  object MediaQueryModifier extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaQueryModifier & String] = js.native
    
    @js.native
    sealed trait Not
      extends StObject
         with MediaQueryModifier
    /* "not" */ val Not: typings.csstoolsMediaQueryListParser.distNodesMediaQueryModifierMod.MediaQueryModifier.Not & String = js.native
    
    @js.native
    sealed trait Only
      extends StObject
         with MediaQueryModifier
    /* "only" */ val Only: typings.csstoolsMediaQueryListParser.distNodesMediaQueryModifierMod.MediaQueryModifier.Only & String = js.native
  }
  
  inline def modifierFromToken(token: TokenIdent): MediaQueryModifier | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("modifierFromToken")(token.asInstanceOf[js.Any]).asInstanceOf[MediaQueryModifier | `false`]
}
