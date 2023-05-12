package typings.csstoolsCssParserAlgorithms

import typings.csstoolsCssParserAlgorithms.anon.Advance
import typings.csstoolsCssParserAlgorithms.anon.AdvanceNode
import typings.csstoolsCssParserAlgorithms.anon.AdvanceNumber
import typings.csstoolsCssParserAlgorithms.anon.NodeCommentNode
import typings.csstoolsCssParserAlgorithms.anon.NodeWhitespaceNode
import typings.csstoolsCssParserAlgorithms.anon.Nodes
import typings.csstoolsCssParserAlgorithms.anon.OnParseError
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.distInterfacesContextMod.Context
import typings.csstoolsCssParserAlgorithms.distUtilNodeAncestryMod.walkable
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenFunction
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@csstools/css-parser-algorithms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/css-parser-algorithms", "CommentNode")
  @js.native
  open class CommentNode protected ()
    extends typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.CommentNode {
    def this(value: CSSToken) = this()
  }
  /* static members */
  object CommentNode {
    
    @JSImport("@csstools/css-parser-algorithms", "CommentNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isCommentNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.CommentNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommentNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.CommentNode */ Boolean]
  }
  
  @JSImport("@csstools/css-parser-algorithms", "ComponentValueType")
  @js.native
  object ComponentValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType & String
      ] = js.native
    
    /* "comment" */ val Comment: typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType.Comment & String = js.native
    
    /* "function" */ val Function: typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType.Function & String = js.native
    
    /* "simple-block" */ val SimpleBlock: typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType.SimpleBlock & String = js.native
    
    /* "token" */ val Token: typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType.Token & String = js.native
    
    /* "whitespace" */ val Whitespace: typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType.Whitespace & String = js.native
  }
  
  @JSImport("@csstools/css-parser-algorithms", "FunctionNode")
  @js.native
  open class FunctionNode protected ()
    extends typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.FunctionNode {
    def this(name: TokenFunction, endToken: CSSToken, value: js.Array[ComponentValue]) = this()
  }
  /* static members */
  object FunctionNode {
    
    @JSImport("@csstools/css-parser-algorithms", "FunctionNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isFunctionNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.FunctionNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.FunctionNode */ Boolean]
  }
  
  @JSImport("@csstools/css-parser-algorithms", "SimpleBlockNode")
  @js.native
  open class SimpleBlockNode protected ()
    extends typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.SimpleBlockNode {
    def this(startToken: CSSToken, endToken: CSSToken, value: js.Array[ComponentValue]) = this()
  }
  /* static members */
  object SimpleBlockNode {
    
    @JSImport("@csstools/css-parser-algorithms", "SimpleBlockNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isSimpleBlockNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.SimpleBlockNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleBlockNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.SimpleBlockNode */ Boolean]
  }
  
  @JSImport("@csstools/css-parser-algorithms", "TokenNode")
  @js.native
  open class TokenNode protected ()
    extends typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.TokenNode {
    def this(value: CSSToken) = this()
  }
  /* static members */
  object TokenNode {
    
    @JSImport("@csstools/css-parser-algorithms", "TokenNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isTokenNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.TokenNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.TokenNode */ Boolean]
  }
  
  @JSImport("@csstools/css-parser-algorithms", "WhitespaceNode")
  @js.native
  open class WhitespaceNode protected ()
    extends typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.WhitespaceNode {
    def this(value: js.Array[CSSToken]) = this()
  }
  /* static members */
  object WhitespaceNode {
    
    @JSImport("@csstools/css-parser-algorithms", "WhitespaceNode")
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
  
  inline def gatherNodeAncestry(node: walkable): Map[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("gatherNodeAncestry")(node.asInstanceOf[js.Any]).asInstanceOf[Map[Any, Any]]
  
  inline def isCommentNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.CommentNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommentNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.CommentNode */ Boolean]
  
  inline def isFunctionNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.FunctionNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.FunctionNode */ Boolean]
  
  inline def isSimpleBlockNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.SimpleBlockNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleBlockNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.SimpleBlockNode */ Boolean]
  
  inline def isTokenNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.TokenNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.TokenNode */ Boolean]
  
  inline def isWhitespaceNode(x: Any): /* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.WhitespaceNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhitespaceNode")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/css-parser-algorithms.@csstools/css-parser-algorithms/dist/consume/consume-component-block-function.WhitespaceNode */ Boolean]
  
  inline def parseCommaSeparatedListOfComponentValues(tokens: js.Array[CSSToken]): js.Array[js.Array[ComponentValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCommaSeparatedListOfComponentValues")(tokens.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[ComponentValue]]]
  inline def parseCommaSeparatedListOfComponentValues(tokens: js.Array[CSSToken], options: OnParseError): js.Array[js.Array[ComponentValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCommaSeparatedListOfComponentValues")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[ComponentValue]]]
  
  inline def parseComponentValue(tokens: js.Array[CSSToken]): js.UndefOr[ComponentValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseComponentValue")(tokens.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ComponentValue]]
  inline def parseComponentValue(tokens: js.Array[CSSToken], options: OnParseError): js.UndefOr[ComponentValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseComponentValue")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ComponentValue]]
  
  inline def parseListOfComponentValues(tokens: js.Array[CSSToken]): js.Array[ComponentValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseListOfComponentValues")(tokens.asInstanceOf[js.Any]).asInstanceOf[js.Array[ComponentValue]]
  inline def parseListOfComponentValues(tokens: js.Array[CSSToken], options: OnParseError): js.Array[ComponentValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseListOfComponentValues")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentValue]]
  
  inline def replaceComponentValues(
    componentValuesList: js.Array[js.Array[ComponentValue]],
    replaceWith: js.Function1[/* componentValue */ ComponentValue, ComponentValue | Unit]
  ): js.Array[js.Array[ComponentValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceComponentValues")(componentValuesList.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[ComponentValue]]]
  
  inline def stringify(componentValueLists: js.Array[js.Array[ComponentValue]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(componentValueLists.asInstanceOf[js.Any]).asInstanceOf[String]
}
