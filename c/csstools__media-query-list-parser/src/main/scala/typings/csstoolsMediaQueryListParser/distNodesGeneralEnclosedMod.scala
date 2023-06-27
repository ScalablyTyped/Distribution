package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ContainerNode
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.Node
import typings.csstoolsMediaQueryListParser.anon.Tokens
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod._MediaInParensWalkerParent
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesGeneralEnclosedMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/general-enclosed", "GeneralEnclosed")
  @js.native
  open class GeneralEnclosed protected ()
    extends StObject
       with _MediaInParensWalkerEntry
       with _MediaInParensWalkerParent {
    def this(value: ComponentValue) = this()
    
    def at(index: String): js.UndefOr[ComponentValue] = js.native
    def at(index: Double): js.UndefOr[ComponentValue] = js.native
    
    def indexOf(item: ComponentValue): Double | String = js.native
    
    def isGeneralEnclosed(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/general-enclosed.GeneralEnclosed */ Boolean = js.native
    
    def toJSON(): Tokens = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    var value: ComponentValue = js.native
    
    def walk[T /* <: Record[String, Any] */](cb: js.Function2[/* entry */ Node[T], /* index */ Double | String, Boolean | Unit]): js.UndefOr[`false`] = js.native
    def walk[T /* <: Record[String, Any] */](cb: js.Function2[/* entry */ Node[T], /* index */ Double | String, Boolean | Unit], state: T): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object GeneralEnclosed {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/general-enclosed", "GeneralEnclosed")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isGeneralEnclosed(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/general-enclosed.GeneralEnclosed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneralEnclosed")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/general-enclosed.GeneralEnclosed */ Boolean]
  }
  
  type GeneralEnclosedWalkerEntry = ComponentValue
  
  type GeneralEnclosedWalkerParent = ContainerNode | GeneralEnclosed
}
