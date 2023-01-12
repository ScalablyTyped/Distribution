package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectClause extends StObject {
  
  var propertyPaths: js.Array[String]
  
  def toFunction(config: js.Object): js.Function1[/* entity */ Entity, js.Object]
  
  def toJSONExt(context: js.Object): js.Array[String]
  
  def validate(entityType: EntityType): Unit
}
object SelectClause {
  
  inline def apply(
    propertyPaths: js.Array[String],
    toFunction: js.Object => js.Function1[/* entity */ Entity, js.Object],
    toJSONExt: js.Object => js.Array[String],
    validate: EntityType => Unit
  ): SelectClause = {
    val __obj = js.Dynamic.literal(propertyPaths = propertyPaths.asInstanceOf[js.Any], toFunction = js.Any.fromFunction1(toFunction), toJSONExt = js.Any.fromFunction1(toJSONExt), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[SelectClause]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectClause] (val x: Self) extends AnyVal {
    
    inline def setPropertyPaths(value: js.Array[String]): Self = StObject.set(x, "propertyPaths", value.asInstanceOf[js.Any])
    
    inline def setPropertyPathsVarargs(value: String*): Self = StObject.set(x, "propertyPaths", js.Array(value*))
    
    inline def setToFunction(value: js.Object => js.Function1[/* entity */ Entity, js.Object]): Self = StObject.set(x, "toFunction", js.Any.fromFunction1(value))
    
    inline def setToJSONExt(value: js.Object => js.Array[String]): Self = StObject.set(x, "toJSONExt", js.Any.fromFunction1(value))
    
    inline def setValidate(value: EntityType => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
