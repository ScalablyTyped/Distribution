package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.VariableDeclaration
import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.babelTypesStrings.const
import typings.babelTypes.babelTypesStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclaration_
  extends Node
     with Declaration
     with Statement {
  
  var declarations: js.Array[VariableDeclarator_] = js.native
  
  var kind: `var` | let | const = js.native
  
  @JSName("type")
  var type_VariableDeclaration_ : VariableDeclaration = js.native
}
object VariableDeclaration_ {
  
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclarator_],
    end: Double,
    kind: `var` | let | const,
    loc: SourceLocation,
    start: Double,
    `type`: VariableDeclaration
  ): VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclaration_]
  }
  
  @scala.inline
  implicit class VariableDeclaration_MutableBuilder[Self <: VariableDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclarations(value: js.Array[VariableDeclarator_]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationsVarargs(value: VariableDeclarator_ *): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: `var` | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
