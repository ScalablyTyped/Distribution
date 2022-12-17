package typings.babylonjs.anon

import typings.babylonjs.meshesTransformNodeMod.TransformNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var doNotInstantiate: Boolean | (js.Function1[/* node */ TransformNode, Boolean])
}
object `1` {
  
  inline def apply(doNotInstantiate: Boolean | (js.Function1[/* node */ TransformNode, Boolean])): `1` = {
    val __obj = js.Dynamic.literal(doNotInstantiate = doNotInstantiate.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setDoNotInstantiate(value: Boolean | (js.Function1[/* node */ TransformNode, Boolean])): Self = StObject.set(x, "doNotInstantiate", value.asInstanceOf[js.Any])
    
    inline def setDoNotInstantiateFunction1(value: /* node */ TransformNode => Boolean): Self = StObject.set(x, "doNotInstantiate", js.Any.fromFunction1(value))
  }
}
