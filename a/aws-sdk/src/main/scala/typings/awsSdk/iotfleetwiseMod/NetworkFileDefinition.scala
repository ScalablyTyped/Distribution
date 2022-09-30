package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFileDefinition extends StObject {
  
  /**
    * Information, including CAN DBC files, about the configurations used to create a decoder manifest.
    */
  var canDbc: js.UndefOr[CanDbcDefinition] = js.undefined
}
object NetworkFileDefinition {
  
  inline def apply(): NetworkFileDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFileDefinition]
  }
  
  extension [Self <: NetworkFileDefinition](x: Self) {
    
    inline def setCanDbc(value: CanDbcDefinition): Self = StObject.set(x, "canDbc", value.asInstanceOf[js.Any])
    
    inline def setCanDbcUndefined: Self = StObject.set(x, "canDbc", js.undefined)
  }
}
