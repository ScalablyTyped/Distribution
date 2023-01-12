package typings.babylonjs.BABYLON

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInspectable extends StObject {
  
  /**
    * Gets the extensions to accept when using "FileButton" mode.
    * The value should be a comma separated string with the list of extensions to accept e.g., ".jpg, .png, .tga, .dds, .env".
    */
  var accept: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the callback function when using "Button" mode
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Gets the callback function when using "FileButton" mode
    */
  var fileCallback: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.undefined
  
  /**
    * Gets the label to display
    */
  var label: String
  
  /**
    * Gets the maximum value of the property when using in "slider" mode
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the minimum value of the property when using in "slider" mode
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the list of options when using "Option" mode
    */
  var options: js.UndefOr[js.Array[IInspectableOptions]] = js.undefined
  
  /**
    * Gets the name of the property to edit
    */
  var propertyName: String
  
  /**
    * Gets the setp to use when using in "slider" mode
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the type of the editor to use
    */
  var `type`: InspectableType
}
object IInspectable {
  
  inline def apply(label: String, propertyName: String, `type`: InspectableType): IInspectable = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInspectable] (val x: Self) extends AnyVal {
    
    inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setFileCallback(value: /* file */ File => Unit): Self = StObject.set(x, "fileCallback", js.Any.fromFunction1(value))
    
    inline def setFileCallbackUndefined: Self = StObject.set(x, "fileCallback", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOptions(value: js.Array[IInspectableOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: IInspectableOptions*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setType(value: InspectableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
