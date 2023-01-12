package typings.babelTypes.anon

import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.PrivateName_
import typings.babelTypes.mod.Super_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@babel/types.@babel/types.MemberExpression, 'object' | 'property'> */
trait PickMemberExpressionobjec extends StObject {
  
  var `object`: Expression | Super_
  
  var property: Expression | Identifier_ | PrivateName_
}
object PickMemberExpressionobjec {
  
  inline def apply(`object`: Expression | Super_, property: Expression | Identifier_ | PrivateName_): PickMemberExpressionobjec = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickMemberExpressionobjec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickMemberExpressionobjec] (val x: Self) extends AnyVal {
    
    inline def setObject(value: Expression | Super_): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Expression | Identifier_ | PrivateName_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
