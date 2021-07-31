package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.DeclareInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait DeclareInterface_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var body: ObjectTypeAnnotation_
  
  var `extends`: js.Array[InterfaceExtends_] | Null
  
  var id: Identifier_
  
  var implements: js.Array[ClassImplements_] | Null
  
  var mixins: js.Array[InterfaceExtends_] | Null
  
  var typeParameters: TypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_DeclareInterface_ : DeclareInterface
}
object DeclareInterface_ {
  
  @scala.inline
  def apply(body: ObjectTypeAnnotation_, id: Identifier_): DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[DeclareInterface_]
  }
  
  @scala.inline
  implicit class DeclareInterface_MutableBuilder[Self <: DeclareInterface_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ObjectTypeAnnotation_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtends(value: js.Array[InterfaceExtends_]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    @scala.inline
    def setExtendsVarargs(value: InterfaceExtends_ *): Self = StObject.set(x, "extends", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplements(value: js.Array[ClassImplements_]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementsNull: Self = StObject.set(x, "implements", null)
    
    @scala.inline
    def setImplementsVarargs(value: ClassImplements_ *): Self = StObject.set(x, "implements", js.Array(value :_*))
    
    @scala.inline
    def setMixins(value: js.Array[InterfaceExtends_]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixinsNull: Self = StObject.set(x, "mixins", null)
    
    @scala.inline
    def setMixinsVarargs(value: InterfaceExtends_ *): Self = StObject.set(x, "mixins", js.Array(value :_*))
    
    @scala.inline
    def setType(value: DeclareInterface): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
