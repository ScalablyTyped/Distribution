package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientPropertiesResult extends StObject {
  
  /**
    * Information about the Amazon WorkSpaces client.
    */
  var ClientProperties: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.ClientProperties] = js.undefined
  
  /**
    * The resource identifier, in the form of a directory ID.
    */
  var ResourceId: js.UndefOr[NonEmptyString] = js.undefined
}
object ClientPropertiesResult {
  
  inline def apply(): ClientPropertiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientPropertiesResult]
  }
  
  extension [Self <: ClientPropertiesResult](x: Self) {
    
    inline def setClientProperties(value: ClientProperties): Self = StObject.set(x, "ClientProperties", value.asInstanceOf[js.Any])
    
    inline def setClientPropertiesUndefined: Self = StObject.set(x, "ClientProperties", js.undefined)
    
    inline def setResourceId(value: NonEmptyString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
