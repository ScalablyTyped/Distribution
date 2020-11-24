package typings.babylonjs.BABYLON

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardInfoPre extends KeyboardInfo {
  
  /**
    * Defines whether the engine should skip the next onKeyboardObservable associated to this pre.
    */
  var skipOnPointerObservable: Boolean = js.native
}
object KeyboardInfoPre {
  
  @scala.inline
  def apply(event: KeyboardEvent, skipOnPointerObservable: Boolean, `type`: Double): KeyboardInfoPre = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], skipOnPointerObservable = skipOnPointerObservable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardInfoPre]
  }
  
  @scala.inline
  implicit class KeyboardInfoPreOps[Self <: KeyboardInfoPre] (val x: Self) extends AnyVal {
    
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
    def setSkipOnPointerObservable(value: Boolean): Self = this.set("skipOnPointerObservable", value.asInstanceOf[js.Any])
  }
}
