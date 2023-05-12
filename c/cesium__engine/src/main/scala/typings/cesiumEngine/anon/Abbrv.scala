package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abbrv extends StObject {
  
  var abbrv: js.UndefOr[Double] = js.undefined
}
object Abbrv {
  
  inline def apply(): Abbrv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abbrv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Abbrv] (val x: Self) extends AnyVal {
    
    inline def setAbbrv(value: Double): Self = StObject.set(x, "abbrv", value.asInstanceOf[js.Any])
    
    inline def setAbbrvUndefined: Self = StObject.set(x, "abbrv", js.undefined)
  }
}
