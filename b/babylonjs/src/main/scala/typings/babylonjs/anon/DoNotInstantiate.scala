package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoNotInstantiate extends StObject {
  
  var doNotInstantiate: Boolean = js.native
}
object DoNotInstantiate {
  
  @scala.inline
  def apply(doNotInstantiate: Boolean): DoNotInstantiate = {
    val __obj = js.Dynamic.literal(doNotInstantiate = doNotInstantiate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoNotInstantiate]
  }
  
  @scala.inline
  implicit class DoNotInstantiateMutableBuilder[Self <: DoNotInstantiate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoNotInstantiate(value: Boolean): Self = StObject.set(x, "doNotInstantiate", value.asInstanceOf[js.Any])
  }
}
