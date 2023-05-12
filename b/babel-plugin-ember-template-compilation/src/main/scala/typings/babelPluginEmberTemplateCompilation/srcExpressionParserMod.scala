package typings.babelPluginEmberTemplateCompilation

import typings.babelPluginEmberTemplateCompilation.anon.TypeofBabel
import typings.babelPluginEmberTemplateCompilation.srcScopeLocalsMod.ScopeLocals
import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.ArrayExpression_
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.ObjectExpression_
import typings.babelTypes.mod.ObjectMethod_
import typings.babelTypes.mod.ObjectProperty_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExpressionParserMod {
  
  @JSImport("babel-plugin-ember-template-compilation/src/expression-parser", "ExpressionParser")
  @js.native
  open class ExpressionParser protected () extends StObject {
    def this(babel: TypeofBabel) = this()
    
    /* private */ var babel: Any = js.native
    
    def parseArrayExpression(invokedName: String, path: NodePath[ArrayExpression_]): js.Array[Any] = js.native
    
    def parseExpression(invokedName: String, path: NodePath[Expression]): Any = js.native
    
    def parseObjectExpression(invokedName: String, path: NodePath[ObjectExpression_]): Record[String, Any] = js.native
    def parseObjectExpression(invokedName: String, path: NodePath[ObjectExpression_], shouldParseScope: Boolean): Record[String, Any] = js.native
    
    def parseScope(invokedName: String, path: NodePath[ObjectProperty_ | ObjectMethod_]): ScopeLocals = js.native
    
    /* private */ def t: Any = js.native
  }
}
