package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGeoMatchSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.clientsWafMod.ChangeToken
  
  /**
    * A friendly name or description of the GeoMatchSet. You can't change Name after you create the GeoMatchSet.
    */
  var Name: ResourceName
}
object CreateGeoMatchSetRequest {
  
  inline def apply(ChangeToken: ChangeToken, Name: ResourceName): CreateGeoMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGeoMatchSetRequest]
  }
  
  extension [Self <: CreateGeoMatchSetRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
