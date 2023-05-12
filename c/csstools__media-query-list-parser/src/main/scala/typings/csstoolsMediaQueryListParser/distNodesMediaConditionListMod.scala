package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ContainerNode
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.NodeMediaConditionListWithOrWalkerEntry
import typings.csstoolsMediaQueryListParser.anon.NodeParent
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAnd
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod._MediaConditionWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod._MediaConditionWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOr
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaConditionListMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithoutTypeWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithTypeWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithoutTypeWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithTypeWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod._MediaConditionWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod._MediaConditionWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod._MediaConditionListWithAndWalkerParent because Already inherited */ @JSImport("@csstools/media-query-list-parser/dist/nodes/media-condition-list", "MediaConditionListWithAnd")
  @js.native
  open class MediaConditionListWithAnd protected ()
    extends StObject
       with MediaConditionList {
    def this(leading: MediaInParens, list: js.Array[MediaAnd]) = this()
    def this(leading: MediaInParens, list: js.Array[MediaAnd], before: js.Array[CSSToken]) = this()
    def this(
      leading: MediaInParens,
      list: js.Array[MediaAnd],
      before: js.Array[CSSToken],
      after: js.Array[CSSToken]
    ) = this()
    def this(leading: MediaInParens, list: js.Array[MediaAnd], before: Unit, after: js.Array[CSSToken]) = this()
    
    var after: js.Array[CSSToken] = js.native
    
    def at(index: String): js.UndefOr[MediaInParens | MediaAnd] = js.native
    def at(index: Double): js.UndefOr[MediaInParens | MediaAnd] = js.native
    
    var before: js.Array[CSSToken] = js.native
    
    def indexOf(item: MediaAnd): Double | String = js.native
    def indexOf(item: MediaInParens): Double | String = js.native
    
    def isMediaConditionListWithAnd(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithAnd */ Boolean = js.native
    
    var leading: MediaInParens = js.native
    
    var list: js.Array[MediaAnd] = js.native
    
    def toJSON(): Any = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    def walk(cb: js.Function2[/* entry */ NodeParent, /* index */ Double | String, Boolean | Unit]): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaConditionListWithAnd {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-condition-list", "MediaConditionListWithAnd")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaConditionListWithAnd(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithAnd */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaConditionListWithAnd")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithAnd */ Boolean]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithoutTypeWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithTypeWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithoutTypeWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithTypeWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod._MediaConditionWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod._MediaConditionWalkerEntry because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod._MediaConditionListWithOrWalkerParent because Already inherited */ @JSImport("@csstools/media-query-list-parser/dist/nodes/media-condition-list", "MediaConditionListWithOr")
  @js.native
  open class MediaConditionListWithOr protected ()
    extends StObject
       with MediaConditionList {
    def this(leading: MediaInParens, list: js.Array[MediaOr]) = this()
    def this(leading: MediaInParens, list: js.Array[MediaOr], before: js.Array[CSSToken]) = this()
    def this(
      leading: MediaInParens,
      list: js.Array[MediaOr],
      before: js.Array[CSSToken],
      after: js.Array[CSSToken]
    ) = this()
    def this(leading: MediaInParens, list: js.Array[MediaOr], before: Unit, after: js.Array[CSSToken]) = this()
    
    var after: js.Array[CSSToken] = js.native
    
    def at(index: String): js.UndefOr[MediaInParens | MediaOr] = js.native
    def at(index: Double): js.UndefOr[MediaInParens | MediaOr] = js.native
    
    var before: js.Array[CSSToken] = js.native
    
    def indexOf(item: MediaInParens): Double | String = js.native
    def indexOf(item: MediaOr): Double | String = js.native
    
    def isMediaConditionListWithOr(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithOr */ Boolean = js.native
    
    var leading: MediaInParens = js.native
    
    var list: js.Array[MediaOr] = js.native
    
    def toJSON(): Any = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    def walk(
      cb: js.Function2[
          /* entry */ NodeMediaConditionListWithOrWalkerEntry, 
          /* index */ Double | String, 
          Boolean | Unit
        ]
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaConditionListWithOr {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-condition-list", "MediaConditionListWithOr")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaConditionListWithOr(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithOr */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaConditionListWithOr")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-condition-list.MediaConditionListWithOr */ Boolean]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAnd
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOr
  */
  trait MediaConditionList
    extends StObject
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAndWalkerEntry
    - typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAnd
  */
  type MediaConditionListWithAndWalkerEntry = _MediaConditionListWithAndWalkerEntry | js.Array[ComponentValue] | ComponentValue
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAndWalkerParent
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAnd
  */
  type MediaConditionListWithAndWalkerParent = _MediaConditionListWithAndWalkerParent | ContainerNode
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOrWalkerEntry
    - typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOr
  */
  type MediaConditionListWithOrWalkerEntry = _MediaConditionListWithOrWalkerEntry | js.Array[ComponentValue] | ComponentValue
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOrWalkerParent
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOr
  */
  type MediaConditionListWithOrWalkerParent = _MediaConditionListWithOrWalkerParent | ContainerNode
  
  trait _MediaConditionListWithAndWalkerEntry
    extends StObject
       with _MediaConditionWalkerEntry
  
  trait _MediaConditionListWithAndWalkerParent
    extends StObject
       with _MediaConditionWalkerParent
  
  trait _MediaConditionListWithOrWalkerEntry
    extends StObject
       with _MediaConditionWalkerEntry
  
  trait _MediaConditionListWithOrWalkerParent
    extends StObject
       with _MediaConditionWalkerParent
}
