package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclareInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareInterface_
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var body: ObjectTypeAnnotation_ = js.native
  var `extends`: js.Array[InterfaceExtends_] = js.native
  var id: Identifier_ = js.native
  var typeParameters: TypeParameterDeclaration_ = js.native
  @JSName("type")
  var type_DeclareInterface_ : DeclareInterface = js.native
}

object DeclareInterface_ {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: DeclareInterface,
    typeParameters: TypeParameterDeclaration_
  ): DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareInterface_]
  }
  @scala.inline
  implicit class DeclareInterface_Ops[Self <: DeclareInterface_] (val x: Self) extends AnyVal {
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
    def setBody(value: ObjectTypeAnnotation_): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendsVarargs(value: InterfaceExtends_ *): Self = this.set("extends", js.Array(value :_*))
    @scala.inline
    def setExtends(value: js.Array[InterfaceExtends_]): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DeclareInterface): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
  }
  
}

