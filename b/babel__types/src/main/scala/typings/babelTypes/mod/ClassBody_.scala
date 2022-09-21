package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ClassBody_
  extends StObject
     with BaseNode
     with Standardized {
  
  var body: js.Array[
    ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | ClassAccessorProperty_ | TSDeclareMethod_ | TSIndexSignature_ | StaticBlock_
  ]
  
  @JSName("type")
  var type_ClassBody_ : ClassBody
}
object ClassBody_ {
  
  inline def apply(
    body: js.Array[
      ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | ClassAccessorProperty_ | TSDeclareMethod_ | TSIndexSignature_ | StaticBlock_
    ]
  ): ClassBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ClassBody")
    __obj.asInstanceOf[ClassBody_]
  }
  
  extension [Self <: ClassBody_](x: Self) {
    
    inline def setBody(
      value: js.Array[
          ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | ClassAccessorProperty_ | TSDeclareMethod_ | TSIndexSignature_ | StaticBlock_
        ]
    ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(
      value: (ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | ClassAccessorProperty_ | TSDeclareMethod_ | TSIndexSignature_ | StaticBlock_)*
    ): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: ClassBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
