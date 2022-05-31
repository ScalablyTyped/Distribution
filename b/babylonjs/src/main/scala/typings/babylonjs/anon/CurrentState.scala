package typings.babylonjs.anon

import typings.babylonjs.deviceEnumsMod.DeviceType
import typings.babylonjs.deviceTypesMod.DeviceInput
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentState[T /* <: DeviceType */] extends StObject {
  
  var currentState: Nullable[Double]
  
  var inputIndex: DeviceInput[T]
  
  var previousState: Nullable[Double]
}
object CurrentState {
  
  inline def apply[T /* <: DeviceType */](inputIndex: DeviceInput[T]): CurrentState[T] = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any], currentState = null, previousState = null)
    __obj.asInstanceOf[CurrentState[T]]
  }
  
  extension [Self <: CurrentState[?], T /* <: DeviceType */](x: Self & CurrentState[T]) {
    
    inline def setCurrentState(value: Nullable[Double]): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateNull: Self = StObject.set(x, "currentState", null)
    
    inline def setInputIndex(value: DeviceInput[T]): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
    
    inline def setPreviousState(value: Nullable[Double]): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
    
    inline def setPreviousStateNull: Self = StObject.set(x, "previousState", null)
  }
}
