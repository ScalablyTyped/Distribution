package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyboardEvent
  extends StObject
     with IUIEvent {
  
  /**
    * Status of Alt key being pressed
    */
  var altKey: Boolean
  
  /**
    * Unicode value of character pressed
    * @deprecated Required for event, use keyCode instead.
    */
  var charCode: js.UndefOr[Double] = js.undefined
  
  /**
    * Code for key based on layout
    */
  var code: String
  
  /**
    * Status of Ctrl key being pressed
    */
  var ctrlKey: Boolean
  
  /**
    * String representation of key
    */
  var key: String
  
  /**
    * ASCII value of key
    * @deprecated Used with DeviceSourceManager
    */
  var keyCode: Double
  
  /**
    * Status of Meta key (eg. Windows key) being pressed
    */
  var metaKey: Boolean
  
  /**
    * Status of Shift key being pressed
    */
  var shiftKey: Boolean
}
object IKeyboardEvent {
  
  inline def apply(
    altKey: Boolean,
    code: String,
    ctrlKey: Boolean,
    inputIndex: Double,
    key: String,
    keyCode: Double,
    metaKey: Boolean,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    target: Any,
    `type`: String
  ): IKeyboardEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyboardEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IKeyboardEvent] (val x: Self) extends AnyVal {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
    
    inline def setCharCodeUndefined: Self = StObject.set(x, "charCode", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
  }
}
