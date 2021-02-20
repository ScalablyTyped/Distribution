package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLUniformLocation extends StObject {
  
  var _currentState: js.Any = js.native
}
object WebGLUniformLocation {
  
  @scala.inline
  def apply(_currentState: js.Any): WebGLUniformLocation = {
    val __obj = js.Dynamic.literal(_currentState = _currentState.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLUniformLocation]
  }
  
  @scala.inline
  implicit class WebGLUniformLocationMutableBuilder[Self <: WebGLUniformLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_currentState(value: js.Any): Self = StObject.set(x, "_currentState", value.asInstanceOf[js.Any])
  }
}
