package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormDataVisitorHelpers extends StObject {
  
  def convertValue(value: Any): Any
  
  def defaultVisitor(value: Any, key: String, path: js.Array[String | Double], helpers: FormDataVisitorHelpers): Boolean
  def defaultVisitor(value: Any, key: String, path: Null, helpers: FormDataVisitorHelpers): Boolean
  def defaultVisitor(value: Any, key: Double, path: js.Array[String | Double], helpers: FormDataVisitorHelpers): Boolean
  def defaultVisitor(value: Any, key: Double, path: Null, helpers: FormDataVisitorHelpers): Boolean
  @JSName("defaultVisitor")
  var defaultVisitor_Original: SerializerVisitor
  
  def isVisitable(value: Any): Boolean
}
object FormDataVisitorHelpers {
  
  inline def apply(convertValue: Any => Any, defaultVisitor: SerializerVisitor, isVisitable: Any => Boolean): FormDataVisitorHelpers = {
    val __obj = js.Dynamic.literal(convertValue = js.Any.fromFunction1(convertValue), defaultVisitor = defaultVisitor.asInstanceOf[js.Any], isVisitable = js.Any.fromFunction1(isVisitable))
    __obj.asInstanceOf[FormDataVisitorHelpers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormDataVisitorHelpers] (val x: Self) extends AnyVal {
    
    inline def setConvertValue(value: Any => Any): Self = StObject.set(x, "convertValue", js.Any.fromFunction1(value))
    
    inline def setDefaultVisitor(value: SerializerVisitor): Self = StObject.set(x, "defaultVisitor", value.asInstanceOf[js.Any])
    
    inline def setIsVisitable(value: Any => Boolean): Self = StObject.set(x, "isVisitable", js.Any.fromFunction1(value))
  }
}
