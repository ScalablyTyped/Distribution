package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var doNotInstantiate: Boolean | (js.Function1[/* node */ this.type, Boolean])
}
object `2` {
  
  inline def apply(doNotInstantiate: Boolean | (js.Function1[`2`, Boolean])): `2` = {
    val __obj = js.Dynamic.literal(doNotInstantiate = doNotInstantiate.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setDoNotInstantiate(value: Boolean | (js.Function1[`2`, Boolean])): Self = StObject.set(x, "doNotInstantiate", value.asInstanceOf[js.Any])
    
    inline def setDoNotInstantiateFunction1(value: `2` => Boolean): Self = StObject.set(x, "doNotInstantiate", js.Any.fromFunction1(value))
  }
}
