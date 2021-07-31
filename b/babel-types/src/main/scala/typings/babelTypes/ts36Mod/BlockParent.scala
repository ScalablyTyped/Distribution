package typings.babelTypes.ts36Mod

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
  - typings.babelTypes.ts36Mod.BlockStatement_
  - typings.babelTypes.ts36Mod.DoWhileStatement_
  - typings.babelTypes.ts36Mod.ForInStatement_
  - typings.babelTypes.ts36Mod.ForStatement_
  - typings.babelTypes.ts36Mod.FunctionDeclaration_
  - typings.babelTypes.ts36Mod.FunctionExpression_
  - typings.babelTypes.ts36Mod.Program_
  - typings.babelTypes.ts36Mod.ObjectMethod_
  - typings.babelTypes.ts36Mod.SwitchStatement_
  - typings.babelTypes.ts36Mod.WhileStatement_
  - typings.babelTypes.ts36Mod.ArrowFunctionExpression_
  - typings.babelTypes.ts36Mod.ForOfStatement_
  - typings.babelTypes.ts36Mod.ClassMethod_
*/
trait BlockParent extends StObject
object BlockParent {
  
  @scala.inline
  def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    end: Double,
    expression: Boolean,
    generator: Boolean,
    id: Identifier_,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double
  ): typings.babelTypes.ts36Mod.ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ArrowFunctionExpression_]
  }
  
  @scala.inline
  def BlockStatement_(body: js.Array[Statement], end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.BlockStatement_]
  }
  
  @scala.inline
  def ClassMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    end: Double,
    expression: Boolean,
    generator: Boolean,
    id: Identifier_,
    key: Expression,
    kind: constructor | method | get | set,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    static: Boolean
  ): typings.babelTypes.ts36Mod.ClassMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassMethod")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ClassMethod_]
  }
  
  @scala.inline
  def DoWhileStatement_(body: Statement, end: Double, loc: SourceLocation, start: Double, test: Expression): typings.babelTypes.ts36Mod.DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DoWhileStatement_]
  }
  
  @scala.inline
  def ForInStatement_(
    body: Statement,
    end: Double,
    left: VariableDeclaration_ | LVal,
    loc: SourceLocation,
    right: Expression,
    start: Double
  ): typings.babelTypes.ts36Mod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ForInStatement_]
  }
  
  @scala.inline
  def ForOfStatement_(
    body: Statement,
    end: Double,
    left: VariableDeclaration_ | LVal,
    loc: SourceLocation,
    right: Expression,
    start: Double
  ): typings.babelTypes.ts36Mod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ForOfStatement_]
  }
  
  @scala.inline
  def ForStatement_(
    body: Statement,
    end: Double,
    init: VariableDeclaration_ | Expression,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    update: Expression
  ): typings.babelTypes.ts36Mod.ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ForStatement_]
  }
  
  @scala.inline
  def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    end: Double,
    generator: Boolean,
    id: Identifier_,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double
  ): typings.babelTypes.ts36Mod.FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.FunctionDeclaration_]
  }
  
  @scala.inline
  def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    end: Double,
    generator: Boolean,
    id: Identifier_,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double
  ): typings.babelTypes.ts36Mod.FunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.FunctionExpression_]
  }
  
  @scala.inline
  def ObjectMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    end: Double,
    generator: Boolean,
    id: Identifier_,
    key: Expression,
    kind: get | set | method,
    loc: SourceLocation,
    params: js.Array[LVal],
    shorthand: Boolean,
    start: Double,
    value: Expression
  ): typings.babelTypes.ts36Mod.ObjectMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ObjectMethod_]
  }
  
  @scala.inline
  def Program_(
    body: js.Array[Statement | ModuleDeclaration],
    end: Double,
    loc: SourceLocation,
    sourceType: script | module,
    start: Double
  ): typings.babelTypes.ts36Mod.Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.Program_]
  }
  
  @scala.inline
  def SwitchStatement_(
    cases: js.Array[SwitchCase_],
    discriminant: Expression,
    end: Double,
    loc: SourceLocation,
    start: Double
  ): typings.babelTypes.ts36Mod.SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.SwitchStatement_]
  }
  
  @scala.inline
  def WhileStatement_(body: Statement, end: Double, loc: SourceLocation, start: Double, test: Expression): typings.babelTypes.ts36Mod.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.WhileStatement_]
  }
}
