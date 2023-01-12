package typings.babelCore.mod

import typings.babelCore.anon.Exported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BabelFileModulesMetadata extends StObject {
  
  var exports: Exported
  
  var imports: js.Array[js.Object]
}
object BabelFileModulesMetadata {
  
  inline def apply(exports: Exported, imports: js.Array[js.Object]): BabelFileModulesMetadata = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFileModulesMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BabelFileModulesMetadata] (val x: Self) extends AnyVal {
    
    inline def setExports(value: Exported): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setImports(value: js.Array[js.Object]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: js.Object*): Self = StObject.set(x, "imports", js.Array(value*))
  }
}
