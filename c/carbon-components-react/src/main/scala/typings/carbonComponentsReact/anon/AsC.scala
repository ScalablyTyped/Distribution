package typings.carbonComponentsReact.anon

import typings.react.mod.JSXElementConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsC[C /* <: JSXElementConstructor[js.Any] */] extends StObject {
  
  var as: C
}
object AsC {
  
  @scala.inline
  def apply[C /* <: JSXElementConstructor[js.Any] */](as: C): AsC[C] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsC[C]]
  }
  
  @scala.inline
  implicit class AsCMutableBuilder[Self <: AsC[?], C /* <: JSXElementConstructor[js.Any] */] (val x: Self & AsC[C]) extends AnyVal {
    
    @scala.inline
    def setAs(value: C): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
  }
}
