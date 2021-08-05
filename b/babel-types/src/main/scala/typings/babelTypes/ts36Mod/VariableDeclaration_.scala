package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.VariableDeclaration
import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.babelTypesStrings.const
import typings.babelTypes.babelTypesStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDeclaration_
  extends StObject
     with Node
     with Declaration
     with Statement {
  
  var declarations: js.Array[VariableDeclarator_]
  
  var kind: `var` | let | const
  
  @JSName("type")
  var type_VariableDeclaration_ : VariableDeclaration
}
object VariableDeclaration_ {
  
  inline def apply(
    declarations: js.Array[VariableDeclarator_],
    end: Double,
    kind: `var` | let | const,
    loc: SourceLocation,
    start: Double
  ): VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[VariableDeclaration_]
  }
  
  extension [Self <: VariableDeclaration_](x: Self) {
    
    inline def setDeclarations(value: js.Array[VariableDeclarator_]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: VariableDeclarator_ *): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    inline def setKind(value: `var` | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
