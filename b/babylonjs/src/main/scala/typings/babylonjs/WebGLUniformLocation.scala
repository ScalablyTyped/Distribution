package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLUniformLocation extends js.Object {
  
  var _currentState: js.Any = js.native
}
object WebGLUniformLocation {
  
  @scala.inline
  def apply(_currentState: js.Any): WebGLUniformLocation = {
    val __obj = js.Dynamic.literal(_currentState = _currentState.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLUniformLocation]
  }
  
  @scala.inline
  implicit class WebGLUniformLocationOps[Self <: WebGLUniformLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_currentState(value: js.Any): Self = this.set("_currentState", value.asInstanceOf[js.Any])
  }
}
