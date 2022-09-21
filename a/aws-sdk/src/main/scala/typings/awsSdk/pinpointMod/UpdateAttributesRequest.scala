package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAttributesRequest extends StObject {
  
  /**
    * An array of the attributes to remove from all the endpoints that are associated with the application. The array can specify the complete, exact name of each attribute to remove or it can specify a glob pattern that an attribute name must match in order for the attribute to be removed.
    */
  var Blacklist: js.UndefOr[ListOfString] = js.undefined
}
object UpdateAttributesRequest {
  
  inline def apply(): UpdateAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAttributesRequest]
  }
  
  extension [Self <: UpdateAttributesRequest](x: Self) {
    
    inline def setBlacklist(value: ListOfString): Self = StObject.set(x, "Blacklist", value.asInstanceOf[js.Any])
    
    inline def setBlacklistUndefined: Self = StObject.set(x, "Blacklist", js.undefined)
    
    inline def setBlacklistVarargs(value: string*): Self = StObject.set(x, "Blacklist", js.Array(value*))
  }
}
