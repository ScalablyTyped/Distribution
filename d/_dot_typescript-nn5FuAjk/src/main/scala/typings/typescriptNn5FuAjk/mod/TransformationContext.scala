package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformationContext
  extends StObject
     with CoreTransformationContext {
  
  /**
    * Enables before/after emit notifications in the pretty printer for the provided
    * SyntaxKind.
    */
  def enableEmitNotification(kind: SyntaxKind): Unit
  
  /** Enables expression substitutions in the pretty printer for the provided SyntaxKind. */
  def enableSubstitution(kind: SyntaxKind): Unit
  
  /**
    * Determines whether before/after emit notifications should be raised in the pretty
    * printer when it emits a node.
    */
  def isEmitNotificationEnabled(node: Node): Boolean
  
  /** Determines whether expression substitutions are enabled for the provided node. */
  def isSubstitutionEnabled(node: Node): Boolean
  
  /**
    * Hook used to allow transformers to capture state before or after
    * the printer emits a node.
    *
    * NOTE: Transformation hooks should only be modified during `Transformer` initialization,
    * before returning the `NodeTransformer` callback.
    */
  def onEmitNode(hint: EmitHint, node: Node, emitCallback: js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]): Unit
  
  /**
    * Hook used by transformers to substitute expressions just before they
    * are emitted by the pretty printer.
    *
    * NOTE: Transformation hooks should only be modified during `Transformer` initialization,
    * before returning the `NodeTransformer` callback.
    */
  def onSubstituteNode(hint: EmitHint, node: Node): Node
  
  /** Gets and resets the requested non-scoped emit helpers. */
  def readEmitHelpers(): js.UndefOr[Array[EmitHelper]]
  
  /** Records a request for a non-scoped emit helper in the current context. */
  def requestEmitHelper(helper: EmitHelper): Unit
}
object TransformationContext {
  
  inline def apply(
    enableEmitNotification: SyntaxKind => Unit,
    enableSubstitution: SyntaxKind => Unit,
    endLexicalEnvironment: () => js.UndefOr[Array[Statement]],
    factory: NodeFactory,
    getCompilerOptions: () => CompilerOptions,
    hoistFunctionDeclaration: FunctionDeclaration => Unit,
    hoistVariableDeclaration: Identifier => Unit,
    isEmitNotificationEnabled: Node => Boolean,
    isSubstitutionEnabled: Node => Boolean,
    onEmitNode: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit,
    onSubstituteNode: (EmitHint, Node) => Node,
    readEmitHelpers: () => js.UndefOr[Array[EmitHelper]],
    requestEmitHelper: EmitHelper => Unit,
    resumeLexicalEnvironment: () => Unit,
    startLexicalEnvironment: () => Unit,
    suspendLexicalEnvironment: () => Unit
  ): TransformationContext = {
    val __obj = js.Dynamic.literal(enableEmitNotification = js.Any.fromFunction1(enableEmitNotification), enableSubstitution = js.Any.fromFunction1(enableSubstitution), endLexicalEnvironment = js.Any.fromFunction0(endLexicalEnvironment), factory = factory.asInstanceOf[js.Any], getCompilerOptions = js.Any.fromFunction0(getCompilerOptions), hoistFunctionDeclaration = js.Any.fromFunction1(hoistFunctionDeclaration), hoistVariableDeclaration = js.Any.fromFunction1(hoistVariableDeclaration), isEmitNotificationEnabled = js.Any.fromFunction1(isEmitNotificationEnabled), isSubstitutionEnabled = js.Any.fromFunction1(isSubstitutionEnabled), onEmitNode = js.Any.fromFunction3(onEmitNode), onSubstituteNode = js.Any.fromFunction2(onSubstituteNode), readEmitHelpers = js.Any.fromFunction0(readEmitHelpers), requestEmitHelper = js.Any.fromFunction1(requestEmitHelper), resumeLexicalEnvironment = js.Any.fromFunction0(resumeLexicalEnvironment), startLexicalEnvironment = js.Any.fromFunction0(startLexicalEnvironment), suspendLexicalEnvironment = js.Any.fromFunction0(suspendLexicalEnvironment))
    __obj.asInstanceOf[TransformationContext]
  }
  
  extension [Self <: TransformationContext](x: Self) {
    
    inline def setEnableEmitNotification(value: SyntaxKind => Unit): Self = StObject.set(x, "enableEmitNotification", js.Any.fromFunction1(value))
    
    inline def setEnableSubstitution(value: SyntaxKind => Unit): Self = StObject.set(x, "enableSubstitution", js.Any.fromFunction1(value))
    
    inline def setIsEmitNotificationEnabled(value: Node => Boolean): Self = StObject.set(x, "isEmitNotificationEnabled", js.Any.fromFunction1(value))
    
    inline def setIsSubstitutionEnabled(value: Node => Boolean): Self = StObject.set(x, "isSubstitutionEnabled", js.Any.fromFunction1(value))
    
    inline def setOnEmitNode(value: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit): Self = StObject.set(x, "onEmitNode", js.Any.fromFunction3(value))
    
    inline def setOnSubstituteNode(value: (EmitHint, Node) => Node): Self = StObject.set(x, "onSubstituteNode", js.Any.fromFunction2(value))
    
    inline def setReadEmitHelpers(value: () => js.UndefOr[Array[EmitHelper]]): Self = StObject.set(x, "readEmitHelpers", js.Any.fromFunction0(value))
    
    inline def setRequestEmitHelper(value: EmitHelper => Unit): Self = StObject.set(x, "requestEmitHelper", js.Any.fromFunction1(value))
  }
}
