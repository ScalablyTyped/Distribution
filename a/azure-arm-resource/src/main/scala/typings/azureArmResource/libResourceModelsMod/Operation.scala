package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  /**
    * The object that represents the operation.
    */
  var display: js.UndefOr[OperationDisplay] = js.undefined
  
  /**
    * Operation name: {provider}/{resource}/{operation}
    */
  var name: js.UndefOr[String] = js.undefined
}
object Operation {
  
  inline def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  extension [Self <: Operation](x: Self) {
    
    inline def setDisplay(value: OperationDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
