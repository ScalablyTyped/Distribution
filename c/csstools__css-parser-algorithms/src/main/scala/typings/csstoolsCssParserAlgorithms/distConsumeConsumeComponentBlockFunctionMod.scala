package typings.csstoolsCssParserAlgorithms

import typings.csstoolsCssParserAlgorithms.anon.Advance
import typings.csstoolsCssParserAlgorithms.anon.AdvanceNode
import typings.csstoolsCssParserAlgorithms.anon.AdvanceNumber
import typings.csstoolsCssParserAlgorithms.anon.Node
import typings.csstoolsCssParserAlgorithms.anon.NodeCommentNode
import typings.csstoolsCssParserAlgorithms.anon.NodeWhitespaceNode
import typings.csstoolsCssParserAlgorithms.anon.Nodes
import typings.csstoolsCssParserAlgorithms.anon.Tokens
import typings.csstoolsCssParserAlgorithms.csstoolsCssParserAlgorithmsBooleans.`false`
import typings.csstoolsCssParserAlgorithms.distInterfacesContextMod.Context
import typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenFunction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumeConsumeComponentBlockFunctionMod {
  
  @JSImport("@csstools/css-parser-algorithms/dist/consume/consume-component-block-function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/css-parser-algorithms/dist/consume/consume-component-block-function", "CommentNode")
  @js.native
  open class CommentNode protected ()
    extends StObject
       with ComponentValue {
    def this(value: CSSToken) = this()
    
    def isCommentNode(): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.CommentNode */ Boolean = js.native
    
    def toJSON(): Tokens = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: ComponentValueType = js.native
    
    var value: CSSToken = js.native
  }
  /* static members */
  object CommentNode {
    
    @JSImport("@csstools/css-parser-algorithms/dist/consume/consume-component-block-function", "CommentNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isCommentNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.CommentNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommentNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.CommentNode */ Boolean]
  }
  
  @JSImport("@csstools/css-parser-algorithms/dist/consume/consume-component-block-function", "FunctionNode")
  @js.native
  open class FunctionNode protected ()
    extends StObject
       with ComponentValue
       with ContainerNode {
    def this(name: TokenFunction, endToken: CSSToken, value: js.Array[ComponentValue]) = this()
    
    def at(index: String): js.UndefOr[ComponentValue] = js.native
    def at(index: Double): js.UndefOr[ComponentValue] = js.native
    
    var endToken: CSSToken = js.native
    
    def getName(): String = js.native
    
    def indexOf(item: ComponentValue): Double | String = js.native
    
    def isFunctionNode(): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.FunctionNode */ Boolean = js.native
    
    var name: TokenFunction = js.native
    
    /**
      * Normalize the current Function:
      * - if the "endToken" is EOF, replace with a ")-token"
      */
    def normalize(): Unit = js.native
    
    def toJSON(): Any = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: ComponentValueType = js.native
    
    var value: js.Array[ComponentValue] = js.native
    
    def walk[T /* <: Record[String, Any] */](cb: js.Function2[/* entry */ Node[T], /* index */ Double | String, Boolean | Unit]): js.UndefOr[`false`] = js.native
    def walk[T /* <: Record[String, Any] */](cb: js.Function2[/* entry */ Node[T], /* index */ Double | String, Boolean | Unit], state: T): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object FunctionNode {
    
    @JSImport("@csstools/css-parser-algorithms/dist/consume/consume-component-block-function", "FunctionNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isFunctionNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.FunctionNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.FunctionNode */ Boolean]
  }
  
  @JSImport("@csstools/css-parser-algorithms/dist/consume/consume-component-block-function", "SimpleBlockNode")
  @js.native
  open class SimpleBlockNode protected ()
    extends StObject
       with ComponentValue
       with ContainerNode {
    def this(startToken: CSSToken, endToken: CSSToken, value: js.Array[ComponentValue]) = this()
    
    def at(index: String): js.UndefOr[ComponentValue] = js.native
    def at(index: Double): js.UndefOr[ComponentValue] = js.native
    
    var endToken: CSSToken = js.native
    
    def indexOf(item: ComponentValue): Double | String = js.native
    
    def isSimpleBlockNode(): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.SimpleBlockNode */ Boolean = js.native
    
    /**
      * Normalize the current Simple Block:
      * - if the "endToken" is EOF, replace with the mirror token of the "startToken"
      */
    def normalize(): Unit = js.native
    
    var startToken: CSSToken = js.native
    
    def toJSON(): Any = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: ComponentValueType = js.native
    
    var value: js.Array[ComponentValue] = js.native
    
    def walk[T /* <: Record[String, Any] */](cb: js.Function2[/* entry */ Node[T], /* index */ Double | String, Boolean | Unit]): js.UndefOr[`false`] = js.native
    def walk[T /* <: Record[String, Any] */](cb: js.Function2[/* entry */ Node[T], /* index */ Double | String, Boolean | Unit], state: T): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object SimpleBlockNode {
    
    @JSImport("@csstools/css-parser-algorithms/dist/consume/consume-component-block-function", "SimpleBlockNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isSimpleBlockNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.SimpleBlockNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleBlockNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.SimpleBlockNode */ Boolean]
  }
  
  @JSImport("@csstools/css-parser-algorithms/dist/consume/consume-component-block-function", "TokenNode")
  @js.native
  open class TokenNode protected ()
    extends StObject
       with ComponentValue {
    def this(value: CSSToken) = this()
    
    def isTokenNode(): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.TokenNode */ Boolean = js.native
    
    def toJSON(): Tokens = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: ComponentValueType = js.native
    
    var value: CSSToken = js.native
  }
  /* static members */
  object TokenNode {
    
    @JSImport("@csstools/css-parser-algorithms/dist/consume/consume-component-block-function", "TokenNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isTokenNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.TokenNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.TokenNode */ Boolean]
  }
  
  @JSImport("@csstools/css-parser-algorithms/dist/consume/consume-component-block-function", "WhitespaceNode")
  @js.native
  open class WhitespaceNode protected ()
    extends StObject
       with ComponentValue {
    def this(value: js.Array[CSSToken]) = this()
    
    def isWhitespaceNode(): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.WhitespaceNode */ Boolean = js.native
    
    def toJSON(): Tokens = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: ComponentValueType = js.native
    
    var value: js.Array[CSSToken] = js.native
  }
  /* static members */
  object WhitespaceNode {
    
    @JSImport("@csstools/css-parser-algorithms/dist/consume/consume-component-block-function", "WhitespaceNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isWhitespaceNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.WhitespaceNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhitespaceNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.WhitespaceNode */ Boolean]
  }
  
  inline def consumeAllCommentsAndWhitespace(ctx: Context, tokens: js.Array[CSSToken]): Nodes = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeAllCommentsAndWhitespace")(ctx.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[Nodes]
  
  inline def consumeComment(ctx: Context, tokens: js.Array[CSSToken]): NodeCommentNode = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeComment")(ctx.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[NodeCommentNode]
  
  inline def consumeComponentValue(ctx: Context, tokens: js.Array[CSSToken]): Advance = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeComponentValue")(ctx.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[Advance]
  
  inline def consumeFunction(ctx: Context, tokens: js.Array[CSSToken]): AdvanceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeFunction")(ctx.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[AdvanceNode]
  
  inline def consumeSimpleBlock(ctx: Context, tokens: js.Array[CSSToken]): AdvanceNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeSimpleBlock")(ctx.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[AdvanceNumber]
  
  inline def consumeWhitespace(ctx: Context, tokens: js.Array[CSSToken]): NodeWhitespaceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeWhitespace")(ctx.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[NodeWhitespaceNode]
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.FunctionNode
    - typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.SimpleBlockNode
    - typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.WhitespaceNode
    - typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.CommentNode
    - typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.TokenNode
  */
  trait ComponentValue extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.FunctionNode
    - typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.SimpleBlockNode
  */
  trait ContainerNode extends StObject
}
