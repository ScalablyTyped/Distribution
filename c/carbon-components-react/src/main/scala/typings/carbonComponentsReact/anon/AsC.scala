package typings.carbonComponentsReact.anon

import typings.carbonComponentsReact.typingsSharedMod.ReactComponentConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsC[C /* <: ReactComponentConstructor[scala.Nothing] */] extends StObject {
  
  var as: C
}
object AsC {
  
  inline def apply[C /* <: ReactComponentConstructor[scala.Nothing] */](as: C): AsC[C] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsC[C]]
  }
  
  extension [Self <: AsC[?], C /* <: ReactComponentConstructor[scala.Nothing] */](x: Self & AsC[C]) {
    
    inline def setAs(value: C): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
  }
}
