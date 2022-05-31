package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoNotInstantiate extends StObject {
  
  var doNotInstantiate: Boolean
}
object DoNotInstantiate {
  
  inline def apply(doNotInstantiate: Boolean): DoNotInstantiate = {
    val __obj = js.Dynamic.literal(doNotInstantiate = doNotInstantiate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoNotInstantiate]
  }
  
  extension [Self <: DoNotInstantiate](x: Self) {
    
    inline def setDoNotInstantiate(value: Boolean): Self = StObject.set(x, "doNotInstantiate", value.asInstanceOf[js.Any])
  }
}
