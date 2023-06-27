package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ContainerNode
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.Modifier
import typings.csstoolsMediaQueryListParser.anon.NodeMediaNotWalkerEntry
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod._MediaConditionWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod._MediaConditionWalkerParent
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerParent
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaNotMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithoutTypeWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod._MediaQueryWithTypeWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod._MediaConditionWalkerParent because Already inherited
  - typings.csstoolsMediaQueryListParser.distNodesMediaNotMod._MediaNotWalkerParent because Already inherited */ @JSImport("@csstools/media-query-list-parser/dist/nodes/media-not", "MediaNot")
  @js.native
  open class MediaNot protected ()
    extends StObject
       with _MediaConditionWalkerEntry
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent {
    def this(modifier: js.Array[CSSToken], media: MediaInParens) = this()
    
    def at(index: String): js.UndefOr[MediaInParens] = js.native
    def at(index: Double): js.UndefOr[MediaInParens] = js.native
    
    def indexOf(item: MediaInParens): Double | String = js.native
    
    def isMediaNot(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-not.MediaNot */ Boolean = js.native
    
    var media: MediaInParens = js.native
    
    var modifier: js.Array[CSSToken] = js.native
    
    def toJSON(): Modifier = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    def walk[T /* <: Record[String, Any] */](
      cb: js.Function2[/* entry */ NodeMediaNotWalkerEntry[T], /* index */ Double | String, Boolean | Unit]
    ): js.UndefOr[`false`] = js.native
    def walk[T /* <: Record[String, Any] */](
      cb: js.Function2[/* entry */ NodeMediaNotWalkerEntry[T], /* index */ Double | String, Boolean | Unit],
      state: T
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaNot {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-not", "MediaNot")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaNot(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-not.MediaNot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaNot")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-not.MediaNot */ Boolean]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParensWalkerEntry
    - typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParens
  */
  type MediaNotWalkerEntry = _MediaNotWalkerEntry | ComponentValue
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParensWalkerParent
    - typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNot
  */
  type MediaNotWalkerParent = _MediaNotWalkerParent | ContainerNode
  
  trait _MediaNotWalkerEntry
    extends StObject
       with _MediaConditionWalkerEntry
  
  trait _MediaNotWalkerParent
    extends StObject
       with _MediaConditionWalkerParent
}
