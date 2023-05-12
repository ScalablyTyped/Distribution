package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cacheable extends StObject {
  
  var cacheable: Boolean
}
object Cacheable {
  
  inline def apply(cacheable: Boolean): Cacheable = {
    val __obj = js.Dynamic.literal(cacheable = cacheable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cacheable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cacheable] (val x: Self) extends AnyVal {
    
    inline def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
  }
}
