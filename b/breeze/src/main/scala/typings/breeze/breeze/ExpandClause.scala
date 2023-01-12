package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandClause extends StObject {
  
  var propertyPaths: js.Array[String]
  
  def toJSONExt(context: js.Object): js.Array[String]
}
object ExpandClause {
  
  inline def apply(propertyPaths: js.Array[String], toJSONExt: js.Object => js.Array[String]): ExpandClause = {
    val __obj = js.Dynamic.literal(propertyPaths = propertyPaths.asInstanceOf[js.Any], toJSONExt = js.Any.fromFunction1(toJSONExt))
    __obj.asInstanceOf[ExpandClause]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandClause] (val x: Self) extends AnyVal {
    
    inline def setPropertyPaths(value: js.Array[String]): Self = StObject.set(x, "propertyPaths", value.asInstanceOf[js.Any])
    
    inline def setPropertyPathsVarargs(value: String*): Self = StObject.set(x, "propertyPaths", js.Array(value*))
    
    inline def setToJSONExt(value: js.Object => js.Array[String]): Self = StObject.set(x, "toJSONExt", js.Any.fromFunction1(value))
  }
}
