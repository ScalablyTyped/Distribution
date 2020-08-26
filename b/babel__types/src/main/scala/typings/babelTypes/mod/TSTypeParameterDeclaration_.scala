package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterDeclaration_
  extends BaseNode
     with _Node {
  var params: js.Array[TSTypeParameter_] = js.native
  @JSName("type")
  var type_TSTypeParameterDeclaration_ : TSTypeParameterDeclaration = js.native
}

object TSTypeParameterDeclaration_ {
  @scala.inline
  def apply(params: js.Array[TSTypeParameter_], `type`: TSTypeParameterDeclaration): TSTypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameterDeclaration_]
  }
  @scala.inline
  implicit class TSTypeParameterDeclaration_Ops[Self <: TSTypeParameterDeclaration_] (val x: Self) extends AnyVal {
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
    def setParamsVarargs(value: TSTypeParameter_ *): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[TSTypeParameter_]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TSTypeParameterDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

