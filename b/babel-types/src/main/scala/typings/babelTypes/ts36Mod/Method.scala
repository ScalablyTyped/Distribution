package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.ObjectMethod_
  - typings.babelTypes.ts36Mod.ClassMethod_
*/
trait Method extends StObject
object Method {
  
  inline def ClassMethod_(
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
  
  inline def ObjectMethod_(
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
}
