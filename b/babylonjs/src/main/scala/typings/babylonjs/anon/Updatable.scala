package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Updatable extends StObject {
  
  var updatable: js.UndefOr[Boolean] = js.undefined
}
object Updatable {
  
  inline def apply(): Updatable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Updatable]
  }
  
  extension [Self <: Updatable](x: Self) {
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
