package typings.cesium.anon

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
  
  extension [Self <: Abbrv](x: Self) {
    
    inline def setAbbrv(value: Double): Self = StObject.set(x, "abbrv", value.asInstanceOf[js.Any])
    
    inline def setAbbrvUndefined: Self = StObject.set(x, "abbrv", js.undefined)
  }
}
