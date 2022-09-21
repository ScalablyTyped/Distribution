package typings.vegaLite8ozrbXDH.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactiveGeom extends StObject {
  
  var reactiveGeom: js.UndefOr[Boolean] = js.undefined
}
object ReactiveGeom {
  
  inline def apply(): ReactiveGeom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactiveGeom]
  }
  
  extension [Self <: ReactiveGeom](x: Self) {
    
    inline def setReactiveGeom(value: Boolean): Self = StObject.set(x, "reactiveGeom", value.asInstanceOf[js.Any])
    
    inline def setReactiveGeomUndefined: Self = StObject.set(x, "reactiveGeom", js.undefined)
  }
}
