package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LodashAnyHack extends StObject {
  
  var __lodashAnyHack: Any
}
object LodashAnyHack {
  
  inline def apply(__lodashAnyHack: Any): LodashAnyHack = {
    val __obj = js.Dynamic.literal(__lodashAnyHack = __lodashAnyHack.asInstanceOf[js.Any])
    __obj.asInstanceOf[LodashAnyHack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LodashAnyHack] (val x: Self) extends AnyVal {
    
    inline def set__lodashAnyHack(value: Any): Self = StObject.set(x, "__lodashAnyHack", value.asInstanceOf[js.Any])
  }
}
