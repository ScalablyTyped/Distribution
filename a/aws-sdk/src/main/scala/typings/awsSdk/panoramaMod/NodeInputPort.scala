package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeInputPort extends StObject {
  
  /**
    * The input port's default value.
    */
  var DefaultValue: js.UndefOr[PortDefaultValue] = js.undefined
  
  /**
    * The input port's description.
    */
  var Description: js.UndefOr[typings.awsSdk.panoramaMod.Description] = js.undefined
  
  /**
    * The input port's max connections.
    */
  var MaxConnections: js.UndefOr[typings.awsSdk.panoramaMod.MaxConnections] = js.undefined
  
  /**
    * The input port's name.
    */
  var Name: js.UndefOr[PortName] = js.undefined
  
  /**
    * The input port's type.
    */
  var Type: js.UndefOr[PortType] = js.undefined
}
object NodeInputPort {
  
  inline def apply(): NodeInputPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeInputPort]
  }
  
  extension [Self <: NodeInputPort](x: Self) {
    
    inline def setDefaultValue(value: PortDefaultValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMaxConnections(value: MaxConnections): Self = StObject.set(x, "MaxConnections", value.asInstanceOf[js.Any])
    
    inline def setMaxConnectionsUndefined: Self = StObject.set(x, "MaxConnections", js.undefined)
    
    inline def setName(value: PortName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: PortType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
