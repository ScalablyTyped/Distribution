package typings.babylonjs.anon

import typings.babylonjs.BABYLON.DeviceInput
import typings.babylonjs.BABYLON.DeviceType
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputIndex[T /* <: DeviceType */] extends StObject {
  
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
  implicit class InputIndexMutableBuilder[Self <: InputIndex[_], T /* <: DeviceType */] (val x: Self with InputIndex[T]) extends AnyVal {
    
    @scala.inline
    def setCurrentState(value: Nullable[Double]): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStateNull: Self = StObject.set(x, "currentState", null)
    
    @scala.inline
    def setInputIndex(value: DeviceInput[T]): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousState(value: Nullable[Double]): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousStateNull: Self = StObject.set(x, "previousState", null)
  }
}
