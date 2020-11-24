package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.OpaqueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait OpaqueType_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  
  var id: Identifier_ = js.native
  
  var impltype: FlowType = js.native
  
  var supertype: FlowType | Null = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_OpaqueType_ : OpaqueType = js.native
}
object OpaqueType_ {
  
  @scala.inline
  def apply(id: Identifier_, impltype: FlowType, `type`: OpaqueType): OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpaqueType_]
  }
  
  @scala.inline
  implicit class OpaqueType_Ops[Self <: OpaqueType_] (val x: Self) extends AnyVal {
    
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
    def setImpltype(value: FlowType): Self = this.set("impltype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OpaqueType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupertype(value: FlowType): Self = this.set("supertype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupertypeNull: Self = this.set("supertype", null)
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
}
