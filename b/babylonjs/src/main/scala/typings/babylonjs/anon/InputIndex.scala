package typings.babylonjs.anon

import typings.babylonjs.BABYLON.DeviceInput
import typings.babylonjs.BABYLON.DeviceType
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputIndex[T /* <: DeviceType */] extends js.Object {
  
  var currentState: Nullable[Double] = js.native
  
  var inputIndex: DeviceInput[T] = js.native
  
  var previousState: Nullable[Double] = js.native
}
object InputIndex {
  
  @scala.inline
  def apply[T /* <: DeviceType */](inputIndex: DeviceInput[T]): InputIndex[T] = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputIndex[T]]
  }
  
  @scala.inline
  implicit class InputIndexOps[Self <: InputIndex[_], T /* <: DeviceType */] (val x: Self with InputIndex[T]) extends AnyVal {
    
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
    def setInputIndex(value: DeviceInput[T]): Self = this.set("inputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentState(value: Nullable[Double]): Self = this.set("currentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStateNull: Self = this.set("currentState", null)
    
    @scala.inline
    def setPreviousState(value: Nullable[Double]): Self = this.set("previousState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousStateNull: Self = this.set("previousState", null)
  }
}
