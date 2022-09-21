package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNetworkChange extends StObject {
  
  /**
    * The action to take for a core network.
    */
  var Action: js.UndefOr[ChangeAction] = js.undefined
  
  /**
    * The resource identifier.
    */
  var Identifier: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * Uniquely identifies the path for a change within the changeset. For example, the IdentifierPath for a core network segment change might be "CORE_NETWORK_SEGMENT/us-east-1/devsegment".
    */
  var IdentifierPath: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The new value for a core network
    */
  var NewValues: js.UndefOr[CoreNetworkChangeValues] = js.undefined
  
  /**
    * The previous values for a core network.
    */
  var PreviousValues: js.UndefOr[CoreNetworkChangeValues] = js.undefined
  
  /**
    * The type of change.
    */
  var Type: js.UndefOr[ChangeType] = js.undefined
}
object CoreNetworkChange {
  
  inline def apply(): CoreNetworkChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreNetworkChange]
  }
  
  extension [Self <: CoreNetworkChange](x: Self) {
    
    inline def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setIdentifier(value: ConstrainedString): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierPath(value: ConstrainedString): Self = StObject.set(x, "IdentifierPath", value.asInstanceOf[js.Any])
    
    inline def setIdentifierPathUndefined: Self = StObject.set(x, "IdentifierPath", js.undefined)
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setNewValues(value: CoreNetworkChangeValues): Self = StObject.set(x, "NewValues", value.asInstanceOf[js.Any])
    
    inline def setNewValuesUndefined: Self = StObject.set(x, "NewValues", js.undefined)
    
    inline def setPreviousValues(value: CoreNetworkChangeValues): Self = StObject.set(x, "PreviousValues", value.asInstanceOf[js.Any])
    
    inline def setPreviousValuesUndefined: Self = StObject.set(x, "PreviousValues", js.undefined)
    
    inline def setType(value: ChangeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
