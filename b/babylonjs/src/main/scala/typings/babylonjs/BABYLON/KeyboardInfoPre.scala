package typings.babylonjs.BABYLON

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
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
  implicit class KeyboardInfoPreMutableBuilder[Self <: KeyboardInfoPre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkipOnPointerObservable(value: Boolean): Self = StObject.set(x, "skipOnPointerObservable", value.asInstanceOf[js.Any])
  }
}
