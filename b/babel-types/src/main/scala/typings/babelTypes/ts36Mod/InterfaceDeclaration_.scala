package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.InterfaceDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceDeclaration_
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var body: ObjectTypeAnnotation_ = js.native
  
  var `extends`: js.Array[InterfaceExtends_] = js.native
  
  var id: Identifier_ = js.native
  
  var mixins: js.UndefOr[js.Array[_]] = js.native
  
  var typeParameters: TypeParameterDeclaration_ = js.native
  
  @JSName("type")
  var type_InterfaceDeclaration_ : InterfaceDeclaration = js.native
}
object InterfaceDeclaration_ {
  
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: InterfaceDeclaration,
    typeParameters: TypeParameterDeclaration_
  ): InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceDeclaration_]
  }
  
  @scala.inline
  implicit class InterfaceDeclaration_MutableBuilder[Self <: InterfaceDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ObjectTypeAnnotation_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtends(value: js.Array[InterfaceExtends_]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsVarargs(value: InterfaceExtends_ *): Self = StObject.set(x, "extends", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixins(value: js.Array[_]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
    
    @scala.inline
    def setMixinsVarargs(value: js.Any*): Self = StObject.set(x, "mixins", js.Array(value :_*))
    
    @scala.inline
    def setType(value: InterfaceDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
  }
}
