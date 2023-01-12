package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUIEvent extends StObject {
  
  /**
    * Current target for an event
    */
  var currentTarget: js.UndefOr[Any] = js.undefined
  
  /**
    * Input array index
    */
  var inputIndex: Double
  
  /**
    * Tells user agent what to do when not explicitly handled
    */
  def preventDefault(): Unit
  
  /**
    * Alias for target
    * @deprecated Use target instead
    */
  var srcElement: js.UndefOr[Any] = js.undefined
  
  /**
    * Reference to object where object was dispatched
    */
  var target: Any
  
  /**
    * Type of event
    */
  var `type`: String
}
object IUIEvent {
  
  inline def apply(inputIndex: Double, preventDefault: () => Unit, target: Any, `type`: String): IUIEvent = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUIEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUIEvent] (val x: Self) extends AnyVal {
    
    inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
    
    inline def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setSrcElement(value: Any): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
