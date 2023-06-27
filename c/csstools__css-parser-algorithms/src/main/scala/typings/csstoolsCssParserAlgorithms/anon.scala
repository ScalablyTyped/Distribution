package typings.csstoolsCssParserAlgorithms

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.CommentNode
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ContainerNode
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.FunctionNode
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.SimpleBlockNode
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.WhitespaceNode
import typings.csstoolsCssParserAlgorithms.distUtilComponentValueTypeMod.ComponentValueType
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.mod.ParseError
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Advance extends StObject {
    
    var advance: Double
    
    var node: ComponentValue
  }
  object Advance {
    
    inline def apply(advance: Double, node: ComponentValue): Advance = {
      val __obj = js.Dynamic.literal(advance = advance.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Advance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Advance] (val x: Self) extends AnyVal {
      
      inline def setAdvance(value: Double): Self = StObject.set(x, "advance", value.asInstanceOf[js.Any])
      
      inline def setNode(value: ComponentValue): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdvanceNode extends StObject {
    
    var advance: Double
    
    var node: FunctionNode
  }
  object AdvanceNode {
    
    inline def apply(advance: Double, node: FunctionNode): AdvanceNode = {
      val __obj = js.Dynamic.literal(advance = advance.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdvanceNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdvanceNode] (val x: Self) extends AnyVal {
      
      inline def setAdvance(value: Double): Self = StObject.set(x, "advance", value.asInstanceOf[js.Any])
      
      inline def setNode(value: FunctionNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdvanceNumber extends StObject {
    
    var advance: Double
    
    var node: SimpleBlockNode
  }
  object AdvanceNumber {
    
    inline def apply(advance: Double, node: SimpleBlockNode): AdvanceNumber = {
      val __obj = js.Dynamic.literal(advance = advance.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdvanceNumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdvanceNumber] (val x: Self) extends AnyVal {
      
      inline def setAdvance(value: Double): Self = StObject.set(x, "advance", value.asInstanceOf[js.Any])
      
      inline def setNode(value: SimpleBlockNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node[T /* <: Record[String, Any] */] extends StObject {
    
    var node: ComponentValue
    
    var parent: ContainerNode
    
    var state: js.UndefOr[T] = js.undefined
  }
  object Node {
    
    inline def apply[T /* <: Record[String, Any] */](node: ComponentValue, parent: ContainerNode): Node[T] = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node[?], T /* <: Record[String, Any] */] (val x: Self & Node[T]) extends AnyVal {
      
      inline def setNode(value: ComponentValue): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setParent(value: ContainerNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait NodeCommentNode extends StObject {
    
    var advance: Double
    
    var node: CommentNode
  }
  object NodeCommentNode {
    
    inline def apply(advance: Double, node: CommentNode): NodeCommentNode = {
      val __obj = js.Dynamic.literal(advance = advance.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeCommentNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeCommentNode] (val x: Self) extends AnyVal {
      
      inline def setAdvance(value: Double): Self = StObject.set(x, "advance", value.asInstanceOf[js.Any])
      
      inline def setNode(value: CommentNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeWhitespaceNode extends StObject {
    
    var advance: Double
    
    var node: WhitespaceNode
  }
  object NodeWhitespaceNode {
    
    inline def apply(advance: Double, node: WhitespaceNode): NodeWhitespaceNode = {
      val __obj = js.Dynamic.literal(advance = advance.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeWhitespaceNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeWhitespaceNode] (val x: Self) extends AnyVal {
      
      inline def setAdvance(value: Double): Self = StObject.set(x, "advance", value.asInstanceOf[js.Any])
      
      inline def setNode(value: WhitespaceNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait Nodes extends StObject {
    
    var advance: Double
    
    var nodes: js.Array[WhitespaceNode | CommentNode]
  }
  object Nodes {
    
    inline def apply(advance: Double, nodes: js.Array[WhitespaceNode | CommentNode]): Nodes = {
      val __obj = js.Dynamic.literal(advance = advance.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nodes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Nodes] (val x: Self) extends AnyVal {
      
      inline def setAdvance(value: Double): Self = StObject.set(x, "advance", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[WhitespaceNode | CommentNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: (WhitespaceNode | CommentNode)*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait OnParseError extends StObject {
    
    var onParseError: js.UndefOr[js.Function1[/* error */ ParseError, Unit]] = js.undefined
  }
  object OnParseError {
    
    inline def apply(): OnParseError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnParseError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnParseError] (val x: Self) extends AnyVal {
      
      inline def setOnParseError(value: /* error */ ParseError => Unit): Self = StObject.set(x, "onParseError", js.Any.fromFunction1(value))
      
      inline def setOnParseErrorUndefined: Self = StObject.set(x, "onParseError", js.undefined)
    }
  }
  
  trait Parent extends StObject {
    
    var node: js.Array[Any] | Any
    
    var parent: Any
  }
  object Parent {
    
    inline def apply(node: js.Array[Any] | Any, parent: Any): Parent = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
      
      inline def setNode(value: js.Array[Any] | Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeVarargs(value: Any*): Self = StObject.set(x, "node", js.Array(value*))
      
      inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tokens extends StObject {
    
    var tokens: js.Array[CSSToken]
    
    var `type`: ComponentValueType
  }
  object Tokens {
    
    inline def apply(tokens: js.Array[CSSToken], `type`: ComponentValueType): Tokens = {
      val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tokens]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tokens] (val x: Self) extends AnyVal {
      
      inline def setTokens(value: js.Array[CSSToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: CSSToken*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setType(value: ComponentValueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
