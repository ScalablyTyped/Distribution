package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cacheable extends StObject {
  
  var cacheable: js.UndefOr[Boolean] = js.undefined
}
object Cacheable {
  
  inline def apply(): Cacheable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cacheable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cacheable] (val x: Self) extends AnyVal {
    
    inline def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    inline def setCacheableUndefined: Self = StObject.set(x, "cacheable", js.undefined)
  }
}
