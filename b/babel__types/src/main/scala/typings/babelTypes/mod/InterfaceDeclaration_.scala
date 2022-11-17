package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterfaceDeclaration_
  extends StObject
     with BaseNode {
  
  var body: ObjectTypeAnnotation_
  
  var `extends`: js.Array[InterfaceExtends_] | Null
  
  var id: Identifier_
  
  var implements: js.Array[ClassImplements_] | Null
  
  var mixins: js.Array[InterfaceExtends_] | Null
  
  var typeParameters: TypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_InterfaceDeclaration_ : "InterfaceDeclaration"
}
object InterfaceDeclaration_ {
  
  inline def apply(body: ObjectTypeAnnotation_, id: Identifier_): InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[InterfaceDeclaration_]
  }
  
  extension [Self <: InterfaceDeclaration_](x: Self) {
    
    inline def setBody(value: ObjectTypeAnnotation_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setExtends(value: js.Array[InterfaceExtends_]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    inline def setExtendsVarargs(value: InterfaceExtends_ *): Self = StObject.set(x, "extends", js.Array(value*))
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImplements(value: js.Array[ClassImplements_]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    inline def setImplementsNull: Self = StObject.set(x, "implements", null)
    
    inline def setImplementsVarargs(value: ClassImplements_ *): Self = StObject.set(x, "implements", js.Array(value*))
    
    inline def setMixins(value: js.Array[InterfaceExtends_]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    inline def setMixinsNull: Self = StObject.set(x, "mixins", null)
    
    inline def setMixinsVarargs(value: InterfaceExtends_ *): Self = StObject.set(x, "mixins", js.Array(value*))
    
    inline def setType(value: "InterfaceDeclaration"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
