package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateEffectSpec[Value] extends StObject {
  
  /**
    Provides a way to map an effect like this through a position
    mapping. When not given, the effects will simply not be mapped.
    When the function returns `undefined`, that means the mapping
    deletes the effect.
    */
  var map: js.UndefOr[js.Function2[/* value */ Value, /* mapping */ ChangeDesc, js.UndefOr[Value]]] = js.undefined
}
object StateEffectSpec {
  
  inline def apply[Value](): StateEffectSpec[Value] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateEffectSpec[Value]]
  }
  
  extension [Self <: StateEffectSpec[?], Value](x: Self & StateEffectSpec[Value]) {
    
    inline def setMap(value: (/* value */ Value, /* mapping */ ChangeDesc) => js.UndefOr[Value]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
