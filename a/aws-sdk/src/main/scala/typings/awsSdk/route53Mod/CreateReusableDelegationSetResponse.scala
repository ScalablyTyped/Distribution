package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReusableDelegationSetResponse extends StObject {
  
  /**
    * A complex type that contains name server information.
    */
  var DelegationSet: typings.awsSdk.route53Mod.DelegationSet
  
  /**
    * The unique URL representing the new reusable delegation set.
    */
  var Location: ResourceURI
}
object CreateReusableDelegationSetResponse {
  
  inline def apply(DelegationSet: DelegationSet, Location: ResourceURI): CreateReusableDelegationSetResponse = {
    val __obj = js.Dynamic.literal(DelegationSet = DelegationSet.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReusableDelegationSetResponse]
  }
  
  extension [Self <: CreateReusableDelegationSetResponse](x: Self) {
    
    inline def setDelegationSet(value: DelegationSet): Self = StObject.set(x, "DelegationSet", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: ResourceURI): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
  }
}
