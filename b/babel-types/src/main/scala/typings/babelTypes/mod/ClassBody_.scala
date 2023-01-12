package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassBody_
  extends StObject
     with Node {
  
  var body: js.Array[ClassMethod_ | ClassProperty_]
  
  @JSName("type")
  var type_ClassBody_ : ClassBody
}
object ClassBody_ {
  
  inline def apply(body: js.Array[ClassMethod_ | ClassProperty_], end: Double, loc: SourceLocation, start: Double): ClassBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassBody")
    __obj.asInstanceOf[ClassBody_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassBody_] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.Array[ClassMethod_ | ClassProperty_]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: (ClassMethod_ | ClassProperty_)*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: ClassBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
