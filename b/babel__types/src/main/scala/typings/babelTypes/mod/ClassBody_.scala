package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassBody_
  extends BaseNode
     with _Node {
  
  var body: js.Array[
    ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | TSDeclareMethod_ | TSIndexSignature_
  ] = js.native
  
  @JSName("type")
  var type_ClassBody_ : ClassBody = js.native
}
object ClassBody_ {
  
  @scala.inline
  def apply(
    body: js.Array[
      ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | TSDeclareMethod_ | TSIndexSignature_
    ],
    `type`: ClassBody
  ): ClassBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBody_]
  }
  
  @scala.inline
  implicit class ClassBody_MutableBuilder[Self <: ClassBody_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(
      value: js.Array[
          ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | TSDeclareMethod_ | TSIndexSignature_
        ]
    ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(
      value: (ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | TSDeclareMethod_ | TSIndexSignature_)*
    ): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ClassBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
