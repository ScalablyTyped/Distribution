package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R extends StObject {
  
  /**
    * The radius size of each point on selected.
    */
  var r: js.UndefOr[Double] = js.undefined
}
object R {
  
  inline def apply(): R = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[R]
  }
  
  extension [Self <: R](x: Self) {
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
