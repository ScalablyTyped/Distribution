package typings.cypress.typesLodashMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoizedFunction extends StObject {
  
  /**
    * @see _.cache
    */
  var cache: MapCache
}
object MemoizedFunction {
  
  inline def apply(cache: MapCache): MemoizedFunction = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoizedFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoizedFunction] (val x: Self) extends AnyVal {
    
    inline def setCache(value: MapCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
  }
}
