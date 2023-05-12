package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExplorerAdditionalChild extends StObject {
  
  /**
    * Function used to return the class name of the child node
    */
  def getClassName(): String
  
  /**
    * List of inspectable custom properties (used by the Inspector)
    * @see https://doc.babylonjs.com/toolsAndResources/inspector#extensibility
    */
  var inspectableCustomProperties: js.Array[IInspectable]
  
  /**
    * Gets the name of the additional node
    */
  var name: String
}
object IExplorerAdditionalChild {
  
  inline def apply(getClassName: () => String, inspectableCustomProperties: js.Array[IInspectable], name: String): IExplorerAdditionalChild = {
    val __obj = js.Dynamic.literal(getClassName = js.Any.fromFunction0(getClassName), inspectableCustomProperties = inspectableCustomProperties.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExplorerAdditionalChild]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExplorerAdditionalChild] (val x: Self) extends AnyVal {
    
    inline def setGetClassName(value: () => String): Self = StObject.set(x, "getClassName", js.Any.fromFunction0(value))
    
    inline def setInspectableCustomProperties(value: js.Array[IInspectable]): Self = StObject.set(x, "inspectableCustomProperties", value.asInstanceOf[js.Any])
    
    inline def setInspectableCustomPropertiesVarargs(value: IInspectable*): Self = StObject.set(x, "inspectableCustomProperties", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
