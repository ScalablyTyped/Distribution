package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.VariableDeclaration
import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.babelTypesStrings.const
import typings.babelTypes.babelTypesStrings.let
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
  implicit class VariableDeclaration_Ops[Self <: VariableDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeclarationsVarargs(value: VariableDeclarator_ *): Self = this.set("declarations", js.Array(value :_*))
    
    @scala.inline
    def setDeclarations(value: js.Array[VariableDeclarator_]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: `var` | let | const): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: VariableDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
