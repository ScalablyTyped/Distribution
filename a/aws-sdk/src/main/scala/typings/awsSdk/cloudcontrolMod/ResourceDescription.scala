package typings.awsSdk.cloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDescription extends StObject {
  
  /**
    * The primary identifier for the resource. For more information, see Identifying resources in the Amazon Web Services Cloud Control API User Guide.
    */
  var Identifier: js.UndefOr[typings.awsSdk.cloudcontrolMod.Identifier] = js.undefined
  
  /**
    * A list of the resource properties and their current values.
    */
  var Properties: js.UndefOr[typings.awsSdk.cloudcontrolMod.Properties] = js.undefined
}
object ResourceDescription {
  
  inline def apply(): ResourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDescription]
  }
  
  extension [Self <: ResourceDescription](x: Self) {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
  }
}
