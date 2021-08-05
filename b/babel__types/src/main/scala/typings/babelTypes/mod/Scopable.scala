package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.module
import typings.babelTypes.babelTypesStrings.script
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.BlockStatement_
  - typings.babelTypes.mod.CatchClause_
  - typings.babelTypes.mod.DoWhileStatement_
  - typings.babelTypes.mod.ForInStatement_
  - typings.babelTypes.mod.ForStatement_
  - typings.babelTypes.mod.FunctionDeclaration_
  - typings.babelTypes.mod.FunctionExpression_
  - typings.babelTypes.mod.Program_
  - typings.babelTypes.mod.ObjectMethod_
  - typings.babelTypes.mod.SwitchStatement_
  - typings.babelTypes.mod.WhileStatement_
  - typings.babelTypes.mod.ArrowFunctionExpression_
  - typings.babelTypes.mod.ClassExpression_
  - typings.babelTypes.mod.ClassDeclaration_
  - typings.babelTypes.mod.ForOfStatement_
  - typings.babelTypes.mod.ClassMethod_
  - typings.babelTypes.mod.ClassPrivateMethod_
  - typings.babelTypes.mod.StaticBlock_
  - typings.babelTypes.mod.TSModuleBlock_
*/
trait Scopable
  extends StObject
     with _Node
object Scopable {
  
  inline def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  ): typings.babelTypes.mod.ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ArrowFunctionExpression_]
  }
  
  inline def BlockStatement_(body: js.Array[Statement], directives: js.Array[Directive_]): typings.babelTypes.mod.BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.BlockStatement_]
  }
  
  inline def CatchClause_(body: BlockStatement_): typings.babelTypes.mod.CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, param = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[typings.babelTypes.mod.CatchClause_]
  }
  
  inline def ClassDeclaration_(body: ClassBody_, id: Identifier_): typings.babelTypes.mod.ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, decorators = null, end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, superClass = null, superTypeParameters = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.ClassDeclaration_]
  }
  
  inline def ClassExpression_(body: ClassBody_): typings.babelTypes.mod.ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], decorators = null, end = null, id = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, superClass = null, superTypeParameters = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ClassExpression_]
  }
  
  inline def ClassMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    kind: get | set | method | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    static: Boolean
  ): typings.babelTypes.mod.ClassMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], access = null, accessibility = null, decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassMethod")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.ClassMethod_]
  }
  
  inline def ClassPrivateMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: PrivateName_,
    kind: get | set | method | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    static: Boolean
  ): typings.babelTypes.mod.ClassPrivateMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], access = null, accessibility = null, decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassPrivateMethod")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.ClassPrivateMethod_]
  }
  
  inline def DoWhileStatement_(body: Statement, test: Expression): typings.babelTypes.mod.DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.DoWhileStatement_]
  }
  
  inline def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typings.babelTypes.mod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ForInStatement_]
  }
  
  inline def ForOfStatement_(await: Boolean, body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typings.babelTypes.mod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ForOfStatement_]
  }
  
  inline def ForStatement_(body: Statement): typings.babelTypes.mod.ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, init = null, innerComments = null, leadingComments = null, loc = null, start = null, test = null, trailingComments = null, update = null)
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ForStatement_]
  }
  
  inline def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  ): typings.babelTypes.mod.FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], declare = null, end = null, id = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.FunctionDeclaration_]
  }
  
  inline def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  ): typings.babelTypes.mod.FunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], end = null, id = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.FunctionExpression_]
  }
  
  inline def ObjectMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_,
    kind: method | get | set,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  ): typings.babelTypes.mod.ObjectMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectMethod_]
  }
  
  inline def Program_(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceFile: String,
    sourceType: script | module
  ): typings.babelTypes.mod.Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], end = null, innerComments = null, interpreter = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[typings.babelTypes.mod.Program_]
  }
  
  inline def StaticBlock_(body: js.Array[Statement]): typings.babelTypes.mod.StaticBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[typings.babelTypes.mod.StaticBlock_]
  }
  
  inline def SwitchStatement_(cases: js.Array[SwitchCase_], discriminant: Expression): typings.babelTypes.mod.SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.SwitchStatement_]
  }
  
  inline def TSModuleBlock_(body: js.Array[Statement]): typings.babelTypes.mod.TSModuleBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSModuleBlock")
    __obj.asInstanceOf[typings.babelTypes.mod.TSModuleBlock_]
  }
  
  inline def WhileStatement_(body: Statement, test: Expression): typings.babelTypes.mod.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.WhileStatement_]
  }
}
