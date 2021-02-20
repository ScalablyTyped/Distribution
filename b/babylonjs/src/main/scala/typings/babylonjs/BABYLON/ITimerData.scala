package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimerData[T] extends StObject {
  
  /**
    * How much is completed, in [0.0...1.0].
    * Note that this CAN be higher than 1 due to the fact that we don't actually measure time but delta between observable calls
    */
  var completeRate: Double = js.native
  
  /**
    * Time now
    */
  var currentTime: Double = js.native
  
  /**
    * Time passed since started
    */
  var deltaTime: Double = js.native
  
  /**
    * What the registered observable sent in the last count
    */
  var payload: T = js.native
  
  /**
    * When did it start
    */
  var startTime: Double = js.native
}
object ITimerData {
  
  @scala.inline
  def apply[T](completeRate: Double, currentTime: Double, deltaTime: Double, payload: T, startTime: Double): ITimerData[T] = {
    val __obj = js.Dynamic.literal(completeRate = completeRate.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], deltaTime = deltaTime.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimerData[T]]
  }
  
  @scala.inline
  implicit class ITimerDataMutableBuilder[Self <: ITimerData[_], T] (val x: Self with ITimerData[T]) extends AnyVal {
    
    @scala.inline
    def setCompleteRate(value: Double): Self = StObject.set(x, "completeRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaTime(value: Double): Self = StObject.set(x, "deltaTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
