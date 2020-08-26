package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclareTypeAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareTypeAlias_
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier_ = js.native
  var right: FlowTypeAnnotation = js.native
  var typeParameters: TypeParameterDeclaration_ = js.native
  @JSName("type")
  var type_DeclareTypeAlias_ : DeclareTypeAlias = js.native
}

object DeclareTypeAlias_ {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    `type`: DeclareTypeAlias,
    typeParameters: TypeParameterDeclaration_
  ): DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareTypeAlias_]
  }
  @scala.inline
  implicit class DeclareTypeAlias_Ops[Self <: DeclareTypeAlias_] (val x: Self) extends AnyVal {
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
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: FlowTypeAnnotation): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DeclareTypeAlias): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
  }
  
}

