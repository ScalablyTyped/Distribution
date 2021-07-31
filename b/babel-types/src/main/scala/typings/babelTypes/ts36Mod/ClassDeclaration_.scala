package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ClassDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassDeclaration_
  extends StObject
     with Node
     with Class
     with Declaration
     with Pureish
     with Scopable
     with Statement {
  
  var body: ClassBody_
  
  var decorators: js.UndefOr[js.Array[Decorator_]] = js.undefined
  
  var id: Identifier_
  
  var implements: js.UndefOr[js.Array[ClassImplements_]] = js.undefined
  
  var mixins: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var superClass: Expression
  
  var superTypeParameters: js.UndefOr[TypeParameterInstantiation_] = js.undefined
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration_] = js.undefined
  
  @JSName("type")
  var type_ClassDeclaration_ : ClassDeclaration
}
object ClassDeclaration_ {
  
  @scala.inline
  def apply(
    body: ClassBody_,
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    superClass: Expression
  ): ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[ClassDeclaration_]
  }
  
  @scala.inline
  implicit class ClassDeclaration_MutableBuilder[Self <: ClassDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ClassBody_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplements(value: js.Array[ClassImplements_]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementsUndefined: Self = StObject.set(x, "implements", js.undefined)
    
    @scala.inline
    def setImplementsVarargs(value: ClassImplements_ *): Self = StObject.set(x, "implements", js.Array(value :_*))
    
    @scala.inline
    def setMixins(value: js.Array[js.Any]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
    
    @scala.inline
    def setMixinsVarargs(value: js.Any*): Self = StObject.set(x, "mixins", js.Array(value :_*))
    
    @scala.inline
    def setSuperClass(value: Expression): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "superTypeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperTypeParametersUndefined: Self = StObject.set(x, "superTypeParameters", js.undefined)
    
    @scala.inline
    def setType(value: ClassDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
