package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.module
import typings.babelTypes.babelTypesStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.BlockStatement_
  - typings.babelTypes.indexTs37Mod.Program_
  - typings.babelTypes.indexTs37Mod.TSModuleBlock_
*/
trait Block
  extends StObject
     with _Node
object Block {
  
  inline def BlockStatement_(body: js.Array[Statement], directives: js.Array[Directive_]): typings.babelTypes.indexTs37Mod.BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.BlockStatement_]
  }
  
  inline def Program_(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceFile: String,
    sourceType: script | module
  ): typings.babelTypes.indexTs37Mod.Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], end = null, innerComments = null, interpreter = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.Program_]
  }
  
  inline def TSModuleBlock_(body: js.Array[Statement]): typings.babelTypes.indexTs37Mod.TSModuleBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSModuleBlock")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.TSModuleBlock_]
  }
}
