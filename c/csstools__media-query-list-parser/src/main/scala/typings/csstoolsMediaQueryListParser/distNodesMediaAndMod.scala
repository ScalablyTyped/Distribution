package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ContainerNode
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.Parent
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod._MediaConditionListWithAndWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod._MediaConditionListWithAndWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerParent
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaAndMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-and", "MediaAnd")
  @js.native
  open class MediaAnd protected ()
    extends StObject
       with _MediaAndWalkerParent
       with _MediaConditionListWithAndWalkerEntry
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent {
    def this(modifier: js.Array[CSSToken], media: MediaInParens) = this()
    
    def at(index: String): MediaInParens | Null = js.native
    def at(index: Double): MediaInParens | Null = js.native
    
    def indexOf(item: MediaInParens): Double | String = js.native
    
    def isMediaAnd(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-and.MediaAnd */ Boolean = js.native
    
    var media: MediaInParens = js.native
    
    var modifier: js.Array[CSSToken] = js.native
    
    def toJSON(): Any = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    def walk(cb: js.Function2[/* entry */ Parent, /* index */ Double | String, Boolean | Unit]): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaAnd {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-and", "MediaAnd")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaAnd(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-and.MediaAnd */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaAnd")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-and.MediaAnd */ Boolean]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParensWalkerEntry
    - typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens
  */
  type MediaAndWalkerEntry = _MediaAndWalkerEntry | js.Array[ComponentValue] | ComponentValue
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParensWalkerParent
    - typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAnd
  */
  type MediaAndWalkerParent = _MediaAndWalkerParent | ContainerNode
  
  trait _MediaAndWalkerEntry
    extends StObject
       with _MediaConditionListWithAndWalkerEntry
  
  trait _MediaAndWalkerParent
    extends StObject
       with _MediaConditionListWithAndWalkerParent
}
