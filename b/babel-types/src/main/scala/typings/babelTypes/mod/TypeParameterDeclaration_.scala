package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameterDeclaration_
  extends Node
     with Flow {
  var params: js.Array[Identifier_] = js.native
  @JSName("type")
  var type_TypeParameterDeclaration_ : TypeParameterDeclaration = js.native
}

object TypeParameterDeclaration_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    params: js.Array[Identifier_],
    start: Double,
    `type`: TypeParameterDeclaration
  ): TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterDeclaration_]
  }
  @scala.inline
  implicit class TypeParameterDeclaration_Ops[Self <: TypeParameterDeclaration_] (val x: Self) extends AnyVal {
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
    def setParamsVarargs(value: Identifier_ *): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[Identifier_]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TypeParameterDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

