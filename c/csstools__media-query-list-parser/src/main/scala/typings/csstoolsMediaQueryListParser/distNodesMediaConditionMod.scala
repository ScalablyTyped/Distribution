package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ContainerNode
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.NodeMediaConditionWalkerEntry
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAnd
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOr
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNot
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithTypeWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithTypeWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithoutTypeWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithoutTypeWalkerParent
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaConditionMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithoutTypeWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithTypeWalkerEntry because Already inherited */ @JSImport("@csstools/media-query-list-parser/dist/nodes/media-condition", "MediaCondition")
  @js.native
  open class MediaCondition protected ()
    extends StObject
       with _MediaConditionWalkerParent
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent {
    def this(media: MediaConditionListWithAnd) = this()
    def this(media: MediaConditionListWithOr) = this()
    def this(media: MediaInParens) = this()
    def this(media: MediaNot) = this()
    
    def at(index: String): js.UndefOr[MediaNot | MediaInParens | MediaConditionListWithAnd | MediaConditionListWithOr] = js.native
    def at(index: Double): js.UndefOr[MediaNot | MediaInParens | MediaConditionListWithAnd | MediaConditionListWithOr] = js.native
    
    def indexOf(item: MediaConditionListWithAnd): Double | String = js.native
    def indexOf(item: MediaConditionListWithOr): Double | String = js.native
    def indexOf(item: MediaInParens): Double | String = js.native
    def indexOf(item: MediaNot): Double | String = js.native
    
    def isMediaCondition(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition.MediaCondition */ Boolean = js.native
    
    var media: MediaNot | MediaInParens | MediaConditionListWithAnd | MediaConditionListWithOr = js.native
    
    def toJSON(): Any = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    def walk(
      cb: js.Function2[
          /* entry */ NodeMediaConditionWalkerEntry, 
          /* index */ Double | String, 
          Boolean | Unit
        ]
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaCondition {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-condition", "MediaCondition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaCondition(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition.MediaCondition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaCondition")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition.MediaCondition */ Boolean]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNotWalkerEntry
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAndWalkerEntry
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOrWalkerEntry
    - typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNot
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAnd
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOr
  */
  type MediaConditionWalkerEntry = _MediaConditionWalkerEntry | js.Array[ComponentValue] | ComponentValue
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNotWalkerParent
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAndWalkerParent
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOrWalkerParent
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition
  */
  type MediaConditionWalkerParent = _MediaConditionWalkerParent | ContainerNode
  
  trait _MediaConditionWalkerEntry
    extends StObject
       with _MediaQueryWithTypeWalkerEntry
       with _MediaQueryWithoutTypeWalkerEntry
  
  trait _MediaConditionWalkerParent
    extends StObject
       with _MediaQueryWithTypeWalkerParent
       with _MediaQueryWithoutTypeWalkerParent
}
