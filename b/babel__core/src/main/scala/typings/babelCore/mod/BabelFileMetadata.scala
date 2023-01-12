package typings.babelCore.mod

import typings.babelCore.anon.Loc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BabelFileMetadata extends StObject {
  
  var marked: js.Array[Loc]
  
  var modules: BabelFileModulesMetadata
  
  var usedHelpers: js.Array[String]
}
object BabelFileMetadata {
  
  inline def apply(marked: js.Array[Loc], modules: BabelFileModulesMetadata, usedHelpers: js.Array[String]): BabelFileMetadata = {
    val __obj = js.Dynamic.literal(marked = marked.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], usedHelpers = usedHelpers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFileMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BabelFileMetadata] (val x: Self) extends AnyVal {
    
    inline def setMarked(value: js.Array[Loc]): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    inline def setMarkedVarargs(value: Loc*): Self = StObject.set(x, "marked", js.Array(value*))
    
    inline def setModules(value: BabelFileModulesMetadata): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setUsedHelpers(value: js.Array[String]): Self = StObject.set(x, "usedHelpers", value.asInstanceOf[js.Any])
    
    inline def setUsedHelpersVarargs(value: String*): Self = StObject.set(x, "usedHelpers", js.Array(value*))
  }
}
