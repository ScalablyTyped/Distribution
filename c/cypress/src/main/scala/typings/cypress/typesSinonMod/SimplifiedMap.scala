package typings.cypress.typesSinonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimplifiedMap
  extends StObject
     with SimplifiedSet {
  
  def get(key: Any): Any
}
object SimplifiedMap {
  
  inline def apply(get: Any => Any, has: Any => Boolean): SimplifiedMap = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[SimplifiedMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimplifiedMap] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
