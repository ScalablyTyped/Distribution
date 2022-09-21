package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreTransformationContext extends StObject {
  
  /** Ends a lexical environment, returning any declarations. */
  def endLexicalEnvironment(): js.UndefOr[Array[Statement]]
  
  val factory: NodeFactory
  
  /** Gets the compiler options supplied to the transformer. */
  def getCompilerOptions(): CompilerOptions
  
  /** Hoists a function declaration to the containing scope. */
  def hoistFunctionDeclaration(node: FunctionDeclaration): Unit
  
  /** Hoists a variable declaration to the containing scope. */
  def hoistVariableDeclaration(node: Identifier): Unit
  
  /** Resumes a suspended lexical environment, usually before visiting a function body. */
  def resumeLexicalEnvironment(): Unit
  
  /** Starts a new lexical environment. */
  def startLexicalEnvironment(): Unit
  
  /** Suspends the current lexical environment, usually after visiting a parameter list. */
  def suspendLexicalEnvironment(): Unit
}
object CoreTransformationContext {
  
  inline def apply(
    endLexicalEnvironment: () => js.UndefOr[Array[Statement]],
    factory: NodeFactory,
    getCompilerOptions: () => CompilerOptions,
    hoistFunctionDeclaration: FunctionDeclaration => Unit,
    hoistVariableDeclaration: Identifier => Unit,
    resumeLexicalEnvironment: () => Unit,
    startLexicalEnvironment: () => Unit,
    suspendLexicalEnvironment: () => Unit
  ): CoreTransformationContext = {
    val __obj = js.Dynamic.literal(endLexicalEnvironment = js.Any.fromFunction0(endLexicalEnvironment), factory = factory.asInstanceOf[js.Any], getCompilerOptions = js.Any.fromFunction0(getCompilerOptions), hoistFunctionDeclaration = js.Any.fromFunction1(hoistFunctionDeclaration), hoistVariableDeclaration = js.Any.fromFunction1(hoistVariableDeclaration), resumeLexicalEnvironment = js.Any.fromFunction0(resumeLexicalEnvironment), startLexicalEnvironment = js.Any.fromFunction0(startLexicalEnvironment), suspendLexicalEnvironment = js.Any.fromFunction0(suspendLexicalEnvironment))
    __obj.asInstanceOf[CoreTransformationContext]
  }
  
  extension [Self <: CoreTransformationContext](x: Self) {
    
    inline def setEndLexicalEnvironment(value: () => js.UndefOr[Array[Statement]]): Self = StObject.set(x, "endLexicalEnvironment", js.Any.fromFunction0(value))
    
    inline def setFactory(value: NodeFactory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setGetCompilerOptions(value: () => CompilerOptions): Self = StObject.set(x, "getCompilerOptions", js.Any.fromFunction0(value))
    
    inline def setHoistFunctionDeclaration(value: FunctionDeclaration => Unit): Self = StObject.set(x, "hoistFunctionDeclaration", js.Any.fromFunction1(value))
    
    inline def setHoistVariableDeclaration(value: Identifier => Unit): Self = StObject.set(x, "hoistVariableDeclaration", js.Any.fromFunction1(value))
    
    inline def setResumeLexicalEnvironment(value: () => Unit): Self = StObject.set(x, "resumeLexicalEnvironment", js.Any.fromFunction0(value))
    
    inline def setStartLexicalEnvironment(value: () => Unit): Self = StObject.set(x, "startLexicalEnvironment", js.Any.fromFunction0(value))
    
    inline def setSuspendLexicalEnvironment(value: () => Unit): Self = StObject.set(x, "suspendLexicalEnvironment", js.Any.fromFunction0(value))
  }
}
