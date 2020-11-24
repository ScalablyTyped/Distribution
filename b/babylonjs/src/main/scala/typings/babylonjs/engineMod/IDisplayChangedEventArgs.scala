package typings.babylonjs.engineMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDisplayChangedEventArgs extends js.Object {
  
  /** Gets the vrDisplay object (if any) */
  var vrDisplay: Nullable[_] = js.native
  
  /** Gets a boolean indicating if webVR is supported */
  var vrSupported: Boolean = js.native
}
object IDisplayChangedEventArgs {
  
  @scala.inline
  def apply(vrSupported: Boolean): IDisplayChangedEventArgs = {
    val __obj = js.Dynamic.literal(vrSupported = vrSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayChangedEventArgs]
  }
  
  @scala.inline
  implicit class IDisplayChangedEventArgsOps[Self <: IDisplayChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setVrSupported(value: Boolean): Self = this.set("vrSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVrDisplay(value: Nullable[_]): Self = this.set("vrDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVrDisplayNull: Self = this.set("vrDisplay", null)
  }
}
