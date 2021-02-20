package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.OpaqueType
import org.scalablytyped.runtime.StObject
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
  implicit class OpaqueType_MutableBuilder[Self <: OpaqueType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpltype(value: FlowType): Self = StObject.set(x, "impltype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupertype(value: FlowType): Self = StObject.set(x, "supertype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupertypeNull: Self = StObject.set(x, "supertype", null)
    
    @scala.inline
    def setType(value: OpaqueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
