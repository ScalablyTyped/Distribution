package typings.terserMCwkxx7L.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolDef extends StObject {
  
  var eliminated: Double
  
  var `export`: Boolean
  
  var global: Boolean
  
  var id: Double
  
  var init: ASTSymbolRef
  
  var mangled_name: Null | String
  
  var name: String
  
  var orig: js.Array[ASTSymbolRef]
  
  var references: js.Array[ASTSymbolRef]
  
  var replaced: Double
  
  var scope: ASTScope
  
  var undeclared: Boolean
}
object SymbolDef {
  
  inline def apply(
    eliminated: Double,
    `export`: Boolean,
    global: Boolean,
    id: Double,
    init: ASTSymbolRef,
    name: String,
    orig: js.Array[ASTSymbolRef],
    references: js.Array[ASTSymbolRef],
    replaced: Double,
    scope: ASTScope,
    undeclared: Boolean
  ): SymbolDef = {
    val __obj = js.Dynamic.literal(eliminated = eliminated.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orig = orig.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], replaced = replaced.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], undeclared = undeclared.asInstanceOf[js.Any], mangled_name = null)
    __obj.updateDynamic("export")(`export`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolDef]
  }
  
  extension [Self <: SymbolDef](x: Self) {
    
    inline def setEliminated(value: Double): Self = StObject.set(x, "eliminated", value.asInstanceOf[js.Any])
    
    inline def setExport(value: Boolean): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: ASTSymbolRef): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setMangled_name(value: String): Self = StObject.set(x, "mangled_name", value.asInstanceOf[js.Any])
    
    inline def setMangled_nameNull: Self = StObject.set(x, "mangled_name", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrig(value: js.Array[ASTSymbolRef]): Self = StObject.set(x, "orig", value.asInstanceOf[js.Any])
    
    inline def setOrigVarargs(value: ASTSymbolRef*): Self = StObject.set(x, "orig", js.Array(value*))
    
    inline def setReferences(value: js.Array[ASTSymbolRef]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesVarargs(value: ASTSymbolRef*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setReplaced(value: Double): Self = StObject.set(x, "replaced", value.asInstanceOf[js.Any])
    
    inline def setScope(value: ASTScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setUndeclared(value: Boolean): Self = StObject.set(x, "undeclared", value.asInstanceOf[js.Any])
  }
}
