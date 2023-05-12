package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenIdent
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaTypeMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait MediaType extends StObject
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-type", "MediaType")
  @js.native
  object MediaType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaType & String] = js.native
    
    /** Always matches */
    @js.native
    sealed trait All
      extends StObject
         with MediaType
    /* "all" */ val All: typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType.All & String = js.native
    
    /** Never matches */
    @js.native
    sealed trait Aural
      extends StObject
         with MediaType
    /* "aural" */ val Aural: typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType.Aural & String = js.native
    
    /** Never matches */
    @js.native
    sealed trait Braille
      extends StObject
         with MediaType
    /* "braille" */ val Braille: typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType.Braille & String = js.native
    
    /** Never matches */
    @js.native
    sealed trait Embossed
      extends StObject
         with MediaType
    /* "embossed" */ val Embossed: typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType.Embossed & String = js.native
    
    /** Never matches */
    @js.native
    sealed trait Handheld
      extends StObject
         with MediaType
    /* "handheld" */ val Handheld: typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType.Handheld & String = js.native
    
    @js.native
    sealed trait Print
      extends StObject
         with MediaType
    /* "print" */ val Print: typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType.Print & String = js.native
    
    /** Never matches */
    @js.native
    sealed trait Projection
      extends StObject
         with MediaType
    /* "projection" */ val Projection: typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType.Projection & String = js.native
    
    @js.native
    sealed trait Screen
      extends StObject
         with MediaType
    /* "screen" */ val Screen: typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType.Screen & String = js.native
    
    /** Never matches */
    @js.native
    sealed trait Speech
      extends StObject
         with MediaType
    /* "speech" */ val Speech: typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType.Speech & String = js.native
    
    /** Never matches */
    @js.native
    sealed trait Tty
      extends StObject
         with MediaType
    /* "tty" */ val Tty: typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType.Tty & String = js.native
    
    /** Never matches */
    @js.native
    sealed trait Tv
      extends StObject
         with MediaType
    /* "tv" */ val Tv: typings.csstoolsMediaQueryListParser.distNodesMediaTypeMod.MediaType.Tv & String = js.native
  }
  
  inline def typeFromToken(token: TokenIdent): MediaType | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("typeFromToken")(token.asInstanceOf[js.Any]).asInstanceOf[MediaType | `false`]
}
