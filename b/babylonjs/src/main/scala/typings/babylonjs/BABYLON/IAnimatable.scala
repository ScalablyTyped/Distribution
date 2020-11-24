package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimatable extends js.Object {
  
  /**
    * Array of animations
    */
  var animations: Nullable[js.Array[Animation]] = js.native
}
object IAnimatable {
  
  @scala.inline
  def apply(): IAnimatable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimatable]
  }
  
  @scala.inline
  implicit class IAnimatableOps[Self <: IAnimatable] (val x: Self) extends AnyVal {
    
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
    def setAnimationsVarargs(value: Animation*): Self = this.set("animations", js.Array(value :_*))
    
    @scala.inline
    def setAnimations(value: Nullable[js.Array[Animation]]): Self = this.set("animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsNull: Self = this.set("animations", null)
  }
}
