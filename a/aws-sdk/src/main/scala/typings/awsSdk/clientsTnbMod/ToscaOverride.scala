package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToscaOverride extends StObject {
  
  /**
    * Default value for the override.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the TOSCA override.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ToscaOverride {
  
  inline def apply(): ToscaOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToscaOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToscaOverride] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
