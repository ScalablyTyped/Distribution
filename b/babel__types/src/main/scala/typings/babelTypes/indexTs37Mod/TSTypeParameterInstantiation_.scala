package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSTypeParameterInstantiation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeParameterInstantiation_
  extends BaseNode
     with _Node {
  
  var params: js.Array[TSType] = js.native
  
  @JSName("type")
  var type_TSTypeParameterInstantiation_ : TSTypeParameterInstantiation = js.native
}
object TSTypeParameterInstantiation_ {
  
  @scala.inline
  def apply(params: js.Array[TSType], `type`: TSTypeParameterInstantiation): TSTypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameterInstantiation_]
  }
  
  @scala.inline
  implicit class TSTypeParameterInstantiation_Ops[Self <: TSTypeParameterInstantiation_] (val x: Self) extends AnyVal {
    
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
    def setParamsVarargs(value: TSType*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[TSType]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSTypeParameterInstantiation): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
