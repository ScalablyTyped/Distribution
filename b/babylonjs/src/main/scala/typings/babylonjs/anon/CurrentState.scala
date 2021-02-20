package typings.babylonjs.anon

import typings.babylonjs.deviceEnumsMod.DeviceType
import typings.babylonjs.deviceTypesMod.DeviceInput
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentState[T /* <: DeviceType */] extends StObject {
  
  var currentState: Nullable[Double] = js.native
  
  var inputIndex: DeviceInput[T] = js.native
  
  var previousState: Nullable[Double] = js.native
}
object CurrentState {
  
  @scala.inline
  def apply[T /* <: DeviceType */](inputIndex: DeviceInput[T]): CurrentState[T] = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentState[T]]
  }
  
  @scala.inline
  implicit class CurrentStateMutableBuilder[Self <: CurrentState[_], T /* <: DeviceType */] (val x: Self with CurrentState[T]) extends AnyVal {
    
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
