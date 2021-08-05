package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Front extends StObject {
  
  var front: js.UndefOr[Boolean] = js.undefined
}
object Front {
  
  inline def apply(): Front = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Front]
  }
  
  extension [Self <: Front](x: Self) {
    
    inline def setFront(value: Boolean): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
    
    inline def setFrontUndefined: Self = StObject.set(x, "front", js.undefined)
  }
}
