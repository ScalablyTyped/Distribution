package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineAttribute extends StObject {
  
  /**
    * The name of the engine attribute. 
    */
  var Name: js.UndefOr[EngineAttributeName] = js.undefined
  
  /**
    * The value of the engine attribute. 
    */
  var Value: js.UndefOr[EngineAttributeValue] = js.undefined
}
object EngineAttribute {
  
  inline def apply(): EngineAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineAttribute]
  }
  
  extension [Self <: EngineAttribute](x: Self) {
    
    inline def setName(value: EngineAttributeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: EngineAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
