package typings.chainsafeLibp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cache extends StObject {
  
  var cache: String
}
object Cache {
  
  inline def apply(cache: String): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
    
    inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
  }
}
