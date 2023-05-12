package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ContainerNode
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.Modifier
import typings.csstoolsMediaQueryListParser.anon.NodeMediaOrWalkerEntry
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod._MediaConditionListWithOrWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod._MediaConditionListWithOrWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerParent
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaOrMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithoutTypeWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithTypeWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod._MediaConditionWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod._MediaConditionListWithOrWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaOrMod._MediaOrWalkerParent because Already inherited */ @JSImport("@csstools/media-query-list-parser/dist/nodes/media-or", "MediaOr")
  @js.native
  open class MediaOr protected ()
    extends StObject
       with _MediaConditionListWithOrWalkerEntry
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent {
    def this(modifier: js.Array[CSSToken], media: MediaInParens) = this()
    
    def at(index: String): js.UndefOr[MediaInParens] = js.native
    def at(index: Double): js.UndefOr[MediaInParens] = js.native
    
    def indexOf(item: MediaInParens): Double | String = js.native
    
    def isMediaOr(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-or.MediaOr */ Boolean = js.native
    
    var media: MediaInParens = js.native
    
    var modifier: js.Array[CSSToken] = js.native
    
    def toJSON(): Modifier = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    def walk(cb: js.Function2[/* entry */ NodeMediaOrWalkerEntry, /* index */ Double | String, Boolean | Unit]): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaOr {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-or", "MediaOr")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaOr(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-or.MediaOr */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaOr")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-or.MediaOr */ Boolean]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParensWalkerEntry
    - typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens
  */
  type MediaOrWalkerEntry = _MediaOrWalkerEntry | js.Array[ComponentValue] | ComponentValue
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParensWalkerParent
    - typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOr
  */
  type MediaOrWalkerParent = _MediaOrWalkerParent | ContainerNode
  
  trait _MediaOrWalkerEntry
    extends StObject
       with _MediaConditionListWithOrWalkerEntry
  
  trait _MediaOrWalkerParent
    extends StObject
       with _MediaConditionListWithOrWalkerParent
}
